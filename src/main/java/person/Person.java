package person;

import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class Person implements Serializable {

    @Id private String id;

    private String firstName;
    private String lastName;
    private List<DailyTimeTable> timeTables;
    private String userId;

    public Person() {}

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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<DailyTimeTable> getTimeTables() {
        return timeTables;
    }

    public void setTimeTables(List<DailyTimeTable> timeTables) {
        this.timeTables = timeTables;
    }
}