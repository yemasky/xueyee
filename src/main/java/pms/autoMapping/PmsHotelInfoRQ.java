package pms.autoMapping;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"pmsBaseHotelInfos"})
@XmlRootElement(name = "PmsHotelInfoRQ")
public class PmsHotelInfoRQ {
    @XmlElement(name = "PMSBaseHotelInfos")
    protected ArrayOfPMSHotelInfo pmsBaseHotelInfos;

    public ArrayOfPMSHotelInfo getPMSBaseHotelInfos() {
        return pmsBaseHotelInfos;
    }

    public void setPMSBaseHotelInfos(ArrayOfPMSHotelInfo value) {
        this.pmsBaseHotelInfos = value;
    }
}