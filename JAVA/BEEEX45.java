import java.util.Scanner;
import java.util.Locale;

public class BEEEX45 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        double a = entrada.nextDouble();
        double b = entrada.nextDouble();
        double c = entrada.nextDouble();

        double aux;
        double[] valores = { a, b, c };

        for (int i = 0; i < valores.length; i++) {
            for (int j = 0; j < valores.length; j++) {
                if (valores[i] > valores[j]) {
                    aux = valores[i];
                    valores[i] = valores[j];
                    valores[j] = aux;
                }
            }
        }
        double maior = valores[0];
        double soma = valores[1] + valores[2];
        double expUm = Math.pow(valores[0], 2);
        double expBeC = Math.pow(valores[1], 2) + Math.pow(valores[2], 2);

        // Estrutura

        if (expUm == expBeC) {
            System.out.println("TRIANGULO RETANGULO");
        }
        if (maior >= soma) {
            System.out.println("NAO FORMA TRIANGULO");
        } else if (expUm > expBeC) {
            System.out.println("TRIANGULO OBTUSANGULO");
        }
        if (expUm < expBeC) {
            System.out.println("TRIANGULO ACUTANGULO");
        }
        if (a == b && a == c) {
            System.out.println("TRIANGULO EQUILATERO");
        }
        if ((a == b && b != c) || (b == c && c != a) || (c == a && a != b)) {
            System.out.println("TRIANGULO ISOSCELES");
        }

        entrada.close();
    }
}
