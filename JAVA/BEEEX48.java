import java.util.Scanner;
import java.util.Locale;

public class BEEEX48 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        double salario = entrada.nextDouble();

        if (salario > 0 && salario <= 400.00) {
            double percentual = 15.00;
            double calcReajuste = (percentual * salario) / 100;
            salario += calcReajuste;
            System.out.printf("Novo salario: %.2f%n", salario);
            System.out.printf("Reajuste ganho: %.2f%n", calcReajuste);
            System.out.printf("Em percentual: %.0f", percentual);
            System.out.println(" %");
        } else if (salario >= 400.01 && salario <= 800.00) {
            double percentual = 12.0;
            double calcReajuste = (percentual * salario) / 100;
            salario += calcReajuste;
            System.out.printf("Novo salario: %.2f%n", salario);
            System.out.printf("Reajuste ganho: %.2f%n", calcReajuste);
            System.out.printf("Em percentual: %.0f", percentual);
            System.out.println(" %");
        } else if (salario >= 800.01 && salario <= 1200.00) {
            double percentual = 10.0;
            double calcReajuste = (percentual * salario) / 100;
            salario += calcReajuste;
            System.out.printf("Novo salario: %.2f%n", salario);
            System.out.printf("Reajuste ganho: %.2f%n", calcReajuste);
            System.out.printf("Em percentual: %.0f", percentual);
            System.out.println(" %");
        } else if (salario >= 1200.01 && salario <= 2000.00) {
            double percentual = 7.0;
            double calcReajuste = (percentual * salario) / 100;
            salario += calcReajuste;
            System.out.printf("Novo salario: %.2f%n", salario);
            System.out.printf("Reajuste ganho: %.2f%n", calcReajuste);
            System.out.printf("Em percentual: %.0f", percentual);
            System.out.println(" %");
        } else if (salario > 2000.00) {
            double percentual = 4.0;
            double calcReajuste = (percentual * salario) / 100;
            salario += calcReajuste;
            System.out.printf("Novo salario: %.2f%n", salario);
            System.out.printf("Reajuste ganho: %.2f%n", calcReajuste);
            System.out.printf("Em percentual: %.0f", percentual);
            System.out.println(" %");
        }

        entrada.close();
    }
}
