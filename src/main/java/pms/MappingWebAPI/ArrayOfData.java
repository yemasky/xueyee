package pms.MappingWebAPI;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfData", propOrder = {"data"})
public class ArrayOfData {
    @XmlElement(nillable = true)
    protected List<Data> data;

    public List<Data> getData() {
        if (data == null) {
            data = new ArrayList<Data>();
        }
        return this.data;
    }
}