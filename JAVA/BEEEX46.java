import java.util.Scanner;

public class BEEEX46 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int horaEntrada = entrada.nextInt();
        int horaSaida = entrada.nextInt();
        int dia = 24;
        int meioDia = dia / 2;

        if (horaSaida < 10) {
            int calcHora = (dia - horaEntrada) + horaSaida;
            System.out.println("O JOGO DUROU " + calcHora + " HORA(S)");
        } else if (horaEntrada <= 10) {
            int calcHora = (meioDia - horaEntrada) + (horaSaida - meioDia);
            System.out.println("O JOGO DUROU " + calcHora + " HORA(S)");
        } else if (horaEntrada > 10 && horaSaida > horaEntrada) {
            int calcHora = horaSaida - horaEntrada;
            System.out.println("O JOGO DUROU " + calcHora + " HORA(S)");
  } else if (horaSaida > 10 && horaEntrada > horaSaida) {
            int calcHora = (dia - horaEntrada) + horaSaida;
            System.out.println("O JOGO DUROU " + calcHora + " HORA(S)");
        }
        entrada.close();
    }
}
