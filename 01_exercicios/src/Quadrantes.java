/* Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema 
cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo 
menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).*/

import java.util.Scanner;

public class Quadrantes {
	public static void main(String [] args) {
		Scanner sc = new Scanner (System.in);
		
		double X,Y;
		do {
			System.out.println("Insira o valor de X: ");
			X = sc.nextDouble();
			
			System.out.println("Insira o valor de Y:");
			Y = sc.nextDouble();
			
			if(X==0||Y==0) {
				break;
			}
			

			if (X > 0 && Y > 0) {
                System.out.println("Quadrante Q1");
            } else if (X < 0 && Y > 0) {
                System.out.println("Quadrante Q2");
            } else if (X < 0 && Y < 0) {
                System.out.println("Quadrante Q3");
            } else { // x > 0 && y < 0
                System.out.println("Quadrante Q4");
            }

		}
		while(X!=0 || Y!=0);
		
		
	}

}
