package pms.MappingWebAPI;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MappingStatusSearchRS", propOrder = {"retCode", "msg", "list"})
public class MappingStatusSearchRS {
    protected int retCode;
    protected String msg;
    protected ArrayOfData list;

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

    public ArrayOfData getList() {
        return list;
    }

    public void setList(ArrayOfData value) {
        this.list = value;
    }
}