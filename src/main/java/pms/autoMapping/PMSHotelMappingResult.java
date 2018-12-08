package pms.autoMapping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PMSHotelMappingResult", propOrder = {"channel", "hotelCode", "roomTypeCode", "ratePlanCode", "isSuccess", "errorCode", "message"})
public class PMSHotelMappingResult {
    @XmlElement(name = "Channel")
    protected String channel;
    @XmlElement(name = "HotelCode")
    protected String hotelCode;
    @XmlElement(name = "RoomTypeCode")
    protected String roomTypeCode;
    @XmlElement(name = "RatePlanCode")
    protected String ratePlanCode;
    @XmlElement(name = "IsSuccess")
    protected boolean isSuccess;
    @XmlElement(name = "ErrorCode")
    protected String errorCode;
    @XmlElement(name = "Message")
    protected String message;

    public String getChannel() {
        return channel;
    }

    public void setChannel(String value) {
        this.channel = value;
    }

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

    public boolean isIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(boolean value) {
        this.isSuccess = value;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String value) {
        this.errorCode = value;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String value) {
        this.message = value;
    }
}