package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaBancaria;


public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		ContaBancaria conta = new ContaBancaria ();
		
		int x;
		
		System.out.println("Insira o nome do titular: ");
		String titular = sc.nextLine();
		System.out.println("Insira o numero da conta");
		double numeroConta = sc.nextDouble();
		
		System.out.println("Deseja fazer um deposito? (S = 1/N = 2)");
		x = sc.nextInt();
		if (x == 1) {
			System.out.println("Quanto deseja depositar? ");
			double deposito = sc.nextDouble();
			conta = new ContaBancaria(titular, numeroConta, deposito);
		} else if (x == 2) {
			conta = new ContaBancaria(titular, numeroConta);
		}
		
				
		System.out.println("Dados da conta: " + conta.toString());
		
		System.out.println("Digite o valor que deseja depositar: ");
		double deposito = sc.nextDouble();
		conta.Deposito(deposito);
		
		System.out.println("Dados da conta: " + conta.toString());
		
		
		System.out.println("Digite o valor que deseja sacar: ");
		double saque = sc.nextDouble();
		conta.Saque(saque);
		
		System.out.println("Dados da conta: " + conta.toString());
		
		sc.close();

	}

}
