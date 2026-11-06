/*Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o 
X, se for o caso. */

import java.util.Locale;
import java.util.Scanner;

public class InteirosImpares {

	public static void main (String [] args) {
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		int x = 0;
		
		System.out.println("Insira o valor de X: ");
		x = sc.nextInt();
		
		for(int i = 0; i<=x; i++) {
			if(i%2 != 0) {
				System.out.println("Os números ímpares são: "+ i);
			}
		}
		sc.close();
		
	}
	
}
