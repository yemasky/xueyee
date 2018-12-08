package pms.prdPayment;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OTA_HotelResPrdPaymentNotifRS", propOrder = {"warningsOrSuccessOrErrors"})
@XmlRootElement(name = "OTA_HotelResPrdPaymentNotifRQ")
public class OTAHotelResPrdPaymentNotifRS {
    @XmlElements({@XmlElement(name = "Warnings", type = WarningsType.class), @XmlElement(name = "Success", type = SuccessType.class), @XmlElement(name = "Errors", type = ErrorsType.class)})
    protected Object warningsOrSuccessOrErrors;

    public Object getWarningsOrSuccessOrErrors() {
        return this.warningsOrSuccessOrErrors;
    }

    public void setWarningsOrSuccessOrErrors(Object warningsOrSuccessOrErrors) {
        this.warningsOrSuccessOrErrors = warningsOrSuccessOrErrors;
    }
}