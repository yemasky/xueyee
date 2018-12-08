package pms.order;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSpecialRequestTypeSpecialRequest", propOrder = {"specialRequest"})
public class ArrayOfSpecialRequestTypeSpecialRequest {
    @XmlElement(name = "SpecialRequest")
    protected List<ArrayOfSpecialRequestTypeSpecialRequest.SpecialRequest> specialRequest;

    public List<ArrayOfSpecialRequestTypeSpecialRequest.SpecialRequest> getSpecialRequest() {
        if (specialRequest == null) {
            specialRequest = new ArrayList<ArrayOfSpecialRequestTypeSpecialRequest.SpecialRequest>();
        }
        return this.specialRequest;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SpecialRequest extends ParagraphType {
        @XmlAttribute(name = "RequestCode")
        protected String requestCode;
        @XmlAttribute(name = "CodeContext")
        protected String codeContext;
        @XmlAttribute(name = "NumberOfUnits")
        protected BigInteger numberOfUnits;

        public String getRequestCode() {
            return requestCode;
        }

        public void setRequestCode(String value) {
            this.requestCode = value;
        }

        public String getCodeContext() {
            return codeContext;
        }

        public void setCodeContext(String value) {
            this.codeContext = value;
        }

        public BigInteger getNumberOfUnits() {
            return numberOfUnits;
        }

        public void setNumberOfUnits(BigInteger value) {
            this.numberOfUnits = value;
        }
    }
}