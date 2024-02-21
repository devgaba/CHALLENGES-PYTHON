import java.util.Scanner;

public class BEEEX47 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int hI = entrada.nextInt();
        int mI = entrada.nextInt();
        int hF = entrada.nextInt();
        int mF = entrada.nextInt();

        if (hF > hI && mF > mI) {
            int calcHora = hF - hI;
            int calcMin = mF - mI;
            System.out.println("O JOGO DUROU " + calcHora + " HORA(S) E " + calcMin + " MINUTO(S)");
        } else if (hF > hI && mF < mI) {
            int calcHora = (hF - hI) - 1;
            int calcMin = (mF - mI) + 60;
            System.out.println("O JOGO DUROU " + calcHora + " HORA(S) E " + calcMin + " MINUTO(S)");
        } else if (hF < hI && mF < mI) {
            int calcHora = ((24 - hI) + hF) - 1;
            int calcMin = (60 - mI) + mF;
            System.out.println("O JOGO DUROU " + calcHora + " HORA(S) E " + calcMin + " MINUTO(S)");
        } else if (hF < hI && mF > mI) {
            int calcHora = (24 - hI) + hF;
            int calcMin = mF - mI;
            System.out.println("O JOGO DUROU " + calcHora + " HORA(S) E " + calcMin + " MINUTO(S)");
        } else if (hF == hI && mF == mI) {
            int calcHora = (24 - hI) + hF;
            int calcMin = 0;
            System.out.println("O JOGO DUROU " + calcHora + " HORA(S) E " + calcMin + " MINUTO(S)");
        } else if (hF == hI && mF > mI) {
            int calcHora = 0;
            int calcMin = mF - mI;
            System.out.println("O JOGO DUROU " + calcHora + " HORA(S) E " + calcMin + " MINUTO(S)");
        } else if (hF == hI && mF < mI) {
            int calcHora = ((24 - hI) + hF) - 1;
            int calcMin = (60 - mI) + mF;
            System.out.println("O JOGO DUROU " + calcHora + " HORA(S) E " + calcMin + " MINUTO(S)");

        }
        entrada.close();
    }

}
