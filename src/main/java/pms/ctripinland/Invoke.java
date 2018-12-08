package pms.ctripinland;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"requestXml", "invoketype"})
@XmlRootElement(name = "Invoke")
public class Invoke {
    protected String requestXml;
    @XmlElement(name = "Invoketype")
    protected String invoketype;

    public String getRequestXml() {
        return requestXml;
    }

    public void setRequestXml(String value) {
        this.requestXml = value;
    }

    public String getInvoketype() {
        return invoketype;
    }

    public void setInvoketype(String value) {
        this.invoketype = value;
    }
}