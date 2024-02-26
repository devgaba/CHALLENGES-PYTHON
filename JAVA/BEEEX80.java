import java.util.Scanner;

public class BEEEX80 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] valores = new int[100];
        for (int i = 0; i < valores.length; i++) {
            int valorDigitado = entrada.nextInt();
            valores[i] = valorDigitado;
        }
        int maior = valores[0];
        int posicao = 0;
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] > maior) {
                maior = valores[i];
                posicao = i;
            }
        }
        maior += 0;
        posicao += 1;
        System.out.println(maior);
        System.out.println(posicao);

        entrada.close();
    }
}
