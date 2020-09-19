package homeworks.september_13.task4;

public class Main {

    public static void main(String[] args) {

        Person buyer = Parser.getPersonInfo();

        Vehicle car = new Car(Brand.BMW, Model.M3);

        System.out.println(
                buyer.getFirstName() + " " + buyer.getLastName() + " bought a new car:\n" +
                        car.toString() + "\n" +
                "On " + java.time.LocalDate.now() + " at " + buyer.getCity());


    }
}
