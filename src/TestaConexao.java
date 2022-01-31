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
	
	stm.execute("SELECT ID, NOME, DESCRICAO FROM PRODUTO");
	
	ResultSet rst = stm.getResultSet();
	
	while(rst.next()) {
		Integer id = rst.getInt("ID");
		String nome = rst.getString("NOME");
		String descricao = rst.getString("DESCRICAO");
		System.out.println(id + "|" + nome + "|" + descricao);
	}
	//laço while utilizando next pra conferir se tem um proximo item atraves do Label da Coluna (ID, NOME, COLUNA)
	
	
	connection.close();
	}

}
