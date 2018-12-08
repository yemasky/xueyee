package pms.MappingWebAPI;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoomProductInfo", propOrder = {"subHotelId", "subRoomId", "breakfast", "balanceType", "subRoomName", "pmsRoomTypeCode", "pmsRoomName", "pmsHotelCode", "pmsRatePlanCode"})
public class RoomProductInfo {
    protected String subHotelId;
    protected String subRoomId;
    protected String breakfast;
    protected String balanceType;
    protected String subRoomName;
    protected String pmsRoomTypeCode;
    protected String pmsRoomName;
    protected String pmsHotelCode;
    protected String pmsRatePlanCode;

    public String getSubHotelId() {
        return subHotelId;
    }

    public void setSubHotelId(String value) {
        this.subHotelId = value;
    }

    public String getSubRoomId() {
        return subRoomId;
    }

    public void setSubRoomId(String value) {
        this.subRoomId = value;
    }

    public String getBreakfast() {
        return breakfast;
    }

    public void setBreakfast(String value) {
        this.breakfast = value;
    }

    public String getBalanceType() {
        return balanceType;
    }

    public void setBalanceType(String value) {
        this.balanceType = value;
    }

    public String getSubRoomName() {
        return subRoomName;
    }

    public void setSubRoomName(String value) {
        this.subRoomName = value;
    }

    public String getPmsRoomTypeCode() {
        return pmsRoomTypeCode;
    }

    public void setPmsRoomTypeCode(String value) {
        this.pmsRoomTypeCode = value;
    }

    public String getPmsRoomName() {
        return pmsRoomName;
    }

    public void setPmsRoomName(String value) {
        this.pmsRoomName = value;
    }

    public String getPmsHotelCode() {
        return pmsHotelCode;
    }

    public void setPmsHotelCode(String value) {
        this.pmsHotelCode = value;
    }

    public String getPmsRatePlanCode() {
        return pmsRatePlanCode;
    }

    public void setPmsRatePlanCode(String value) {
        this.pmsRatePlanCode = value;
    }
}