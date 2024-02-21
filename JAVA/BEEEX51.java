import java.util.Scanner;
import java.util.Locale;

public class BEEEX51 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        double salario = entrada.nextDouble();

        if (salario >= 0.00 && salario <= 2000.00) {
            System.out.println("Isento");
        } else if (salario >= 2000.01 && salario <= 3000.00) {
            int percentual = 8;
            salario -= 2000.00;
            double calcValor = (salario * 8) / 100;
            System.out.printf("R$ %.2f%n", calcValor);
        } else if (salario >= 3000.01 && salario <= 4500.00) {
            int percentual = 18;
            double calcReajuste = (1000.00 * 8) / 100;
            double calc = salario - 3000.00;
            double calcValor = (calc * 18) / 100;
            System.out.printf("R$ %.2f%n", calcValor + calcReajuste);
        } else if (salario > 4500.00) {
            double calcUm = (1000.00 * 8) / 100;
            double calcDois = (1500.00 * 18) / 100;
            double calcSalario = ((salario - 4500.00) * 28) / 100;
            double soma = calcUm + calcDois + calcSalario;
            System.out.printf("R$ %.2f%n", soma);
        }
        entrada.close();
    }
}
