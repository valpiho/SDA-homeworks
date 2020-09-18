package homeworks.september_13.task7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class RoutePlanner {

    private HashMap<String, ArrayList<String>> route;
    private final String country;
    private final ArrayList<String> cities;

    public RoutePlanner() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter destination country:");
        this.country = scanner.nextLine();

        this.cities = new ArrayList<>();

        System.out.println("Please enter cities you want to visit:\n" +
                "Type 'Exit' to stop adding cities.");

        while (true){
            String city = scanner.nextLine();
            if (city.equals("Exit")){
                break;
            }
            this.cities.add(city);
        }

        createRoute();
    }

    public void createRoute() {
        this.route = new HashMap<>();
        this.route.put(this.country, this.cities);
    }

    public void show(){
        for (int i = 0; i < this.cities.size(); i++) {
            for (int j = i + 1; j < this.cities.size(); j++) {
                if (this.cities.get(i).equals(this.cities.get(j))) {
                    this.cities.set(j, this.cities.get(j) + " back and forth");
                }
            }
        }
        this.route.forEach((k, v) -> System.out.println(k + " -> " + v));
    }
}
