package homeworks.september_13.task1;

public class Person {

    public Person() {
        System.out.println("Calling Person constructor");
    }

    protected void sayMyName(String name) {
        System.out.println("Hello " + name);
    }
}
