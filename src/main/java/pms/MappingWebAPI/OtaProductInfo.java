package pms.MappingWebAPI;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "otaProductInfo", propOrder = {"otaRoomId", "otaRoomName"})
public class OtaProductInfo {
    @XmlElement(name = "ota_RoomId")
    protected String otaRoomId;
    @XmlElement(name = "ota_RoomName")
    protected String otaRoomName;

    public String getOtaRoomId() {
        return otaRoomId;
    }

    public void setOtaRoomId(String value) {
        this.otaRoomId = value;
    }

    public String getOtaRoomName() {
        return otaRoomName;
    }

    public void setOtaRoomName(String value) {
        this.otaRoomName = value;
    }
}