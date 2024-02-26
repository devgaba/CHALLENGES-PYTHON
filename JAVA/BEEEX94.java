import java.util.Scanner;

public class BEEEX94 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int quantCasos = entrada.nextInt();
        int[] casos = new int[quantCasos];
        String[] letras = { "C", "R", "S" };

        for (int i = 0; i < casos.length; i++) {
            int quant = entrada.nextInt();
            char letra = entrada.next().charAt(0);

            entrada.nextLine();
        }

        entrada.close();
    }
}
