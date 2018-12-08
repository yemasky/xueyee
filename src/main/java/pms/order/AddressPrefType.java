package pms.order;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressPrefType", propOrder = {"address"})
public class AddressPrefType {
    @XmlElement(name = "Address")
    protected AddressInfoType address;
    @XmlAttribute(name = "ShareSynchInd")
    protected String shareSynchInd;
    @XmlAttribute(name = "ShareMarketInd")
    protected String shareMarketInd;

    public AddressInfoType getAddress() {
        return address;
    }

    public void setAddress(AddressInfoType value) {
        this.address = value;
    }

    public String getShareSynchInd() {
        return shareSynchInd;
    }

    public void setShareSynchInd(String value) {
        this.shareSynchInd = value;
    }

    public String getShareMarketInd() {
        return shareMarketInd;
    }

    public void setShareMarketInd(String value) {
        this.shareMarketInd = value;
    }
}