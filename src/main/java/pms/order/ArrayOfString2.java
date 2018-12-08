package pms.order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfString", namespace = "http://htng.org/2014B", propOrder = {"telephoneExtention"})
public class ArrayOfString2 {
    @XmlElement(name = "TelephoneExtention")
    protected List<String> telephoneExtention;

    public List<String> getTelephoneExtention() {
        if (telephoneExtention == null) {
            telephoneExtention = new ArrayList<String>();
        }
        return this.telephoneExtention;
    }
}