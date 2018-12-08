package pms.MappingWebAPI;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSearchProductInfo", propOrder = {"searchProductInfo"})
public class ArrayOfSearchProductInfo {
    @XmlElement(name = "SearchProductInfo", nillable = true)
    protected List<SearchProductInfo> searchProductInfo;

    public List<SearchProductInfo> getSearchProductInfo() {
        if (searchProductInfo == null) {
            searchProductInfo = new ArrayList<SearchProductInfo>();
        }
        return this.searchProductInfo;
    }
}