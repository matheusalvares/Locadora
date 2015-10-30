package pessoas;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import filmes.Filme;

public class Cliente {
	private String nomeCliente;
	private String endereco;
	private String cpf;
	private String email;
	private String telefone;
	ArrayList<String> dependentes = new ArrayList<String>();
	public ArrayList<Filme> filmesAlugados = new ArrayList<Filme>();
	Scanner s = new Scanner(System.in);
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public void adicionarDependentes(){
		int n = 0;
		String dependente;
		boolean teste = true;
		
		while(teste){
			try{
				System.out.print("Número de dependentes: ");
				n = s.nextInt();
				teste = false;
			}catch(InputMismatchException ime){
				System.out.println("\nTipo de dado inválido.\n");
				s.nextLine();
			}
		}		
		for(int i = 0; i < n; i++){
			System.out.print("Dependente " + (i + 1) + ": ");
			dependente = s.next();
			dependentes.add(dependente);
		}
	}
	
	public void listarDependentes(){
		System.out.println("Número de dependentes: " + dependentes.size());		
		System.out.print("Dependentes: ");
		for(String s : dependentes){
			System.out.print(s + "; ");
		}
	}
	
	public void listarFilmesAlugados(){
		System.out.print("Filmes Alugados: ");
		for(Filme f : filmesAlugados){
			System.out.println(f.getNomeFilme() + "; ");
		}
	}
	
	public boolean equals(Object obj){
		if(obj instanceof Cliente){
			Cliente c = (Cliente) obj;
			
			return this.getCpf().equals(c.getCpf());					
		}
		else{
			return false;
		}
	}
}