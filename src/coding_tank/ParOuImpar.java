package coding_tank;

import java.util.Locale;
import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        leitor.useLocale(Locale.US);

        System.out.println("Informe um número");
        System.out.print("> ");
        int numero = leitor.nextInt();

        int resto = numero % 2;

        boolean ePar = resto == 0;

        if (ePar) {
            System.out.println("O número é par");
        } else {
            System.out.println("O número é ímpar");
        }
        System.out.println("Obrigado");




        leitor.close();
    }
}
