/*Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro 
casas decimais conforme exemplos. */

import java.util.Scanner;

public class Raio {
	public static void main (String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o valor do raio: ");
		double raio = sc.nextDouble();
				
		double area = Math.PI * Math.pow(raio,2);
		
		System.out.printf("O valor da área do círculo é: %.4f%n", area);
		
		sc.close();
		
	}

}
