package homeworks.september_13.task7;

import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RoutePlanner {
    private final List<Route> routes = new ArrayList<>();

    public void createRoute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter destination country:");
        String country = scanner.nextLine();
        ArrayList<String> cities = new ArrayList<>();

        System.out.println("Please enter cities you want to visit:\n" +
                "Type 'Exit' to stop adding cities.");

        while (true){
            String city = scanner.nextLine();
            if (city.equals("Exit")){
                break;
            }
            cities.add(city);
        }

        Route route= new Route(country, cities);
        routes.add(route);
    }

    public void convertToJSON() {

        try {
            ObjectMapper mapper = new ObjectMapper();
            ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());

            writer.writeValue(Paths.get("JsonFile.json").toFile(), routes);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void showAllRoutes() {
        routes.forEach(System.out::println);
    }
}
