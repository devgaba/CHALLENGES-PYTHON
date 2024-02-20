import java.util.Scanner;

public class BEEEX46 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int horaEntrada = entrada.nextInt();
        int horaSaida = entrada.nextInt();

        if (horaEntrada > horaSaida) {
            int calcDuracao = horaSaida - horaEntrada + 24;
            System.out.println("O JOGO DUROU " + calcDuracao + " HORA(S)");
        } else if (horaEntrada == horaSaida) {
            System.out.println("O JOGO DUROU 24 HORA(S)");
        } else {
            int calcDuracao = horaSaida - horaEntrada;
            System.out.println("O JOGO DUROU " + calcDuracao + " HORA(S)");
        }
        entrada.close();
    }
}