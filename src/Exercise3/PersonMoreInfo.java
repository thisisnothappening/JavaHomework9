package Exercise3;

import Exercise2.People.Person;

import java.time.LocalDateTime;

public class PersonMoreInfo {

    private final Person person;

    public PersonMoreInfo(Person person) {
        this.person = person;
    }

    public String getFullName() {
        return person.getFirstName() + " " + person.getLastName();
    }

    public int getAge() {
        return LocalDateTime.now().getYear() - person.getBirthday().getYear();
    }
}
