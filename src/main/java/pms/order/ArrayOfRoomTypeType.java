package pms.order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRoomTypeType", propOrder = {"roomType"})
public class ArrayOfRoomTypeType {
    @XmlElement(name = "RoomType")
    protected List<RoomTypeType> roomType;

    public List<RoomTypeType> getRoomType() {
        if (roomType == null) {
            roomType = new ArrayList<RoomTypeType>();
        }
        return this.roomType;
    }

}
