package pms.MappingWebAPI;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetMappingRQ", propOrder = {"hotelCode", "roomTypeCode", "ratePlanCode", "subHotelId", "masterHotelId", "subRoomId", "setType"})
public class SetMappingRQ {
    protected String hotelCode;
    protected String roomTypeCode;
    protected String ratePlanCode;
    protected String subHotelId;
    protected String masterHotelId;
    protected String subRoomId;
    protected int setType;

    public String getHotelCode() {
        return hotelCode;
    }

    public void setHotelCode(String value) {
        this.hotelCode = value;
    }

    public String getRoomTypeCode() {
        return roomTypeCode;
    }

    public void setRoomTypeCode(String value) {
        this.roomTypeCode = value;
    }

    public String getRatePlanCode() {
        return ratePlanCode;
    }

    public void setRatePlanCode(String value) {
        this.ratePlanCode = value;
    }

    public String getSubHotelId() {
        return subHotelId;
    }

    public void setSubHotelId(String value) {
        this.subHotelId = value;
    }

    public String getMasterHotelId() {
        return masterHotelId;
    }

    public void setMasterHotelId(String value) {
        this.masterHotelId = value;
    }

    public String getSubRoomId() {
        return subRoomId;
    }

    public void setSubRoomId(String value) {
        this.subRoomId = value;
    }

    public int getSetType() {
        return setType;
    }

    public void setSetType(int value) {
        this.setType = value;
    }
}