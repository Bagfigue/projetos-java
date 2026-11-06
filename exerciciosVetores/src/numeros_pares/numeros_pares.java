/*Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na 
tela todos os números pares, e também a quantidade de números pares.*/

package numeros_pares;

import java.util.Locale;
import java.util.Scanner;

public class numeros_pares {

	public static void main (String [] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Insira a quantidade de numeros que serão analisados: ");
		int n = sc.nextInt();
		int [] vect = new int[n];
		int pares = 0;
		
		for (int i = 0; i<n; i++) {
			System.out.println("Digite um numero: ");
			vect[i] = sc.nextInt();
		}
		
		System.out.println("NUMEROS PARES:");
		
		for(int i=0; i<n; i++) {
			if(vect[i]%2 ==0) {				
				System.out.println(vect[i] + " ");
				pares++;
			}
		}
		
		System.out.println();
		System.out.println("QUANTIDADE DE PARES = " + pares);
		
		sc.close();
	}
}
