/*Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por 
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas 
decimais. */

import java.util.Locale;
import java.util.Scanner;

public class Salario {
	
	public static void main(String [] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Insira o número do funcionario: ");
		int numero = sc.nextInt();
		
		System.out.println("Qual o numero de horas trabalhadas?: ");
		int horas = sc.nextInt();
		
		System.out.println("Quanto ele recebe por hora:" );
		double valor = sc.nextDouble();
		
		double salario = horas*valor;
		
		System.out.printf("O funcionário %d tem como salário: %.2f%n", numero, salario);
		
		sc.close();
	}

}
