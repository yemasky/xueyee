package pms.autoMapping;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotifyOnOffInfo", propOrder = {"errorOrSuccess"})
public class NotifyOnOffInfo {
    @XmlElements({@XmlElement(name = "Error", type = ErrorType.class), @XmlElement(name = "Success", type = SuccessType.class)})
    protected List<Object> errorOrSuccess;

    public List<Object> getErrorOrSuccess() {
        if (errorOrSuccess == null) {
            errorOrSuccess = new ArrayList<Object>();
        }
        return this.errorOrSuccess;
    }

    public void setErrorOrSuccess(List<Object> errorOrSuccess) {
        this.errorOrSuccess = errorOrSuccess;
    }
}