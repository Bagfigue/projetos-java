package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		
		List<Funcionario> lista = new ArrayList<>();
		
		int opcao;

		do {
		    System.out.println("\n===== MENU =====");
		    System.out.println("1 - Cadastrar funcionário");
		    System.out.println("2 - Listar funcionários");
		    System.out.println("3 - Atualizar funcionário");
		    System.out.println("4 - Remover funcionário");
		    System.out.println("5 - Relatórios");
		    System.out.println("0 - Sair");
		    System.out.print("Escolha uma opção: ");

		    opcao = sc.nextInt();
		    sc.nextLine();

		    switch (opcao) {

	        case 1:
	            System.out.print("Nome: ");
	            String nome = sc.nextLine();

	            System.out.print("Departamento: ");
	            String depto = sc.nextLine();

	            System.out.print("Cargo: ");
	            String cargo = sc.nextLine();

	            System.out.print("Salário: ");
	            double salario = sc.nextDouble();
	            sc.nextLine();

	            lista.add(new Funcionario(nome, depto, cargo, salario));
	            System.out.println("Funcionário cadastrado!");
	            break;

	        case 2:
	            for (Funcionario funcionario : lista) {
	                System.out.println(funcionario.getNome() + " | " +
	                                   funcionario.getDepartamento() + " | " +
	                                   funcionario.getCargo() + " | " +
	                                   funcionario.getSalario());
	            }
	            break;
	            
	        case 3:
	            System.out.print("Digite o nome do funcionário que deseja atualizar: ");
	            String nomeBusca = sc.nextLine();

	            boolean encontrado = false;

	            for (Funcionario funcionario : lista) {
	                if (funcionario.getNome().equalsIgnoreCase(nomeBusca)) {

	                    System.out.print("Novo departamento: ");
	                    String novoDepto = sc.nextLine();

	                    System.out.print("Novo cargo: ");
	                    String novoCargo = sc.nextLine();

	                    System.out.print("Novo salário: ");
	                    double novoSalario = sc.nextDouble();
	                    sc.nextLine();

	                   
	                    funcionario.setDepartamento(novoDepto);
	                    funcionario.setCargo(novoCargo);
	                    funcionario.setSalario(novoSalario);

	                    System.out.println("Funcionário atualizado!");
	                    encontrado = true;
	                    break;
	                }
	            }

	            if (!encontrado) {
	                System.out.println("Funcionário não encontrado!");
	            }
	            break;
	            
	        case 4:
	            System.out.print("Digite o nome do funcionário que deseja remover: ");
	            String nomeRemover = sc.nextLine();

	            boolean removido = lista.removeIf(f -> f.getNome().equalsIgnoreCase(nomeRemover));

	            if (removido) {
	                System.out.println("Funcionário removido!");
	            } else {
	                System.out.println("Funcionário não encontrado!");
	            }

	            break;
	            
	            
	        case 5:

	            System.out.println("\n=== Maior salário por departamento ===");

	            for (int i = 0; i < lista.size(); i++) {

	                String departamento = lista.get(i).getDepartamento();

	                boolean jaMostrado = false;

	                for (int j = 0; j < i; j++) {
	                    if (lista.get(j).getDepartamento().equals(departamento)) {
	                        jaMostrado = true;
	                        break;
	                    }
	                }

	                if (!jaMostrado) {

	                    double maiorSalario = 0;

	                    for (Funcionario f : lista) {
	                        if (f.getDepartamento().equals(departamento)) {
	                            if (f.getSalario() > maiorSalario) {
	                                maiorSalario = f.getSalario();
	                            }
	                        }
	                    }

	              
	                    System.out.println("\nDepartamento: " + departamento);
	                    System.out.println("Maior salário: " + maiorSalario);

	                    for (Funcionario f : lista) {
	                        if (f.getDepartamento().equals(departamento) &&
	                            f.getSalario() == maiorSalario) {

	                            System.out.println(" - " + f.getNome());
	                        }
	                    }
	                }
	            }

	        case 0:
	            System.out.println("Saindo...");
	            break;

	        default:
	            System.out.println("Opção inválida!");
	        }

		} while (opcao != 0);

	}
	

}
