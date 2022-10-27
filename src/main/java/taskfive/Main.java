package taskfive;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    /**
     * Förstod inte riktigt vad jag skulle göra med numberOfCars, tyvärr så
     * använde jag inte den
     * Ser kluddigt ut - mkt text
     *
     */
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("src/main/resources/carslist.json");
        ObjectMapper mapper = new ObjectMapper();
        List<Car> carsList = new ArrayList<>();

        Car car1 = new Car();
        car1.setColor("Blue");
        car1.setBrand("BMW");
        carsList.add(car1);
        System.out.println(Car.COUNTER);

        Car car2 = new Car();
        car2.setColor("Black");
        car2.setBrand("Mercedes-Benz");
        carsList.add(car2);
        System.out.println(Car.COUNTER);

        Car car3 = new Car();
        car3.setColor("Purple");
        car3.setBrand("Nissan");
        carsList.add(car3);
        System.out.println(Car.COUNTER);

        Car car4 = new Car();
        car4.setColor("Black");
        car4.setBrand("Toyota");
        carsList.add(car4);
        System.out.println(Car.COUNTER);

        mapper.writeValue(path.toFile(), carsList);
    }
}
