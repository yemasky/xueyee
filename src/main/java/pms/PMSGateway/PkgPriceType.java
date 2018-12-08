package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;
import java.math.BigInteger;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PkgPriceType")
public class PkgPriceType {
    @XmlAttribute(name = "Age")
    protected BigInteger age;
    @XmlAttribute(name = "Code")
    protected String code;
    @XmlAttribute(name = "CodeContext")
    protected String codeContext;
    @XmlAttribute(name = "URI")
    @XmlSchemaType(name = "anyURI")
    protected String uri;
    @XmlAttribute(name = "Amount")
    protected BigDecimal amount;
    @XmlAttribute(name = "PriceBasis")
    protected PricingType priceBasis;

    public BigInteger getAge() {
        return age;
    }

    public void setAge(BigInteger value) {
        this.age = value;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String value) {
        this.code = value;
    }

    public String getCodeContext() {
        return codeContext;
    }

    public void setCodeContext(String value) {
        this.codeContext = value;
    }

    public String getURI() {
        return uri;
    }

    public void setURI(String value) {
        this.uri = value;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    public PricingType getPriceBasis() {
        return priceBasis;
    }

    public void setPriceBasis(PricingType value) {
        this.priceBasis = value;
    }
}