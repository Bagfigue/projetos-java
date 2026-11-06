package aprovados;

import java.util.Locale;
import java.util.Scanner;

public class aprovados {
	public static void main(String [] arg) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Quantos alunos serão digitados: ");
		int n = sc.nextInt();
		
		System.out.println("Insira o nome, a primeira e a segunda nota do %d aluno: ");
		String [] nome = new String [n];
		double [] primeiraNota = new double [n];
		double [] segundaNota = new double [n];
		
		for(int i=0;i<n;i++) {
			System.out.println("Nome: ");
			nome[i]=sc.next();
			System.out.println("Primeira nota: ");
			primeiraNota[i]=sc.nextDouble();
			System.out.println("Segunda nota: ");
			segundaNota[i]=sc.nextDouble();
		}
		
		double avg = 0;
		double soma = 0;
		
		System.out.println("Alunos aprovados: ");
		
		for(int i=0;i<n;i++) {
			soma = primeiraNota[i]+segundaNota[i];
			avg = soma/2;
			if(avg>=6) {
				System.out.println(nome[i]);
			}
		}
		sc.close();
	}

}
