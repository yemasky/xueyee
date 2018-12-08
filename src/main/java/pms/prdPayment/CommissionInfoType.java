package pms.prdPayment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommissionInfoType")
public class CommissionInfoType extends FreeTextType {
    @XmlAttribute(name = "CommissionPlanCode")
    protected String commissionPlanCode;
    @XmlAttribute(name = "Amount")
    protected BigDecimal amount;

    public String getCommissionPlanCode() {
        return commissionPlanCode;
    }

    public void setCommissionPlanCode(String value) {
        this.commissionPlanCode = value;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal value) {
        this.amount = value;
    }
}