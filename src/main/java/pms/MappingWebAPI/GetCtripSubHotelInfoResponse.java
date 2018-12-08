package pms.MappingWebAPI;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"ctripSubHotelInfoRS"})
@XmlRootElement(name = "GetCtripSubHotelInfoResponse")
public class GetCtripSubHotelInfoResponse {
    @XmlElement(name = "CtripSubHotelInfoRS")
    protected CtripSubHotelInfoRS ctripSubHotelInfoRS;

    public CtripSubHotelInfoRS getCtripSubHotelInfoRS() {
        return ctripSubHotelInfoRS;
    }

    public void setCtripSubHotelInfoRS(CtripSubHotelInfoRS value) {
        this.ctripSubHotelInfoRS = value;
    }
}