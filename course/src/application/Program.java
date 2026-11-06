/*Fazer um programa para ler as medidas dos lados de dois triângulos XeY (suponha medidas
		válidas).Em seguida, mostrar o valor das áreas dos dois triângulos e dizer qual dos dois triângulos
		possui a maior área.*/


package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangulo;

public class Program {

	public static void main(String[] args) {
		
				Locale.setDefault(Locale.US);
				Scanner sc = new Scanner (System.in);
				
				Triangulo x, y;
				x = new Triangulo();
				y = new Triangulo();
				
				System.out.println("Insira as medidas do primeiro triangulo: ");
				x.a = sc.nextDouble();
				x.b = sc.nextDouble();
				x.c = sc.nextDouble();
				
				System.out.println("Insira as medidas do segundo triangulo: ");
				y.a = sc.nextDouble();
				y.b = sc.nextDouble();
				y.c = sc.nextDouble();
				
				double area1 = x.area();
				double area2 = y.area();
				
				System.out.printf("Triangulo 1: %.4f%n", area1);
				System.out.printf("Triangulo 2: %.4f%n", area2);
				
				if(area1>area2) {
					System.out.println("triangulo 1 é maior. ");
				} else if (area1==area2){
					System.out.println("triangulo 1 é igual ao triangulo 2 ");
				}else{
					System.out.println("triangulo 2 é maior. ");
				}
				
				sc.close();
			}
	

}
