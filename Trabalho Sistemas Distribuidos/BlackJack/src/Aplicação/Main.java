package Aplicação;

import BlackJack.dao.BlackJackDAO;
import br.ufrn.imd.ppgsw.ed.Jogador;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Jogador jogador = new Jogador();
		jogador.setNome(jogador.getNome());
		jogador.setPontos(jogador.getPontos());
		
		BlackJackDAO blackJackDAO = new BlackJackDAO();
		blackJackDAO.save(jogador);
		
		//Visualização dos registros do banco de dados TODOS
		
		for(Jogador j : BlackJackDAO.getJogador()) {
			System.out.println("Jogador: "+j.getNome());
		}
	}

}
