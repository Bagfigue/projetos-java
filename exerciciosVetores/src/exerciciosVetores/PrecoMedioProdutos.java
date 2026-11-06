package exerciciosVetores;

import java.util.Locale;
import java.util.Scanner;

public class PrecoMedioProdutos {

	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Quantos produtos serão analisados?");
		int n = sc.nextInt();
		String [] nomes = new String[n];
		double [] precos = new double[n];
		
		System.out.println("Digite o nome e o preço dos produtos:");
		for(int i = 0; i<n; i++) {
			System.out.println("nome do produto:");
			sc.nextLine(); 
				nomes[i]=sc.nextLine();
			System.out.println("preço do produto:");
				precos[i]=sc.nextDouble();
		}
		double soma = 0.0;
		for (int i = 0; i<n; i++) {
			soma += precos[i];
		}
		double avgPrice = soma/n;
		
		System.out.println("A media dos preços é: " + avgPrice);
		
		
		
		sc.close();
	}
}
