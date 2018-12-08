package pms.autoMapping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PMSHotelMapingRS", propOrder = {"pmsHotelMappingResults"})
public class PMSHotelMapingRS {
    @XmlElement(name = "PMSHotelMappingResults")
    protected ArrayOfPMSHotelMappingResult pmsHotelMappingResults;

    public ArrayOfPMSHotelMappingResult getPMSHotelMappingResults() {
        return pmsHotelMappingResults;
    }

    public void setPMSHotelMappingResults(ArrayOfPMSHotelMappingResult value) {
        this.pmsHotelMappingResults = value;
    }
}