package person;

import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;

public class DailyTimeTable implements Serializable {

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

    public void setTimeTable(Map<String, String> timetable) {
        this.timetable = timetable;
    }
}
