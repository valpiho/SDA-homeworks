package homeworks.september_13.task10;

public enum Department {
    DIRECTOR("Director"),
    MANAGER("Manager"),
    WORKER("Worker");

    private String title;

    Department(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
