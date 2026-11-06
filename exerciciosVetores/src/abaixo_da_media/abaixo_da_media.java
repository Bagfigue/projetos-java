/*Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida, 
mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos 
os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.*/

package abaixo_da_media;

import java.util.Locale;
import java.util.Scanner;

public class abaixo_da_media {

	public static void main (String [] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Insira quantos elementos: ");
		int n = sc.nextInt();
		
		double [] vect = new double [n];
		
		double soma = 0;
		double avg = 0;
		
		System.out.println("Insira os elementos desejados: ");
		for (int i = 0; i < n; i++) {
			vect[i] = sc.nextDouble();
		}

		
				
		for(int i = 0; i<n; i++) {
			soma += vect[i];
		}
		
		avg = soma/n;
		
		System.out.println("Elementos abaixo da media: ");
		for (int i = 0; i<n; i++) {
			if (vect[i]<avg) {
				System.out.println(vect[i]);
			}
		}
		
		System.out.printf("Media do vetor: %.2f%n", avg);

		
		
		sc.close();
	}
}
