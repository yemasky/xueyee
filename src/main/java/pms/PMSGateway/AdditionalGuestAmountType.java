package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalGuestAmountType", propOrder = {"amount", "addlGuestAmtDescription"})
public class AdditionalGuestAmountType {
    @XmlElement(name = "Amount")
    protected TotalType amount;
    @XmlElement(name = "AddlGuestAmtDescription")
    protected List<ParagraphType> addlGuestAmtDescription;
    @XmlAttribute(name = "MaxAdditionalGuests")
    protected BigInteger maxAdditionalGuests;
    @XmlAttribute(name = "AgeQualifyingCode")
    protected String ageQualifyingCode;
    @XmlAttribute(name = "MinAge")
    protected BigInteger minAge;
    @XmlAttribute(name = "MaxAge")
    protected BigInteger maxAge;
    @XmlAttribute(name = "AgeTimeUnit")
    protected TimeUnitType ageTimeUnit;
    @XmlAttribute(name = "AgeBucket")
    protected String ageBucket;
    @XmlAttribute(name = "Type")
    protected String type;
    @XmlAttribute(name = "Percent")
    protected BigDecimal percent;
    @XmlAttribute(name = "RPH")
    protected String rph;

    public TotalType getAmount() {
        return amount;
    }

    public void setAmount(TotalType value) {
        this.amount = value;
    }

    public List<ParagraphType> getAddlGuestAmtDescription() {
        if (addlGuestAmtDescription == null) {
            addlGuestAmtDescription = new ArrayList<ParagraphType>();
        }
        return this.addlGuestAmtDescription;
    }

    public BigInteger getMaxAdditionalGuests() {
        return maxAdditionalGuests;
    }

    public void setMaxAdditionalGuests(BigInteger value) {
        this.maxAdditionalGuests = value;
    }

    public String getAgeQualifyingCode() {
        return ageQualifyingCode;
    }

    public void setAgeQualifyingCode(String value) {
        this.ageQualifyingCode = value;
    }

    public BigInteger getMinAge() {
        return minAge;
    }

    public void setMinAge(BigInteger value) {
        this.minAge = value;
    }

    public BigInteger getMaxAge() {
        return maxAge;
    }

    public void setMaxAge(BigInteger value) {
        this.maxAge = value;
    }

    public TimeUnitType getAgeTimeUnit() {
        return ageTimeUnit;
    }

    public void setAgeTimeUnit(TimeUnitType value) {
        this.ageTimeUnit = value;
    }

    public String getAgeBucket() {
        return ageBucket;
    }

    public void setAgeBucket(String value) {
        this.ageBucket = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String value) {
        this.type = value;
    }

    public BigDecimal getPercent() {
        return percent;
    }

    public void setPercent(BigDecimal value) {
        this.percent = value;
    }

    public String getRPH() {
        return rph;
    }

    public void setRPH(String value) {
        this.rph = value;
    }
}