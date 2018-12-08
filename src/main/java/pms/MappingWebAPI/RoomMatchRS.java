package pms.MappingWebAPI;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoomMatchRS", propOrder = {"retCode", "msg", "matchResults"})
public class RoomMatchRS {
    protected String retCode;
    protected String msg;
    protected ArrayOfMatch matchResults;

    public String getRetCode() {
        return retCode;
    }

    public void setRetCode(String value) {
        this.retCode = value;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String value) {
        this.msg = value;
    }

    public ArrayOfMatch getMatchResults() {
        return matchResults;
    }

    public void setMatchResults(ArrayOfMatch value) {
        this.matchResults = value;
    }
}