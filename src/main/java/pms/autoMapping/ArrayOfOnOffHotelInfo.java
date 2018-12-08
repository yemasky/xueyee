package pms.autoMapping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOnOffHotelInfo", propOrder = {"onOffHotelInfo"})
public class ArrayOfOnOffHotelInfo {
    @XmlElement(name = "OnOffHotelInfo", nillable = true)
    protected List<OnOffHotelInfo> onOffHotelInfo;

    public List<OnOffHotelInfo> getOnOffHotelInfo() {
        if (onOffHotelInfo == null) {
            onOffHotelInfo = new ArrayList<OnOffHotelInfo>();
        }
        return this.onOffHotelInfo;
    }
}