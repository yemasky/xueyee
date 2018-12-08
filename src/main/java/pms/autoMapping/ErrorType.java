package pms.autoMapping;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ErrorType", propOrder = {"value"})
public class ErrorType {
    @XmlValue
    protected String value;
    @XmlAttribute(name = "Type")
    protected String type;
    @XmlAttribute(name = "ShortText")
    protected String shortText;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String value) {
        this.type = value;
    }

    public String getShortText() {
        return shortText;
    }

    public void setShortText(String value) {
        this.shortText = value;
    }
}