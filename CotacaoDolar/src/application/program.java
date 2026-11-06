/*Faça um programa para ler a cotação do dólar, e depois um valor em dólares a ser comprado por uma pessoa em reais.
 * informar quantos reais a pessoa vai pagar pelos dólares, considerando ainda que a pessoa terá que pagar 6% de IOF sobre
 * o valor em dólar. Criar uma classe CurrencuConverter para ser responsável pelos cálculos*/

package application;

import java.util.Locale;
import java.util.Scanner;

import util.CalculosConversao;

public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual a cotação do dolar? ");
		double cotacao = sc.nextDouble();
		System.out.println("Quantos dolares serão comprados? ");
		double quantidade = sc.nextDouble();
		double resultado = CalculosConversao.Conversor(quantidade, cotacao);
		System.out.printf("A quantidade a ser paga em reais é: %.2f%n", resultado);
		
		sc.close();

	}

}
