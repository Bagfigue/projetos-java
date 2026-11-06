import java.util.Locale;
import java.util.Scanner;

public class DivisaoPares {

	public static void main (String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int N;
		double a, b, d;
		
		System.out.println("Quantos pares de numeros deseja adicionar? ");
		N = sc.nextInt();
		
		for(int i = 0; i<N; i++) {
			System.out.println("Insira o valor de a: ");
			a = sc.nextDouble();
			System.out.println("Insira o valor de b:");
			b = sc.nextDouble();
			if (b != 0) {
				d = a/b;
				System.out.printf("O valor da divisão é: %.1f%n", d);
			}else {
				System.out.println("disivão impossível");
			}
		}
		sc.close();
	}
	
}
