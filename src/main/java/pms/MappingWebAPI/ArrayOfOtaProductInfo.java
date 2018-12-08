package pms.MappingWebAPI;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOtaProductInfo", propOrder = {"otaProductInfo"})
public class ArrayOfOtaProductInfo {
    @XmlElement(nillable = true)
    protected List<OtaProductInfo> otaProductInfo;

    public List<OtaProductInfo> getOtaProductInfo() {
        if (otaProductInfo == null) {
            otaProductInfo = new ArrayList<OtaProductInfo>();
        }
        return this.otaProductInfo;
    }
}