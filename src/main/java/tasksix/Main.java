package tasksix;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    /**
     * Hittade inte riktigt svar på fråga nummer 4. (stressad)
     * Blev väldigt mycket text ser kluddigt ut
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userPoints = 0;

        System.out.println("Nämn en av rollerna som finns inom Scrum: ");
        String answer1 = scanner.next();
        if (answer1.equals("Scrum master") || answer1.equals("Developer") || answer1.equals("Product owner")) {
            System.out.println("Rätt svar!");
            userPoints++;
        } else {
            System.out.println("Det var tyvärr fel svar!");
        }

        System.out.println("Nämn en av ceremonierna som finns inom Scrum: ");
        String answer2 = scanner.next();
        if (answer2.equals("The sprint") || answer2.equals("Sprint planning") || answer2.equals("Daily Scrum")
                || answer2.equals("Sprint review") || answer2.equals("Sprint retrospective")) {
            System.out.println("Rätt svar!");
            userPoints++;
        } else {
            System.out.println("Det var tyvärr fel svar!");
        }

        System.out.println("Vad är ett rekommenderat max antal personer i ett team?");
        int answer3 = scanner.nextInt();
        if (answer3 == 9) {
            System.out.println("Rätt svar!");
            userPoints++;
        } else {
            System.out.println("Det var tyvärr fel svar!");
        }

        System.out.println("Scrum har ett dokument där ALL information om " +
                "Scrum finns, vad heter dokumentet?");
        String answer4 = scanner.next();
        if (Objects.equals(answer4, "Scrum DOC")) {
            System.out.println("Rätt svar!");
            userPoints++;
        } else {
            System.out.println("Det var tyvärr fel svar!");
        }

        System.out.println("Vem är den enda som får avbryta en Sprint?");
        String answer5 = scanner.next();
        if (Objects.equals(answer5, "Product owner")) {
            System.out.println("Rätt svar!");
            userPoints++;
        } else {
            System.out.println("Det var tyvärr fel svar!");
        }

        if (userPoints < 3) {
            System.out.println("Jag tror att du behöver läsa på mer om Scrum!");
        } else if (userPoints == 5) {
            System.out.println("--------------");
            System.out.println("Grattis!! Du har svarat rätt på alla frågor!");
            System.out.println("--------------");
            System.out.println("**************");
        }

    }
}
