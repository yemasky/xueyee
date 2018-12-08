package pms.MappingWebAPI;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Match", propOrder = {"otaRoomId", "score"})
public class Match {
    protected String otaRoomId;
    protected String score;

    public String getOtaRoomId() {
        return otaRoomId;
    }

    public void setOtaRoomId(String value) {
        this.otaRoomId = value;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String value) {
        this.score = value;
    }
}