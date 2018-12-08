package pms.order;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelResResponseType", propOrder = {"pos", "errorsOrWarningsOrHotelReservations"})
public class HotelResResponseType {
    @XmlElement(name = "POS")
    protected ArrayOfSourceType pos;
    @XmlElements({@XmlElement(name = "Errors", type = ErrorsType.class), @XmlElement(name = "Warnings", type = WarningsType.class), @XmlElement(name = "HotelReservations", type = HotelReservationsType.class), @XmlElement(name = "Success", type = SuccessType.class)})
    protected List<Object> errorsOrWarningsOrHotelReservations;
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
    @XmlAttribute(name = "ResResponseType")
    protected TransactionStatusType resResponseType;

    public ArrayOfSourceType getPOS() {
        return pos;
    }

    public void setPOS(ArrayOfSourceType value) {
        this.pos = value;
    }

    public List<Object> getErrorsOrWarningsOrHotelReservations() {
        if (errorsOrWarningsOrHotelReservations == null) {
            errorsOrWarningsOrHotelReservations = new ArrayList<Object>();
        }
        return this.errorsOrWarningsOrHotelReservations;
    }

    public String getEchoToken() {
        return echoToken;
    }

    public void setEchoToken(String value) {
        this.echoToken = value;
    }

    public XMLGregorianCalendar getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(XMLGregorianCalendar value) {
        this.timeStamp = value;
    }

    public String getTarget() {
        return target;
    }

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
     * ��ȡresResponseType���Ե�ֵ��
     *
     * @return possible object is
     * {@link TransactionStatusType }
     */
    public TransactionStatusType getResResponseType() {
        return resResponseType;
    }

    /**
     * ����resResponseType���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link TransactionStatusType }
     */
    public void setResResponseType(TransactionStatusType value) {
        this.resResponseType = value;
    }

}
