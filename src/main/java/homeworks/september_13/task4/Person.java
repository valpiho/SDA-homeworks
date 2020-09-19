package homeworks.september_13.task4;

import java.util.GregorianCalendar;

public class Person {

    private String firstName;
    private String lastName;
    private String city;
    private GregorianCalendar dateOfBirth;

    public Person(String firstName, String lastName, String city, GregorianCalendar dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCity() {
        return city;
    }

    public GregorianCalendar getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", city='" + city + '\'' +
                ", dateOfBirth=" + '\'' +
                dateOfBirth.get(GregorianCalendar.DATE)  +
                "." + dateOfBirth.get(GregorianCalendar.MONTH) +
                "." + dateOfBirth.get(GregorianCalendar.YEAR) + '\'' +
                '}';
    }
}
