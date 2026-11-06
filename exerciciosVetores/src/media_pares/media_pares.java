/*Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média 
aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for 
digitado, mostrar a mensagem "NENHUM NUMERO PAR" */

package media_pares;

import java.util.Locale;
import java.util.Scanner;

public class media_pares {

	public static void main (String [] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Quantos elementos serão incluidos: ");
		int n = sc.nextInt();
		
		System.out.println("Insira os valores desejados: ");
		int [] vect = new int [n];
		for (int i = 0; i<n ; i++) {
			vect[i]=sc.nextInt();
		}
		
		double soma = 0; 
		int contPares = 0;
		
		for(int i=0;i<n;i++) {
			if(vect[i]%2==0) {
				soma += vect[i];
				contPares++;
			}
		}
		

		if (contPares > 0) {
    double avg = soma / contPares;
    System.out.printf("Média dos pares: %.2f", avg);
		} else {
    System.out.println("Nenhum numero par");
		}

	
		sc.close();
	}
}
