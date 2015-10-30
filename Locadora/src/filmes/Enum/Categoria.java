package filmes.Enum;

public enum Categoria {
	ACAO("Ação"), SUSPENSE("Suspense"), ROMANCE("Romance"), TERROR("Terror"), COMEDIA("Comédia");
	
	private final String categoria;

	private Categoria(String categoria) {
		this.categoria = categoria;
	}

	public String nomeGenero() {
		return categoria;
	}
}
