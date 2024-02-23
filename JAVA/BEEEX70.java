import java.util.Scanner;

public class BEEEX70 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int valorDigitado = entrada.nextInt();

        for (int i = 0; i < valorDigitado; i++) {
            if (valorDigitado % 2 == 0) {
                valorDigitado += 1;
                System.out.println(valorDigitado);
            } else {
                valorDigitado += 2;
                System.out.println(valorDigitado);
            }
        }
        entrada.close();
    }
}
