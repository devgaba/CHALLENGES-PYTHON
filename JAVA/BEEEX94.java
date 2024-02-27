import java.util.Scanner;

public class BEEEX94 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int quantCasos = entrada.nextInt();
        int[] casos = new int[quantCasos];
        int quantR = 0;
        int quantS = 0;
        int quantC = 0;
        for (int i = 0; i < casos.length; i++) {
            quantC = entrada.nextInt();
            quantR = entrada.nextInt();
            quantS = entrada.nextInt();

            /*
             * if (letra == "C") {
             * quantC = quant + 0;
             * } else if (letra == "R") {
             * quantR = quant + 0;
             * } else if (letra == "S") {
             * quantS = quant + 0;
             * }
             */

            /*
             *
             */
        }
        System.out.println("Total de coelhos; " + quantC);
        System.out.println("Total de coelhos; " + quantR);
        System.out.println("Total de coelhos; " + quantS);
        entrada.close();
    }
}
