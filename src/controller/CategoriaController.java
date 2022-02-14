package controller;
import java.sql.Connection;
import java.util.List;

import dao.CategoriaDAO;
import factory.ConnectionFactory;
import modelo.Categoria;

public class CategoriaController {
	
	private CategoriaDAO categoriaDAO;
	
	public CategoriaController() {
		Connection connection = 
				new ConnectionFactory().recuperarConexao();
		this.categoriaDAO =  new CategoriaDAO(connection);
	}
	
	public List<Categoria> listar() {
		return this.categoriaDAO.listar();
	}
}