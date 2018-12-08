package pms.MappingWebAPI;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetMappingRS", propOrder = {"retCode", "msg"})
public class SetMappingRS {
    protected int retCode;
    protected String msg;

    public int getRetCode() {
        return retCode;
    }

    public void setRetCode(int value) {
        this.retCode = value;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String value) {
        this.msg = value;
    }
}