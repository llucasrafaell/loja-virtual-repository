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
			connection.setAutoCommit(false);
		
			try (PreparedStatement stm = connection.prepareStatement("INSERT INTO PRODUTO (nome, descricao) VALUES (?, ?)", 
						Statement.RETURN_GENERATED_KEYS);){
				adiconarVariavel("Smart Tv", "45 Polegadas", stm);
				adiconarVariavel("Radio", "Radio a Bateria", stm);
				connection.commit();
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("ROLLBACK EXECUTADO");
				connection.rollback();
			}			
			connection.close();
	}

	private static void adiconarVariavel(String nome, String descricao, PreparedStatement stm) throws SQLException {
		stm.setString(1, nome);
		stm.setString(2,descricao);	
		stm.execute();
		
		try (ResultSet rst = stm.getGeneratedKeys()){
		while(rst.next()) {
			Integer id = rst.getInt(1);
			System.out.println("O id criado foi: "+id);
			}
		}
	}
}
