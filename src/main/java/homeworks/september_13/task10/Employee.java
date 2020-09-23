package homeworks.september_13.task10;

public abstract class Employee {
    private String firstName;
    private String lastName;
    private String tool;
    private Department department;

    public Employee(String firstName, String lastName, String tool, Department department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.tool = tool;
        this.department = department;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTool() {
        return tool;
    }

    public void setTool(String tool) {
        this.tool = tool;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public abstract void doSomeWork();

    @Override
    public String toString() {
        return "Employee{ " + department +
                " FirstName=" + firstName +
                ", LastName=" + lastName +
                ", tool=" + tool + "}";
    }
}
