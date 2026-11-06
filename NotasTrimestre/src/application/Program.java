/*Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano 
(primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no 
ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam 
para o aluno obter o mínimo para ser aprovado (que é 60% da nota). Você deve criar uma classe Studentpara 
resolver este problema.*/

package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Aluno;

public class Program {

	public static void main (String [] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.println("Insira o nome do aluno: ");
		aluno.nome = sc.nextLine();
		System.out.println("Insira as notas do aluno: ");
		aluno.n1 = sc.nextDouble();
		aluno.n2 = sc.nextDouble();
		aluno.n3 = sc.nextDouble();
		
		System.out.printf("Nota final do aluno: %.2f%n", aluno.notaFinal());
		
		if(aluno.notaFinal()<60.0) {
			System.out.println("Reprovado");
			System.out.printf("Faltaram %.2f pontos", aluno.faltou());
			}
		else {
			System.out.println("Aprovado.");
		}
		
		
		sc.close();
	}
	
}
