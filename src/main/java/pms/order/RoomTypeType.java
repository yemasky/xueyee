package pms.order;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoomTypeType", propOrder = {"roomDescription", "additionalDetails", "amenities", "occupancy", "tpaExtensions"})
@XmlSeeAlso({HTNGBasicOrSuiteRoomType.class, pms.order.HTNGComponentRoomType.RoomType.class})
public class RoomTypeType {
    @XmlElement(name = "RoomDescription")
    protected ParagraphType roomDescription;
    @XmlElement(name = "AdditionalDetails")
    protected ArrayOfAdditionalDetailType additionalDetails;
    @XmlElement(name = "Amenities")
    protected ArrayOfRoomAmenityPrefType amenities;
    @XmlElement(name = "Occupancy")
    protected List<RoomTypeType.Occupancy> occupancy;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType tpaExtensions;
    @XmlAttribute(name = "NumberOfUnits")
    protected BigInteger numberOfUnits;
    @XmlAttribute(name = "IsRoom")
    protected Boolean isRoom;
    @XmlAttribute(name = "IsConverted")
    protected Boolean isConverted;
    @XmlAttribute(name = "IsAlternate")
    protected Boolean isAlternate;
    @XmlAttribute(name = "ReqdGuaranteeType")
    protected String reqdGuaranteeType;
    @XmlAttribute(name = "RoomType")
    protected String roomType;
    @XmlAttribute(name = "RoomTypeCode")
    protected String roomTypeCode;
    @XmlAttribute(name = "RoomCategory")
    protected String roomCategory;
    @XmlAttribute(name = "RoomID")
    protected String roomID;
    @XmlAttribute(name = "Floor")
    protected BigInteger floor;
    @XmlAttribute(name = "InvBlockCode")
    protected String invBlockCode;
    @XmlAttribute(name = "RoomLocationCode")
    protected String roomLocationCode;
    @XmlAttribute(name = "RoomViewCode")
    protected String roomViewCode;
    @XmlAttribute(name = "BedTypeCode")
    protected List<String> bedTypeCode;
    @XmlAttribute(name = "NonSmoking")
    protected Boolean nonSmoking;
    @XmlAttribute(name = "Configuration")
    protected String configuration;
    @XmlAttribute(name = "SizeMeasurement")
    protected String sizeMeasurement;
    @XmlAttribute(name = "Quantity")
    protected BigInteger quantity;
    @XmlAttribute(name = "Composite")
    protected Boolean composite;
    @XmlAttribute(name = "RoomClassificationCode")
    protected String roomClassificationCode;
    @XmlAttribute(name = "RoomArchitectureCode")
    protected String roomArchitectureCode;
    @XmlAttribute(name = "RoomGender")
    protected String roomGender;
    @XmlAttribute(name = "SharedRoomInd")
    protected Boolean sharedRoomInd;

    public ParagraphType getRoomDescription() {
        return roomDescription;
    }

    public void setRoomDescription(ParagraphType value) {
        this.roomDescription = value;
    }

    public ArrayOfAdditionalDetailType getAdditionalDetails() {
        return additionalDetails;
    }

    public void setAdditionalDetails(ArrayOfAdditionalDetailType value) {
        this.additionalDetails = value;
    }

    public ArrayOfRoomAmenityPrefType getAmenities() {
        return amenities;
    }

    public void setAmenities(ArrayOfRoomAmenityPrefType value) {
        this.amenities = value;
    }

    public List<RoomTypeType.Occupancy> getOccupancy() {
        if (occupancy == null) {
            occupancy = new ArrayList<RoomTypeType.Occupancy>();
        }
        return this.occupancy;
    }

    public TPAExtensionsType getTPAExtensions() {
        return tpaExtensions;
    }

    public void setTPAExtensions(TPAExtensionsType value) {
        this.tpaExtensions = value;
    }

    public BigInteger getNumberOfUnits() {
        return numberOfUnits;
    }

    public void setNumberOfUnits(BigInteger value) {
        this.numberOfUnits = value;
    }

    public Boolean isIsRoom() {
        return isRoom;
    }

    public void setIsRoom(Boolean value) {
        this.isRoom = value;
    }

    public Boolean isIsConverted() {
        return isConverted;
    }

    public void setIsConverted(Boolean value) {
        this.isConverted = value;
    }

    public Boolean isIsAlternate() {
        return isAlternate;
    }

    public void setIsAlternate(Boolean value) {
        this.isAlternate = value;
    }

    public String getReqdGuaranteeType() {
        return reqdGuaranteeType;
    }

