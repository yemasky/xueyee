package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDestinationSystemCodesTypeDestinationSystemCode", propOrder = {"destinationSystemCode"})
public class ArrayOfDestinationSystemCodesTypeDestinationSystemCode {
    @XmlElement(name = "DestinationSystemCode")
    protected List<ArrayOfDestinationSystemCodesTypeDestinationSystemCode.DestinationSystemCode> destinationSystemCode;

    public List<ArrayOfDestinationSystemCodesTypeDestinationSystemCode.DestinationSystemCode> getDestinationSystemCode() {
        if (destinationSystemCode == null) {
            destinationSystemCode = new ArrayList<ArrayOfDestinationSystemCodesTypeDestinationSystemCode.DestinationSystemCode>();
        }
        return this.destinationSystemCode;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {"value"})
    public static class DestinationSystemCode {
        @XmlValue
        protected String value;

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }
}