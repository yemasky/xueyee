package pms.autoMapping;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OnOffProductInfo", propOrder = {"ratePlanCode", "roomTypeCode", "channelCode", "onlineStatus", "timeSpan"})
public class OnOffProductInfo {
    @XmlElement(name = "RatePlanCode")
    protected String ratePlanCode;
    @XmlElement(name = "RoomTypeCode")
    protected String roomTypeCode;
    @XmlElement(name = "ChannelCode")
    protected String channelCode;
    @XmlElement(name = "OnlineStatus")
    protected String onlineStatus;
    @XmlElement(name = "TimeSpan", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeSpan;

    public String getRatePlanCode() {
        return ratePlanCode;
    }

    public void setRatePlanCode(String value) {
        this.ratePlanCode = value;
    }

    public String getRoomTypeCode() {
        return roomTypeCode;
    }

    public void setRoomTypeCode(String value) {
        this.roomTypeCode = value;
    }

    public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String value) {
        this.channelCode = value;
    }

    public String getOnlineStatus() {
        return onlineStatus;
    }

    public void setOnlineStatus(String value) {
        this.onlineStatus = value;
    }

    public XMLGregorianCalendar getTimeSpan() {
        return timeSpan;
    }

    public void setTimeSpan(XMLGregorianCalendar value) {
        this.timeSpan = value;
    }
}