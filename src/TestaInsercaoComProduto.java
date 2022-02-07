import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class TestaInsercaoComProduto {
	
	public static void main(String[] args) throws SQLException {
	
		//ConnectionFactory connectionFactory = new ConnectionFactory();
		//Connection connection = connectionFactory.recuperarConexao();
		try(Connection connection = new ConnectionFactory().recuperarConexao()){
		CategoriaDAO categoriaDao = new CategoriaDAO(connection);
		List<Categoria> listaDeCategoria = categoriaDao.listar();
		listaDeCategoria.stream().forEach(ct -> System.out.println(ct));
		
		}
		
		
	}
}


//Produto comoda = new Produto("Comoda","Comoda Vertical");
//
//try(Connection connection = new ConnectionFactory().recuperarConexao()){
//	ProdutoDAO produtoDao = new ProdutoDAO(connection);
//	produtoDao.salvar(comoda);
//	List<Produto> listaDeProdutos = produtoDao.listar();
//	listaDeProdutos.stream().forEach(lp -> System.out.println(lp));
//	}