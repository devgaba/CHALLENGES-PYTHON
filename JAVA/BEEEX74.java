import java.util.Scanner;

public class BEEEX74 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int quant = entrada.nextInt();
        int[] valores = new int[quant];
        for (int i = 0; i < quant; i++) {
            int valorDigitado = entrada.nextInt();
            valores[i] = valorDigitado;
        }
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] < 0) {
                if (valores[i] % 2 == 0) {
                    System.out.println("EVEN NEGATIVE");
                } else {
                    System.out.println("ODD NEGATIVE");
                }
            } else if (valores[i] > 0) {
                if (valores[i] % 2 == 0) {
                    System.out.println("EVEN POSITIVE");
                } else {
                    System.out.println("ODD POSITIVE");
                }
            } else {
                System.out.println("NULL");
            }
        }

        entrada.close();
    }
}
