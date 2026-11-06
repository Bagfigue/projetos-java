/*Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não. */

import java.util.Scanner;

public class Nnegativo {
public static void main (String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Insira o número desejado: ");
	double n = sc.nextDouble();
	
	if(n<0) {
		System.out.println("o número é NEGATIVO.");
	}
	else {
		System.out.println("O número é POSITIVO");
	}
}
}

