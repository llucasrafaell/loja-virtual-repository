import java.sql.SQLException;
import javax.swing.JFrame;

import view.ProdutoCategoriaFrame;

public class Main {
	
	public static void main(String[] args) throws SQLException {
		ProdutoCategoriaFrame produtoCategoriaFrame = new ProdutoCategoriaFrame();
		produtoCategoriaFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}


