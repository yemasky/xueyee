package pms.MappingWebAPI;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductMappingInfoRS", propOrder = {"retCode", "errorMsg", "roomProductInfos"})
public class ProductMappingInfoRS {
    protected int retCode;
    protected String errorMsg;
    @XmlElement(name = "RoomProductInfos")
    protected ArrayOfRoomProductInfo roomProductInfos;

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

    public ArrayOfRoomProductInfo getRoomProductInfos() {
        return roomProductInfos;
    }

    public void setRoomProductInfos(ArrayOfRoomProductInfo value) {
        this.roomProductInfos = value;
    }
}