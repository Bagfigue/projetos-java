package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.CarrinhoDeCompras;
import entities.ItemCarrinho;
import entities.Laptop;
import entities.Produto;
import entities.Smartphone;
import entities.TV;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//lista de produtos disponíveis:
		List<Produto> produtos = new ArrayList<>();
		

		produtos.add(
			    new Smartphone(
			        "Apple",
			        "iPhone 14",
			        5000.0,
			        1,
			        256,
			        48
			    )
			);

			produtos.add(
			    new Laptop(
			        "Dell",
			        "Inspiron",
			        3500.0,
			        2,
			        16,
			        "Intel i7"
			    )
			);

			produtos.add(
			    new TV(
			        "Samsung",
			        "Smart TV 50",
			        2800.0,
			        3,
			        50,
			        true
			    )
			);

		//criar carrinho:
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras(1);
		
		//Menu
        
        System.out.println("-----MENU-----");
		System.out.println("1. visualizar produtos");
		System.out.println("2. adicionar produtos no carrinho");
		System.out.println("3. visualizar carrinho");
		System.out.println("4. remover item do carrinho");
		System.out.println("0. sair");
		System.out.println("Digite a opção desejada: ");
		int op = sc.nextInt();
		sc.nextLine();
		
		while(op!=0) {
			if(op == 1) {

			    System.out.println("\nLista de produtos:");

			    for (Produto p : produtos) {
			        System.out.println(p.getId() + " - " + p);
			    }
			}
			else if(op == 2) {
				System.out.print("Digite o ID do produto: ");
                int id = sc.nextInt();

                System.out.print("Quantidade: ");
                int qtd = sc.nextInt();

                for (Produto p : produtos) {
                    if (p.getId() == id) {
                    	
                        carrinho.adicionarProduto(p, qtd);
                        System.out.println("Produto adicionado ao carrinho!");
                    }
                }
				
			}
			else if(op == 3) {
				System.out.println("\n ------Itens no carrinho------ ");
				if (carrinho.getItens().isEmpty()) {
					System.out.println("O carrinho está vazio.");
				} else {
					for (ItemCarrinho item : carrinho.getItens()) {
						System.out.println(
								"Produto: " + item.getProduto().getModelo() +
								" | Quantidade: " + item.getQuantidade() + 
								" | Preço por unidade: R$ " + item.getProduto().getPreco() +
								" | Subtotal: R$ " + item.subtotal()
								);
					}
					System.out.println("Total: R$ " + carrinho.calcularTotal());
				}
				
			}
			else if(op == 4) {
				if(carrinho.getItens().isEmpty()) {
					System.out.println("Não há itens para serem removidos. O carrinho está vazio.");
				} else {
					System.out.println("Insira o ID do item que deseja remover: ");
					int id = sc.nextInt();
					
					carrinho.removerProduto(id);
					System.out.println("Produto removido.");
				}
				
			}
			else if(op == 0) {
				break;
			}
			else {
				System.out.println("Opção invalida.");
			}
			
			System.out.println("\nDigite outra opção:");
		    op = sc.nextInt();
		}
		
		sc.close();

	}

}
