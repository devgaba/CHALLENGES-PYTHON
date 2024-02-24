import java.util.Scanner;

public class BEEEX75 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int valorDigitado = entrada.nextInt();

        for (int i = 0; i < 10000; i++) {
            if (i % valorDigitado == 2) {
                System.out.println(i);
            }
        }

        entrada.close();
    }
}
