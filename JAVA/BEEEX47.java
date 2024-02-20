import java.util.Scanner;

public class BEEEX47 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int horaInicial = entrada.nextInt();
        int minutoInicial = entrada.nextInt();
        int horaFinal = entrada.nextInt();
        int minutoFinal = entrada.nextInt();

        int calculo = horaFinal - horaInicial;

        if (horaInicial < horaFinal && minutoFinal > minutoInicial) {
            int calcDuracao = horaFinal - horaInicial;
            int calcMinuto = minutoFinal - minutoInicial;
            System.out.println("O JOGO DUROU " + calcDuracao + " HORA(S) E " + calcMinuto + " MINUTO(S)");
        } else if (horaFinal == horaInicial) {
            System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
        }
        if (minutoFinal < minutoInicial && horaFinal > horaInicial) {
            int duracao = 0;
        }

        if (minutoInicial > minutoFinal) {
            int duracaoMinutos = 60 + (minutoFinal - minutoInicial);
            System.out.println("O JOGO DUROU 0 HORA(S) E " + duracaoMinutos + " MINUTO(S)");
        } else if (minutoInicial == minutoFinal) {
            int duracaoMinutos = minutoFinal - minutoInicial;
            System.out.println("O JOGO DUROU 0 HORA(S) E " + duracaoMinutos + " MINUTO(S)");
        } else {
            int duracaoMinutos = minutoFinal - minutoInicial;
            System.out.println("O JOGO DUROU 0 HORA(S) E " + duracaoMinutos + " MINUTO(S)");

        }

        entrada.close();
    }
}