import java.util.Scanner;

public class BEEEX61 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Entrada do Primeiro dia
        entrada.next();
        int firstDay = entrada.nextInt();

        // Entrada do relógio inicial
        int firstHour = entrada.nextInt();
        entrada.next();
        int firstMinute = entrada.nextInt();
        entrada.next();
        int firstSecond = entrada.nextInt();

        // Entrada do Segundo dia
        entrada.next();
        int secondDay = entrada.nextInt();

        // Entrada do relógio final
        int lastHour = entrada.nextInt();
        entrada.next();
        int lastMinute = entrada.nextInt();
        entrada.next();
        int lastSecond = entrada.nextInt();

        int seconds = (secondDay - firstDay) * 86400 + (lastHour - firstHour) * 3600
                + (lastMinute - firstMinute) * 60 + (lastSecond - firstSecond);

        int calcDay = seconds / 86400;
        int calcHour = (seconds % 86400) / 3600;
        int calcMin = ((seconds % 86400) % 3600) / 60;
        int calcSecond = ((seconds % 86400) % 3600) % 60;

        System.out.println(calcDay + " dia(s)");
        System.out.println(calcHour + " hora(s)");
        System.out.println(calcMin + " minuto(s)");
        System.out.println(calcSecond + " segundo(s)");

        entrada.close();
    }
}
