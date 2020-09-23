package homeworks.september_13.task10;

public class Director extends Employee{


    public Director(String firstName, String lastName, String tool, Department department) {
        super(firstName, lastName, tool, department);
    }

    @Override
    public void doSomeWork() {
        System.out.println("Some Directors work");
    }
}
