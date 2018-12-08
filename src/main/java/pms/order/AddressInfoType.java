package pms.order;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressInfoType")
@XmlSeeAlso({pms.order.CompanyInfoType.AddressInfo.class, pms.order.CustomerType.Address.class, pms.order.ArrayOfRequiredPaymentsTypeGuaranteePayment.GuaranteePayment.Address.class})
public class AddressInfoType extends AddressType {
    @XmlAttribute(name = "DefaultInd")
    protected Boolean defaultInd;
    @XmlAttribute(name = "UseType")
    protected String useType;
    @XmlAttribute(name = "RPH")
    protected String rph;

    public Boolean isDefaultInd() {
        return defaultInd;
    }

    public void setDefaultInd(Boolean value) {
        this.defaultInd = value;
    }

    public String getUseType() {
        return useType;
    }

    public void setUseType(String value) {
        this.useType = value;
    }

    public String getRPH() {
        return rph;
    }

    public void setRPH(String value) {
        this.rph = value;
    }
}