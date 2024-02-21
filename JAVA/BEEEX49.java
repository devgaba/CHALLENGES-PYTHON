import java.util.Scanner;

public class BEEEX49 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String animalClasse = entrada.nextLine();
        String animalTipo = entrada.nextLine();
        String animalDieta = entrada.nextLine();

        switch (animalClasse) {
            case "vertebrado":
                switch (animalTipo) {
                    case "ave":
                        switch (animalDieta) {
                            case "carnivoro":
                                System.out.println("aguia");
                                break;

                            case "onivoro":
                                System.out.println("pombo");
                                break;
                        }
                        break;

                    case "mamifero":
                        switch (animalDieta) {
                            case "onivoro":
                                System.out.println("homem");
                                break;

                            case "herbivoro":
                                System.out.println("vaca");
                                break;
                        }
                        break;
                }
                break;

            case "invertebrado":
                switch (animalTipo) {
                    case "inseto":
                        switch (animalDieta) {
                            case "hematofago":
                                System.out.println("pulga");
                                break;

                            case "herbivoro":
                                System.out.println("lagarta");
                                break;
                        }
                        break;

                    case "anelideo":
                        switch (animalDieta) {
                            case "hematofago":
                                System.out.println("sanguessuga");
                                break;

                            case "onivoro":
                                System.out.println("minhoca");
                                break;
                        }
                        break;
                }
                break;
        }
        entrada.close();
    }
}
