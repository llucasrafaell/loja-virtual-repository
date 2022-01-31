import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaConexao {

	public static void main(String[] args) throws SQLException {
		
	Connection connection = 
			DriverManager.getConnection
			("jdbc:mysql://localhost/loja_virtual?useTimezone=true&serverTimezone=UTC", "root", "8h7mbebesd");
	
			String nome = "mouse 2'";
			String descricao = "mouse sem fio 2";
	
			PreparedStatement stm = connection.prepareStatement("INSERT INTO PRODUTO (nome, descricao) VALUES (?, ?)", 
					Statement.RETURN_GENERATED_KEYS);
			stm.setString(1, nome);
			stm.setString(2,descricao);
			
			stm.execute();
			
			ResultSet rst = stm.getGeneratedKeys();
			while(rst.next()) {
				Integer id = rst.getInt(1);
				System.out.println("O id criado foi: "+id);
			}
			
	connection.close();
	}

}
