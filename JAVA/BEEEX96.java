public class BEEEX96 {
    public static void main(String[] args) {

        int i = 1;
        int j = 7;

        while (i <= 9) {
            while (j >= 5) {
                System.out.println("I=" + i + " " + "J=" + j);
                j -= 1;
            }
            i += 2;
            j += 3;
        }

    }
}
