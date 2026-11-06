/*Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na 
tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos, 
bem como os nomes dessas pessoas caso houver.*/

package alturas;

import java.util.Locale;
import java.util.Scanner;

public class alturas {

	public static void main (String [] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
			
		System.out.println("Insira quantas pessoas serão analisadas: ");
		int n = sc.nextInt();
		double [] vectaltura = new double [n];
		int [] vectidade = new int[n];
		String [] vectnome = new String [n];
		
		double soma = 0;
		double altMedia = 0;
		int menorIdade = 0;
		double porcentagem = 0;
		
		for(int i = 0; i<n; i++) {
			System.out.println("Insira os dados da pessoa:");
			sc.nextLine();
			
			System.out.println("Nome: ");
			vectnome[i] = sc.nextLine();
			
			System.out.println("Idade: ");
			vectidade [i] = sc.nextInt();
			
			System.out.println("Altura: ");
			vectaltura[i] = sc.nextDouble();
		}
		
		for(int i = 0; i<n; i++) {
			System.out.println("Dados da pessoa: ");
			System.out.println(vectnome[i]);
			System.out.println(vectidade[i]);
			System.out.println(vectaltura[i]);
			
		}
		
		for (int i = 0; i < n; i++) {
			soma += vectaltura[i];
		}
		
		altMedia = soma/n;
		System.out.printf("altura media: %.2f%n", altMedia);
		
		for (int i = 0; i<n; i++) {
			if(vectidade[i]<16) {
				menorIdade++;
			}
		}
		

		porcentagem  = (double) menorIdade / n * 100;
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", porcentagem);


		for (int i = 0; i < n; i++) {
			if (vectidade[i] < 16) {
				System.out.println(vectnome[i]);
			}
		}

	
		
		sc.close();
	}
}
