package pms.order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ErrorsType", propOrder = {"error"})
public class ErrorsType {
    @XmlElement(name = "Error")
    protected List<ErrorType> error;

    public List<ErrorType> getError() {
        if (error == null) {
            error = new ArrayList<ErrorType>();
        }
        return this.error;
    }

    public void  setError(List<ErrorType> errors) {
       this.error=errors;
    }
}