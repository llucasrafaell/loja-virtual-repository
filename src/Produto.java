
public class Produto {

		private Integer id;
		private String nome;
		private String descricao;
		
		public Produto() {}

		public Produto(String nome, String descricao) {
			super();
			this.nome = nome;
			this.descricao = descricao;
		}

		public String getNome() {
			return nome;
		}

		public String getDescricao() {
			return descricao;
		}

		public void setId(Integer id) {
			this.id = id;
		}
		@Override
		public String toString() {
			return String.format("O produto criado foi: %d, %s, %s", this.id, this.nome, this.descricao);
		}
}
