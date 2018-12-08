package pms.MappingWebAPI;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHotelInfo", propOrder = {"hotelInfo"})
public class ArrayOfHotelInfo {
    @XmlElement(name = "HotelInfo", nillable = true)
    protected List<HotelInfo> hotelInfo;

    public List<HotelInfo> getHotelInfo() {
        if (hotelInfo == null) {
            hotelInfo = new ArrayList<HotelInfo>();
        }
        return this.hotelInfo;
    }
}