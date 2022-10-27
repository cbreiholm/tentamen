package tasktwo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Skriv in ditt namn: ");
        String inputName = scanner.nextLine();

        switch (inputName.charAt(0)){
            case 'Ö':
                System.out.println("Namnet börjar på bokstaven "
                        + inputName.charAt(0) + ", och det är den sista bokstaven i alfabetet!");
                break;
            default:
                System.out.println("Namnet börjar på bokstaven "
                        + inputName.charAt(0) + "!");
        }
    }
}
