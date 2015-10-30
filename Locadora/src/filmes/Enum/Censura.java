package filmes.Enum;

public enum Censura {
	DOZE("12 anos"), DEZESSEIS("16 anos"), DEZOITO("18 anos"); 
	
	private final String censura;

	private Censura(String censura) {
		this.censura = censura;
	}

	public String idadeMinima() {
		return censura;
	}
}
