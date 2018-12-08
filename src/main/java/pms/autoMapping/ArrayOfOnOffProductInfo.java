package pms.autoMapping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOnOffProductInfo", propOrder = {"onOffProductInfo"})
public class ArrayOfOnOffProductInfo {
    @XmlElement(name = "OnOffProductInfo", nillable = true)
    protected List<OnOffProductInfo> onOffProductInfo;

    public List<OnOffProductInfo> getOnOffProductInfo() {
        if (onOffProductInfo == null) {
            onOffProductInfo = new ArrayList<OnOffProductInfo>();
        }
        return this.onOffProductInfo;
    }
}