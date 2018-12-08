package pms.MappingWebAPI;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoomMatchRQ", propOrder = {"roomTypeCode", "roomTypeName", "ratePlanName", "otaProductList"})
public class RoomMatchRQ {
    protected String roomTypeCode;
    protected String roomTypeName;
    protected String ratePlanName;
    protected ArrayOfOtaProductInfo otaProductList;

    public String getRoomTypeCode() {
        return roomTypeCode;
    }

    public void setRoomTypeCode(String value) {
        this.roomTypeCode = value;
    }

    public String getRoomTypeName() {
        return roomTypeName;
    }

    public void setRoomTypeName(String value) {
        this.roomTypeName = value;
    }

    public String getRatePlanName() {
        return ratePlanName;
    }

    public void setRatePlanName(String value) {
        this.ratePlanName = value;
    }

    public ArrayOfOtaProductInfo getOtaProductList() {
        return otaProductList;
    }

    public void setOtaProductList(ArrayOfOtaProductInfo value) {
        this.otaProductList = value;
    }
}