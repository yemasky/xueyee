package pms.autoMapping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPMS_Hotel_Info", propOrder = {"pmsHotelInfo"})
public class ArrayOfPMSHotelInfo {
    @XmlElement(name = "PMS_Hotel_Info", nillable = true)
    protected List<PMSHotelInfo> pmsHotelInfo;

    public List<PMSHotelInfo> getPMSHotelInfo() {
        if (pmsHotelInfo == null) {
            pmsHotelInfo = new ArrayList<PMSHotelInfo>();
        }
        return this.pmsHotelInfo;
    }

}
