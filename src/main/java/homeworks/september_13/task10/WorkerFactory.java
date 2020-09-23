package homeworks.september_13.task10;

import java.util.Scanner;

public class WorkerFactory implements EmployeeFactory {

    @Override
    public Employee createEmployee() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter First name:");
        String firstName = scanner.nextLine();
        System.out.println("Please enter Last name:");
        String lastName = scanner.nextLine();
        return new Worker(firstName, lastName, "Hammer", Department.WORKER);
    }
}
