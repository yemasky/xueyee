package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFacilityInfoTypeGuestRoomsGuestRoomAmenity", propOrder = {"amenity"})
public class ArrayOfFacilityInfoTypeGuestRoomsGuestRoomAmenity {
    @XmlElement(name = "Amenity")
    protected List<ArrayOfFacilityInfoTypeGuestRoomsGuestRoomAmenity.Amenity> amenity;

    public List<ArrayOfFacilityInfoTypeGuestRoomsGuestRoomAmenity.Amenity> getAmenity() {
        if (amenity == null) {
            amenity = new ArrayList<ArrayOfFacilityInfoTypeGuestRoomsGuestRoomAmenity.Amenity>();
        }
        return this.amenity;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {"operationSchedules", "contactInfo", "multimediaDescriptions", "descriptiveText"})
    public static class Amenity {
        @XmlElement(name = "OperationSchedules")
        protected ArrayOfOperationSchedulesPlusChargeTypeOperationSchedule operationSchedules;
        @XmlElement(name = "ContactInfo")
        protected List<ContactInfoRootType> contactInfo;
        @XmlElement(name = "MultimediaDescriptions")
        protected MultimediaDescriptionsType multimediaDescriptions;
        @XmlElement(name = "DescriptiveText")
        protected String descriptiveText;
        @XmlAttribute(name = "RoomAmenityCode")
        protected String roomAmenityCode;
        @XmlAttribute(name = "IncludedInRateIndicator")
        protected Boolean includedInRateIndicator;
        @XmlAttribute(name = "ExistsCode")
        protected String existsCode;
        @XmlAttribute(name = "CodeDetail")
        protected String codeDetail;
        @XmlAttribute(name = "Quantity")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger quantity;
        @XmlAttribute(name = "ID")
        protected String id;

        public ArrayOfOperationSchedulesPlusChargeTypeOperationSchedule getOperationSchedules() {
            return operationSchedules;
        }

        public void setOperationSchedules(ArrayOfOperationSchedulesPlusChargeTypeOperationSchedule value) {
            this.operationSchedules = value;
        }

        public List<ContactInfoRootType> getContactInfo() {
            if (contactInfo == null) {
                contactInfo = new ArrayList<ContactInfoRootType>();
            }
            return this.contactInfo;
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

        public String getRoomAmenityCode() {
            return roomAmenityCode;
        }

        public void setRoomAmenityCode(String value) {
            this.roomAmenityCode = value;
        }

        public Boolean isIncludedInRateIndicator() {
            return includedInRateIndicator;
        }

        public void setIncludedInRateIndicator(Boolean value) {
            this.includedInRateIndicator = value;
        }

        public String getExistsCode() {
            return existsCode;
        }

        public void setExistsCode(String value) {
            this.existsCode = value;
        }

        public String getCodeDetail() {
            return codeDetail;
        }

        public void setCodeDetail(String value) {
            this.codeDetail = value;
        }

        public BigInteger getQuantity() {
            return quantity;
        }

        public void setQuantity(BigInteger value) {
            this.quantity = value;
        }

        public String getID() {
            return id;
        }

        public void setID(String value) {
            this.id = value;
        }
    }
}