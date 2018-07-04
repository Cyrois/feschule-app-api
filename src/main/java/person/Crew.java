package person;

import org.springframework.data.annotation.Id;

public class Crew {

    @Id
    private String id;

    private String crewName;
    private String userId;

    public String getCrewName() {
        return crewName;
    }

    public void setCrewName(String crewName) {
        this.crewName = crewName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
