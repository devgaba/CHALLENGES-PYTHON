package JAVA;

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
            System.out.println(numeros[i]);
        }
        System.out.println();
        sc.close();
    }
}
