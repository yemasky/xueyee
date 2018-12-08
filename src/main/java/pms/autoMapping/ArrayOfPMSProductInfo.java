package pms.autoMapping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPMS_Product_Info", propOrder = {"pmsProductInfo"})
public class ArrayOfPMSProductInfo {
    @XmlElement(name = "PMS_Product_Info", nillable = true)
    protected List<PMSProductInfo> pmsProductInfo;

    public List<PMSProductInfo> getPMSProductInfo() {
        if (pmsProductInfo == null) {
            pmsProductInfo = new ArrayList<PMSProductInfo>();
        }
        return this.pmsProductInfo;
    }
}