package homeworks.september_13.task10;

public class Manager extends Employee{

    public Manager(String firstName, String lastName, String tool, Department department) {
        super(firstName, lastName, tool, department);
    }

    @Override
    public void doSomeWork() {
        System.out.println("Some Managers work");
    }
}
