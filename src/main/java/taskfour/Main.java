package taskfour;

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
            System.out.println("[1] print JSON-file with created people");
            System.out.println("[2] skapa en person");
            System.out.println("[3] exit program");
            System.out.println("");
            choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    printAllPersons();
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
                    System.out.println("Press any key to exit....");
                    System.exit(0);
                default:
                    System.out.println("Something went wrong, please try again!");
            }
        }

    }
    public static void printAllPersons() throws IOException {
        Path path = Paths.get("src/main/resources/personlist.json");
        ObjectMapper mapper = new ObjectMapper();
        Person[] fetchPersons;
        if(path.toFile().exists()) {
        fetchPersons = mapper.readValue(path.toFile(), Person[].class);

            for (Person j : fetchPersons) {
                System.out.println("First name:  " + j.getFirstName());
                System.out.println("Last name: " + j.getLastName());
                System.out.println("Favorite movie: " + j.getFavoriteMovie());
            }
        }
        else {
            System.out.println("To read from JSON, you have to create people first!");
            System.out.println("Please try again!");
        }
    }
}

