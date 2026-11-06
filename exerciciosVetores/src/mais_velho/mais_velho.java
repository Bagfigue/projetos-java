package mais_velho;

import java.util.Locale;
import java.util.Scanner;

public class mais_velho {
	public static void main (String [] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("quantas pessoas você vai digitar: ");
		int n = sc.nextInt();
		
		String [] vectNome = new String [n];
		int [] vectIdade = new int [n];
		
		for (int i = 0; i<n; i++) {
			System.out.printf("dados da %d pessoa: \n", i+1);
			sc.nextLine();
			System.out.println("Nome: ");
			vectNome[i] = sc.nextLine();
			System.out.println("Idade: ");
			vectIdade[i] = sc.nextInt();
		}
		
		int maioridade = vectIdade[0];
		int posicaoMaior = 0;
		
		for (int i=0; i<n;i++) {
			if(vectIdade[i]>maioridade) {
				maioridade = vectIdade[i];
				posicaoMaior = i;
			}			
		}
		
		System.out.printf("PESSOA MAIS VELHA: %s%n", vectNome[posicaoMaior]);
		
		sc.close();
		
	}

}
