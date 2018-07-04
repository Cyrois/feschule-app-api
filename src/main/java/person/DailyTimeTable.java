package person;

import org.springframework.data.annotation.Id;

import java.util.Date;
import java.util.Map;

public class DailyTimeTable {

    @Id private String id;

    private Date date;
        private Map<String, String> timetable;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Map<String, String> getTimeTable() {
        return timetable;
    }

    public void setTimetable(Map<String, String> timetable) {
        this.timetable = timetable;
    }
}
