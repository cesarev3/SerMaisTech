package coding_tank;

import java.util.Scanner;

public class BoaNoiteNomeIdade {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Olá, qual o seu nome?");
        System.out.print("> ");
        String nome = leitor.nextLine();
        System.out.println("Boa noite, " + nome);

        System.out.println("Qual o seu ano de nascimento? ");
        System.out.print("> ");
        int anoNascimento = leitor.nextInt();

        int idade = 2023 - anoNascimento;

        System.out.println("No final de 2023 você terá " + idade + " anos.");

        leitor.close();
    }
}
