/*Ler um número inteiro N e calcular todos os seus divisores. */

import java.util.Scanner;

public class CalculoDiv {

	public static void main(String [] args) {
	Scanner sc = new Scanner (System.in);
	int N;
	
	System.out.println("Insira um numero inteiro: ");
	N=sc.nextInt();
	
	for(int i = 1; i<=N; i++) {
		if(N%i == 0) {
			System.out.println(i);
		}else {
			/*System.out.println(i + "não é divisor");*/
		}
	}
	sc.close();
	}
}
