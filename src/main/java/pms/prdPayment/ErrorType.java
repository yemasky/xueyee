package pms.prdPayment;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ErrorType")
public class ErrorType extends FreeTextType {
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
    @XmlAttribute(name = "NodeList")
    protected String nodeList;

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

    public String getNodeList() {
        return nodeList;
    }

    public void setNodeList(String value) {
        this.nodeList = value;
    }
}
