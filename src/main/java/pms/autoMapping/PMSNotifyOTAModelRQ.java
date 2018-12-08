package pms.autoMapping;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PMSNotifyOTAModelRQ", propOrder = {"notityOnoffInfos"})
@XmlRootElement(name = "NotifyOTAModelRQ")
public class PMSNotifyOTAModelRQ {
    @XmlElement(name = "NotityOnoffInfos")
    protected ArrayOfOnOffHotelInfo notityOnoffInfos;

    public ArrayOfOnOffHotelInfo getNotityOnoffInfos() {
        return notityOnoffInfos;
    }

    public void setNotityOnoffInfos(ArrayOfOnOffHotelInfo value) {
        this.notityOnoffInfos = value;
    }
}