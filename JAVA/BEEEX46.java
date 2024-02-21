import java.util.Scanner;

public class BEEEX46 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int horaEntrada = entrada.nextInt();
        int horaSaida = entrada.nextInt();

        int dia = 24;
        int calcHorario = (dia - horaEntrada) + horaSaida;

        if (horaEntrada < horaSaida) {
            int novoCalc = horaSaida - horaEntrada;
            System.out.println("O JOGO DUROU " + novoCalc + " HORA(S)");
        } else {
            System.out.println("O JOGO DUROU " + calcHorario + " HORA(S)");
        }
        entrada.close();
    }
}
