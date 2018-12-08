package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>ArrayOfTransportationTypeTransportation complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="ArrayOfTransportationTypeTransportation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Transportation" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="MultimediaDescriptions" type="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType" minOccurs="0"/>
 *                   &lt;element name="OperationSchedules" type="{http://www.opentravel.org/OTA/2003/05}OperationSchedulesType" minOccurs="0"/>
 *                   &lt;element name="DescriptiveText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="NotificationRequired" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="TransportationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="ChargeUnit" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Included" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="CodeDetail" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="TypicalTravelTime" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="ExistsCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "ArrayOfTransportationTypeTransportation", propOrder = {
        "transportation"
})
public class ArrayOfTransportationTypeTransportation {

    @XmlElement(name = "Transportation")
    protected List<ArrayOfTransportationTypeTransportation.Transportation> transportation;

    /**
     * Gets the value of the transportation property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transportation property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransportation().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfTransportationTypeTransportation.Transportation }
     */
    public List<ArrayOfTransportationTypeTransportation.Transportation> getTransportation() {
        if (transportation == null) {
            transportation = new ArrayList<ArrayOfTransportationTypeTransportation.Transportation>();
        }
        return this.transportation;
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
     *         &lt;element name="MultimediaDescriptions" type="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType" minOccurs="0"/>
     *         &lt;element name="OperationSchedules" type="{http://www.opentravel.org/OTA/2003/05}OperationSchedulesType" minOccurs="0"/>
     *         &lt;element name="DescriptiveText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="NotificationRequired" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="TransportationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ChargeUnit" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Included" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="CodeDetail" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="TypicalTravelTime" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="ExistsCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "multimediaDescriptions",
            "operationSchedules",
            "descriptiveText"
    })
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

        /**
         * ��ȡmultimediaDescriptions���Ե�ֵ��
         *
         * @return possible object is
         * {@link MultimediaDescriptionsType }
         */
        public MultimediaDescriptionsType getMultimediaDescriptions() {
            return multimediaDescriptions;
        }

        /**
         * ����multimediaDescriptions���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link MultimediaDescriptionsType }
         */
        public void setMultimediaDescriptions(MultimediaDescriptionsType value) {
            this.multimediaDescriptions = value;
        }

        /**
         * ��ȡoperationSchedules���Ե�ֵ��
         *
         * @return possible object is
         * {@link OperationSchedulesType }
         */
        public OperationSchedulesType getOperationSchedules() {
            return operationSchedules;
        }

        /**
         * ����operationSchedules���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link OperationSchedulesType }
         */
        public void setOperationSchedules(OperationSchedulesType value) {
            this.operationSchedules = value;
        }

        /**
         * ��ȡdescriptiveText���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getDescriptiveText() {
            return descriptiveText;
        }

        /**
         * ����descriptiveText���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setDescriptiveText(String value) {
            this.descriptiveText = value;
        }

        /**
         * ��ȡnotificationRequired���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getNotificationRequired() {
            return notificationRequired;
        }

        /**
         * ����notificationRequired���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setNotificationRequired(String value) {
            this.notificationRequired = value;
        }

        /**
         * ��ȡtransportationCode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getTransportationCode() {
            return transportationCode;
        }

        /**
         * ����transportationCode���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setTransportationCode(String value) {
            this.transportationCode = value;
        }

        /**
         * ��ȡchargeUnit���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getChargeUnit() {
            return chargeUnit;
        }

        /**
         * ����chargeUnit���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setChargeUnit(String value) {
            this.chargeUnit = value;
        }

        /**
         * ��ȡincluded���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isIncluded() {
            return included;
        }

        /**
         * ����included���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setIncluded(Boolean value) {
            this.included = value;
        }

        /**
         * ��ȡcodeDetail���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getCodeDetail() {
            return codeDetail;
        }

        /**
         * ����codeDetail���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setCodeDetail(String value) {
            this.codeDetail = value;
        }

        /**
         * ��ȡdescription���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getDescription() {
            return description;
        }

        /**
         * ����description���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setDescription(String value) {
            this.description = value;
        }

        /**
         * ��ȡtypicalTravelTime���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getTypicalTravelTime() {
            return typicalTravelTime;
        }

        /**
         * ����typicalTravelTime���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setTypicalTravelTime(String value) {
            this.typicalTravelTime = value;
        }

        /**
         * ��ȡamount���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigDecimal }
         */
        public BigDecimal getAmount() {
            return amount;
        }

        /**
         * ����amount���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigDecimal }
         */
        public void setAmount(BigDecimal value) {
            this.amount = value;
        }

        /**
         * ��ȡexistsCode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getExistsCode() {
            return existsCode;
        }

        /**
         * ����existsCode���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setExistsCode(String value) {
            this.existsCode = value;
        }

        /**
         * ��ȡid���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getID() {
            return id;
        }

        /**
         * ����id���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setID(String value) {
            this.id = value;
        }

    }

}
