package Exercise2.People;

import java.time.LocalDateTime;

public class DatabaseAdmin extends Employee {
    private final String dbTechnology;

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
        return "db admin: " + super.getAddress();
    }

    @Override
    public LocalDateTime getDateOfEmployment() {
        return super.getDateOfEmployment();
    }

    @Override
    public String getPosition() {
        return super.getPosition();
    }

    public String getDbTechnology() {
        return dbTechnology;
    }

    public DatabaseAdmin(String firstName, String lastName, LocalDateTime birthday, String address,
                         LocalDateTime dateOfEmployment, String position, String dbTechnology) {
        super(firstName, lastName, birthday, address, dateOfEmployment, position);
        this.dbTechnology = dbTechnology;
    }
/*
    @Override
    public String toString() {
        return "DatabaseAdmin{" + super.toString() +
                ", dbTechnology='" + dbTechnology + '\'' +
                "} ";
    }
 */
}
