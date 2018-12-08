package pms.MappingWebAPI;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"ctripSubHotelInfoByEBKRQ"})
@XmlRootElement(name = "GetCtripSubHotelInfoByEBK")
public class GetCtripSubHotelInfoByEBK {
    @XmlElement(name = "CtripSubHotelInfoByEBKRQ")
    protected CtripSubHotelInfoByEBKRQ ctripSubHotelInfoByEBKRQ;

    public CtripSubHotelInfoByEBKRQ getCtripSubHotelInfoByEBKRQ() {
        return ctripSubHotelInfoByEBKRQ;
    }

    public void setCtripSubHotelInfoByEBKRQ(CtripSubHotelInfoByEBKRQ value) {
        this.ctripSubHotelInfoByEBKRQ = value;
    }
}