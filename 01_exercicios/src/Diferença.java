/*Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto 
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).*/

import java.util.Scanner;

public class Diferença {

	public static void main (String [] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Insira o valor de A, B, C e D: ");
		float A = sc.nextFloat();
		float B = sc.nextFloat();
		float C = sc.nextFloat();
		float D = sc.nextFloat();
		
		float diferenca = (A*B-C*D);
				
				System.out.printf("O valor da diferença é: " + diferenca);
		
				
	sc.close();
		
	}
}
