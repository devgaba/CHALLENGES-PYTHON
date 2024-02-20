import java.util.Scanner;

public class BEEEX47 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int horaInicial = entrada.nextInt();
        int minutoInicial = entrada.nextInt();
        int horaFinal = entrada.nextInt();
        int minutoFinal = entrada.nextInt();

        if (horaInicial < horaFinal) {
            int calcDuracao = horaFinal - horaInicial;
            int calcMinuto = minutoFinal - minutoInicial + 60;
            System.out.println("O JOGO DUROU " + calcDuracao + " HORA(S) E " + calcMinuto + " MINUTO(S)");
        } else if (horaFinal == horaInicial) {
            System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
        }

        entrada.close();
    }
}