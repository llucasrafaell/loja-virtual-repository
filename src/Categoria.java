
public class Categoria {

	private Integer id;
	private String nome;
	
	
	public Categoria() {}
	
	public Categoria(Integer id, String nome) {
		this.setId(id);
		this.setNome(nome);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return String.format("A categoria eh: %d, %s", this.id, this.nome);
	}
}
