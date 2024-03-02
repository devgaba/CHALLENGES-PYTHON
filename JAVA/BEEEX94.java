import java.util.Locale;
import java.util.Scanner;

public class BEEEX94 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        double quantC = 0.00;
        double quantR = 0.00;
        double quantS = 0.00;

        int quantCasos = entrada.nextInt();

        for (int i = 0; i < quantCasos; i++) {
            int quant = entrada.nextInt();
            String carac = entrada.next();

            switch (carac) {
                case "C":
                    quantC += quant;
                    break;
                case "R":
                    quantR += quant;
                    break;
                case "S":
                    quantS += quant;
                    break;
            }
        }
        double somaCasos = quantC + quantR + quantS;
        double percentC = (quantC * 100) / somaCasos;
        double percentR = (quantR * 100) / somaCasos;
        double percentS = (quantS * 100) / somaCasos;
        System.out.printf("Total: %.0f cobaias%n", somaCasos);
        System.out.printf("Total de coelhos: %.0f%n", quantC);
        System.out.printf("Total de ratos: %.0f%n", quantR);
        System.out.printf("Total de sapos: %.0f%n", quantS);
        System.out.printf("Percentual de coelhos: %.2f %%%n", percentC);
        System.out.printf("Percentual de ratos: %.2f %%%n", percentR);
        System.out.printf("Percentual de sapos: %.2f %%%n", percentS);
        entrada.close();
    }
}
