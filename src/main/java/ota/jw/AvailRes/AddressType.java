
package ota.jw.AvailRes;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>AddressType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AddressType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StreetNmbr" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05&gt;StreetNmbrType"&gt;
 *                 &lt;attribute name="StreetNmbrSuffix" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="StreetDirection" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="RuralRouteNmbr" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BldgRoom" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                 &lt;attribute name="BldgNameIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AddressLine" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="County" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StateProv" type="{http://www.opentravel.org/OTA/2003/05}StateProvType" minOccurs="0"/&gt;
 *         &lt;element name="CountryName" type="{http://www.opentravel.org/OTA/2003/05}CountryNameType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="FormattedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="ShareSynchInd"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Yes"/&gt;
 *             &lt;enumeration value="No"/&gt;
 *             &lt;enumeration value="Inherit"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="ShareMarketInd"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Yes"/&gt;
 *             &lt;enumeration value="No"/&gt;
 *             &lt;enumeration value="Inherit"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Remark" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressType", propOrder = {
    "streetNmbr",
    "bldgRoom",
    "addressLine",
    "cityName",
    "postalCode",
    "county",
    "stateProv",
    "countryName"
})
@XmlSeeAlso({
    ota.jw.AvailRes.ItemSearchCriterionType.Address.class,
    AddressInfoType.class
})
public class AddressType {

    @XmlElement(name = "StreetNmbr")
    protected AddressType.StreetNmbr streetNmbr;
    @XmlElement(name = "BldgRoom")
    protected List<AddressType.BldgRoom> bldgRoom;
    @XmlElement(name = "AddressLine")
    protected List<String> addressLine;
    @XmlElement(name = "CityName")
    protected String cityName;
    @XmlElement(name = "PostalCode")
    protected String postalCode;
    @XmlElement(name = "County")
    protected String county;
    @XmlElement(name = "StateProv")
    protected StateProvType stateProv;
    @XmlElement(name = "CountryName")
    protected CountryNameType countryName;
    @XmlAttribute(name = "FormattedInd")
    protected Boolean formattedInd;
    @XmlAttribute(name = "ShareSynchInd")
    protected String shareSynchInd;
    @XmlAttribute(name = "ShareMarketInd")
    protected String shareMarketInd;
    @XmlAttribute(name = "Type")
    protected String type;
    @XmlAttribute(name = "Remark")
    protected String remark;

    /**
     * 获取streetNmbr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AddressType.StreetNmbr }
     *     
     */
    public AddressType.StreetNmbr getStreetNmbr() {
        return streetNmbr;
    }

    /**
     * 设置streetNmbr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType.StreetNmbr }
     *     
     */
    public void setStreetNmbr(AddressType.StreetNmbr value) {
        this.streetNmbr = value;
    }

    /**
     * Gets the value of the bldgRoom property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bldgRoom property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBldgRoom().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddressType.BldgRoom }
     * 
     * 
     */
    public List<AddressType.BldgRoom> getBldgRoom() {
        if (bldgRoom == null) {
            bldgRoom = new ArrayList<AddressType.BldgRoom>();
        }
        return this.bldgRoom;
    }

    /**
     * Gets the value of the addressLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addressLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddressLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAddressLine() {
        if (addressLine == null) {
            addressLine = new ArrayList<String>();
        }
        return this.addressLine;
    }

    /**
     * 获取cityName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * 设置cityName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityName(String value) {
        this.cityName = value;
    }

    /**
     * 获取postalCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * 设置postalCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * 获取county属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCounty() {
        return county;
    }

    /**
     * 设置county属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCounty(String value) {
        this.county = value;
    }

    /**
     * 获取stateProv属性的值。
     * 
     * @return
     *     possible object is
     *     {@link StateProvType }
     *     
     */
    public StateProvType getStateProv() {
        return stateProv;
    }

    /**
     * 设置stateProv属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link StateProvType }
     *     
     */
    public void setStateProv(StateProvType value) {
        this.stateProv = value;
    }

    /**
     * 获取countryName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CountryNameType }
     *     
     */
    public CountryNameType getCountryName() {
        return countryName;
    }

    /**
     * 设置countryName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CountryNameType }
     *     
     */
    public void setCountryName(CountryNameType value) {
        this.countryName = value;
    }

    /**
     * 获取formattedInd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFormattedInd() {
        return formattedInd;
    }

    /**
     * 设置formattedInd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFormattedInd(Boolean value) {
        this.formattedInd = value;
    }

    /**
     * 获取shareSynchInd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShareSynchInd() {
        return shareSynchInd;
    }

    /**
     * 设置shareSynchInd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShareSynchInd(String value) {
        this.shareSynchInd = value;
    }

    /**
     * 获取shareMarketInd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShareMarketInd() {
        return shareMarketInd;
    }

    /**
     * 设置shareMarketInd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShareMarketInd(String value) {
        this.shareMarketInd = value;
    }

    /**
     * 获取type属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * 设置type属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * 获取remark属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置remark属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemark(String value) {
        this.remark = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *       &lt;attribute name="BldgNameIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class BldgRoom {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "BldgNameIndicator")
        protected Boolean bldgNameIndicator;

        /**
         * 获取value属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * 设置value属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * 获取bldgNameIndicator属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isBldgNameIndicator() {
            return bldgNameIndicator;
        }

        /**
         * 设置bldgNameIndicator属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setBldgNameIndicator(Boolean value) {
            this.bldgNameIndicator = value;
        }

    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05&gt;StreetNmbrType"&gt;
     *       &lt;attribute name="StreetNmbrSuffix" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="StreetDirection" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="RuralRouteNmbr" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class StreetNmbr
        extends StreetNmbrType
    {

        @XmlAttribute(name = "StreetNmbrSuffix")
        protected String streetNmbrSuffix;
        @XmlAttribute(name = "StreetDirection")
        protected String streetDirection;
        @XmlAttribute(name = "RuralRouteNmbr")
        protected String ruralRouteNmbr;

        /**
         * 获取streetNmbrSuffix属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStreetNmbrSuffix() {
            return streetNmbrSuffix;
        }

        /**
         * 设置streetNmbrSuffix属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStreetNmbrSuffix(String value) {
            this.streetNmbrSuffix = value;
        }

        /**
         * 获取streetDirection属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStreetDirection() {
            return streetDirection;
        }

        /**
         * 设置streetDirection属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStreetDirection(String value) {
            this.streetDirection = value;
        }

        /**
         * 获取ruralRouteNmbr属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRuralRouteNmbr() {
            return ruralRouteNmbr;
        }

        /**
         * 设置ruralRouteNmbr属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRuralRouteNmbr(String value) {
            this.ruralRouteNmbr = value;
        }

    }

}
