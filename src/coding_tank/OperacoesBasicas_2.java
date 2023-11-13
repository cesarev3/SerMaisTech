package coding_tank;

public class OperacoesBasicas_2 {
    public static void main(String[] args) {

        float numero1 = 5;
        float numero2 = 2;

        System.out.println("Adição: " + (int)adicionar(numero1, numero2));
        System.out.println("subtração: " + (int)subtrair(numero1, numero2));
        System.out.println("Multiplicação: " + (int)multiplicar(numero1, numero2));
        System.out.println("Divisão: " + dividir(numero1, numero2));
    }

    public static float adicionar(float n1, float n2){
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
