/*
Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas, 
começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme 
exemplo.
*/

import java.util.Scanner;

public class QuadradoCubo {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int N; 
		double quadrado;
		double cubo;
		
		System.out.println("Insira o valor de N: ");
		N = sc.nextInt();
		
		for(int i = 1; i<=N; i++) {
			quadrado = Math.pow(i, 2);
			cubo = Math.pow(i,3);
			
			 System.out.println(i + " " + quadrado + " " + cubo);
		}
		sc.close();
	}
}
