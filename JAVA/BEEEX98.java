import java.util.Locale;

public class BEEEX98 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        int i = 0;
        int j = 0;

        while (j < 3) {
            j += 1;
            System.out.println("I=" + i + " " + "J=" + j);
        }
        while (i < 2) {
            i += 0.2;
            j += 0.2;
            System.out.printf("I= J=", (double) i, (double) j);

        }

    }
}
