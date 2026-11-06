/*
Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1. 
Lembrando que, por definição, fatorial de 0 é 1.*/

import java.util.Locale;
import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner (System.in);
	
	int N; 
	int F = 1;
	
	System.out.println("Insira o valor de N:");
	N = sc.nextInt();
	
	for(int i = 1; i<=N; i++) {
		if(N == 0) {
			System.out.println("O fatorial de = é 1");
		}else {
			F=F*i;
		}
	}
	 System.out.println("O fatorial é: " + F);

     sc.close();
	
	}
}
