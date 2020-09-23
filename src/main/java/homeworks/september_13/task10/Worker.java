package homeworks.september_13.task10;

public class Worker extends Employee{

    public Worker(String firstName, String lastName, String tool, Department department) {
        super(firstName, lastName, tool, department);
    }

    @Override
    public void doSomeWork() {
        System.out.println("Some Workers work");
    }
}
