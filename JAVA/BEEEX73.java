import java.util.Scanner;

public class BEEEX73 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Entrada de dados
        int valorDigitado = entrada.nextInt();

        // Algoritmo
        for (int i = 1; i <= valorDigitado; i++) {
            if (i % 2 == 0) {
                double result = Math.pow(i, 2);
                // Saída de dados
                System.out.printf(i + "^2 = %.0f%n", result);
            }
        }

        entrada.close();
    }
}
