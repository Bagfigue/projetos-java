/*Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva 
um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 
4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até 
que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a 
mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme 
exemplo. */

import java.util.Scanner;

public class Combustivel {
	public static void main (String [] args) {
		Scanner sc = new Scanner (System.in);
		
		int x, alcool, gasolina, diesel;
		
		
		 alcool = 0;
		 gasolina = 0;
		 diesel = 0;
		 
		 while (true) {
			 System.out.println("Insira um numero de 1 a 4");
			 x = sc.nextInt();
			 
			 if (x==4) {
				 break;			
			 }
			 else if(x==1) {
				 alcool++;
			 }
			 else if(x==2) {
				 gasolina++;
			 }
			 else if(x==3) {
				 diesel++;
			 }
			 else {
				 System.out.println("código inválido. Tente novamente");
			 }
		 }
		
		System.out.println("MUITO OBRIGADO");
	    System.out.printf("Alcool: %d\n", alcool);
	    System.out.printf("Gasolina: %d\n", gasolina);
	    System.out.printf("Diesel: %d\n", diesel);

	sc.close();
		
	
	}
}
