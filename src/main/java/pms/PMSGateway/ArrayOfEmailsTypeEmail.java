package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfEmailsTypeEmail", propOrder = {"email"})
public class ArrayOfEmailsTypeEmail {
    @XmlElement(name = "Email")
    protected List<ArrayOfEmailsTypeEmail.Email> email;

    public List<ArrayOfEmailsTypeEmail.Email> getEmail() {
        if (email == null) {
            email = new ArrayList<ArrayOfEmailsTypeEmail.Email>();
        }
        return this.email;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Email extends EmailType {
        @XmlAttribute(name = "Removal")
        protected Boolean removal;
        @XmlAttribute(name = "ID")
        protected String id;

        public Boolean isRemoval() {
            return removal;
        }

        public void setRemoval(Boolean value) {
            this.removal = value;
        }

        public String getID() {
            return id;
        }

        public void setID(String value) {
            this.id = value;
        }
    }
}