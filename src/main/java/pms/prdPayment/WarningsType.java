package pms.prdPayment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WarningsType", propOrder = {"warning"})
public class WarningsType {
    @XmlElement(name = "Warning")
    protected List<WarningType> warning;

    public List<WarningType> getWarning() {
        if (warning == null) {
            warning = new ArrayList<WarningType>();
        }
        return this.warning;
    }
}