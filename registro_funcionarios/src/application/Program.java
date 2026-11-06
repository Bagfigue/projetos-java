package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {
	
	public static void main (String [] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List <Employee> list = new ArrayList<>();
		
		System.out.println("-----MENU-----");
		System.out.println("1. adicionar funcionario");
		System.out.println("2. remover funcionario");
		System.out.println("3. imprimir lista de funcionarios");
		System.out.println("4. aumento de salario");
		System.out.println("0. sair");
		System.out.println("Digite a opção desejada: ");
		int op = sc.nextInt();
		sc.nextLine();
		
		while (op != 0) {
			if(op == 1) {
				System.out.println("Id: ");
				int id = sc.nextInt();
				sc.nextLine();
				
				//verificar se id ja existe
				boolean exists = false;
				for(Employee e: list) {
					if(e.getId() == id) {
						exists = true;
					}
				}
				if(exists) {
					System.out.println("Id ja existente.");
				} else {
					System.out.println("Nome: ");
					String name = sc.nextLine();
					
					System.out.println("Salario: ");
					double salary = sc.nextDouble();
					
					Employee emp = new Employee(id, name, salary);
					list.add(emp);
				}
			} else if (op == 2) {
				System.out.println("Id: ");
				int id = sc.nextInt();
				
				Employee empToRemove = null;
				
				for (Employee e : list) {
		            if (e.getId() == id) {
		                empToRemove = e;
		            }
		        }
		
		        if (empToRemove != null) {
		            list.remove(empToRemove);
		        } else {
		            System.out.println("ERRO. Id inexistente.");
		        }
			} else if (op == 3) {
				System.out.println("\nLista de funcionários:");
				
				for(Employee e : list) {
					System.out.println(e);
				}
			} else if (op == 4) {
			    System.out.print("Digite o id do funcionario: ");
			    int id = sc.nextInt();

			    Employee emp = null;

			    for (Employee e : list) {
			        if (e.getId() == id) {
			            emp = e;
			        }
			    }

			    if (emp == null) {
			        System.out.println("Id inexistente!");
			    } else {
			        System.out.print("Digite a porcentagem: ");
			        double percentage = sc.nextDouble();

			        emp.increaseSalary(percentage);
			    }
			} else if (op == 0) {
				break;
			} else {
				System.out.println("Opção invalida, escolha outra.");
			}


		    System.out.println("\nDigite outra opção:");
		    op = sc.nextInt();

			
		}
			
		
		
		sc.close();
	}

}
