package pms.order;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;
import java.math.BigInteger;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"pos", "availRequestSegments", "hotelReservationIDs"})
@XmlRootElement(name = "OTA_HotelAvailRQ")
public class OTAHotelAvailRQ {
    @XmlElement(name = "POS")
    protected ArrayOfSourceType pos;
    @XmlElement(name = "AvailRequestSegments")
    protected OTAHotelAvailRQ.AvailRequestSegments availRequestSegments;
    @XmlElement(name = "HotelReservationIDs")
    protected ArrayOfHotelReservationIDsTypeHotelReservationID hotelReservationIDs;
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
    @XmlAttribute(name = "SummaryOnly")
    protected Boolean summaryOnly;
    @XmlAttribute(name = "SortOrder")
    protected String sortOrder;
    @XmlAttribute(name = "AvailRatesOnly")
    protected Boolean availRatesOnly;
    @XmlAttribute(name = "OnRequestInd")
    protected Boolean onRequestInd;
    @XmlAttribute(name = "BestOnly")
    protected Boolean bestOnly;
    @XmlAttribute(name = "RateRangeOnly")
    protected Boolean rateRangeOnly;
    @XmlAttribute(name = "ExactMatchOnly")
    protected Boolean exactMatchOnly;
    @XmlAttribute(name = "AllowPartialAvail")
    protected Boolean allowPartialAvail;
    @XmlAttribute(name = "RequestedCurrency")
    protected String requestedCurrency;
    @XmlAttribute(name = "RequestedCurrencyIndicator")
    protected Boolean requestedCurrencyIndicator;
    @XmlAttribute(name = "IsModify")
    protected Boolean isModify;
    @XmlAttribute(name = "MaxResponses")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger maxResponses;
    @XmlAttribute(name = "SearchCacheLevel")
    protected String searchCacheLevel;
    @XmlAttribute(name = "HotelStayOnly")
    protected Boolean hotelStayOnly;
    @XmlAttribute(name = "RateDetailsInd")
    protected Boolean rateDetailsInd;
    @XmlAttribute(name = "MapRequired")
    protected Boolean mapRequired;
    @XmlAttribute(name = "MapHeight")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger mapHeight;
    @XmlAttribute(name = "MapWidth")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger mapWidth;
    @XmlAttribute(name = "DuplicateInd")
    protected Boolean duplicateInd;
    @XmlAttribute(name = "PricingMethod")
    protected String pricingMethod;

    /**
     * ��ȡpos���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArrayOfSourceType }
     */
    public ArrayOfSourceType getPOS() {
        return pos;
    }

    /**
     * ����pos���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArrayOfSourceType }
     */
    public void setPOS(ArrayOfSourceType value) {
        this.pos = value;
    }

    /**
     * ��ȡavailRequestSegments���Ե�ֵ��
     *
     * @return possible object is
     * {@link OTAHotelAvailRQ.AvailRequestSegments }
     */
    public OTAHotelAvailRQ.AvailRequestSegments getAvailRequestSegments() {
        return availRequestSegments;
    }

    /**
     * ����availRequestSegments���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link OTAHotelAvailRQ.AvailRequestSegments }
     */
    public void setAvailRequestSegments(OTAHotelAvailRQ.AvailRequestSegments value) {
        this.availRequestSegments = value;
    }

    /**
     * ��ȡhotelReservationIDs���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArrayOfHotelReservationIDsTypeHotelReservationID }
     */
    public ArrayOfHotelReservationIDsTypeHotelReservationID getHotelReservationIDs() {
        return hotelReservationIDs;
    }

