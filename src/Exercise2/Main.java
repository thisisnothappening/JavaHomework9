package Exercise2;

import Exercise2.People.DatabaseAdmin;
import Exercise2.People.Programmer;
import Exercise3.PersonMoreInfo;

import java.time.LocalDateTime;

/*
2) Create the class hierarchy as in exercise1.jpeg
hint:
- for dates use LocalDateTime

3) Create an object that will receive any person (from ex 2) and will have methods to return person related data:
 - fullName
 - age (you need to calculate the number of years between two LocalDateTime variables)
 */
public class Main {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("Cipri", "Ciprius", LocalDateTime.of(1998, 5, 19, 15, 49),
                "str adgoknerge, nr 23", LocalDateTime.now(), "programmer", "Java");
        DatabaseAdmin databaseAdmin = new DatabaseAdmin("Marcel", "Marcelus", LocalDateTime.of(2002, 11, 28, 23, 51),
                "str drgoknsr, nr 15", LocalDateTime.now(), "database admin", "good stuff");
        PersonMoreInfo programmerMoreInfo = new PersonMoreInfo(programmer);
        PersonMoreInfo databaseAdminMoreInfo = new PersonMoreInfo(databaseAdmin);

    //    System.out.println(programmer);
    //    System.out.println(databaseAdmin);
    //    System.out.println(namelessObject);

        System.out.println("\nProgrammer: ");
        System.out.println("first name: " + programmer.getFirstName());
        System.out.println("last name: " + programmer.getLastName());
        System.out.println("full name: " + programmerMoreInfo.getFullName());
        System.out.println("birthday: " + programmer.getBirthday());
        System.out.println("age: " + programmerMoreInfo.getAge());
        System.out.println("address: " + programmer.getAddress());
        System.out.println("date of employment: " + programmer.getDateOfEmployment());
        System.out.println("position: " + programmer.getPosition());
        System.out.println("language: " + programmer.getLanguage());

        System.out.println("\nDatabase admin: ");
        System.out.println("first name: " + databaseAdmin.getFirstName());
        System.out.println("last name: " + databaseAdmin.getLastName());
        System.out.println("full name: " + databaseAdminMoreInfo.getFullName());
        System.out.println("birthday: " + databaseAdmin.getBirthday());
        System.out.println("age: " + databaseAdminMoreInfo.getAge());
        System.out.println("address: " + databaseAdmin.getAddress());
        System.out.println("date of employment: " + databaseAdmin.getDateOfEmployment());
        System.out.println("position: " + databaseAdmin.getPosition());
        System.out.println("language: " + databaseAdmin.getDbTechnology());
    }
}
