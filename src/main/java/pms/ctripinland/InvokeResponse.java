package pms.ctripinland;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"invokeResult"})
@XmlRootElement(name = "InvokeResponse")
public class InvokeResponse {
    @XmlElement(name = "InvokeResult")
    protected String invokeResult;

    public String getInvokeResult() {
        return invokeResult;
    }

    public void setInvokeResult(String value) {
        this.invokeResult = value;
    }
}