package pms.MappingWebAPI;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRoomProductInfo", propOrder = {"roomProductInfo"})
public class ArrayOfRoomProductInfo {
    @XmlElement(name = "RoomProductInfo", nillable = true)
    protected List<RoomProductInfo> roomProductInfo;

    public List<RoomProductInfo> getRoomProductInfo() {
        if (roomProductInfo == null) {
            roomProductInfo = new ArrayList<RoomProductInfo>();
        }
        return this.roomProductInfo;
    }
}