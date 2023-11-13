package coding_tank;

public class OperacoesBasicas {
    public static void main(String[] args) {
        
        int numero1 = 5;
        int numero2 = 2;

        int adicionar = numero1 + numero2;
        int subtrair = numero1 - numero2;
        int multiplicar = numero1 * numero2;
        float dividir = (float)numero1 / (float)numero2;

        System.out.println("Adição: " + adicionar);
        System.out.println("subtração: " + subtrair);
        System.out.println("Multiplicação: " + multiplicar);
        System.out.println("Divisão: " + dividir);
    }
}
