import java.util.Scanner;

public class BEEEX47 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int horaInicial = entrada.nextInt();
        int minutoInicial = entrada.nextInt();
        int horaFinal = entrada.nextInt();
        int minutoFinal = entrada.nextInt();

        if (horaInicial < horaFinal && minutoFinal > minutoInicial) {
            int calcDuracao = horaFinal - horaInicial;
            int calcMinuto = minutoFinal - minutoInicial;
            System.out.println("O JOGO DUROU " + calcDuracao + " HORA(S) E " + calcMinuto + " MINUTO(S)");
        } else if (horaFinal == horaInicial) {
            System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
        } else {
            int calcDuracao = horaFinal - horaInicial;
            int calcMinuto = minutoInicial - minutoFinal;
            if (calcDuracao == 1) {
                int hora = 60;
                int newCalc = hora - calcMinuto;
                System.out.println("O JOGO DUROU 0 HORA(S) E " + newCalc + " MINUTO(S)");
            }

        }

        entrada.close();
    }
}