    public void setReqdGuaranteeType(String value) {
        this.reqdGuaranteeType = value;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String value) {
        this.roomType = value;
    }

    public String getRoomTypeCode() {
        return roomTypeCode;
    }

    public void setRoomTypeCode(String value) {
        this.roomTypeCode = value;
    }

    public String getRoomCategory() {
        return roomCategory;
    }

    public void setRoomCategory(String value) {
        this.roomCategory = value;
    }

    public String getRoomID() {
        return roomID;
    }

    public void setRoomID(String value) {
        this.roomID = value;
    }

    public BigInteger getFloor() {
        return floor;
    }

    public void setFloor(BigInteger value) {
        this.floor = value;
    }

    public String getInvBlockCode() {
        return invBlockCode;
    }

    public void setInvBlockCode(String value) {
        this.invBlockCode = value;
    }

    public String getRoomLocationCode() {
        return roomLocationCode;
    }

    public void setRoomLocationCode(String value) {
        this.roomLocationCode = value;
    }

    public String getRoomViewCode() {
        return roomViewCode;
    }

    public void setRoomViewCode(String value) {
        this.roomViewCode = value;
    }

    public List<String> getBedTypeCode() {
        if (bedTypeCode == null) {
            bedTypeCode = new ArrayList<String>();
        }
        return this.bedTypeCode;
    }

    public Boolean isNonSmoking() {
        return nonSmoking;
    }

    public void setNonSmoking(Boolean value) {
        this.nonSmoking = value;
    }

    public String getConfiguration() {
        return configuration;
    }

    public void setConfiguration(String value) {
        this.configuration = value;
    }

    public String getSizeMeasurement() {
        return sizeMeasurement;
    }

    public void setSizeMeasurement(String value) {
        this.sizeMeasurement = value;
    }

    public BigInteger getQuantity() {
        return quantity;
    }

    public void setQuantity(BigInteger value) {
        this.quantity = value;
    }

    public Boolean isComposite() {
        return composite;
    }

    public void setComposite(Boolean value) {
        this.composite = value;
    }

    public String getRoomClassificationCode() {
        return roomClassificationCode;
    }

    public void setRoomClassificationCode(String value) {
        this.roomClassificationCode = value;
    }

    public String getRoomArchitectureCode() {
        return roomArchitectureCode;
    }

    public void setRoomArchitectureCode(String value) {
        this.roomArchitectureCode = value;
    }

    public String getRoomGender() {
        return roomGender;
    }

    public void setRoomGender(String value) {
        this.roomGender = value;
    }

    public Boolean isSharedRoomInd() {
        return sharedRoomInd;
    }

    public void setSharedRoomInd(Boolean value) {
        this.sharedRoomInd = value;
    }


    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Occupancy {
        @XmlAttribute(name = "MinOccupancy")
        protected BigInteger minOccupancy;
        @XmlAttribute(name = "MaxOccupancy")
        protected BigInteger maxOccupancy;
        @XmlAttribute(name = "AgeQualifyingCode")
        protected String ageQualifyingCode;
        @XmlAttribute(name = "MinAge")
        protected BigInteger minAge;
        @XmlAttribute(name = "MaxAge")
        protected BigInteger maxAge;
        @XmlAttribute(name = "AgeTimeUnit")
        protected TimeUnitType ageTimeUnit;
        @XmlAttribute(name = "AgeBucket")
        protected String ageBucket;

        public BigInteger getMinOccupancy() {
            return minOccupancy;
        }

        public void setMinOccupancy(BigInteger value) {
            this.minOccupancy = value;
        }

        public BigInteger getMaxOccupancy() {
            return maxOccupancy;
        }

        public void setMaxOccupancy(BigInteger value) {
            this.maxOccupancy = value;
        }

        public String getAgeQualifyingCode() {
            return ageQualifyingCode;
        }

        public void setAgeQualifyingCode(String value) {
            this.ageQualifyingCode = value;
        }

        public BigInteger getMinAge() {
            return minAge;
        }

        public void setMinAge(BigInteger value) {
            this.minAge = value;
        }

        public BigInteger getMaxAge() {
            return maxAge;
        }

        public void setMaxAge(BigInteger value) {
            this.maxAge = value;
        }

        public TimeUnitType getAgeTimeUnit() {
            return ageTimeUnit;
        }

        public void setAgeTimeUnit(TimeUnitType value) {
            this.ageTimeUnit = value;
        }

        public String getAgeBucket() {
            return ageBucket;
        }

        public void setAgeBucket(String value) {
            this.ageBucket = value;
        }
    }
}