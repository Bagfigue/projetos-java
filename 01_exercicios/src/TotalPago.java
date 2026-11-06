/*Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o 
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago. */

import java.util.Locale;
import java.util.Scanner;

public class TotalPago {
	
	public static void main (String [] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Insira o código da peça 1, o número de peças desejado e o valor: ");
		int codigo = sc.nextInt();
		int n_pecas = sc.nextInt();
		double valor = sc.nextDouble();
		
		System.out.println("Insira o código da peça 2, o número de peças desejado e o valor: ");
		int codigo2 = sc.nextInt();
		int n_pecas2 = sc.nextInt();
		double valor2 = sc.nextDouble();
		
		double total_pago = (n_pecas*valor)+(n_pecas2*valor2);
		
		System.out.println("O valor a ser pago é: " + total_pago);
		
		sc.close();	
		
		
	}

}
