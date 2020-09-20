package homeworks.september_13.task7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        RoutePlanner routePlanner = new RoutePlanner();

        do {
            routePlanner.createRoute();
            System.out.println("Do you want to create another route? Type \"Yes\" to continue.");
        }
        while (scanner.nextLine().equals("Yes"));

        routePlanner.showAllRoutes();
        routePlanner.convertToJSON();

    }

}
