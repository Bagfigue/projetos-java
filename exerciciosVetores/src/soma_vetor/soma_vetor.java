package soma_vetor;

import java.util.Locale;
/*Faça um programa que leia N números reais e armazene-os em um vetor.
 * Em seguida: - Imprimir todos os elementos do vetor - Mostrar na 
 * tela a soma e a média dos elementos do vetor*/

import java.util.Scanner;

public class soma_vetor {
	
	public static void main (String [] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Insira quantos números serão analisados: ");
		int  n = sc.nextInt();
		double [] vect = new double [n];
		double soma = 0;
		
		for (int i = 0; i<n; i++) {
			System.out.println("Digite um número: ");
			vect[i]=sc.nextDouble();
		}
				
			
		System.out.println("Valores: ");
		for (int i = 0; i<n; i++) {
			System.out.print(vect[i]+" ");
		}
		
		for (int i = 0; i<n; i++) {
			soma += vect[i];
		}
		System.out.printf("SOMA =%.2f%n", soma);
		
		double avg = soma/n;
		System.out.printf("MEDIA =%.2f%n", avg);
		
		sc.close();
	}
	
}
