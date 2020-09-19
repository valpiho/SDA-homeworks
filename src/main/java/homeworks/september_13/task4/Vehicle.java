package homeworks.september_13.task4;

public abstract class Vehicle {
    private Brand brand;
    private Model model;

    public Vehicle(Brand brand, Model model) {
        this.brand = brand;
        this.model = model;
    }

    public Brand getBrand() {
        return brand;
    }

    public Model getModel() {
        return model;
    }

    public Vehicle buy(Brand brand, Model model) {
        return null;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand=" + brand +
                ", model=" + model +
                '}';
    }
}
