package pms.MappingWebAPI;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfProductSearchResult", propOrder = {"productSearchResult"})
public class ArrayOfProductSearchResult {
    @XmlElement(nillable = true)
    protected List<ProductSearchResult> productSearchResult;

    public List<ProductSearchResult> getProductSearchResult() {
        if (productSearchResult == null) {
            productSearchResult = new ArrayList<ProductSearchResult>();
        }
        return this.productSearchResult;
    }
}