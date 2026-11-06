/* 
Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e 
mostre:  
a) a área do triângulo retângulo que tem A por base e C por altura.  
b) a área do círculo de raio C. (pi = 3.14159)  
c) a área do trapézio que tem A e B por bases e C por altura.  
d) a área do quadrado que tem lado B.  
e) a área do retângulo que tem lados A e B. */

import java.util.Locale;
import java.util.Scanner;

public class Areas {

	public static void main (String [] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Insira o valor de A, B e C: ");
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		
		double area1 = A*C/2;
		double pi = 3.14159;
		double area2 = pi*Math.pow(C, 2);
		double area3 = (A+B)*C/2;
		double area4 = Math.pow(B, 2);
		double area5 = A*B;
		
		System.out.println("triangulo: " + area1);
		System.out.println("circulo: " + area2);
		System.out.println("trapézio: " + area3);
		System.out.println("quadrado: " + area4);
		System.out.println("retangulo: " + area5);
		
		sc.close();
	}
}
