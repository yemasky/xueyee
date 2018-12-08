package pms.autoMapping;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotifyOnOffInfoRS", propOrder = {"notifyOnOffInfo"})
@XmlRootElement(name = "NotifyOnOffInfoRS")
public class NotifyOnOffInfoRS {
    @XmlElement(name = "NotifyOnOffInfo")
    protected NotifyOnOffInfo notifyOnOffInfo;

    public NotifyOnOffInfo getNotifyOnOffInfo() {
        return notifyOnOffInfo;
    }

    public void setNotifyOnOffInfo(NotifyOnOffInfo value) {
        this.notifyOnOffInfo = value;
    }
}