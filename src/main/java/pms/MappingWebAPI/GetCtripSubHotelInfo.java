package pms.MappingWebAPI;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"masterHotelId"})
@XmlRootElement(name = "GetCtripSubHotelInfo")
public class GetCtripSubHotelInfo {
    protected String masterHotelId;

    public String getMasterHotelId() {
        return masterHotelId;
    }

    public void setMasterHotelId(String value) {
        this.masterHotelId = value;
    }
}