package pms.order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfUniqueID_Type", propOrder = {"profileRef"})
public class ArrayOfUniqueIDType {
    @XmlElement(name = "ProfileRef")
    protected List<UniqueIDType> profileRef;

    public List<UniqueIDType> getProfileRef() {
        if (profileRef == null) {
            profileRef = new ArrayList<UniqueIDType>();
        }
        return this.profileRef;
    }
}