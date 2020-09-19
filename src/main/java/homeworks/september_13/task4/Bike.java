package homeworks.september_13.task4;

public class Bike extends Vehicle {


    public Bike(Brand brand, Model model) {
        super(brand, model);
    }

    @Override
    public Bike buy(Brand brand, Model model) {
        return new Bike(brand, model);
    }

    @Override
    public String toString() {
        return "Bike{" +
                super.getBrand().toString() + " | " +
                super.getModel().toString() +
                '}';
    }
}
