import java.util.Locale;
import java.util.Scanner;

public class BEEEX79 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        int quantCasos = entrada.nextInt();
        double pesos = 10;
        double[] valor = new double[quantCasos];

        for (int i = 0; i < valor.length; i++) {
            double valorUm = entrada.nextDouble();
            double valorDois = entrada.nextDouble();
            double valorTres = entrada.nextDouble();
            double calcMedia = (valorUm * (2 / pesos)) + (valorDois * (3 / pesos)) + (valorTres * (5 / pesos));
            valor[i] = calcMedia;
        }
        for (int i = 0; i < valor.length; i++) {
            System.out.printf("%.1f%n", valor[i]);
        }

        entrada.close();
    }

}
