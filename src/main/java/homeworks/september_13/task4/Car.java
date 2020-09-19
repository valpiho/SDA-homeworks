package homeworks.september_13.task4;

public class Car extends Vehicle {


    public Car(Brand brand, Model model) {
        super(brand, model);
    }

    @Override
    public Car buy(Brand brand, Model model) {
        return new Car(brand, model);
    }

    @Override
    public String toString() {
        return "Car{" +
                super.getBrand().toString() + " | " +
                super.getModel().toString() +
                '}';
    }
}
