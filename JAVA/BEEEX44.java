import java.util.Scanner;

public class BEEEX44 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int a = entrada.nextInt();
        int b = entrada.nextInt();

        int calc = b % a;
        if (calc > 0.00 && calc < 1.00) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }

        entrada.close();
    }
}
