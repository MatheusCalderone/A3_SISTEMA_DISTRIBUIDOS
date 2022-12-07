package BlackJack.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.PreparedStatement;

import Factory.ConnectionFactory;
import br.ufrn.imd.ppgsw.ed.Jogador;

public class BlackJackDAO {

	//CRUD
	
	public void save(Jogador Jogador) {
		
		String sql = "INSERT INTO blackjack(jogador, pontos) VALUES (?, ?)";
				
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			//Cria conexão com o Banco de Dados
			conn = ConnectionFactory.createConnectionToMySQL();
			
			//Prepare Statement para executar uma query
			pstm = (PreparedStatement) conn.prepareCall(sql);
			pstm.setString(1, Jogador.getNome());
			pstm.setInt(2, Jogador.getPontos());
			
			//Execute da query
			pstm.execute();
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			//Fechar as conexões
			try {
				if(pstm != null) {
					pstm.close();
				}
				
				if(conn != null) {
					conn.close();
				}
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
	
	public static List<Jogador> getJogador(){
		
		String sql = "SELECT * FROM blackjack";
		
		List<Jogador> Jogadores = new ArrayList<Jogador>();
		
		Connection conn = null;
		PreparedStatement pstm = null;
		//Classe que vai recuperar os dados do banco. ***SELECT****
		ResultSet rset = null;
		
		try {
			conn = ConnectionFactory.createConnectionToMySQL();
			
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			
			rset = pstm.executeQuery();
			
			while (rset.next()) {
				
				Jogador jogador = new Jogador();
				
				//Recuperar o nome do jogador
				jogador.setNome(rset.getString("nome"));
				//Recuperar os pontos
				jogador.setId(rset.getInt("pontos"));
				
				Jogadores.add(jogador);
				
			}
		}catch (Exception e) {
				e.printStackTrace();
			}finally {
				try {
					if(rset!=null) {
						rset.close();
					}
					
					if(pstm!=null) {
						pstm.close();
					}
					
					if(conn!=null) {
						conn.close();
					}
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		
			return Jogadores;
	}
}
