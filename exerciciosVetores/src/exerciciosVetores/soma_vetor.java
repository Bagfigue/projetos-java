package exerciciosVetores;

import java.util.Locale;
import java.util.Scanner;

public class soma_vetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Quantos numeros deseja adicionar? ");
		int n = sc.nextInt();
		double [] vect = new double [n];
		
		
		for (int i = 0; i<n; i++) {
			System.out.printf("Insira %d números:", n);			
			vect[i] = sc.nextDouble();
		}
		
		double soma = 0.0;
		double avg = 0.0;
		
		System.out.println("Os numeros digitados são: ");
		for (int i = 0; i<n; i++) {
			System.out.println(vect[i]);
			soma += vect[i];
			
			avg = soma/n;
			
		}
		System.out.println("A soma dos numeros digitados são: " + soma);
		System.out.println("A média dos numeros digitados são: " + avg);
		
		
		sc.close();

	}

}
