package homeworks.september_13.task6;

public class Manager {

    private final String name;

    public Manager(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
