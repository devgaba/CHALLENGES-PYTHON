import java.util.Scanner;

public class BEEEX66 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] valores = new int[5];
        int valorPar = 0;
        int valorImpar = 0;
        int valorPositivo = 0;
        int valorNegativo = 0;

        for (int i = 0; i < valores.length; i++) {
            int digito = entrada.nextInt();
            if (digito % 2 == 0) {
                valorPar += 1;
            } else {
                valorImpar += 1;
            }
            if (digito > 0) {
                valorPositivo += 1;
            } else if (digito < 0) {
                valorNegativo += 1;
            }
        }
        System.out.println(valorPar + " valor(es) par(es)");
        System.out.println(valorImpar + " valor(es) impar(es)");
        System.out.println(valorPositivo + " valor(es) positivo(s)");
        System.out.println(valorNegativo + " valor(es) negativo(s)");

        entrada.close();
    }
}
