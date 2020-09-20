package homeworks.september_13.task8;

public class Main {

    public static void main(String[] args) {

        RoutesPlanner routesPlanner = new RoutesPlanner(
                "D:\\SDA\\src\\main\\java\\homeworks\\september_13\\task8\\JsonFile.json");

        System.out.println(routesPlanner.showRoute());
    }
}
