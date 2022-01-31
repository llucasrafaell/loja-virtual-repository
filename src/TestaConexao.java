import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaConexao {

	public static void main(String[] args) throws SQLException {
		
	Connection connection = 
			DriverManager.getConnection
			("jdbc:mysql://localhost/loja_virtual?useTimezone=true&serverTimezone=UTC", "root", "8h7mbebesd");
	
			Statement stm = connection.createStatement();
			stm.execute("DELETE FROM PRODUTO WHERE ID > 2");
			
			Integer linhasModificadas = stm.getUpdateCount();
			System.out.println("Linhas excluidas: " + linhasModificadas);
			
	connection.close();
	}

}
