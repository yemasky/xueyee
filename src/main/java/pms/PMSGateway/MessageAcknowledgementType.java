package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>MessageAcknowledgementType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="MessageAcknowledgementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="Success" type="{http://www.opentravel.org/OTA/2003/05}SuccessType" minOccurs="0"/>
 *           &lt;element name="Warnings" type="{http://www.opentravel.org/OTA/2003/05}WarningsType" minOccurs="0"/>
 *           &lt;element name="Errors" type="{http://www.opentravel.org/OTA/2003/05}ErrorsType" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" minOccurs="0"/>
 *         &lt;element name="TPA_Extensions" type="{http://www.opentravel.org/OTA/2003/05}TPA_ExtensionsType" minOccurs="0"/>
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
 *       &lt;attribute name="PrimaryLangID" type="{http://www.w3.org/2001/XMLSchema}language" />
 *       &lt;attribute name="AltLangID" type="{http://www.w3.org/2001/XMLSchema}language" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageAcknowledgementType", propOrder = {
        "successOrWarningsOrErrors",
        "uniqueID",
        "tpaExtensions"
})
@XmlSeeAlso({
        OTAPrdNotifReportRQ.class,
        OTANotifReportRQ.class,
        OTAHotelInvCountNotifRS.class
})
public class MessageAcknowledgementType {

    @XmlElements({
            @XmlElement(name = "Success", type = SuccessType.class),
            @XmlElement(name = "Warnings", type = WarningsType.class),
            @XmlElement(name = "Errors", type = ErrorsType.class)
    })
    protected List<Object> successOrWarningsOrErrors;
    @XmlElement(name = "UniqueID")
    protected UniqueIDType uniqueID;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType tpaExtensions;
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
    @XmlAttribute(name = "PrimaryLangID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String primaryLangID;
    @XmlAttribute(name = "AltLangID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String altLangID;

    /**
     * Gets the value of the successOrWarningsOrErrors property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the successOrWarningsOrErrors property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSuccessOrWarningsOrErrors().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link SuccessType }
     * {@link WarningsType }
     * {@link ErrorsType }
     */
    public List<Object> getSuccessOrWarningsOrErrors() {
        if (successOrWarningsOrErrors == null) {
            successOrWarningsOrErrors = new ArrayList<Object>();
        }
        return this.successOrWarningsOrErrors;
    }

    /**
     * ��ȡuniqueID���Ե�ֵ��
     *
     * @return possible object is
     * {@link UniqueIDType }
     */
    public UniqueIDType getUniqueID() {
        return uniqueID;
    }

    /**
     * ����uniqueID���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link UniqueIDType }
     */
    public void setUniqueID(UniqueIDType value) {
        this.uniqueID = value;
    }

    /**
     * ��ȡtpaExtensions���Ե�ֵ��
     *
     * @return possible object is
     * {@link TPAExtensionsType }
     */
    public TPAExtensionsType getTPAExtensions() {
        return tpaExtensions;
    }

    /**
     * ����tpaExtensions���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link TPAExtensionsType }
     */
    public void setTPAExtensions(TPAExtensionsType value) {
        this.tpaExtensions = value;
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
     * ��ȡprimaryLangID���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getPrimaryLangID() {
        return primaryLangID;
    }

    /**
     * ����primaryLangID���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPrimaryLangID(String value) {
        this.primaryLangID = value;
    }

    /**
     * ��ȡaltLangID���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getAltLangID() {
        return altLangID;
    }

    /**
     * ����altLangID���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAltLangID(String value) {
        this.altLangID = value;
    }

}
