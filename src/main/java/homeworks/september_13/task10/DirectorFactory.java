package homeworks.september_13.task10;

import java.util.Scanner;

public class DirectorFactory implements EmployeeFactory {

    @Override
    public Employee createEmployee() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter First name:");
        String firstName = scanner.nextLine();
        System.out.println("Please enter Last name:");
        String lastName = scanner.nextLine();
        return new Director(firstName, lastName, "Pointing finger", Department.DIRECTOR);
    }
}
