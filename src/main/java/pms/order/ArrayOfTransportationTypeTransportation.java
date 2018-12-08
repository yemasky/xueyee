package pms.order;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTransportationTypeTransportation", propOrder = {"transportation"})
public class ArrayOfTransportationTypeTransportation {
    @XmlElement(name = "Transportation")
    protected List<ArrayOfTransportationTypeTransportation.Transportation> transportation;

    public List<ArrayOfTransportationTypeTransportation.Transportation> getTransportation() {
        if (transportation == null) {
            transportation = new ArrayList<ArrayOfTransportationTypeTransportation.Transportation>();
        }
        return this.transportation;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {"multimediaDescriptions", "operationSchedules", "descriptiveText"})
    public static class Transportation {
        @XmlElement(name = "MultimediaDescriptions")
        protected MultimediaDescriptionsType multimediaDescriptions;
        @XmlElement(name = "OperationSchedules")
        protected OperationSchedulesType operationSchedules;
        @XmlElement(name = "DescriptiveText")
        protected String descriptiveText;
        @XmlAttribute(name = "NotificationRequired")
        protected String notificationRequired;
        @XmlAttribute(name = "TransportationCode")
        protected String transportationCode;
        @XmlAttribute(name = "ChargeUnit")
        protected String chargeUnit;
        @XmlAttribute(name = "Included")
        protected Boolean included;
        @XmlAttribute(name = "CodeDetail")
        protected String codeDetail;
        @XmlAttribute(name = "Description")
        protected String description;
        @XmlAttribute(name = "TypicalTravelTime")
        protected String typicalTravelTime;
        @XmlAttribute(name = "Amount")
        protected BigDecimal amount;
        @XmlAttribute(name = "ExistsCode")
        protected String existsCode;
        @XmlAttribute(name = "ID")
        protected String id;

        public MultimediaDescriptionsType getMultimediaDescriptions() {
            return multimediaDescriptions;
        }

        public void setMultimediaDescriptions(MultimediaDescriptionsType value) {
            this.multimediaDescriptions = value;
        }

        public OperationSchedulesType getOperationSchedules() {
            return operationSchedules;
        }

        public void setOperationSchedules(OperationSchedulesType value) {
            this.operationSchedules = value;
        }

        public String getDescriptiveText() {
            return descriptiveText;
        }

        public void setDescriptiveText(String value) {
            this.descriptiveText = value;
        }

        public String getNotificationRequired() {
            return notificationRequired;
        }

        public void setNotificationRequired(String value) {
            this.notificationRequired = value;
        }

        public String getTransportationCode() {
            return transportationCode;
        }

        public void setTransportationCode(String value) {
            this.transportationCode = value;
        }

        public String getChargeUnit() {
            return chargeUnit;
        }

        public void setChargeUnit(String value) {
            this.chargeUnit = value;
        }

        public Boolean isIncluded() {
            return included;
        }

        public void setIncluded(Boolean value) {
            this.included = value;
        }

        public String getCodeDetail() {
            return codeDetail;
        }

        public void setCodeDetail(String value) {
            this.codeDetail = value;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String value) {
            this.description = value;
        }

        public String getTypicalTravelTime() {
            return typicalTravelTime;
        }

        public void setTypicalTravelTime(String value) {
            this.typicalTravelTime = value;
        }

        public BigDecimal getAmount() {
            return amount;
        }

        public void setAmount(BigDecimal value) {
            this.amount = value;
        }

        public String getExistsCode() {
            return existsCode;
        }

        public void setExistsCode(String value) {
            this.existsCode = value;
        }

        public String getID() {
            return id;
        }

        public void setID(String value) {
            this.id = value;
        }
    }
}