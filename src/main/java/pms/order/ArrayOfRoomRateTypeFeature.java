package pms.order;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRoomRateTypeFeature", propOrder = {"feature"})
public class ArrayOfRoomRateTypeFeature {
    @XmlElement(name = "Feature")
    protected List<ArrayOfRoomRateTypeFeature.Feature> feature;

    public List<ArrayOfRoomRateTypeFeature.Feature> getFeature() {
        if (feature == null) {
            feature = new ArrayList<ArrayOfRoomRateTypeFeature.Feature>();
        }
        return this.feature;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {"description"})
    public static class Feature {
        @XmlElement(name = "Description")
        protected List<ParagraphType> description;
        @XmlAttribute(name = "RoomAmenity")
        protected String roomAmenity;
        @XmlAttribute(name = "Quantity")
        protected BigInteger quantity;
        @XmlAttribute(name = "RoomViewCode")
        protected String roomViewCode;

        public List<ParagraphType> getDescription() {
            if (description == null) {
                description = new ArrayList<ParagraphType>();
            }
            return this.description;
        }

        public String getRoomAmenity() {
            return roomAmenity;
        }

        public void setRoomAmenity(String value) {
            this.roomAmenity = value;
        }

        /**
         * ��ȡquantity���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getQuantity() {
            return quantity;
        }

        /**
         * ����quantity���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setQuantity(BigInteger value) {
            this.quantity = value;
        }

        /**
         * ��ȡroomViewCode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getRoomViewCode() {
            return roomViewCode;
        }

        public void setRoomViewCode(String value) {
            this.roomViewCode = value;
        }
    }
}
