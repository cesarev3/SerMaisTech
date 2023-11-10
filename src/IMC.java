import java.util.Locale;
import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.println("Cálculo do seu Índice de Massa Corporal - IMC");

        double pesoAtual;
        while (true) {
            try {
                System.out.println("Qual o seu peso em kg?");
                System.out.print("> ");
                String valorEntrada = entrada.nextLine();
                pesoAtual = Double.parseDouble(valorEntrada);
                validarPesoAtual(pesoAtual);
                break;

            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida!");

            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        }

        double alturaAtual;
        while (true) {
            try {
                System.out.println("Qual a sua altura em metros?");
                System.out.print("> ");
                String valorEntrada = entrada.nextLine();
                alturaAtual = Double.parseDouble(valorEntrada);
                validaralturaAtual(alturaAtual);
                break;

            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida!");

            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        }
        entrada.close();

        double valorIMC = pesoAtual / Math.pow(alturaAtual, 2);
        String classificacaoIMC;

        if (valorIMC < 18.5) {
            classificacaoIMC = "Magreza";
        } else if (valorIMC >= 18.5 && valorIMC < 25) {
            classificacaoIMC = "Normal";
        } else if (valorIMC >= 25 && valorIMC < 30) {
            classificacaoIMC = "Sobrepeso";
        } else if (valorIMC >= 30 && valorIMC < 35) {
            classificacaoIMC = "Obesidade grau I";
        } else if (valorIMC >= 35 && valorIMC < 40) {
            classificacaoIMC = "Obesidade grau II";
        } else {
            classificacaoIMC = "Obesidade grau III";
        }

        double imcIdealMinimo = 18.5;
        double imcIdeal = 24.9; // conforme definido na etapa 3 do desafio
        double pesoIdealMinimo = Math.pow(alturaAtual,2) * imcIdealMinimo;
        double pesoIdeal = Math.pow(alturaAtual,2) * imcIdeal;

        System.out.printf("\nSeu IMC: %.1f\n", valorIMC);
        System.out.printf("Classificação: %s\n", classificacaoIMC);
        System.out.printf("Peso ideal: %.1f Kg a %.1f Kg\n", pesoIdealMinimo, pesoIdeal);

    }
    public static void validarPesoAtual(double pesoAtual){
        if (pesoAtual > 40 && pesoAtual <= 130) {
            System.out.println("Peso armazenado.");
        } else {
            throw new RuntimeException("Peso entre 40kg e 130kg");
        }
    }
    public static void validaralturaAtual(double alturaAtual){
        if (alturaAtual > 1.1 && alturaAtual <= 2.5) {
            System.out.println("Altura armazenada.");
        } else {
            throw new RuntimeException("Altura entre 1.1 metros e 2.50 metros");
        }
    }
}
