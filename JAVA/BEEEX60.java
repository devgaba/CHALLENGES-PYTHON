import java.util.Scanner;
import java.util.Locale;

public class BEEEX60 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        int valorPositivo = 0;

        double[] valores = new double[6];

        for (int i = 0; i < valores.length; i++) {
            double valorDigitado = entrada.nextDouble();
            if (valorDigitado > 0) {
                valorPositivo += 1;
            }
        }
        System.out.println(valorPositivo + " valores positivos");

        entrada.close();
    }
}
