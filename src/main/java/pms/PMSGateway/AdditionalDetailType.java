package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalDetailType", propOrder = {"detailDescription"})
public class AdditionalDetailType {
    @XmlElement(name = "DetailDescription")
    protected ParagraphType detailDescription;
    @XmlAttribute(name = "Type")
    protected String type;
    @XmlAttribute(name = "Code")
    protected String code;
    @XmlAttribute(name = "Amount")
    protected BigDecimal amount;

    public ParagraphType getDetailDescription() {
        return detailDescription;
    }

    public void setDetailDescription(ParagraphType value) {
        this.detailDescription = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String value) {
        this.type = value;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String value) {
        this.code = value;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal value) {
        this.amount = value;
    }
}