    /**
     * ����hotelReservationIDs���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArrayOfHotelReservationIDsTypeHotelReservationID }
     */
    public void setHotelReservationIDs(ArrayOfHotelReservationIDsTypeHotelReservationID value) {
        this.hotelReservationIDs = value;
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
     * ��ȡsummaryOnly���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isSummaryOnly() {
        return summaryOnly;
    }

    /**
     * ����summaryOnly���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setSummaryOnly(Boolean value) {
        this.summaryOnly = value;
    }

    /**
     * ��ȡsortOrder���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getSortOrder() {
        return sortOrder;
    }

    /**
     * ����sortOrder���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSortOrder(String value) {
        this.sortOrder = value;
    }

    /**
     * ��ȡavailRatesOnly���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isAvailRatesOnly() {
        return availRatesOnly;
    }

    /**
     * ����availRatesOnly���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setAvailRatesOnly(Boolean value) {
        this.availRatesOnly = value;
    }

    /**
     * ��ȡonRequestInd���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isOnRequestInd() {
        return onRequestInd;
    }

    /**
     * ����onRequestInd���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setOnRequestInd(Boolean value) {
        this.onRequestInd = value;
    }

    /**
     * ��ȡbestOnly���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isBestOnly() {
        return bestOnly;
    }

    /**
     * ����bestOnly���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setBestOnly(Boolean value) {
        this.bestOnly = value;
    }

    /**
     * ��ȡrateRangeOnly���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isRateRangeOnly() {
        return rateRangeOnly;
    }

    /**
     * ����rateRangeOnly���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setRateRangeOnly(Boolean value) {
        this.rateRangeOnly = value;
    }

    /**
     * ��ȡexactMatchOnly���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isExactMatchOnly() {
        return exactMatchOnly;
    }

    /**
     * ����exactMatchOnly���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setExactMatchOnly(Boolean value) {
        this.exactMatchOnly = value;
    }

    /**
     * ��ȡallowPartialAvail���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isAllowPartialAvail() {
        return allowPartialAvail;
    }

    /**
     * ����allowPartialAvail���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setAllowPartialAvail(Boolean value) {
        this.allowPartialAvail = value;
    }

    /**
     * ��ȡrequestedCurrency���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getRequestedCurrency() {
        return requestedCurrency;
    }

    /**
     * ����requestedCurrency���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRequestedCurrency(String value) {
        this.requestedCurrency = value;
    }

    /**
     * ��ȡrequestedCurrencyIndicator���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isRequestedCurrencyIndicator() {
        return requestedCurrencyIndicator;
    }

    /**
     * ����requestedCurrencyIndicator���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setRequestedCurrencyIndicator(Boolean value) {
        this.requestedCurrencyIndicator = value;
    }

    /**
     * ��ȡisModify���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isIsModify() {
        return isModify;
    }

    /**
     * ����isModify���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setIsModify(Boolean value) {
        this.isModify = value;
    }

    /**
     * ��ȡmaxResponses���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getMaxResponses() {
        return maxResponses;
    }

    /**
     * ����maxResponses���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setMaxResponses(BigInteger value) {
        this.maxResponses = value;
    }

    /**
     * ��ȡsearchCacheLevel���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getSearchCacheLevel() {
        return searchCacheLevel;
    }

    /**
     * ����searchCacheLevel���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSearchCacheLevel(String value) {
        this.searchCacheLevel = value;
    }

    /**
     * ��ȡhotelStayOnly���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isHotelStayOnly() {
        return hotelStayOnly;
    }

    /**
     * ����hotelStayOnly���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setHotelStayOnly(Boolean value) {
        this.hotelStayOnly = value;
    }

    /**
     * ��ȡrateDetailsInd���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isRateDetailsInd() {
        return rateDetailsInd;
    }

    /**
     * ����rateDetailsInd���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setRateDetailsInd(Boolean value) {
        this.rateDetailsInd = value;
    }

    /**
     * ��ȡmapRequired���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isMapRequired() {
        return mapRequired;
    }

    /**
     * ����mapRequired���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setMapRequired(Boolean value) {
        this.mapRequired = value;
    }

    /**
     * ��ȡmapHeight���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getMapHeight() {
        return mapHeight;
    }

    /**
     * ����mapHeight���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setMapHeight(BigInteger value) {
        this.mapHeight = value;
    }

    /**
     * ��ȡmapWidth���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getMapWidth() {
        return mapWidth;
    }

    /**
     * ����mapWidth���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setMapWidth(BigInteger value) {
        this.mapWidth = value;
    }

    /**
     * ��ȡduplicateInd���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isDuplicateInd() {
        return duplicateInd;
    }

    /**
     * ����duplicateInd���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setDuplicateInd(Boolean value) {
        this.duplicateInd = value;
    }

    /**
     * ��ȡpricingMethod���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getPricingMethod() {
        return pricingMethod;
    }

    /**
     * ����pricingMethod���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPricingMethod(String value) {
        this.pricingMethod = value;
    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * <p/>
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * <p/>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AvailRequestSegmentsType">
     *       &lt;attribute name="MaximumWaitTime" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AvailRequestSegments
            extends AvailRequestSegmentsType {

        @XmlAttribute(name = "MaximumWaitTime")
        protected BigDecimal maximumWaitTime;

        /**
         * ��ȡmaximumWaitTime���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigDecimal }
         */
        public BigDecimal getMaximumWaitTime() {
            return maximumWaitTime;
        }

        /**
         * ����maximumWaitTime���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigDecimal }
         */
        public void setMaximumWaitTime(BigDecimal value) {
            this.maximumWaitTime = value;
        }

    }

}
