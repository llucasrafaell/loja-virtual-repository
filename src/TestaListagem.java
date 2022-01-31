import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class TestaListagem {

	public static void main(String[] args) throws SQLException {
		Connection connection = 
				DriverManager.getConnection
				("jdbc:mysql://localhost/loja_virtual?useTimezone=true&serverTimezone=UTC", "root", "8h7mbebesd");
		
		Statement stm = connection.createStatement();
		
		boolean resultados = stm.execute("SELECT ID, NOME, DESCRICAO FROM PRODUTO");
		//execute é um booleano que retorna um quando a operação (select) for uma lista (ou quando retorna algo)
		
		System.out.println(resultados);
		connection.close();
	}

}
