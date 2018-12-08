package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>GuaranteeType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="GuaranteeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GuaranteesAccepted" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfGuaranteeTypeGuaranteeAccepted" minOccurs="0"/>
 *         &lt;element name="Deadline" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="AbsoluteDeadline" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="OffsetTimeUnit" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" />
 *                 &lt;attribute name="OffsetUnitMultiplier" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="OffsetDropTime">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="BeforeArrival"/>
 *                       &lt;enumeration value="AfterBooking"/>
 *                       &lt;enumeration value="AfterConfirmation"/>
 *                       &lt;enumeration value="AfterArrival"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Comments" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfCommentTypeComment" minOccurs="0"/>
 *         &lt;element name="GuaranteeDescription" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="RetributionType">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="ResAutoCancelled"/>
 *             &lt;enumeration value="ResNotGuaranteed"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="GuaranteeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="GuaranteeType">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="GuaranteeRequired"/>
 *             &lt;enumeration value="None"/>
 *             &lt;enumeration value="CC/DC/Voucher"/>
 *             &lt;enumeration value="Profile"/>
 *             &lt;enumeration value="Deposit"/>
 *             &lt;enumeration value="PrePay"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="HoldTime" type="{http://www.w3.org/2001/XMLSchema}time" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuaranteeType", propOrder = {
        "guaranteesAccepted",
        "deadline",
        "comments",
        "guaranteeDescription"
})
@XmlSeeAlso({
        pms.PMSGateway.ArrayOfBookingRulesTypeBookingRuleAcceptableGuarantee.AcceptableGuarantee.class
})
public class GuaranteeType {

    @XmlElement(name = "GuaranteesAccepted")
    protected ArrayOfGuaranteeTypeGuaranteeAccepted guaranteesAccepted;
    @XmlElement(name = "Deadline")
    protected GuaranteeType.Deadline deadline;
    @XmlElement(name = "Comments")
    protected ArrayOfCommentTypeComment comments;
    @XmlElement(name = "GuaranteeDescription")
    protected List<ParagraphType> guaranteeDescription;
    @XmlAttribute(name = "RetributionType")
    protected String retributionType;
    @XmlAttribute(name = "GuaranteeCode")
    protected String guaranteeCode;
    @XmlAttribute(name = "GuaranteeType")
    protected String guaranteeType;
    @XmlAttribute(name = "HoldTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar holdTime;

    /**
     * ��ȡguaranteesAccepted���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArrayOfGuaranteeTypeGuaranteeAccepted }
     */
    public ArrayOfGuaranteeTypeGuaranteeAccepted getGuaranteesAccepted() {
        return guaranteesAccepted;
    }

    /**
     * ����guaranteesAccepted���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArrayOfGuaranteeTypeGuaranteeAccepted }
     */
    public void setGuaranteesAccepted(ArrayOfGuaranteeTypeGuaranteeAccepted value) {
        this.guaranteesAccepted = value;
    }

    /**
     * ��ȡdeadline���Ե�ֵ��
     *
     * @return possible object is
     * {@link GuaranteeType.Deadline }
     */
    public GuaranteeType.Deadline getDeadline() {
        return deadline;
    }

    /**
     * ����deadline���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link GuaranteeType.Deadline }
     */
    public void setDeadline(GuaranteeType.Deadline value) {
        this.deadline = value;
    }

    /**
     * ��ȡcomments���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArrayOfCommentTypeComment }
     */
    public ArrayOfCommentTypeComment getComments() {
        return comments;
    }

    /**
     * ����comments���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArrayOfCommentTypeComment }
     */
    public void setComments(ArrayOfCommentTypeComment value) {
        this.comments = value;
    }

    /**
     * Gets the value of the guaranteeDescription property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guaranteeDescription property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuaranteeDescription().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link ParagraphType }
     */
    public List<ParagraphType> getGuaranteeDescription() {
        if (guaranteeDescription == null) {
            guaranteeDescription = new ArrayList<ParagraphType>();
        }
        return this.guaranteeDescription;
    }

    /**
     * ��ȡretributionType���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getRetributionType() {
        return retributionType;
    }

    /**
     * ����retributionType���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRetributionType(String value) {
        this.retributionType = value;
    }

    /**
     * ��ȡguaranteeCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getGuaranteeCode() {
        return guaranteeCode;
    }

    /**
     * ����guaranteeCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setGuaranteeCode(String value) {
        this.guaranteeCode = value;
    }

    /**
     * ��ȡguaranteeType���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getGuaranteeType() {
        return guaranteeType;
    }

    /**
     * ����guaranteeType���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setGuaranteeType(String value) {
        this.guaranteeType = value;
    }

    /**
     * ��ȡholdTime���Ե�ֵ��
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getHoldTime() {
        return holdTime;
    }

    /**
     * ����holdTime���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setHoldTime(XMLGregorianCalendar value) {
        this.holdTime = value;
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
     *       &lt;attribute name="AbsoluteDeadline" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="OffsetTimeUnit" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" />
     *       &lt;attribute name="OffsetUnitMultiplier" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="OffsetDropTime">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="BeforeArrival"/>
     *             &lt;enumeration value="AfterBooking"/>
     *             &lt;enumeration value="AfterConfirmation"/>
     *             &lt;enumeration value="AfterArrival"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Deadline {

        @XmlAttribute(name = "AbsoluteDeadline")
        protected String absoluteDeadline;
        @XmlAttribute(name = "OffsetTimeUnit")
        protected TimeUnitType offsetTimeUnit;
        @XmlAttribute(name = "OffsetUnitMultiplier")
        protected BigInteger offsetUnitMultiplier;
        @XmlAttribute(name = "OffsetDropTime")
        protected String offsetDropTime;

        /**
         * ��ȡabsoluteDeadline���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getAbsoluteDeadline() {
            return absoluteDeadline;
        }

        /**
         * ����absoluteDeadline���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setAbsoluteDeadline(String value) {
            this.absoluteDeadline = value;
        }

        /**
         * ��ȡoffsetTimeUnit���Ե�ֵ��
         *
         * @return possible object is
         * {@link TimeUnitType }
         */
        public TimeUnitType getOffsetTimeUnit() {
            return offsetTimeUnit;
        }

        /**
         * ����offsetTimeUnit���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link TimeUnitType }
         */
        public void setOffsetTimeUnit(TimeUnitType value) {
            this.offsetTimeUnit = value;
        }

        /**
         * ��ȡoffsetUnitMultiplier���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getOffsetUnitMultiplier() {
            return offsetUnitMultiplier;
        }

        /**
         * ����offsetUnitMultiplier���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setOffsetUnitMultiplier(BigInteger value) {
            this.offsetUnitMultiplier = value;
        }

        /**
         * ��ȡoffsetDropTime���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getOffsetDropTime() {
            return offsetDropTime;
        }

        /**
         * ����offsetDropTime���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setOffsetDropTime(String value) {
            this.offsetDropTime = value;
        }

    }

}
