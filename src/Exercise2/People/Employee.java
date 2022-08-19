package Exercise2.People;

import java.time.LocalDateTime;

abstract class Employee implements Person {

    private final String firstName;
    private final String lastName;
    private final LocalDateTime birthday;
    private final String address;
    private final LocalDateTime dateOfEmployment;
    private final String position;

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public LocalDateTime getBirthday() {
        return birthday;
    }

    @Override
    public String getAddress() {
        return address;
    }

    public LocalDateTime getDateOfEmployment() {
        return dateOfEmployment;
    }

    public String getPosition() {
        return position;
    }

    protected Employee(String firstName, String lastName, LocalDateTime birthday, String address,
                       LocalDateTime dateOfEmployment, String position) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.address = address;
        this.dateOfEmployment = dateOfEmployment;
        this.position = position;
    }
/*
    @Override
    public String toString() {
        return "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthday=" + birthday +
                ", address='" + address + '\'' +
                ", dateOfEmployment=" + dateOfEmployment +
                ", position='" + position + '\'';
    }
*/
}
