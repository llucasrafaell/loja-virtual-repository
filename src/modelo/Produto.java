package modelo;
public class Produto {

		private Integer id;
		private String nome;
		private String descricao;
		private Integer categoriaId;
		
		public Produto() {}

		public Produto(String nome, String descricao) {
			super();
			this.nome = nome;
			this.descricao = descricao;
		}
		
		public Produto(Integer id, String nome, String descricao) {
			super();
			this.setId(id);
			this.nome = nome;
			this.descricao = descricao;
		}
		
		public String getNome() {
			return nome;
		}

		public String getDescricao() {
			return descricao;
		}
		public Integer getCategoriaId() {
			return categoriaId;
		}

		public void setCategoriaId(Integer categoriaId) {
			this.categoriaId = categoriaId;
		}
		@Override
		public String toString() {
			return String.format("O produto eh: %d, %s, %s", this.getId(), this.nome, this.descricao);
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

}
