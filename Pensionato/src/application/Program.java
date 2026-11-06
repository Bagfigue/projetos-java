package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Quartos;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Quartos[] quartos = new Quartos[10];

        System.out.println("Quantos quartos serão alugados? ");
        int n = sc.nextInt();

        if (n < 1 || n > 10) {
            System.out.println("Quantidade inválida.");
            sc.close();
            return;
        }

        for (int i = 0; i < n; i++) {
            sc.nextLine();

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();

            System.out.print("Quarto: ");
            int numero = sc.nextInt();

            // valida número do quarto
            if (numero < 0 || numero > 9) {
                System.out.println("Número inválido! Tente novamente.");
                i--;
                continue;
            }

            // valida ocupação
            if (quartos[numero] != null) {
                System.out.println("Quarto já ocupado! Tente novamente.");
                i--;
            } else {
                quartos[numero] = new Quartos(nome, email);
            }
        }

        System.out.println("\nQuartos ocupados:");

        for (int i = 0; i < 10; i++) {
            if (quartos[i] != null) {
                System.out.println(i + ": " + quartos[i].getNome() + ", " + quartos[i].getEmail());
            }
        }

        sc.close();
    }
}