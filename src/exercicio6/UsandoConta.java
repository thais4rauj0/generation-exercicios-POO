package exercicio6;

import java.util.Scanner;

public class UsandoConta {
	public static void main(String[]args) {
		
		ContaBancaria conta = new ContaBancaria();
		Scanner leitor = new Scanner(System.in);
		int op;
		
		System.out.println("\nVocê possui: " + conta.getSaldo());
		System.out.println("\nEscolha uma opção abaixo:\n1- Saque \n2- Depositar\n3-Transferir");
		op = leitor.nextInt();
		
		switch (op) {
		case 1: 
			System.out.println("\nDigite o valor que você deseja sacar: ");
			conta.setValor(leitor.nextFloat());
			
			System.out.println("\nVocê sacou: "+ conta.getValor()+"\nAgora você possui:" + conta.sacarDinheiro());
			break;
		
		case 2: 
			System.out.println("\nDigite o valor que você deseja depositar: ");
			conta.setValor(leitor.nextFloat());
			
			System.out.println("\nVocê depositou: " + conta.getValor() + "\nAgora você possui:" + conta.depositarDinheiro());
			break;
		case 3:
			System.out.println("\nDigite a conta de destino:\n");
			conta.setContaDestino(leitor.nextInt());
			System.out.println("\nDigite o valor que você deseja transferir: ");
			conta.setValor(leitor.nextFloat());
			
			System.out.println("\nO valor transferido foi:" + conta.getValor() + "\nA conta de destino:" + conta.getContaDestino() + "\nAgora você possui:" + conta.transferirDinheiro());
			break;
		default:
			System.out.println("\nValor Inválido");
		}
		
	}

}
