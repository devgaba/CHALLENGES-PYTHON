import java.util.Scanner;
import java.util.Locale;

public class BEEEX43 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        double a = entrada.nextDouble();
        double b = entrada.nextDouble();
        double c = entrada.nextDouble();

        double perimetro = a + b + c;
        double area = 0.5 * (c * (a + b));

        if (a < b + c && b < a + c && c < a + b) {
            System.out.printf("Perimetro = %.1f\n", perimetro);
        } else {
            System.out.printf("Area = %.1f\n", area);
        }

        entrada.close();
    }
}