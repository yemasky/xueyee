package pms.MappingWebAPI;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"subHotelId", "type"})
@XmlRootElement(name = "GetRoomProductInfo")
public class GetRoomProductInfo {
    protected String subHotelId;
    protected String type;

    public String getSubHotelId() {
        return subHotelId;
    }

    public void setSubHotelId(String value) {
        this.subHotelId = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String value) {
        this.type = value;
    }
}