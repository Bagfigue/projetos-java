/*Fazer um programa para ler as temperaturas em Celsius e mostrar o equivalente em Fahrenheit. Perguntar se o usuário deseja 
 * repetir (s/n). Caso o usuário digite "s", repetir o programa*/

import java.util.Locale;
import java.util.Scanner;

public class Fahrenheit {

	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double celcius, fahrenheit;
		char resposta;
		
		do {
			System.out.println("Insira o valor desejado em Celsius: ");
			celcius = sc.nextDouble();
			
			fahrenheit = 9*celcius/5+32;
			
			System.out.printf("O valor em fahrenheit é: %.2f%n", fahrenheit);
			System.out.print("Deseja repetir? (s/n)");
			resposta = sc.next().charAt(0);
		
		} while(resposta == 's');
		
		sc.close();
		}
		
		
	}

