import java.util.Scanner;

public class BEEEX70 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int valorDigitado = entrada.nextInt();
        int quant = 6;

        for (int i = 0; i < quant; i++) {
            if (valorDigitado % 2 != 0) {
                System.out.println(valorDigitado);
                valorDigitado += 2;

            } else {
                System.out.println(valorDigitado + 1);
                valorDigitado += 3;
            }
        }

        entrada.close();
    }
}
