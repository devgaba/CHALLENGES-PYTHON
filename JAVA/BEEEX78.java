import java.util.Scanner;

public class BEEEX78 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int valorDigitado = entrada.nextInt();

        for (int i = 1; i <= 10; i++) {
            int calculo = valorDigitado * i;
            System.out.println(i + " x " + valorDigitado + " = " + calculo);
        }

        entrada.close();
    }
}