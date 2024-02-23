import java.util.Scanner;

public class BEEEX67 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int valorDigitado = entrada.nextInt();

        for (int i = 0; i <= valorDigitado; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        entrada.close();
    }
}
