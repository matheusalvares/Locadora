package filmes;

import java.util.ArrayList;

import filmes.Enum.*;
//import pessoas.Ator;

public class Filme {
	private String codigo;
	private String nomeFilme;
	private String anoProducao;
	private int duracao;
	private Categoria categoria;
	private Censura idadeCensura;
	private Estudio estudio;
	private double aluguel;
	//ArrayList<Ator> elenco = new ArrayList<Ator>();
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}	
	public String getNomeFilme() {
		return nomeFilme;
	}
	public void setNomeFilme(String nomeFilme) {
		this.nomeFilme = nomeFilme;
	}
	public String getAnoProducao() {
		return anoProducao;
	}
	public void setAnoProducao(String anoProducao) {
		this.anoProducao = anoProducao;
	}
	public int getDuracao() {
		return duracao;
	}
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public Censura getIdadeCensura() {
		return idadeCensura;
	}
	public void setIdadeCensura(Censura idadeCensura) {
		this.idadeCensura = idadeCensura;
	}
	public Estudio getEstudio() {
		return estudio;
	}
	public void setEstudio(Estudio estudio) {
		this.estudio = estudio;
	}
	public double getAluguel() {
		return aluguel;
	}
	public void setAluguel(double aluguel) {
		this.aluguel = aluguel;
	}
	
	/*public void relacionarAtorFilme(){
		Ator a = new Ator("Johnny Depp", "Americano", 52);;
		
		elenco.add(a);
	}
	
	public void listarAtores(){
		for(Ator a: elenco){
			System.out.print(a.getNomeAtor() + "; ");
		}
	}*/
	
	public boolean equals(Object obj){
		if(obj instanceof Filme){
			Filme f = (Filme) obj;
			
			return this.getCodigo().equals(f.getCodigo());					
		}
		else{
			return false;
		}
	}
}
