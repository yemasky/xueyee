package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFeaturesTypeFeature", propOrder = {"feature"})
public class ArrayOfFeaturesTypeFeature {
    @XmlElement(name = "Feature")
    protected List<ArrayOfFeaturesTypeFeature.Feature> feature;

    public List<ArrayOfFeaturesTypeFeature.Feature> getFeature() {
        if (feature == null) {
            feature = new ArrayList<ArrayOfFeaturesTypeFeature.Feature>();
        }
        return this.feature;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {"charge", "multimediaDescriptions", "descriptiveText"})
    public static class Feature {
        @XmlElement(name = "Charge")
        protected ArrayOfFeaturesTypeFeature.Feature.Charge charge;
        @XmlElement(name = "MultimediaDescriptions")
        protected MultimediaDescriptionsType multimediaDescriptions;
        @XmlElement(name = "DescriptiveText")
        protected String descriptiveText;
        @XmlAttribute(name = "CodeDetail")
        protected String codeDetail;
        @XmlAttribute(name = "AccessibleCode")
        protected String accessibleCode;
        @XmlAttribute(name = "SecurityCode")
        protected String securityCode;
        @XmlAttribute(name = "ExistsCode")
        protected String existsCode;
        @XmlAttribute(name = "ProximityCode")
        protected String proximityCode;
        @XmlAttribute(name = "ID")
        protected String id;

        public ArrayOfFeaturesTypeFeature.Feature.Charge getCharge() {
            return charge;
        }

        public void setCharge(ArrayOfFeaturesTypeFeature.Feature.Charge value) {
            this.charge = value;
        }

        public MultimediaDescriptionsType getMultimediaDescriptions() {
            return multimediaDescriptions;
        }

        public void setMultimediaDescriptions(MultimediaDescriptionsType value) {
            this.multimediaDescriptions = value;
        }

        public String getDescriptiveText() {
            return descriptiveText;
        }

        public void setDescriptiveText(String value) {
            this.descriptiveText = value;
        }

        public String getCodeDetail() {
            return codeDetail;
        }

        public void setCodeDetail(String value) {
            this.codeDetail = value;
        }

        public String getAccessibleCode() {
            return accessibleCode;
        }

        public void setAccessibleCode(String value) {
            this.accessibleCode = value;
        }

        public String getSecurityCode() {
            return securityCode;
        }

        public void setSecurityCode(String value) {
            this.securityCode = value;
        }

        public String getExistsCode() {
            return existsCode;
        }

        public void setExistsCode(String value) {
            this.existsCode = value;
        }

        public String getProximityCode() {
            return proximityCode;
        }

        public void setProximityCode(String value) {
            this.proximityCode = value;
        }

        public String getID() {
            return id;
        }

        public void setID(String value) {
            this.id = value;
        }

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Charge {
            @XmlAttribute(name = "Amount")
            protected BigDecimal amount;

            public BigDecimal getAmount() {
                return amount;
            }

            public void setAmount(BigDecimal value) {
                this.amount = value;
            }
        }
    }
}