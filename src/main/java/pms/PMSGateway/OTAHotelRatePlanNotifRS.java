package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


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
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="RatePlanCrossRefs" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="RatePlanCrossRef" maxOccurs="unbounded" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;attribute name="RequestRatePlanCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                             &lt;attribute name="RequestRatePlanGroupingCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                             &lt;attribute name="ResponseRatePlanCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                             &lt;attribute name="ResponseRatePlanGroupingCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="Warnings" type="{http://www.opentravel.org/OTA/2003/05}WarningsType" minOccurs="0"/>
 *           &lt;element name="Errors" type="{http://www.opentravel.org/OTA/2003/05}ErrorsType" minOccurs="0"/>
 *           &lt;element name="Success" type="{http://www.opentravel.org/OTA/2003/05}SuccessType" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="EchoToken" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="Target">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Test"/>
 *             &lt;enumeration value="Production"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="TargetName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Version" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="TransactionIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SequenceNmbr" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="TransactionStatusCode">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Start"/>
 *             &lt;enumeration value="End"/>
 *             &lt;enumeration value="Rollback"/>
 *             &lt;enumeration value="InSeries"/>
 *             &lt;enumeration value="Continuation"/>
 *             &lt;enumeration value="Subsequent"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="RetransmissionIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="CorrelationID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "ratePlanCrossRefsOrWarningsOrErrors"
})
@XmlRootElement(name = "OTA_HotelRatePlanNotifRS")
public class OTAHotelRatePlanNotifRS {

