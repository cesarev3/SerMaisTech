package coding_tank;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        try {
            System.out.println("Digite o primeiro número: ");
            float numero1 = entrada.nextFloat();
            System.out.println("Digite o segundo número: ");
            float numero2 = entrada.nextFloat();

            System.out.print("Digite a operação desejada");
            System.out.println("\n(+) - Adição");
            System.out.println("(-) - Subtração");
            System.out.println("(*) - Multiplicação");
            System.out.println("(/) - Divisão");
            System.out.println("(0) - Sair do programa");
            System.out.println("> ");
            char operacao = entrada.next().charAt(0);
            entrada.close();

            switch (operacao) {
                case '+':
                    System.out.println("Adição: " +
                            (int) adicionar(numero1, numero2));
                    break;
                case '-':
                    System.out.println("subtração: " +
                            (int) subtrair(numero1, numero2));
                    break;
                case '*':
                    System.out.println("Multiplicação: " +
                            (int) multiplicar(numero1, numero2));
                    break;
                case '/':
                    System.out.println("Divisão: " +
                            dividir(numero1, numero2));
                    break;
                case '0':
                    System.out.println("Você encerrou o programa");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }

        catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Utilize apenas números");
        }
        finally {
                System.out.println("\nfim");
        }
    }

    public static float adicionar(float n1, float n2) {
        return n1 + n2;
    }
    public static float subtrair(float n1, float n2){
        return n1 - n2;
    }
    public static float multiplicar(float n1, float n2){
        return n1 * n2;
    }
    public static float dividir(float n1, float n2){
        return n1 / n2;
    }
}
