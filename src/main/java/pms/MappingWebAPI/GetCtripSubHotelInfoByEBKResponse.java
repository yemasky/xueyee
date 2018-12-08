package pms.MappingWebAPI;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"ctripSubHotelInfoByEBKRS"})
@XmlRootElement(name = "GetCtripSubHotelInfoByEBKResponse")
public class GetCtripSubHotelInfoByEBKResponse {
    @XmlElement(name = "CtripSubHotelInfoByEBKRS")
    protected CtripSubHotelInfoByEBKRS ctripSubHotelInfoByEBKRS;

    public CtripSubHotelInfoByEBKRS getCtripSubHotelInfoByEBKRS() {
        return ctripSubHotelInfoByEBKRS;
    }

    public void setCtripSubHotelInfoByEBKRS(CtripSubHotelInfoByEBKRS value) {
        this.ctripSubHotelInfoByEBKRS = value;
    }
}