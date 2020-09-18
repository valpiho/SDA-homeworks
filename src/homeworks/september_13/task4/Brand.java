package homeworks.september_13.task4;

public enum Brand {
    BMW("BMW"),
    MB("Mercedes-Benz"),
    AUDI("Audi"),
    DUCATI("Ducati");

    String title;

    Brand(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Brand : " + title;
    }
}
