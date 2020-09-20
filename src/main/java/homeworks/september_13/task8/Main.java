package homeworks.september_13.task8;

public class Main {

    public static void main(String[] args) {

        RoutePlanner routePlanner = new RoutePlanner(
                "JsonFile.json");

        System.out.println(routePlanner.showRoute());
    }
}
