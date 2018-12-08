package pms.MappingWebAPI;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"roomProductInfoRS"})
@XmlRootElement(name = "GetRoomProductInfoResponse")
public class GetRoomProductInfoResponse {
    @XmlElement(name = "RoomProductInfoRS")
    protected ProductMappingInfoRS roomProductInfoRS;

    public ProductMappingInfoRS getRoomProductInfoRS() {
        return roomProductInfoRS;
    }

    public void setRoomProductInfoRS(ProductMappingInfoRS value) {
        this.roomProductInfoRS = value;
    }
}