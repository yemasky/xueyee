package pms.autoMapping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPMSHotelMappingResult", propOrder = {"pmsHotelMappingResult"})
public class ArrayOfPMSHotelMappingResult {
    @XmlElement(name = "PMSHotelMappingResult", nillable = true)
    protected List<PMSHotelMappingResult> pmsHotelMappingResult;

    public List<PMSHotelMappingResult> getPMSHotelMappingResult() {
        if (pmsHotelMappingResult == null) {
            pmsHotelMappingResult = new ArrayList<PMSHotelMappingResult>();
        }
        return this.pmsHotelMappingResult;
    }
}