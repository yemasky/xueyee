package pms.MappingWebAPI;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CtripSubHotelInfoRS", propOrder = {"retCode", "errorMsg", "hotelInfos"})
public class CtripSubHotelInfoRS {
    protected int retCode;
    protected String errorMsg;
    @XmlElement(name = "HotelInfos")
    protected ArrayOfHotelInfo hotelInfos;

    public int getRetCode() {
        return retCode;
    }

    public void setRetCode(int value) {
        this.retCode = value;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String value) {
        this.errorMsg = value;
    }

    public ArrayOfHotelInfo getHotelInfos() {
        return hotelInfos;
    }

    public void setHotelInfos(ArrayOfHotelInfo value) {
        this.hotelInfos = value;
    }
}