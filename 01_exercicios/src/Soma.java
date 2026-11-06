/*Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma 
mensagem explicativa, conforme exemplos. */

import java.util.Scanner;

public class Soma {
	public static void main (String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println ("insira o primeiro numero:");
		int a = sc.nextInt();
		
		System.out.println ("insira o segundo numero:");
		int b = sc.nextInt();
		
		int soma = a+b;
		
		System.out.println("a soma entre " + a + " e " + b + " é: " + soma);
		
		sc.close();
	}
	
}
