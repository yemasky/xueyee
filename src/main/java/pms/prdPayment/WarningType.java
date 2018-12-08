package pms.prdPayment;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WarningType")
public class WarningType extends FreeTextType {
    @XmlAttribute(name = "Type")
    protected String type;
    @XmlAttribute(name = "ShortText")
    protected String shortText;
    @XmlAttribute(name = "Code")
    protected String code;
    @XmlAttribute(name = "DocURL")
    @XmlSchemaType(name = "anyURI")
    protected String docURL;
    @XmlAttribute(name = "Status")
    protected String status;
    @XmlAttribute(name = "Tag")
    protected String tag;
    @XmlAttribute(name = "RecordID")
    protected String recordID;
    @XmlAttribute(name = "RPH")
    protected String rph;

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

    public String getCode() {
        return code;
    }

    public void setCode(String value) {
        this.code = value;
    }

    public String getDocURL() {
        return docURL;
    }

    public void setDocURL(String value) {
        this.docURL = value;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String value) {
        this.status = value;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String value) {
        this.tag = value;
    }

    public String getRecordID() {
        return recordID;
    }

    public void setRecordID(String value) {
        this.recordID = value;
    }

    public String getRPH() {
        return rph;
    }

    public void setRPH(String value) {
        this.rph = value;
    }
}