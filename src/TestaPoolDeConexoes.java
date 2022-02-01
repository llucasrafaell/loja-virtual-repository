import java.sql.Connection;
import java.sql.SQLException;


public class TestaPoolDeConexoes {
	
	public static void main(String[] args) throws SQLException {
	
		ConnectionFactory connectionFactory = new ConnectionFactory();
		Connection connection = connectionFactory.recuperarConexao();
		connection.setAutoCommit(false);
		
		for (int i = 0; i < 20; i++) {
			connectionFactory.recuperarConexao();
			System.out.println("Conexao de numero:" + i);
		} 
	}
}
