import java.util.Scanner;
import java.util.Locale;

public class BEEEX44 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        double a = entrada.nextDouble();
        double b = entrada.nextDouble();

        double calc = b % a;
        double calcDois = a % b;
        //System.out.printf("%.3f%n", calc);
        //System.out.printf("%.3f%n", calcDois);

        if (calc == 0.00 || calcDois == 0.00) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }

        entrada.close();
    }
}
