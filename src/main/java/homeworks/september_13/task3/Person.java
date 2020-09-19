package homeworks.september_13.task3;

public class Person {

    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private Gender gender;
    private String ipAddress;

    public Person(String id, String firstName, String lastName, String email, Gender gender, String ipAddress) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.ipAddress = ipAddress;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                ", ipAddress='" + ipAddress + '\'' +
                '}';
    }
}
