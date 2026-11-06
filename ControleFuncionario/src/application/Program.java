/*Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em 
seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o 
salário do funcionário com base em uma porcentagem dada (somente o salário bruto é 
afetado pela porcentagem) e mostrar novamente os dados do funcionário. Use a classe 
projetada abaixo.*/

package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Funcionario;

public class Program {
	public static void main (String [] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Funcionario funcionario = new Funcionario();
		
		System.out.println("Insira os dados do funcionário:");
		System.out.println("Nome:");
		funcionario.nome = sc.nextLine();
		System.out.println("Salário bruto: ");
		funcionario.salarioBruto = sc.nextDouble();
		System.out.println("Impostos: ");
		funcionario.imposto = sc.nextDouble();
		
		System.out.println("O funcionario: " + funcionario.nome + " recebe "+ funcionario.salarioLiquido());
		
		System.out.println("Qual será a porcentagem do aumento do salário?");
		double aumento = sc.nextDouble();
		
		funcionario.aumentoSalario(aumento);
		
		System.out.println(" ");
		System.out.println("Dados atualizados: " + funcionario);
		
		
		sc.close();
	}

}
