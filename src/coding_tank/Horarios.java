package coding_tank;

import java.util.Locale;
import java.util.Scanner;

public class Horarios {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.println("Ola! qual o seu nome?");
        System.out.print("> ");
        String nome = entrada.nextLine();

        System.out.println("que horas são?");
        System.out.print("> ");
        int hora = entrada.nextInt();

        if (hora >= 4 && hora <= 11) {
            System.out.println("Bom dia, " + nome + "!");
        }
        else if (hora >= 12 && hora <= 17) {
            System.out.println("Boa tarde, " + nome + "!");
        }
        else if ((hora >= 18 && hora <= 23) ||(hora >= 0 && hora <= 3)) {
            System.out.println("Boa noite, " + nome + "!");
        }
        else if (hora > 23 && hora < 0) {
            System.out.println("Horário inválido.");
        }
        }
    }

