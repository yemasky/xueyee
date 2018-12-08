package pms.autoMapping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PMS_Product_Info", propOrder = {"roomTypeCode", "roomTypeName", "ratePlanCode", "balanceType", "channel", "ratePlanName"})
public class PMSProductInfo {
    @XmlElement(name = "RoomTypeCode")
    protected String roomTypeCode;
    @XmlElement(name = "RoomTypeName")
    protected String roomTypeName;
    @XmlElement(name = "RatePlanCode")
    protected String ratePlanCode;
    @XmlElement(name = "BalanceType")
    protected String balanceType;
    @XmlElement(name = "Channel")
    protected String channel;
    @XmlElement(name = "RatePlanName")
    protected String ratePlanName;

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

    public String getRatePlanCode() {
        return ratePlanCode;
    }

    public void setRatePlanCode(String value) {
        this.ratePlanCode = value;
    }

    public String getBalanceType() {
        return balanceType;
    }

    public void setBalanceType(String value) {
        this.balanceType = value;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String value) {
        this.channel = value;
    }

    public String getRatePlanName() {
        return ratePlanName;
    }

    public void setRatePlanName(String value) {
        this.ratePlanName = value;
    }
}