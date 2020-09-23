package homeworks.september_13.task10;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Please enter department to create Employee:");
        EmployeeFactory employeeFactory = createEmployeeByDepartment(scanner.nextLine());
        Employee employee = employeeFactory.createEmployee();

        employee.doSomeWork();
        System.out.println(employee.toString());
    }

    public static EmployeeFactory createEmployeeByDepartment(String department) {
        return switch (department) {
            case "director" -> new DirectorFactory();
            case "manager" -> new ManagerFactory();
            case "worker" -> new WorkerFactory();
            default -> throw new RuntimeException(department + "is not available");
        };
    }
}
