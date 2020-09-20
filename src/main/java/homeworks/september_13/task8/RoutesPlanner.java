package homeworks.september_13.task8;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RoutesPlanner {
    private List<Route> routes;

    public RoutesPlanner(String path) {
        this.routes = createNewRoutesFromFile(path);
    }

    public List<Route> createNewRoutesFromFile(String path) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            routes = Arrays.asList(mapper.readValue(
                    Paths.get(path)
                            .toFile(), Route[].class));

            System.out.println("Routes were imported:");
            showAllRoutes();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return routes;
    }

    private void showAllRoutes() {
        routes.forEach(System.out::println);
    }

    public Route getRoute(String routeTitle) {
        return routes.stream()
                .filter(e -> routeTitle.equals(e.getRouteTitle()))
                .findAny()
                .orElse(null);
    }

    public Route showRoute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter route Title po proceed:");
        Route route = getRoute(scanner.nextLine());
        while (route == null) {
            System.out.println("No such route. Please enter again:");
            route = getRoute(scanner.nextLine());
            }

        ArrayList<String> deleteFromCities = new ArrayList<>();
        route.getCities().forEach(element -> {
            System.out.println(element);
            if (scanner.nextLine().equals("Delete")) {
                deleteFromCities.add(element);
            }
        });
        
        for (String s : deleteFromCities) {
            route.getCities().remove(s);
        }

        System.out.println("End of list");

        return route;
    }
}