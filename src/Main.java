import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("C://Users//stix_//Desktop//city_ru.csv"));
        scanner.useDelimiter(";");
        List<City> CityDirectory = new ArrayList<>();
        while(scanner.hasNext()){
            scanner.nextInt();
            City city = new City()
                    .setName(scanner.next())
                    .setRegion(scanner.next())
                    .setDistrict(scanner.next())
                    .setPopulation(scanner.nextInt())
                    .setFoundation(scanner.nextLine().replace(";", ""))
                    .build();
            CityDirectory.add(city);
        }
        scanner.close();
        CityDirectory.forEach(System.out::println);
    }
}
