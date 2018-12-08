
package ota.jw.ARIPmsGateway;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * <p>ArrayOfBaseInvCountTypeInvCount complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfBaseInvCountTypeInvCount"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InvCount" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="InvBlockCutoff" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="AbsoluteCutoff" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="OffsetDuration" type="{http://www.w3.org/2001/XMLSchema}duration" /&gt;
 *                           &lt;attribute name="OffsetCalculationMode"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                 &lt;enumeration value="BeforeBlockStartDate"/&gt;
 *                                 &lt;enumeration value="AfterBlockCreation"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="CountType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="Count" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                 &lt;attribute name="AdjustReason" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="ActionType"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;enumeration value="Adjustment"/&gt;
 *                       &lt;enumeration value="Used"/&gt;
 *                       &lt;enumeration value="Remaining"/&gt;
 *                       &lt;enumeration value="Allocation"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
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
@XmlType(name = "ArrayOfBaseInvCountTypeInvCount", propOrder = {
    "invCount"
})
public class ArrayOfBaseInvCountTypeInvCount {

    @XmlElement(name = "InvCount")
    protected List<ArrayOfBaseInvCountTypeInvCount.InvCount> invCount;

    /**
     * Gets the value of the invCount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invCount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvCount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfBaseInvCountTypeInvCount.InvCount }
     * 
     * 
     */
    public List<ArrayOfBaseInvCountTypeInvCount.InvCount> getInvCount() {
        if (invCount == null) {
            invCount = new ArrayList<ArrayOfBaseInvCountTypeInvCount.InvCount>();
        }
        return this.invCount;
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
     *         &lt;element name="InvBlockCutoff" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="AbsoluteCutoff" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="OffsetDuration" type="{http://www.w3.org/2001/XMLSchema}duration" /&gt;
     *                 &lt;attribute name="OffsetCalculationMode"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                       &lt;enumeration value="BeforeBlockStartDate"/&gt;
     *                       &lt;enumeration value="AfterBlockCreation"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="CountType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="Count" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *       &lt;attribute name="AdjustReason" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="ActionType"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;enumeration value="Adjustment"/&gt;
     *             &lt;enumeration value="Used"/&gt;
     *             &lt;enumeration value="Remaining"/&gt;
     *             &lt;enumeration value="Allocation"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "invBlockCutoff"
    })
    public static class InvCount {

        @XmlElement(name = "InvBlockCutoff")
        protected ArrayOfBaseInvCountTypeInvCount.InvCount.InvBlockCutoff invBlockCutoff;
        @XmlAttribute(name = "CountType")
        protected String countType;
        @XmlAttribute(name = "Count")
        protected BigInteger count;
        @XmlAttribute(name = "AdjustReason")
        protected String adjustReason;
        @XmlAttribute(name = "ActionType")
        protected String actionType;

        /**
         * 获取invBlockCutoff属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfBaseInvCountTypeInvCount.InvCount.InvBlockCutoff }
         *     
         */
        public ArrayOfBaseInvCountTypeInvCount.InvCount.InvBlockCutoff getInvBlockCutoff() {
            return invBlockCutoff;
        }

        /**
         * 设置invBlockCutoff属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfBaseInvCountTypeInvCount.InvCount.InvBlockCutoff }
         *     
         */
        public void setInvBlockCutoff(ArrayOfBaseInvCountTypeInvCount.InvCount.InvBlockCutoff value) {
            this.invBlockCutoff = value;
        }

        /**
         * 获取countType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCountType() {
            return countType;
        }

        /**
         * 设置countType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCountType(String value) {
            this.countType = value;
        }

        /**
         * 获取count属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getCount() {
            return count;
        }

        /**
         * 设置count属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setCount(BigInteger value) {
            this.count = value;
        }

        /**
         * 获取adjustReason属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAdjustReason() {
            return adjustReason;
        }

        /**
         * 设置adjustReason属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAdjustReason(String value) {
            this.adjustReason = value;
        }

        /**
         * 获取actionType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getActionType() {
            return actionType;
        }

        /**
         * 设置actionType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setActionType(String value) {
            this.actionType = value;
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
         *       &lt;attribute name="AbsoluteCutoff" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="OffsetDuration" type="{http://www.w3.org/2001/XMLSchema}duration" /&gt;
         *       &lt;attribute name="OffsetCalculationMode"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *             &lt;enumeration value="BeforeBlockStartDate"/&gt;
         *             &lt;enumeration value="AfterBlockCreation"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class InvBlockCutoff {

            @XmlAttribute(name = "AbsoluteCutoff")
            protected String absoluteCutoff;
            @XmlAttribute(name = "OffsetDuration")
            protected Duration offsetDuration;
            @XmlAttribute(name = "OffsetCalculationMode")
            protected String offsetCalculationMode;

            /**
             * 获取absoluteCutoff属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAbsoluteCutoff() {
                return absoluteCutoff;
            }

            /**
             * 设置absoluteCutoff属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAbsoluteCutoff(String value) {
                this.absoluteCutoff = value;
            }

            /**
             * 获取offsetDuration属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Duration }
             *     
             */
            public Duration getOffsetDuration() {
                return offsetDuration;
            }

            /**
             * 设置offsetDuration属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Duration }
             *     
             */
            public void setOffsetDuration(Duration value) {
                this.offsetDuration = value;
            }

            /**
             * 获取offsetCalculationMode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOffsetCalculationMode() {
                return offsetCalculationMode;
            }

            /**
             * 设置offsetCalculationMode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOffsetCalculationMode(String value) {
                this.offsetCalculationMode = value;
            }

        }

    }

}
