package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Product product = new Product ();
		
		System.out.println("Insira as informações do produto: ");
		System.out.println("Nome: ");
		product.name = sc.nextLine();
		System.out.println("Preço: ");
		product.price = sc.nextDouble();
		System.out.println("Quantidade no estoque: ");
		product.quantity = sc.nextInt();
		
		System.out.println("Dados do produto: " + product);
		System.out.println();
		
		System.out.println("Insira a quantidade de produtos que deseja adicionar ao estoque: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Dados atualizados: " + product);
		
		System.out.println("Insira a quantidade de produtos que deseja excluir do estoque:");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Dados atualizados: " + product);
		
		
		
		sc.close();

	}

}
