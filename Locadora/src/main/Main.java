package main;

import java.util.InputMismatchException;
import java.util.Scanner;

import locadora.Locadora;

public class Main {

	public static void main(String[] args) {
		Locadora l = new Locadora();
		int opcao = 0;
		int opcaoM = 0;
		boolean t = true;
		Scanner s = new Scanner(System.in);

		while (t) {
			try {
				System.out.println("Digite 1 para acessar como Funcionário, 2 para Cliente e 3 para finalizar o programa.");
				System.out.print("Entre com a opção desejada: ");
				opcaoM = s.nextInt();
				s.nextLine();
				if (opcaoM > 0 && opcaoM < 4) {
					t = false;
				}

				// Validador da escolha de cliente ou funcionario.
				while (opcaoM < 1 || opcaoM > 3) {

					System.out.println("OPÇÃO INVÁLIDA!");
					System.out.println("Digite 1 para acessar como Funcionário, 2 para Cliente e 3 para finalizar o programa.");
					System.out.print("Entre com a opção desejada: ");
					opcaoM = s.nextInt();
					s.nextLine();
					if (opcaoM > 0 && opcaoM < 4) {
						t = false;
					}
				}
			} catch (InputMismatchException ime) {
				System.out.println("");
				System.out.println("OPÇÃO INVÁLIDA!");
				s.nextLine();
			}
		}

		t = true;

		while (opcaoM != 3) {
			if (opcaoM == 1) {// opção para acessar como funcionario.
				while (t) {
					try {
						System.out.println("");
						System.out.println("Digite 1 para registrar um cliente.");
						System.out.println("Digite 2 para adicionar um filme ao estoque.");
						System.out.println("Digite 3 para listar clientes registrados.");
						System.out.println("Digite 4 para listar filmes do estoque.");
						System.out.print("Entre com a opção desejada: ");
						opcao = s.nextInt();
						s.nextLine();
						if (opcao > 0 && opcao < 5) {
							t = false;
						}
						while (opcao < 1 || opcao > 4) {
							System.out.println("");
							System.out.println("Digite 1 para registrar um cliente.");
							System.out.println("Digite 2 para adicionar um filme ao estoque.");
							System.out.println("Digite 3 para listar clientes registrados.");
							System.out.println("Digite 4 para listar filmes do estoque.");
							System.out.print("Entre com a opção desejada: ");
							opcao = s.nextInt();
							s.nextLine();
							if (opcao > 0 && opcao < 7) {
								t = false;
							}
						}
					} catch (InputMismatchException ime) {
						System.out.println("");
						System.out.println("OPÇÃO INVÁLIDA!");
						s.nextLine();
					}
				}

				t = true;

				if (opcao == 1) {
					System.out.println("");
					l.registrarCliente();
				} else if (opcao == 2) {
					System.out.println("");
					l.adicionarFilme();
				} else if (opcao == 3) {
					System.out.println("");
					l.listarCliente();
				} else if (opcao == 4) {
					System.out.println("");
					l.listarFilmes();
				} 
			} else if (opcaoM == 2) {// Opçao para acessar como cliente.
				while (t) {
					try {
						System.out.println("");
						System.out.println("Digite 1 para listar filmes disponiveis.");
						System.out.println("Digite 2 para alugar.");
						System.out.print("Entre com a opção desejada: ");
						opcao = s.nextInt();
						s.nextLine();
						if (opcao > 0 && opcao < 3) {
							t = false;
						}

						while (opcao < 1 || opcao > 2) {
							System.out.println("");
							System.out.println("Digite 1 para listar filmes disponiveis.");
							System.out.println("Digite 2 para alugar.");
							System.out.print("Entre com a opção desejada: ");
							System.out.print("Entre com a opção desejada: ");
							opcao = s.nextInt();
							s.nextLine();
							if (opcao > 0 && opcao < 3) {
								t = false;
							}
						}
					} catch (InputMismatchException ime) {
						System.out.println("");
						System.out.println("OPÇÃO INVÁLIDA!");
						s.nextLine();
					}
				}

				t = true;

				if (opcao == 1) {
					l.listarFilmes();
				} else if (opcao == 2) {
					System.out.println("");
					l.alugarFilme();
				} 
			}
			while (t) {
				try {
					System.out.println("");
					System.out.println("Digite 1 para acessar como Funcionário, 2 para Cliente e 3 para finalizar o programa.");
					System.out.print("Entre com a opção desejada: ");
					opcaoM = s.nextInt();
					s.nextLine();
					if (opcaoM > 0 && opcaoM < 4) {
						t = false;
					}
					while (opcaoM < 1 || opcaoM > 3) {		
						System.out.println("");				
						System.out.println("OPÇÃO INVÁLIDA!");
						System.out.println("Digite 1 para acessar como Funcionário, 2 para Cliente e 3 para finalizar o programa.");
						System.out.print("Entre com a opção desejada: ");
						opcaoM = s.nextInt();
						s.nextLine();
						if (opcaoM > 0 && opcaoM < 4) {
							t = false;
						}
					}
				} catch (InputMismatchException ime) {
					System.out.println("");
					System.out.println("OPÇÃO INVÁLIDA!");
					s.nextLine();
				}
			}
			t = true;
		}
		s.close();
		System.out
		.println("*************************************************************");
		System.out
		.println("********************|PROGRAMA ENCERRADO!|********************");
		System.out
		.println("*************************************************************");
	}
}