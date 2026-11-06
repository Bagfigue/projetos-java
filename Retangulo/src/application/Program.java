/*Fazer um programa para ler os valores da largura e altura 
de um retângulo. Em seguida, mostrar na tela o valor de 
sua área, perímetro e diagonal. Usar uma classe como 
mostrado no projeto ao lado.*/

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class Program {
	
	public static void main (String [] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Insira o valor da altura: ");
		retangulo.altura = sc.nextDouble();
		System.out.println("Insira o valor da largura: ");
		retangulo.largura = sc.nextDouble();
		
		System.out.printf("O valor da área: %.2f%n", retangulo.area());
		System.out.printf("O valor do perimetro : %.2f%n", retangulo.perimetro());
		System.out.printf("O valor da diagonal: %.2f%n", retangulo.diagonal());
		
		sc.close();
	}

}
