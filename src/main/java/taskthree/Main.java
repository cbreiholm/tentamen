package taskthree;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        ObjectMapper mapper = new ObjectMapper();
        Path path = Paths.get("src/main/resources/personlist.json");
        Person person = new Person();
        String choice = "0";
        ArrayList<Person> personList = new ArrayList<>();
        while (!choice.equals("3")) {
            Person personNew = new Person();
            System.out.println("");
            System.out.println("[1] för att skriva ut skapade personer");
            System.out.println("[2] för att skapa en person");
            System.out.println("[3] för att avsluta programmet");
            System.out.println("");
            choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    for(Person i : personList){
                        System.out.println("First name: " + i.getFirstName());
                        System.out.println("Last name: " + i.getLastName());
                        System.out.println("Favorite movie: " + i.getFavoriteMovie());
                    }
                    break;
                case "2":
                    System.out.println("");
                    System.out.println("First name: ");
                    String userInputFirstName = scanner.nextLine();
                    personNew.setFirstName(userInputFirstName);
                    System.out.println("Last name: ");
                    String userInputLastName = scanner.nextLine();
                    personNew.setLastName(userInputLastName);
                    System.out.println("Favorite movie: ");
                    String userInputFavoriteMovie = scanner.nextLine();
                    personNew.setFavoriteMovie(userInputFavoriteMovie);
                    personList.add(personNew);

                    mapper.writeValue(path.toFile(), personList);

                    break;
                case "3":
                    System.out.println("Press any key to quit....");
                    break;
                default:
                    System.out.println("Something went wrong, please try again!");
            }

        }
    }
}
