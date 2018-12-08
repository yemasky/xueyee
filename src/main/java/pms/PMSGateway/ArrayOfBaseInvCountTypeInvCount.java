package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.Duration;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>ArrayOfBaseInvCountTypeInvCount complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="ArrayOfBaseInvCountTypeInvCount">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InvCount" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="InvBlockCutoff" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="AbsoluteCutoff" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="OffsetDuration" type="{http://www.w3.org/2001/XMLSchema}duration" />
 *                           &lt;attribute name="OffsetCalculationMode">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;enumeration value="BeforeBlockStartDate"/>
 *                                 &lt;enumeration value="AfterBlockCreation"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="CountType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Count" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="AdjustReason" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="ActionType">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="Adjustment"/>
 *                       &lt;enumeration value="Used"/>
 *                       &lt;enumeration value="Remaining"/>
 *                       &lt;enumeration value="Allocation"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
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
@XmlType(name = "ArrayOfBaseInvCountTypeInvCount", propOrder = {
        "invCount"
})
public class ArrayOfBaseInvCountTypeInvCount {

    @XmlElement(name = "InvCount")
    protected List<ArrayOfBaseInvCountTypeInvCount.InvCount> invCount;

    /**
     * Gets the value of the invCount property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invCount property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvCount().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfBaseInvCountTypeInvCount.InvCount }
     */
    public List<ArrayOfBaseInvCountTypeInvCount.InvCount> getInvCount() {
        if (invCount == null) {
            invCount = new ArrayList<ArrayOfBaseInvCountTypeInvCount.InvCount>();
        }
        return this.invCount;
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
     *         &lt;element name="InvBlockCutoff" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="AbsoluteCutoff" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="OffsetDuration" type="{http://www.w3.org/2001/XMLSchema}duration" />
     *                 &lt;attribute name="OffsetCalculationMode">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;enumeration value="BeforeBlockStartDate"/>
     *                       &lt;enumeration value="AfterBlockCreation"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="CountType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Count" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="AdjustReason" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ActionType">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="Adjustment"/>
     *             &lt;enumeration value="Used"/>
     *             &lt;enumeration value="Remaining"/>
     *             &lt;enumeration value="Allocation"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
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
         * ��ȡinvBlockCutoff���Ե�ֵ��
         *
         * @return possible object is
         * {@link ArrayOfBaseInvCountTypeInvCount.InvCount.InvBlockCutoff }
         */
        public ArrayOfBaseInvCountTypeInvCount.InvCount.InvBlockCutoff getInvBlockCutoff() {
            return invBlockCutoff;
        }

        /**
         * ����invBlockCutoff���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link ArrayOfBaseInvCountTypeInvCount.InvCount.InvBlockCutoff }
         */
        public void setInvBlockCutoff(ArrayOfBaseInvCountTypeInvCount.InvCount.InvBlockCutoff value) {
            this.invBlockCutoff = value;
        }

        /**
         * ��ȡcountType���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getCountType() {
            return countType;
        }

        /**
         * ����countType���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setCountType(String value) {
            this.countType = value;
        }

        /**
         * ��ȡcount���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getCount() {
            return count;
        }

        /**
         * ����count���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setCount(BigInteger value) {
            this.count = value;
        }

        /**
         * ��ȡadjustReason���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getAdjustReason() {
            return adjustReason;
        }

        /**
         * ����adjustReason���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setAdjustReason(String value) {
            this.adjustReason = value;
        }

        /**
         * ��ȡactionType���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getActionType() {
            return actionType;
        }

        /**
         * ����actionType���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setActionType(String value) {
            this.actionType = value;
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
         *       &lt;attribute name="AbsoluteCutoff" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="OffsetDuration" type="{http://www.w3.org/2001/XMLSchema}duration" />
         *       &lt;attribute name="OffsetCalculationMode">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;enumeration value="BeforeBlockStartDate"/>
         *             &lt;enumeration value="AfterBlockCreation"/>
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
        public static class InvBlockCutoff {

            @XmlAttribute(name = "AbsoluteCutoff")
            protected String absoluteCutoff;
            @XmlAttribute(name = "OffsetDuration")
            protected Duration offsetDuration;
            @XmlAttribute(name = "OffsetCalculationMode")
            protected String offsetCalculationMode;

            /**
             * ��ȡabsoluteCutoff���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getAbsoluteCutoff() {
                return absoluteCutoff;
            }

            /**
             * ����absoluteCutoff���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setAbsoluteCutoff(String value) {
                this.absoluteCutoff = value;
            }

            /**
             * ��ȡoffsetDuration���Ե�ֵ��
             *
             * @return possible object is
             * {@link Duration }
             */
            public Duration getOffsetDuration() {
                return offsetDuration;
            }

            /**
             * ����offsetDuration���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link Duration }
             */
            public void setOffsetDuration(Duration value) {
                this.offsetDuration = value;
            }

            /**
             * ��ȡoffsetCalculationMode���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getOffsetCalculationMode() {
                return offsetCalculationMode;
            }

            /**
             * ����offsetCalculationMode���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setOffsetCalculationMode(String value) {
                this.offsetCalculationMode = value;
            }

        }

    }

}
