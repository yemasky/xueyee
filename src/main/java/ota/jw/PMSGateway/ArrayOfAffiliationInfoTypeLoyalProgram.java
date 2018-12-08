
package ota.jw.PMSGateway;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfAffiliationInfoTypeLoyalProgram complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAffiliationInfoTypeLoyalProgram"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LoyalProgram" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ProgramDescription" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ParagraphType"&gt;
 *                           &lt;attribute name="Removal" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="ProgramRestriction" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ParagraphType"&gt;
 *                           &lt;attribute name="Removal" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="BlackoutDates" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfDateTimeSpanType1" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="Removal" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="ProgramName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="SecondaryProgramName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="AffiliateProgramName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="HotelLevel" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="ProgramCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="TravelSector" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="PrimaryProgramInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
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
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loyalProgram property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoyalProgram().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfAffiliationInfoTypeLoyalProgram.LoyalProgram }
     * 
     * 
     */
    public List<ArrayOfAffiliationInfoTypeLoyalProgram.LoyalProgram> getLoyalProgram() {
        if (loyalProgram == null) {
            loyalProgram = new ArrayList<ArrayOfAffiliationInfoTypeLoyalProgram.LoyalProgram>();
        }
        return this.loyalProgram;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="ProgramDescription" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ParagraphType"&gt;
     *                 &lt;attribute name="Removal" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="ProgramRestriction" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ParagraphType"&gt;
     *                 &lt;attribute name="Removal" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="BlackoutDates" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfDateTimeSpanType1" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="Removal" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="ProgramName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="SecondaryProgramName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="AffiliateProgramName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="HotelLevel" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="ProgramCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="TravelSector" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="PrimaryProgramInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
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
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the programDescription property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProgramDescription().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ArrayOfAffiliationInfoTypeLoyalProgram.LoyalProgram.ProgramDescription }
         * 
         * 
         */
        public List<ArrayOfAffiliationInfoTypeLoyalProgram.LoyalProgram.ProgramDescription> getProgramDescription() {
            if (programDescription == null) {
                programDescription = new ArrayList<ArrayOfAffiliationInfoTypeLoyalProgram.LoyalProgram.ProgramDescription>();
            }
            return this.programDescription;
        }

        /**
         * 获取programRestriction属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfAffiliationInfoTypeLoyalProgram.LoyalProgram.ProgramRestriction }
         *     
         */
        public ArrayOfAffiliationInfoTypeLoyalProgram.LoyalProgram.ProgramRestriction getProgramRestriction() {
            return programRestriction;
        }

        /**
         * 设置programRestriction属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfAffiliationInfoTypeLoyalProgram.LoyalProgram.ProgramRestriction }
         *     
         */
        public void setProgramRestriction(ArrayOfAffiliationInfoTypeLoyalProgram.LoyalProgram.ProgramRestriction value) {
            this.programRestriction = value;
        }

        /**
         * 获取blackoutDates属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfDateTimeSpanType1 }
         *     
         */
        public ArrayOfDateTimeSpanType1 getBlackoutDates() {
            return blackoutDates;
        }

        /**
         * 设置blackoutDates属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfDateTimeSpanType1 }
         *     
         */
        public void setBlackoutDates(ArrayOfDateTimeSpanType1 value) {
            this.blackoutDates = value;
        }

        /**
         * 获取removal属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isRemoval() {
            return removal;
        }

        /**
         * 设置removal属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setRemoval(Boolean value) {
            this.removal = value;
        }

        /**
         * 获取programName属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProgramName() {
            return programName;
        }

        /**
         * 设置programName属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProgramName(String value) {
            this.programName = value;
        }

        /**
         * 获取secondaryProgramName属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSecondaryProgramName() {
            return secondaryProgramName;
        }

        /**
         * 设置secondaryProgramName属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSecondaryProgramName(String value) {
            this.secondaryProgramName = value;
        }

        /**
         * 获取affiliateProgramName属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAffiliateProgramName() {
            return affiliateProgramName;
        }

        /**
         * 设置affiliateProgramName属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAffiliateProgramName(String value) {
            this.affiliateProgramName = value;
        }

        /**
         * 获取hotelLevel属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHotelLevel() {
            return hotelLevel;
        }

        /**
         * 设置hotelLevel属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHotelLevel(String value) {
            this.hotelLevel = value;
        }

        /**
         * 获取programCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProgramCode() {
            return programCode;
        }

        /**
         * 设置programCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProgramCode(String value) {
            this.programCode = value;
        }

        /**
         * 获取travelSector属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTravelSector() {
            return travelSector;
        }

        /**
         * 设置travelSector属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTravelSector(String value) {
            this.travelSector = value;
        }

        /**
         * 获取primaryProgramInd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isPrimaryProgramInd() {
            return primaryProgramInd;
        }

        /**
         * 设置primaryProgramInd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setPrimaryProgramInd(Boolean value) {
            this.primaryProgramInd = value;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ParagraphType"&gt;
         *       &lt;attribute name="Removal" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class ProgramDescription
            extends ParagraphType
        {

            @XmlAttribute(name = "Removal")
            protected Boolean removal;

            /**
             * 获取removal属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isRemoval() {
                return removal;
            }

            /**
             * 设置removal属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setRemoval(Boolean value) {
                this.removal = value;
            }

        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ParagraphType"&gt;
         *       &lt;attribute name="Removal" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class ProgramRestriction
            extends ParagraphType
        {

            @XmlAttribute(name = "Removal")
            protected Boolean removal;

            /**
             * 获取removal属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isRemoval() {
                return removal;
            }

            /**
             * 设置removal属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setRemoval(Boolean value) {
                this.removal = value;
            }

        }

    }

}
