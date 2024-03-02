import java.util.Locale;
import java.util.Scanner;

public class BEEEX94 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        int quantC = 0;
        int quantR = 0;
        int quantS = 0;

        int quantCasos = entrada.nextInt();

        for(int i=0; i<quantCasos; i++){
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
        int somaCasos = quantC + quantR + quantS;
        double percentC = (quantC*100) / somaCasos;
        double percentR = (quantR*100) / somaCasos;
        double percentS =(quantS*100) / somaCasos;
        System.out.println("Total: " + somaCasos + " cobaias");
        System.out.println("Total de coelhos: " + quantC);
        System.out.println("Total de ratos: " + quantR);
        System.out.println("Total de sapos: " + quantS);
        System.out.printf("Percentual de coelhos: %.2f%n ", percentC + " %");
        System.out.printf("Percentual de ratos: %.2f%n", percentR + " %");
        System.out.printf("Percentual de sapos: %.2f%n", percentS + " %");

        System.out.println(quantCasos);
        entrada.close();
    }
}
