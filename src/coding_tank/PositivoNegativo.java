package coding_tank;

import java.util.Locale;
import java.util.Scanner;

public class PositivoNegativo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        leitor.useLocale(Locale.US);

        System.out.println("Informe um número");
        System.out.print("> ");
        int numero = leitor.nextInt();

        if (numero > 0) {
            System.out.println("O número é positivo");
        } else if (numero < 0) {
            System.out.println("O número é negativo");
        } else {
            System.out.println("O zero é neutro");
        }

        System.out.println("Obrigado");

        leitor.close();
    }
}
