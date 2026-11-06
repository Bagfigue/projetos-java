package exerciciosVetores;

import java.util.Locale;
import java.util.Scanner;

public class mediaAlturas {

	public static void main (String [] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("quantas alturas serão analisadas?");
		
		int n = sc.nextInt();
		double [] vect = new double [n];
		
		System.out.println("Digite as alturas (em metros), uma por linha:");
		
		for (int i = 0; i<n; i++) {
			vect[i] = sc.nextDouble();
		}
		
		double soma = 0.0;
		for(int i = 0; i< n; i++) {
			soma += vect[i];
		}
		
		double avg = soma/n;
		
		System.out.println("O valor da media das alturas é: " + avg);
		
		sc.close();
	}
}
