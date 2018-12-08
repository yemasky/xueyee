package pms.order;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccessesType", propOrder = {"access"})
public class AccessesType {
    @XmlElement(name = "Access")
    protected List<AccessesType.Access> access;
    @XmlAttribute(name = "ShareSynchInd")
    protected String shareSynchInd;
    @XmlAttribute(name = "ShareMarketInd")
    protected String shareMarketInd;
    @XmlAttribute(name = "CreateDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDateTime;

    public List<AccessesType.Access> getAccess() {
        if (access == null) {
            access = new ArrayList<AccessesType.Access>();
        }
        return this.access;
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

    public XMLGregorianCalendar getCreateDateTime() {
        return createDateTime;
    }

    public void setCreateDateTime(XMLGregorianCalendar value) {
        this.createDateTime = value;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {"accessPerson", "accessComment"})
    public static class Access {
        @XmlElement(name = "AccessPerson")
        protected PersonNameType accessPerson;
        @XmlElement(name = "AccessComment")
        protected FreeTextType accessComment;
        @XmlAttribute(name = "ActionType")
        protected String actionType;
        @XmlAttribute(name = "ActionDateTime")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar actionDateTime;
        @XmlAttribute(name = "ID")
        protected String id;

        public PersonNameType getAccessPerson() {
            return accessPerson;
        }

        public void setAccessPerson(PersonNameType value) {
            this.accessPerson = value;
        }

        public FreeTextType getAccessComment() {
            return accessComment;
        }

        public void setAccessComment(FreeTextType value) {
            this.accessComment = value;
        }

        public String getActionType() {
            return actionType;
        }

        public void setActionType(String value) {
            this.actionType = value;
        }

        public XMLGregorianCalendar getActionDateTime() {
            return actionDateTime;
        }

        public void setActionDateTime(XMLGregorianCalendar value) {
            this.actionDateTime = value;
        }

        public String getID() {
            return id;
        }

        public void setID(String value) {
            this.id = value;
        }
    }
}