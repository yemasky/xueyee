package pms.order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfString", propOrder = {"additionalPersonName"})
public class ArrayOfString {
    @XmlElement(name = "AdditionalPersonName")
    protected List<String> additionalPersonName;

    public List<String> getAdditionalPersonName() {
        if (additionalPersonName == null) {
            additionalPersonName = new ArrayList<String>();
        }
        return this.additionalPersonName;
    }
}