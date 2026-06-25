package conta_bancaria;

import java.util.InputMismatchException;
import java.util.Optional;
import java.util.Scanner;

import conta_bancaria.model.Conta;
import conta_bancaria.model.ContaCorrente;
import conta_bancaria.model.ContaPoupanca;
import conta_bancaria.util.Cores;
import conta_bancaria.controller.ContaController;
public class Menu {

	private static final Scanner leia = new Scanner(System.in);
	private static final ContaController contaController = new ContaController();

	public static void main(String[] args) {

		int opcao;
		
		//Criar dados de teste
		criarContasTeste();

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

			System.out.println("                                                                     " + Cores.TEXT_RESET);

			try{
				opcao = leia.nextInt();

			leia.nextLine();
			} catch(InputMismatchException e) {
				opcao =-1;
				System.out.println("Digite um néumero inteiro entre 0 e 8");
			leia.nextLine();
			}

			switch (opcao) {

			case 1:

				System.out.println("\n-> Opção Selecionada: Criar Conta");

				cadastrarConta();

				keyPress();
				break;

			case 2:

				System.out.println("\n-> Opção Selecionada: Listar todas as Contas");

				System.out.print("\nPressione ENTER para voltar ao menu...");

				listarContas();
				keyPress();
				

				break;

			case 3:

				System.out.println("\n-> Opção Selecionada: Buscar Conta por Numero");

				procurarContaPorNumero();

				keyPress();

				break;

			case 4:

				System.out.println("\n-> Opção Selecionada: Atualizar Dados da Conta");
				atualizarConta();
				keyPress();

				break;

			case 5:

				System.out.println("\n-> Opção Selecionada: Apagar Conta");

				deletarConta();
				keyPress();

				break;

			case 6:

				System.out.println("\n-> Opção Selecionada: Sacar");

				System.out.print("\nPressione ENTER para voltar ao menu...");

				keyPress();

				break;

			case 7:

				System.out.println("\n-> Opção Selecionada: Depositar");

				System.out.print("\nPressione ENTER para voltar ao menu...");

				keyPress();

				break;

			case 8:

				System.out.println("\n-> Opção Selecionada: Transferir valores entre Contas");

				System.out.print("\nPressione ENTER para voltar ao menu...");

				keyPress();

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

				keyPress();

				break;

			}

		}
		
	}
	public static void keyPress() {
		System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para continuar...");
		leia.nextLine();
	}

		public static void criarContasTeste() {
			contaController.cadastrar(new ContaCorrente(contaController.gerarNumero(), 456, 1, "Thuany Silva", 1000000.00f, 100000.00f));
			contaController.cadastrar(new ContaPoupanca(contaController.gerarNumero(), 456, 2, "Marcia Condarco", 1000000.00f, 10));
	
	}
	public static void listarContas() {
		contaController.listarTodas();
	}
	public static void cadastrarConta() {
		System.out.println("Digite o número da agência: ");
		int agencia = leia.nextInt();
		System.out.println("Digite o nome do titular da conta : ");
		leia.skip("\\R");
		String titular = leia.nextLine();
		System.out.println("Digite o tipo de conta (1 - CC | 2 - CP): ");
		int tipo = leia.nextInt();
		System.out.println("Digite o saldo da conta: ");
		float saldo = leia.nextFloat();
		
		switch(tipo) { 
			case 1 -> {
				System.out.println("Digite o limite da conta: ");
				float limite = leia.nextFloat();
				leia.nextLine();
				
				contaController.cadastrar(new ContaCorrente(contaController.gerarNumero(), agencia, tipo, titular, saldo, limite));
			}
			case 2 -> { 
				System.out.println("Digite o aniversário da conta: ");
				int aniversario = leia.nextInt();
				leia.nextLine();
				
				contaController.cadastrar(new ContaPoupanca(contaController.gerarNumero(), agencia, tipo, titular, saldo, aniversario));
			}
			default -> System.out.println(Cores.TEXT_RED + "Tipo de conta inválida" + Cores.TEXT_RESET);
			}
	}
	
	public static void procurarContaPorNumero() {
		System.out.println("Digite o número da conta: ");
		int numero = leia.nextInt();
		leia.nextLine();
		
		contaController.procurarPorNumero(numero);
	}
			
	public static void deletarConta() {
		System.out.println("Digite o número da conta: ");
		int numero = leia.nextInt();
		leia.nextLine();
		
		Optional<Conta> conta = contaController.buscarNaCollection(numero);
		
		if (conta.isPresent()) {
			
			//confirmação da exclusão
			
			System.out.printf("\nTem certeza que você deseja excluir a conta número %d (S/N)?", numero);
			String confirmacao = leia.nextLine();
			
			if(confirmacao.equalsIgnoreCase("S"))
		contaController.deletar(numero);
			else
				System.out.println("\nOperação cancelada!");
		}else {
			System.out.printf("\nA conta número %d não foi encontrada!", numero);
		}
}
	
	public static void atualizarConta() {
		System.out.println("Digite o número da conta: ");
		int numero = leia.nextInt();
		leia.nextLine();
		
		Optional<Conta> conta = contaController.buscarNaCollection(numero);
		if(conta.isPresent()) {
			
			// Obtem os dados atuais da conta
			int agencia = conta.get().getAgencia();
			String titular = conta.get().getTitular();
			int tipo = conta.get().getTipo();
			float saldo = conta.get().getSaldo();
			
			//Atualiza a agência ou mantém o valot atual
			
			System.out.printf("Agência atual: %d"
					+ "%nDigite o número da nova agência (Pressione ENTER para manter o valor atual)", agencia);
			String entrada =leia.nextLine();
			agencia = entrada.isEmpty() ? agencia : Integer.parseInt(entrada);
			System.out.println(agencia);
			
			//Atualiza o titular ou mantém o valot atual
			
			System.out.printf("Titular atual: %s"
					+ "%nDigite o nome do novo Titular (Pressione ENTER para manter o valor atual)", titular);
			entrada =leia.nextLine();
			titular = entrada.isEmpty() ? titular : entrada;
		
			//Atualiza o Saldo ou mantém o valot atual
			
			System.out.printf("Saldo atual: %.2f"
					+ "%nDigite o novo Saldo (Pressione ENTER para manter o valor atual)", saldo);
			entrada =leia.nextLine();
			saldo = entrada.isEmpty() ? saldo : Float.parseFloat(entrada.replace(",", "."));
			
			switch(tipo) {
			case 1 ->{
				ContaCorrente contaCorrente = (ContaCorrente) conta.get();
				float limite = contaCorrente.getLimite();
				
				//Atualiza o limite ou mantém o valot atual
				
				System.out.printf("Limite atual: %.2f"
						+ "%nDigite o novo limite (Pressione ENTER para manter o valor atual)", limite);
				entrada =leia.nextLine();
				limite = entrada.isEmpty() ? limite : Float.parseFloat(entrada.replace(",", "."));
				
				contaController.atualizar(new ContaCorrente(numero, agencia, tipo, titular, saldo, limite));
			}
			case 2 -> {
				ContaPoupanca contaPoupanca = (ContaPoupanca) conta.get();
				int aniversario = contaPoupanca.getAniversario();
				
				//Atualiza o aniversário ou mantém o valot atual
				
				System.out.printf("Dia do aniversário atual: %d"
						+ "%nDigite o dia do aniversário da conta (Pressione ENTER para manter o valor atual)", aniversario);
				entrada =leia.nextLine();
				aniversario = entrada.isEmpty() ? aniversario : Integer.parseInt(entrada);
				
				contaController.atualizar(new ContaPoupanca(numero, agencia, tipo, titular, saldo, aniversario));
			}
			default -> System.out.println(Cores.TEXT_RED + "Tipo da conta é inválido!" + Cores.TEXT_RESET);
			}
			
			
			
		}else {
			System.out.printf("\nA conta número %d não foi encontrada!", numero);
		}
	}
}
