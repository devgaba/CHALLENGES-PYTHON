import java.util.Scanner;

public class BEEEX72 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Entrada de dados e variáveis para armazenamento
        int quantValores = entrada.nextInt();
        int quantIn = 0;
        int quantOut = 0;

        // Algoritmo construído
        for (int i = 0; i < quantValores; i++) {
            int valorDigitado = entrada.nextInt();
            if (valorDigitado >= 10 && valorDigitado <= 20) {
                quantIn += 1;
            } else {
                quantOut += 1;
            }
        }

        // Saída
        System.out.println(quantIn + " in");
        System.out.println(quantOut + " out");

        entrada.close();
    }
}
