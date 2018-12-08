package pms.order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRatePlanType", propOrder = {"ratePlan"})
public class ArrayOfRatePlanType {
    @XmlElement(name = "RatePlan")
    protected List<RatePlanType> ratePlan;

    public List<RatePlanType> getRatePlan() {
        if (ratePlan == null) {
            ratePlan = new ArrayList<RatePlanType>();
        }
        return this.ratePlan;
    }

}
