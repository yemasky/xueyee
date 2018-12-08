package pms.MappingWebAPI;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "productSearchResult", propOrder = {"subRoomId", "resultCode", "resultMsg"})
public class ProductSearchResult extends SearchProductInfo {
    protected String subRoomId;
    protected int resultCode;
    protected String resultMsg;

    public String getSubRoomId() {
        return subRoomId;
    }

    public void setSubRoomId(String value) {
        this.subRoomId = value;
    }

    public int getResultCode() {
        return resultCode;
    }

    public void setResultCode(int value) {
        this.resultCode = value;
    }

    public String getResultMsg() {
        return resultMsg;
    }

    public void setResultMsg(String value) {
        this.resultMsg = value;
    }
}