    @XmlElements({
            @XmlElement(name = "RatePlanCrossRefs", type = OTAHotelRatePlanNotifRS.RatePlanCrossRefs.class),
            @XmlElement(name = "Warnings", type = WarningsType.class),
            @XmlElement(name = "Errors", type = ErrorsType.class),
            @XmlElement(name = "Success", type = SuccessType.class)
    })
    protected List<Object> ratePlanCrossRefsOrWarningsOrErrors;
    @XmlAttribute(name = "EchoToken")
    protected String echoToken;
    @XmlAttribute(name = "TimeStamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeStamp;
    @XmlAttribute(name = "Target")
    protected String target;
    @XmlAttribute(name = "TargetName")
    protected String targetName;
    @XmlAttribute(name = "Version", required = true)
    protected BigDecimal version;
    @XmlAttribute(name = "TransactionIdentifier")
    protected String transactionIdentifier;
    @XmlAttribute(name = "SequenceNmbr")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger sequenceNmbr;
    @XmlAttribute(name = "TransactionStatusCode")
    protected String transactionStatusCode;
    @XmlAttribute(name = "RetransmissionIndicator")
    protected Boolean retransmissionIndicator;
    @XmlAttribute(name = "CorrelationID")
    protected String correlationID;

    /**
     * Gets the value of the ratePlanCrossRefsOrWarningsOrErrors property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ratePlanCrossRefsOrWarningsOrErrors property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRatePlanCrossRefsOrWarningsOrErrors().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link OTAHotelRatePlanNotifRS.RatePlanCrossRefs }
     * {@link WarningsType }
     * {@link ErrorsType }
     * {@link SuccessType }
     */
    public List<Object> getRatePlanCrossRefsOrWarningsOrErrors() {
        if (ratePlanCrossRefsOrWarningsOrErrors == null) {
            ratePlanCrossRefsOrWarningsOrErrors = new ArrayList<Object>();
        }
        return this.ratePlanCrossRefsOrWarningsOrErrors;
    }

    /**
     * ��ȡechoToken���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getEchoToken() {
        return echoToken;
    }

    /**
     * ����echoToken���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEchoToken(String value) {
        this.echoToken = value;
    }

    /**
     * ��ȡtimeStamp���Ե�ֵ��
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getTimeStamp() {
        return timeStamp;
    }

    /**
     * ����timeStamp���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setTimeStamp(XMLGregorianCalendar value) {
        this.timeStamp = value;
    }

    /**
     * ��ȡtarget���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getTarget() {
        return target;
    }

    /**
     * ����target���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTarget(String value) {
        this.target = value;
    }

    /**
     * ��ȡtargetName���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getTargetName() {
        return targetName;
    }

    /**
     * ����targetName���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTargetName(String value) {
        this.targetName = value;
    }

    /**
     * ��ȡversion���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getVersion() {
        return version;
    }

    /**
     * ����version���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setVersion(BigDecimal value) {
        this.version = value;
    }

    /**
     * ��ȡtransactionIdentifier���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getTransactionIdentifier() {
        return transactionIdentifier;
    }

    /**
     * ����transactionIdentifier���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTransactionIdentifier(String value) {
        this.transactionIdentifier = value;
    }

    /**
     * ��ȡsequenceNmbr���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getSequenceNmbr() {
        return sequenceNmbr;
    }

    /**
     * ����sequenceNmbr���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setSequenceNmbr(BigInteger value) {
        this.sequenceNmbr = value;
    }

    /**
     * ��ȡtransactionStatusCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getTransactionStatusCode() {
        return transactionStatusCode;
    }

    /**
     * ����transactionStatusCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTransactionStatusCode(String value) {
        this.transactionStatusCode = value;
    }

    /**
     * ��ȡretransmissionIndicator���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isRetransmissionIndicator() {
        return retransmissionIndicator;
    }

    /**
     * ����retransmissionIndicator���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setRetransmissionIndicator(Boolean value) {
        this.retransmissionIndicator = value;
    }

    /**
     * ��ȡcorrelationID���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getCorrelationID() {
        return correlationID;
    }

    /**
     * ����correlationID���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCorrelationID(String value) {
        this.correlationID = value;
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
     *         &lt;element name="RatePlanCrossRef" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="RequestRatePlanCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="RequestRatePlanGroupingCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="ResponseRatePlanCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="ResponseRatePlanGroupingCode" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    @XmlType(name = "", propOrder = {
            "ratePlanCrossRef"
    })
    public static class RatePlanCrossRefs {

        @XmlElement(name = "RatePlanCrossRef")
        protected List<OTAHotelRatePlanNotifRS.RatePlanCrossRefs.RatePlanCrossRef> ratePlanCrossRef;

        /**
         * Gets the value of the ratePlanCrossRef property.
         * <p/>
         * <p/>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ratePlanCrossRef property.
         * <p/>
         * <p/>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRatePlanCrossRef().add(newItem);
         * </pre>
         * <p/>
         * <p/>
         * <p/>
         * Objects of the following type(s) are allowed in the list
         * {@link OTAHotelRatePlanNotifRS.RatePlanCrossRefs.RatePlanCrossRef }
         */
        public List<OTAHotelRatePlanNotifRS.RatePlanCrossRefs.RatePlanCrossRef> getRatePlanCrossRef() {
            if (ratePlanCrossRef == null) {
                ratePlanCrossRef = new ArrayList<OTAHotelRatePlanNotifRS.RatePlanCrossRefs.RatePlanCrossRef>();
            }
            return this.ratePlanCrossRef;
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
         *       &lt;attribute name="RequestRatePlanCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="RequestRatePlanGroupingCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="ResponseRatePlanCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="ResponseRatePlanGroupingCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class RatePlanCrossRef {

            @XmlAttribute(name = "RequestRatePlanCode")
            protected String requestRatePlanCode;
            @XmlAttribute(name = "RequestRatePlanGroupingCode")
            protected String requestRatePlanGroupingCode;
            @XmlAttribute(name = "ResponseRatePlanCode")
            protected String responseRatePlanCode;
            @XmlAttribute(name = "ResponseRatePlanGroupingCode")
            protected String responseRatePlanGroupingCode;

            /**
             * ��ȡrequestRatePlanCode���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getRequestRatePlanCode() {
                return requestRatePlanCode;
            }

            /**
             * ����requestRatePlanCode���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setRequestRatePlanCode(String value) {
                this.requestRatePlanCode = value;
            }

            /**
             * ��ȡrequestRatePlanGroupingCode���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getRequestRatePlanGroupingCode() {
                return requestRatePlanGroupingCode;
            }

            /**
             * ����requestRatePlanGroupingCode���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setRequestRatePlanGroupingCode(String value) {
                this.requestRatePlanGroupingCode = value;
            }

            /**
             * ��ȡresponseRatePlanCode���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getResponseRatePlanCode() {
                return responseRatePlanCode;
            }

            /**
             * ����responseRatePlanCode���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setResponseRatePlanCode(String value) {
                this.responseRatePlanCode = value;
            }

            /**
             * ��ȡresponseRatePlanGroupingCode���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getResponseRatePlanGroupingCode() {
                return responseRatePlanGroupingCode;
            }

            /**
             * ����responseRatePlanGroupingCode���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setResponseRatePlanGroupingCode(String value) {
                this.responseRatePlanGroupingCode = value;
            }

        }

    }

}
