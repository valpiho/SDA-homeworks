package homeworks.september_13.task1;

public class Developer extends Person{

    public Developer() {
        super();
        System.out.println("Colling Developer constructor");
    }

    protected void sayHello() {
        System.out.println("Hello");
    }
}
