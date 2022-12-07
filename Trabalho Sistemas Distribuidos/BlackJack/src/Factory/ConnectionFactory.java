package Factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

	//Nome do usuario no banco de dados
	private static final String USERNAME = "root";
	
	//Senha do banco de dados
	private static final String PASSWORD = "root";
	
	//Caminho do banco de dados, porta e nome da tabela
	private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/blackjack";
	
	//Conexão ao banco de dados
	public static Connection createConnectionToMySQL() throws Exception {
		//Carrega o JVM na classe
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
				
		return connection;
	}
	
	public static void main(String[] args) throws Exception {
		//Recuperar conexão com o banco de dados
		Connection con = createConnectionToMySQL();
		
		//Testar se a conexão é nula
		if(con != null){
			System.out.println("Conexão Estabelecida com Sucesso");
			con.close();
		}
	}
}
