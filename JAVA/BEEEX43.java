import java.util.Scanner;

public class BEEEX43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        double calcPerimetro = A + B + C;

        System.out.printf("Perimetro = %.1f%n", calcPerimetro);

        sc.close();
    }
}
// Aqui fica um comentário a respeito do exercício.