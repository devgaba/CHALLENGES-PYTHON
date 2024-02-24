import java.util.Scanner;

public class BEEEX71 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int valorUm = entrada.nextInt();
        int valorDois = entrada.nextInt();
        int novoValor = 0;

        if (valorUm > valorDois) {
            for (int i = (valorDois + 1); i < valorUm; i++) {
                if (i % 2 != 0) {
                    novoValor += i;
                }
            }
        } else {
            for (int i = (valorUm + 1); i < valorDois; i++) {
                if (i % 2 != 0) {
                    novoValor += i;
                }
            }
        }
        System.out.println(novoValor);

        entrada.close();
    }
}
