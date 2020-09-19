package homeworks.september_13.task6;

import java.util.*;

public class Main {

    static Map<Manager, List<Employee>> managerListMap = new HashMap<>();

    public static void main(String[] args) {

        Map<String, String> easyMap = new HashMap<>();
        easyMap.put("Employee", "Manager");
        easyMap.forEach((key, value) -> System.out.println(key + " - " + value));

        System.out.println("-------------------------------------------------------------");

        Map<Employee, Manager> generalMap = new HashMap<>();
        Manager manager = new Manager("Kevin");
        Employee employee = new Employee("John");
        generalMap.put(employee, manager);
        generalMap.forEach((k, v) -> System.out.println(k.getName() + " -> " + v.getName()));

        System.out.println("-------------------------------------------------------------");


        Manager manager1 = new Manager("Mark");
        Employee employee1 = new Employee("Zoe");
        Employee employee2 = new Employee("Frank");

        managerListMap.put(manager1, new ArrayList<>());
        managerListMap.get(manager1).add(employee1);
        managerListMap.get(manager1).add(employee2);
        showMap();

        removeEmployee(manager1, employee1);
        showMap();

        addEmployee(manager1, "Brad");
        addEmployee(manager1, "Antony");
        showMap();
    }

    public static void removeEmployee(Manager manager, Employee employee) {
        managerListMap.get(manager).removeIf(employee::equals);
    }
    public static void addEmployee(Manager manager, String name) {
        managerListMap.get(manager).add(new Employee(name));
    }
    public static void showMap(){
        managerListMap.forEach((k, v) -> System.out.println(k.getName() + " -> " +
                Arrays.toString(v.stream().map(Employee::getName).toArray())));
    }
}
