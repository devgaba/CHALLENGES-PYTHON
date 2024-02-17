
import java.util.Scanner;

public class BEEEX42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        int[] numeros = { n1, n2, n3 };
        int aux;
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length; j++) {
                if (numeros[i] < numeros[j]) {
                    aux = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = aux;

                }
            }
        }

        for (int numero : numeros) {
            System.out.println(numero);
        }
        System.out.println();
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);

        sc.close();
    }
}
