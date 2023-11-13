package coding_tank;

import java.util.Locale;
import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        leitor.useLocale(Locale.US);

        System.out.println("Informe sua altura em metros");
        System.out.print("> ");
        float altura = leitor.nextFloat();

        System.out.println("Informe seu peso em Kg.");
        System.out.print("> ");
        float peso = leitor.nextFloat();

        float imc = peso / (altura * altura);

        System.out.printf("O valor do seu IMC é %.2f", imc);

        leitor.close();
    }
}
