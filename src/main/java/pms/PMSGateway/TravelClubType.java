package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>TravelClubType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="TravelClubType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TravelClubName" type="{http://www.opentravel.org/OTA/2003/05}CompanyNameType" minOccurs="0"/>
 *         &lt;element name="ClubMemberName" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PersonNameType">
 *                 &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="ShareSynchInd">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Yes"/>
 *             &lt;enumeration value="No"/>
 *             &lt;enumeration value="Inherit"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="ShareMarketInd">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Yes"/>
 *             &lt;enumeration value="No"/>
 *             &lt;enumeration value="Inherit"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="ExpireDateExclusiveIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelClubType", propOrder = {
        "travelClubName",
        "clubMemberName"
})
public class TravelClubType {

    @XmlElement(name = "TravelClubName")
    protected CompanyNameType travelClubName;
    @XmlElement(name = "ClubMemberName")
    protected TravelClubType.ClubMemberName clubMemberName;
    @XmlAttribute(name = "ShareSynchInd")
    protected String shareSynchInd;
    @XmlAttribute(name = "ShareMarketInd")
    protected String shareMarketInd;
    @XmlAttribute(name = "EffectiveDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveDate;
    @XmlAttribute(name = "ExpireDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expireDate;
    @XmlAttribute(name = "ExpireDateExclusiveIndicator")
    protected Boolean expireDateExclusiveIndicator;

    /**
     * ��ȡtravelClubName���Ե�ֵ��
     *
     * @return possible object is
     * {@link CompanyNameType }
     */
    public CompanyNameType getTravelClubName() {
        return travelClubName;
    }

    /**
     * ����travelClubName���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link CompanyNameType }
     */
    public void setTravelClubName(CompanyNameType value) {
        this.travelClubName = value;
    }

    /**
     * ��ȡclubMemberName���Ե�ֵ��
     *
     * @return possible object is
     * {@link TravelClubType.ClubMemberName }
     */
    public TravelClubType.ClubMemberName getClubMemberName() {
        return clubMemberName;
    }

    /**
     * ����clubMemberName���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link TravelClubType.ClubMemberName }
     */
    public void setClubMemberName(TravelClubType.ClubMemberName value) {
        this.clubMemberName = value;
    }

    /**
     * ��ȡshareSynchInd���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getShareSynchInd() {
        return shareSynchInd;
    }

    /**
     * ����shareSynchInd���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setShareSynchInd(String value) {
        this.shareSynchInd = value;
    }

    /**
     * ��ȡshareMarketInd���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getShareMarketInd() {
        return shareMarketInd;
    }

    /**
     * ����shareMarketInd���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setShareMarketInd(String value) {
        this.shareMarketInd = value;
    }

    /**
     * ��ȡeffectiveDate���Ե�ֵ��
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * ����effectiveDate���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setEffectiveDate(XMLGregorianCalendar value) {
        this.effectiveDate = value;
    }

    /**
     * ��ȡexpireDate���Ե�ֵ��
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getExpireDate() {
        return expireDate;
    }

    /**
     * ����expireDate���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setExpireDate(XMLGregorianCalendar value) {
        this.expireDate = value;
    }

    /**
     * ��ȡexpireDateExclusiveIndicator���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isExpireDateExclusiveIndicator() {
        return expireDateExclusiveIndicator;
    }

    /**
     * ����expireDateExclusiveIndicator���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setExpireDateExclusiveIndicator(Boolean value) {
        this.expireDateExclusiveIndicator = value;
    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * <p/>
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * <p/>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PersonNameType">
     *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ClubMemberName
            extends PersonNameType {

        @XmlAttribute(name = "ID")
        protected String id;

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
