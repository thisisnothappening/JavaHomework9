package Exercise2.People;

import java.time.LocalDateTime;

public interface Person {
    String getFirstName();
    String getLastName();
    LocalDateTime getBirthday();
    String getAddress();
}
