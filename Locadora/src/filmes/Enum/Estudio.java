package filmes.Enum;

public enum Estudio {
	COLUMBIAPICTURES("Columbia Pictures"), TH20("20th Century Fox"), PIXAR("Pixar");	
	
	private final String estudio;

	private Estudio(String estudio) {
		this.estudio = estudio;
	}

	public String nomeEstudio() {
		return estudio;
	}
}
