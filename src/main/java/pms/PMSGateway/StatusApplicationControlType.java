package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>StatusApplicationControlType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="StatusApplicationControlType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DestinationSystemCodes" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfDestinationSystemCodesTypeDestinationSystemCode" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Mon" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Tue" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="InvTypeCode">
 *         &lt;simpleType>
 *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Weds" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Thur" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Fri" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Sat" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Sun" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="RatePlanCodeType">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="DoesNotApply"/>
 *             &lt;enumeration value="RatePlanCode"/>
 *             &lt;enumeration value="RatePlanGroupingCode"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="RateTier" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AllRateCode" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="AllInvCode" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="InvBlockCodeApply">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="DoesNotApply"/>
 *             &lt;enumeration value="BlockCode"/>
 *             &lt;enumeration value="BlockGroupingCode"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="InvBlockCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Override" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="QuoteID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SubBlockCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RatePlanCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="WingIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusApplicationControlType", propOrder = {
        "destinationSystemCodes"
})
public class StatusApplicationControlType {

    @XmlElement(name = "DestinationSystemCodes")
    protected ArrayOfDestinationSystemCodesTypeDestinationSystemCode destinationSystemCodes;
    @XmlAttribute(name = "Mon")
    protected Boolean mon;
    @XmlAttribute(name = "Tue")
    protected Boolean tue;
    @XmlAttribute(name = "InvTypeCode")
    protected List<String> invTypeCode;
    @XmlAttribute(name = "Start")
    protected String start;
    @XmlAttribute(name = "End")
    protected String end;
    @XmlAttribute(name = "Weds")
    protected Boolean weds;
    @XmlAttribute(name = "Thur")
    protected Boolean thur;
    @XmlAttribute(name = "Fri")
    protected Boolean fri;
    @XmlAttribute(name = "Sat")
    protected Boolean sat;
    @XmlAttribute(name = "Sun")
    protected Boolean sun;
    @XmlAttribute(name = "RatePlanCodeType")
    protected String ratePlanCodeType;
    @XmlAttribute(name = "RateTier")
    protected String rateTier;
    @XmlAttribute(name = "AllRateCode")
    protected Boolean allRateCode;
    @XmlAttribute(name = "AllInvCode")
    protected Boolean allInvCode;
    @XmlAttribute(name = "InvBlockCodeApply")
    protected String invBlockCodeApply;
    @XmlAttribute(name = "InvBlockCode")
    protected String invBlockCode;
    @XmlAttribute(name = "Override")
    protected Boolean override;
    @XmlAttribute(name = "QuoteID")
    protected String quoteID;
    @XmlAttribute(name = "SubBlockCode")
    protected String subBlockCode;
    @XmlAttribute(name = "RatePlanCode")
    protected String ratePlanCode;
    @XmlAttribute(name = "WingIdentifier")
    protected String wingIdentifier;

    /**
     * ��ȡdestinationSystemCodes���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArrayOfDestinationSystemCodesTypeDestinationSystemCode }
     */
    public ArrayOfDestinationSystemCodesTypeDestinationSystemCode getDestinationSystemCodes() {
        return destinationSystemCodes;
    }

    /**
     * ����destinationSystemCodes���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArrayOfDestinationSystemCodesTypeDestinationSystemCode }
     */
    public void setDestinationSystemCodes(ArrayOfDestinationSystemCodesTypeDestinationSystemCode value) {
        this.destinationSystemCodes = value;
    }

    /**
     * ��ȡmon���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isMon() {
        return mon;
    }

    /**
     * ����mon���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setMon(Boolean value) {
        this.mon = value;
    }

    /**
     * ��ȡtue���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isTue() {
        return tue;
    }

    /**
     * ����tue���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setTue(Boolean value) {
        this.tue = value;
    }

    /**
     * Gets the value of the invTypeCode property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invTypeCode property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvTypeCode().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     */
    public List<String> getInvTypeCode() {
        if (invTypeCode == null) {
            invTypeCode = new ArrayList<String>();
        }
        return this.invTypeCode;
    }

    /**
     * ��ȡstart���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getStart() {
        return start;
    }

    /**
     * ����start���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setStart(String value) {
        this.start = value;
    }

    /**
     * ��ȡend���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getEnd() {
        return end;
    }

    /**
     * ����end���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEnd(String value) {
        this.end = value;
    }

    /**
     * ��ȡweds���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isWeds() {
        return weds;
    }

    /**
     * ����weds���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setWeds(Boolean value) {
        this.weds = value;
    }

    /**
     * ��ȡthur���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isThur() {
        return thur;
    }

    /**
     * ����thur���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setThur(Boolean value) {
        this.thur = value;
    }

    /**
     * ��ȡfri���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isFri() {
        return fri;
    }

    /**
     * ����fri���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setFri(Boolean value) {
        this.fri = value;
    }

    /**
     * ��ȡsat���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isSat() {
        return sat;
    }

    /**
     * ����sat���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setSat(Boolean value) {
        this.sat = value;
    }

    /**
     * ��ȡsun���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isSun() {
        return sun;
    }

    /**
     * ����sun���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setSun(Boolean value) {
        this.sun = value;
    }

    /**
     * ��ȡratePlanCodeType���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getRatePlanCodeType() {
        return ratePlanCodeType;
    }

    /**
     * ����ratePlanCodeType���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRatePlanCodeType(String value) {
        this.ratePlanCodeType = value;
    }

    /**
     * ��ȡrateTier���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getRateTier() {
        return rateTier;
    }

    /**
     * ����rateTier���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRateTier(String value) {
        this.rateTier = value;
    }

    /**
     * ��ȡallRateCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isAllRateCode() {
        return allRateCode;
    }

    /**
     * ����allRateCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setAllRateCode(Boolean value) {
        this.allRateCode = value;
    }

    /**
     * ��ȡallInvCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isAllInvCode() {
        return allInvCode;
    }

    /**
     * ����allInvCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setAllInvCode(Boolean value) {
        this.allInvCode = value;
    }

    /**
     * ��ȡinvBlockCodeApply���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getInvBlockCodeApply() {
        return invBlockCodeApply;
    }

    /**
     * ����invBlockCodeApply���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setInvBlockCodeApply(String value) {
        this.invBlockCodeApply = value;
    }

    /**
     * ��ȡinvBlockCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getInvBlockCode() {
        return invBlockCode;
    }

    /**
     * ����invBlockCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setInvBlockCode(String value) {
        this.invBlockCode = value;
    }

    /**
     * ��ȡoverride���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isOverride() {
        return override;
    }

    /**
     * ����override���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setOverride(Boolean value) {
        this.override = value;
    }

    /**
     * ��ȡquoteID���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getQuoteID() {
        return quoteID;
    }

    /**
     * ����quoteID���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setQuoteID(String value) {
        this.quoteID = value;
    }

    /**
     * ��ȡsubBlockCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getSubBlockCode() {
        return subBlockCode;
    }

    /**
     * ����subBlockCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSubBlockCode(String value) {
        this.subBlockCode = value;
    }

    /**
     * ��ȡratePlanCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getRatePlanCode() {
        return ratePlanCode;
    }

    /**
     * ����ratePlanCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRatePlanCode(String value) {
        this.ratePlanCode = value;
    }

    /**
     * ��ȡwingIdentifier���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getWingIdentifier() {
        return wingIdentifier;
    }

    /**
     * ����wingIdentifier���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setWingIdentifier(String value) {
        this.wingIdentifier = value;
    }

}
