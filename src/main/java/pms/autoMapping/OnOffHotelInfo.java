package pms.autoMapping;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OnOffHotelInfo", propOrder = {"onOffProductInfos"})
public class OnOffHotelInfo {
    @XmlElement(name = "OnOffProductInfos")
    protected ArrayOfOnOffProductInfo onOffProductInfos;
    @XmlAttribute(name = "HotelCode")
    protected String hotelCode;
    @XmlAttribute(name = "HotelOnlineStatus")
    protected String hotelOnlineStatus;
    @XmlAttribute(name = "Channel")
    protected String channel;
    @XmlAttribute(name = "HotelGroupCode")
    protected String hotelGroupCode;
    @XmlAttribute(name = "OfflineCause")
    protected String offlineCause;

    public ArrayOfOnOffProductInfo getOnOffProductInfos() {
        return onOffProductInfos;
    }

    public void setOnOffProductInfos(ArrayOfOnOffProductInfo value) {
        this.onOffProductInfos = value;
    }

    public String getHotelCode() {
        return hotelCode;
    }

    public void setHotelCode(String value) {
        this.hotelCode = value;
    }

    public String getHotelOnlineStatus() {
        return hotelOnlineStatus;
    }

    public void setHotelOnlineStatus(String value) {
        this.hotelOnlineStatus = value;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String value) {
        this.channel = value;
    }

    public String getHotelGroupCode() {
        return hotelGroupCode;
    }

    public void setHotelGroupCode(String value) {
        this.hotelGroupCode = value;
    }

    public String getOfflineCause() {
        return offlineCause;
    }

    public void setOfflineCause(String value) {
        this.offlineCause = value;
    }
}