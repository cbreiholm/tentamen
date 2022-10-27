package taskone;

import java.util.Scanner;

public class Main {
    /**
     * Ser lite konstigt ut men det funkar :)
     *
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Skriv in ditt namn: ");
        String inputName = scanner.nextLine();
        while (true) {
            if (inputName != null) {
                char inputNameFirstLetter = inputName.charAt(0);
                if (inputNameFirstLetter == 'Ö') {
                    System.out.println("Namnet börjar på bokstaven " +
                            inputNameFirstLetter + " och det är den sista bokstaven i alfabetet!");
                    break;
                } else {
                    System.out.println("Namnet börjar på bokstaven " + inputNameFirstLetter + " !");
                    break;
                }
            }
        }
    }
}

