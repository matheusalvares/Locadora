package filmes.Enum;

public enum Categoria {
	ACAO("A��o"), SUSPENSE("Suspense"), ROMANCE("Romance"), TERROR("Terror"), COMEDIA("Com�dia");
	
	private final String categoria;

	private Categoria(String categoria) {
		this.categoria = categoria;
	}

	public String nomeGenero() {
		return categoria;
	}
}
