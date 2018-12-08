package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>ArrayOfAffiliationInfoTypeLoyalProgram complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="ArrayOfAffiliationInfoTypeLoyalProgram">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LoyalProgram" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ProgramDescription" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ParagraphType">
 *                           &lt;attribute name="Removal" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ProgramRestriction" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ParagraphType">
 *                           &lt;attribute name="Removal" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="BlackoutDates" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfDateTimeSpanType1" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Removal" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="ProgramName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="SecondaryProgramName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="AffiliateProgramName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="HotelLevel" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="ProgramCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="TravelSector" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="PrimaryProgramInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAffiliationInfoTypeLoyalProgram", propOrder = {
        "loyalProgram"
})
public class ArrayOfAffiliationInfoTypeLoyalProgram {

    @XmlElement(name = "LoyalProgram")
    protected List<ArrayOfAffiliationInfoTypeLoyalProgram.LoyalProgram> loyalProgram;

    /**
     * Gets the value of the loyalProgram property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loyalProgram property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoyalProgram().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfAffiliationInfoTypeLoyalProgram.LoyalProgram }
     */
    public List<ArrayOfAffiliationInfoTypeLoyalProgram.LoyalProgram> getLoyalProgram() {
        if (loyalProgram == null) {
            loyalProgram = new ArrayList<ArrayOfAffiliationInfoTypeLoyalProgram.LoyalProgram>();
        }
        return this.loyalProgram;
    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * <p/>
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * <p/>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ProgramDescription" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ParagraphType">
     *                 &lt;attribute name="Removal" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ProgramRestriction" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ParagraphType">
     *                 &lt;attribute name="Removal" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="BlackoutDates" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfDateTimeSpanType1" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="Removal" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="ProgramName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="SecondaryProgramName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="AffiliateProgramName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="HotelLevel" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ProgramCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="TravelSector" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="PrimaryProgramInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "programDescription",
            "programRestriction",
            "blackoutDates"
    })
    public static class LoyalProgram {

        @XmlElement(name = "ProgramDescription")
        protected List<ArrayOfAffiliationInfoTypeLoyalProgram.LoyalProgram.ProgramDescription> programDescription;
        @XmlElement(name = "ProgramRestriction")
        protected ArrayOfAffiliationInfoTypeLoyalProgram.LoyalProgram.ProgramRestriction programRestriction;
        @XmlElement(name = "BlackoutDates")
        protected ArrayOfDateTimeSpanType1 blackoutDates;
        @XmlAttribute(name = "Removal")
        protected Boolean removal;
        @XmlAttribute(name = "ProgramName")
        protected String programName;
        @XmlAttribute(name = "SecondaryProgramName")
        protected String secondaryProgramName;
        @XmlAttribute(name = "AffiliateProgramName")
        protected String affiliateProgramName;
        @XmlAttribute(name = "HotelLevel")
        protected String hotelLevel;
        @XmlAttribute(name = "ProgramCode")
        protected String programCode;
        @XmlAttribute(name = "TravelSector")
        protected String travelSector;
        @XmlAttribute(name = "PrimaryProgramInd")
        protected Boolean primaryProgramInd;

        /**
         * Gets the value of the programDescription property.
         * <p/>
         * <p/>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the programDescription property.
         * <p/>
         * <p/>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProgramDescription().add(newItem);
         * </pre>
         * <p/>
         * <p/>
         * <p/>
         * Objects of the following type(s) are allowed in the list
         * {@link ArrayOfAffiliationInfoTypeLoyalProgram.LoyalProgram.ProgramDescription }
         */
        public List<ArrayOfAffiliationInfoTypeLoyalProgram.LoyalProgram.ProgramDescription> getProgramDescription() {
            if (programDescription == null) {
                programDescription = new ArrayList<ArrayOfAffiliationInfoTypeLoyalProgram.LoyalProgram.ProgramDescription>();
            }
            return this.programDescription;
        }

        /**
         * ��ȡprogramRestriction���Ե�ֵ��
         *
         * @return possible object is
         * {@link ArrayOfAffiliationInfoTypeLoyalProgram.LoyalProgram.ProgramRestriction }
         */
        public ArrayOfAffiliationInfoTypeLoyalProgram.LoyalProgram.ProgramRestriction getProgramRestriction() {
            return programRestriction;
        }

        /**
         * ����programRestriction���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link ArrayOfAffiliationInfoTypeLoyalProgram.LoyalProgram.ProgramRestriction }
         */
        public void setProgramRestriction(ArrayOfAffiliationInfoTypeLoyalProgram.LoyalProgram.ProgramRestriction value) {
            this.programRestriction = value;
        }

        /**
         * ��ȡblackoutDates���Ե�ֵ��
         *
         * @return possible object is
         * {@link ArrayOfDateTimeSpanType1 }
         */
        public ArrayOfDateTimeSpanType1 getBlackoutDates() {
            return blackoutDates;
        }

        /**
         * ����blackoutDates���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link ArrayOfDateTimeSpanType1 }
         */
        public void setBlackoutDates(ArrayOfDateTimeSpanType1 value) {
            this.blackoutDates = value;
        }

        /**
         * ��ȡremoval���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isRemoval() {
            return removal;
        }

        /**
         * ����removal���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setRemoval(Boolean value) {
            this.removal = value;
        }

        /**
         * ��ȡprogramName���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getProgramName() {
            return programName;
        }

        /**
         * ����programName���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setProgramName(String value) {
            this.programName = value;
        }

        /**
         * ��ȡsecondaryProgramName���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getSecondaryProgramName() {
            return secondaryProgramName;
        }

        /**
         * ����secondaryProgramName���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setSecondaryProgramName(String value) {
            this.secondaryProgramName = value;
        }

        /**
         * ��ȡaffiliateProgramName���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getAffiliateProgramName() {
            return affiliateProgramName;
        }

        /**
         * ����affiliateProgramName���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setAffiliateProgramName(String value) {
            this.affiliateProgramName = value;
        }

        /**
         * ��ȡhotelLevel���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getHotelLevel() {
            return hotelLevel;
        }

        /**
         * ����hotelLevel���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setHotelLevel(String value) {
            this.hotelLevel = value;
        }

        /**
         * ��ȡprogramCode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getProgramCode() {
            return programCode;
        }

        /**
         * ����programCode���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setProgramCode(String value) {
            this.programCode = value;
        }

        /**
         * ��ȡtravelSector���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getTravelSector() {
            return travelSector;
        }

        /**
         * ����travelSector���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setTravelSector(String value) {
            this.travelSector = value;
        }

        /**
         * ��ȡprimaryProgramInd���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isPrimaryProgramInd() {
            return primaryProgramInd;
        }

        /**
         * ����primaryProgramInd���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setPrimaryProgramInd(Boolean value) {
            this.primaryProgramInd = value;
        }


        /**
         * <p>anonymous complex type�� Java �ࡣ
         * <p/>
         * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
         * <p/>
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ParagraphType">
         *       &lt;attribute name="Removal" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class ProgramDescription
                extends ParagraphType {

            @XmlAttribute(name = "Removal")
            protected Boolean removal;

            /**
             * ��ȡremoval���Ե�ֵ��
             *
             * @return possible object is
             * {@link Boolean }
             */
            public Boolean isRemoval() {
                return removal;
            }

            /**
             * ����removal���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link Boolean }
             */
            public void setRemoval(Boolean value) {
                this.removal = value;
            }

        }


        /**
         * <p>anonymous complex type�� Java �ࡣ
         * <p/>
         * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
         * <p/>
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ParagraphType">
         *       &lt;attribute name="Removal" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class ProgramRestriction
                extends ParagraphType {

            @XmlAttribute(name = "Removal")
            protected Boolean removal;

            /**
             * ��ȡremoval���Ե�ֵ��
             *
             * @return possible object is
             * {@link Boolean }
             */
            public Boolean isRemoval() {
                return removal;
            }

            /**
             * ����removal���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link Boolean }
             */
            public void setRemoval(Boolean value) {
                this.removal = value;
            }

        }

    }

}
