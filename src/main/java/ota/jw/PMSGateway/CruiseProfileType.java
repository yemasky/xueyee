
package ota.jw.PMSGateway;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CruiseProfileType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CruiseProfileType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CruiseProfile" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="MaxQuantity" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ProfileTypeIdentifier" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Modifiable"/&gt;
 *             &lt;enumeration value="NotModifiable"/&gt;
 *             &lt;enumeration value="Maximums"/&gt;
 *             &lt;enumeration value="Mandatory"/&gt;
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
@XmlType(name = "CruiseProfileType", propOrder = {
    "cruiseProfile"
})
public class CruiseProfileType {

    @XmlElement(name = "CruiseProfile")
    protected List<CruiseProfileType.CruiseProfile> cruiseProfile;
    @XmlAttribute(name = "ProfileTypeIdentifier", required = true)
    protected String profileTypeIdentifier;

    /**
     * Gets the value of the cruiseProfile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cruiseProfile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCruiseProfile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CruiseProfileType.CruiseProfile }
     * 
     * 
     */
    public List<CruiseProfileType.CruiseProfile> getCruiseProfile() {
        if (cruiseProfile == null) {
            cruiseProfile = new ArrayList<CruiseProfileType.CruiseProfile>();
        }
        return this.cruiseProfile;
    }

    /**
     * 获取profileTypeIdentifier属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileTypeIdentifier() {
        return profileTypeIdentifier;
    }

    /**
     * 设置profileTypeIdentifier属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileTypeIdentifier(String value) {
        this.profileTypeIdentifier = value;
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
     *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="MaxQuantity" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CruiseProfile {

        @XmlAttribute(name = "Code")
        protected String code;
        @XmlAttribute(name = "MaxQuantity")
        protected String maxQuantity;

        /**
         * 获取code属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCode() {
            return code;
        }

        /**
         * 设置code属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCode(String value) {
            this.code = value;
        }

        /**
         * 获取maxQuantity属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMaxQuantity() {
            return maxQuantity;
        }

        /**
         * 设置maxQuantity属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMaxQuantity(String value) {
            this.maxQuantity = value;
        }

    }

}
