package pms.order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRoomAmenityPrefType", propOrder = {"amenity"})
public class ArrayOfRoomAmenityPrefType {
    @XmlElement(name = "Amenity")
    protected List<RoomAmenityPrefType> amenity;

    public List<RoomAmenityPrefType> getAmenity() {
        if (amenity == null) {
            amenity = new ArrayList<RoomAmenityPrefType>();
        }
        return this.amenity;
    }
}