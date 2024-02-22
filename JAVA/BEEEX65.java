import java.util.Scanner;

public class BEEEX65 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] valores = new int[5];
        int valorPar = 0;
        for (int i = 0; i < valores.length; i++) {
            int digito = entrada.nextInt();
            if (digito % 2 == 0) {
                valorPar += 1;
            }
        }
        System.out.println(valorPar + " valores pares");
        entrada.close();
    }
}
