package person;

import org.springframework.data.annotation.Id;

import java.util.Map;

public class Person {

    @Id private String id;

    private String firstName;
    private String lastName;
    private Map<String, String> timetable;
    private String userId;
    private Crew crew;

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

    public Map<String, String> getTimeTable() {
        return timetable;
    }

    public void setTimetable(Map<String, String> timetable) {
        this.timetable = timetable;
    }
}