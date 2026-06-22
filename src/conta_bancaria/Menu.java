package conta_bancaria;

import java.util.Scanner;

import conta_bancaria.model.Conta;
import conta_bancaria.util.Cores;

public class Menu {

	public static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		int opcao;
		
		/* Instanciar Objetos da Classe Conta*/
		
		Conta c1 = new Conta(1, 123, 1, "Logan", 200000.00f);
		c1.visualizar();
		Conta c2 = new Conta(1, 123, 2, "Luiza", 100000.00f);
		c2.visualizar();
		
		c1.setSaldo(300000.00f);
		c1.setTitular("Logan Xmen");
		c1.visualizar();
		
		System.out.println("\nSacar R$ 1000,00 da conta C2: " + (c2.sacar(1000.00f) ? 
				"Saque efetuado com Sucesso!" : "Saldo insuficiente"));
		
		System.out.println("\nSacar R$ 1000,00 da conta C2: " + (c2.sacar(300000.00f) ? 
				"Saque efetuado com Sucesso!" : "Saldo insuficiente"));
		c2.visualizar();
		
		c2.depositar(50000.00f);
		c2.visualizar();
		

		while (true) {

			System.out.println(Cores.TEXT_RED + Cores.ANSI_WHITE_BACKGROUND
					+ "*********************************************************************");

			System.out.println("                               BRADEZBANK                            ");

			System.out.println("*********************************************************************");

			System.out.println("                            1 - Criar Conta                          ");

			System.out.println("                        2 - Listar todas as Contas                   ");

			System.out.println("                       3 - Buscar Conta por Numero                   ");
 
			System.out.println("                       4 - Atualizar Dados da Conta                  ");

			System.out.println("                             5 - Apagar Conta                        ");

			System.out.println("                                6 - Sacar                            ");
 
			System.out.println("                               7 - Depositar                         ");

			System.out.println("                      8 - Transferir valores entre Contas            ");

			System.out.println("                                   0 - Sair                          ");

			System.out.println("*********************************************************************");

			System.out.println("Entre com a opção desejada:                                          ");

			System.out.println("                                                                     ");

			opcao = leia.nextInt();

			leia.nextLine();

			switch (opcao) {

			case 1:

				System.out.println("\n-> Opção Selecionada: Criar Conta");

				System.out.print("\nPressione ENTER para voltar ao menu...");

				leia.nextLine();

				break;

			case 2:

				System.out.println("\n-> Opção Selecionada: Listar todas as Contas");

				System.out.print("\nPressione ENTER para voltar ao menu...");

				leia.nextLine();

				break;

			case 3:

				System.out.println("\n-> Opção Selecionada: Buscar Conta por Numero");

				System.out.print("\nPressione ENTER para voltar ao menu...");

				leia.nextLine();

				break;

			case 4:

				System.out.println("\n-> Opção Selecionada: Atualizar Dados da Conta");

				System.out.print("\nPressione ENTER para voltar ao menu...");

				leia.nextLine();

				break;

			case 5:

				System.out.println("\n-> Opção Selecionada: Apagar Conta");

				System.out.print("\nPressione ENTER para voltar ao menu...");

				leia.nextLine();

				break;

			case 6:

				System.out.println("\n-> Opção Selecionada: Sacar");

				System.out.print("\nPressione ENTER para voltar ao menu...");

				leia.nextLine();

				break;

			case 7:

				System.out.println("\n-> Opção Selecionada: Depositar");

				System.out.print("\nPressione ENTER para voltar ao menu...");

				leia.nextLine();

				break;

			case 8:

				System.out.println("\n-> Opção Selecionada: Transferir valores entre Contas");

				System.out.print("\nPressione ENTER para voltar ao menu...");

				leia.nextLine();

				break;

			case 0:

				System.out.println("\n*********************************************************************");

				System.out.println("BRADEZBANK - OBRIGADO POR UTILIZAR NOSSOS SERVIÇOS! ");

				System.out.println("*********************************************************************");

				leia.close();

				System.exit(0);

				break;

			default:

				System.out.println("\nOpção Inválida! Escolha um número de 0 a 8.");

				System.out.print("\nPressione ENTER para continuar...");

				leia.nextLine();

				break;

			}

		}

	}

}
