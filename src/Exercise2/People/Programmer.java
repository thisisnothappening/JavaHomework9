package Exercise2.People;

import java.time.LocalDateTime;

public class Programmer extends Employee {
    private final String language;

    @Override
    public String getFirstName() {
        return super.getFirstName();
    }

    @Override
    public String getLastName() {
        return super.getLastName();
    }

    @Override
    public LocalDateTime getBirthday() {
        return super.getBirthday();
    }

    @Override
    public String getAddress() {
        return super.getAddress();
    }

    @Override
    public LocalDateTime getDateOfEmployment() {
        return super.getDateOfEmployment();
    }

    @Override
    public String getPosition() {
        return "programmer";
    }

    public String getLanguage() {
        return language;
    }

    public Programmer(String firstName, String lastName, LocalDateTime birthday, String address,
                      LocalDateTime dateOfEmployment, String position, String language) {
        super(firstName, lastName, birthday, address, dateOfEmployment, position);
        this.language = language;
    }
/*
    @Override
    public String toString() {
        return "Programmer{" + super.toString() +
                ", language='" + language + '\'' +
                "} ";
    }
 */
}
