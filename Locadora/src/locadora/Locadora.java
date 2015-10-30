package locadora;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import pessoas.Cliente;
import filmes.Filme;
import filmes.Enum.*;

public class Locadora {
	Scanner s = new Scanner(System.in);
	ArrayList<Filme> filmes = new ArrayList<Filme>();
	ArrayList<Cliente> clientes = new ArrayList<Cliente>();	

	public void registrarCliente(){		
		Cliente c = new Cliente();

		System.out.print("Nome cliente: ");
		c.setNomeCliente(s.nextLine());
		System.out.print("Endereço: ");
		c.setEndereco(s.nextLine());
		System.out.print("CPF: ");
		c.setCpf(s.nextLine());
		System.out.print("E-mail: ");
		c.setEmail(s.nextLine());
		System.out.print("Telefone: ");
		c.setTelefone(s.nextLine());
		c.adicionarDependentes();
		clientes.add(c);
	}

	public void adicionarFilme(){
		Filme f = new Filme();
		int censura = -1;
		int estudio = -1;
		int categoria = -1;
		boolean teste = true;

		System.out.print("Código do filme: ");
		f.setCodigo(s.nextLine());
		System.out.print("Nome filme: ");
		f.setNomeFilme(s.nextLine());
		System.out.print("Ano de Produção: ");
		f.setAnoProducao(s.nextLine());
		while(teste){
			try{
				System.out.print("Duração: ");
				f.setDuracao(s.nextInt());
				teste = false;
			}catch(InputMismatchException ime){
				System.out.println("\nTipo de dado inválido.\n");
				s.nextLine();
			}
		}
		teste = true;
		while(teste){
			try{
				while(censura == -1){	
					System.out.println("Informe a censura:\n1- 12 anos;\n2- 16 anos;\n3- 18 anos;");
					censura = s.nextInt();
					switch(censura){
					case 1: 
						f.setIdadeCensura(Censura.DOZE);
						teste = false;
						break;
					case 2:
						f.setIdadeCensura(Censura.DEZESSEIS);
						teste = false;
						break;
					case 3:
						f.setIdadeCensura(Censura.DEZOITO);
						teste = false;
						break;
					default:
						censura = -1;
						System.out.println("*****************");
						System.out.println("Opção Inválida");
					}
				}
			} catch(InputMismatchException ime){
				System.out.println("\nTipo de dado inválido.\n");
				s.nextLine();
			}
		}
		teste = true;
		while(teste){
			try{
				while(estudio == -1){
					System.out.println("Informe o estúdio:\n1- Columbia Pictures;\n2- 20th Century Fox;\n3- Pixar;");
					estudio = s.nextInt();
					switch(estudio){
					case 1: 
						f.setEstudio(Estudio.COLUMBIAPICTURES);
						teste = false;
						break;
					case 2:
						f.setEstudio(Estudio.TH20);
						teste = false;
						break;
					case 3:
						f.setEstudio(Estudio.PIXAR);
						teste = false;
						break;
					default:
						estudio = -1;
						System.out.println("*****************");
						System.out.println("Opção Inválida");
					}
				}
			}catch(InputMismatchException ime){
				System.out.println("\nTipo de dado inválido.\n");
				s.nextLine();
			}
		}
		teste = true;
		while(teste){
			try{
				while(categoria == -1){
					System.out.println("Categoria:\n1- Ação;\n2- Comédia;\n3- Romance;\n4- Suspense;\n5- Terror;");
					categoria = s.nextInt();
					switch(categoria){
					case 1: 
						f.setCategoria(Categoria.ACAO);
						teste = false;
						break;
					case 2:
						f.setCategoria(Categoria.COMEDIA);
						teste = false;
						break;
					case 3:
						f.setCategoria(Categoria.ROMANCE);
						teste = false;
						break;
					case 4:
						f.setCategoria(Categoria.SUSPENSE);
						teste = false;
						break;
					case 5:
						f.setCategoria(Categoria.TERROR);
						teste = false;
						break;	
					default:
						categoria = -1;
						System.out.println("*****************");
						System.out.println("Opção Inválida");
					}
				}
			}catch(InputMismatchException ime){
				System.out.println("\nTipo de dado inválido.\n");
				s.nextLine();
			}
		}
		teste = true;
		while(teste){
			try{
				System.out.print("Preço Aluguel: ");
				f.setAluguel(s.nextDouble());
				teste = false;
			}catch(InputMismatchException ime){
				System.out.println("\nTipo de dado inválido.\n");
				s.nextLine();
			}
		}
		//f.relacionarAtorFilme();

		filmes.add(f);
	}

	public void alugarFilme(){
		Cliente cliente = new Cliente();
		Filme filme = new Filme();

		System.out.print("Insira seu cpf: ");
		cliente.setCpf(s.nextLine());

		for(Cliente c : clientes){
			if(cliente.equals(c)){
				System.out.print("Insira o código do filme que deseja alugar: ");
				for(Filme f: filmes){
					System.out.println("");
					System.out.print("Código: " + f.getCodigo());
					System.out.println(" | Nome: " + f.getNomeFilme());
				}
				filme.setCodigo(s.nextLine());	
				for(Filme f: filmes){
					if(filme.equals(f)){
						c.filmesAlugados.add(f);
					}
				}
			}			
		}
	}

	public void listarCliente(){
		for(Cliente c: clientes){
			System.out.println("");
			System.out.println("Nome: " + c.getNomeCliente());
			System.out.println("Endereço: " + c.getEndereco());
			System.out.println("CPF: " + c.getCpf());
			System.out.println("E-mail: " + c.getEmail());
			System.out.println("Telefone: " + c.getTelefone());			
			c.listarDependentes();
			System.out.println("");
			c.listarFilmesAlugados();
			System.out.println("");
		}
	}

	public void listarFilmes(){
		for(Filme f: filmes){
			System.out.println("");
			System.out.println("Código: " + f.getCodigo());
			System.out.println("Nome: " + f.getNomeFilme());
			System.out.println("Duração: " + f.getDuracao() + " minutos");
			System.out.println("Ano de Produção: " + f.getAnoProducao());
			System.out.println("Censura: " + f.getIdadeCensura().idadeMinima());
			System.out.println("Estúdio: " + f.getEstudio().nomeEstudio());
			System.out.println("Genero: " + f.getCategoria().nomeGenero());
			System.out.println("Preço do Aluguel: R$" + f.getAluguel());
			//System.out.print("Elenco: ");
			//f.listarAtores();
			System.out.println("");
		}
	}
}