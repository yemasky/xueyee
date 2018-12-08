
package ota.jw.PMSGateway;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AffiliationsType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AffiliationsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Organization" type="{http://www.opentravel.org/OTA/2003/05}OrganizationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Employer" type="{http://www.opentravel.org/OTA/2003/05}EmployerType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TravelArranger" type="{http://www.opentravel.org/OTA/2003/05}TravelArrangerType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TravelClub" type="{http://www.opentravel.org/OTA/2003/05}TravelClubType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Insurance" type="{http://www.opentravel.org/OTA/2003/05}InsuranceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TPA_Extensions" type="{http://www.opentravel.org/OTA/2003/05}TPA_ExtensionsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
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
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AffiliationsType", propOrder = {
    "organization",
    "employer",
    "travelArranger",
    "travelClub",
    "insurance",
    "tpaExtensions"
})
public class AffiliationsType {

    @XmlElement(name = "Organization")
    protected List<OrganizationType> organization;
    @XmlElement(name = "Employer")
    protected List<EmployerType> employer;
    @XmlElement(name = "TravelArranger")
    protected List<TravelArrangerType> travelArranger;
    @XmlElement(name = "TravelClub")
    protected List<TravelClubType> travelClub;
    @XmlElement(name = "Insurance")
    protected List<InsuranceType> insurance;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType tpaExtensions;
    @XmlAttribute(name = "ShareSynchInd")
    protected String shareSynchInd;
    @XmlAttribute(name = "ShareMarketInd")
    protected String shareMarketInd;

    /**
     * Gets the value of the organization property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organization property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganization().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganizationType }
     * 
     * 
     */
    public List<OrganizationType> getOrganization() {
        if (organization == null) {
            organization = new ArrayList<OrganizationType>();
        }
        return this.organization;
    }

    /**
     * Gets the value of the employer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the employer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmployer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmployerType }
     * 
     * 
     */
    public List<EmployerType> getEmployer() {
        if (employer == null) {
            employer = new ArrayList<EmployerType>();
        }
        return this.employer;
    }

    /**
     * Gets the value of the travelArranger property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the travelArranger property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTravelArranger().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TravelArrangerType }
     * 
     * 
     */
    public List<TravelArrangerType> getTravelArranger() {
        if (travelArranger == null) {
            travelArranger = new ArrayList<TravelArrangerType>();
        }
        return this.travelArranger;
    }

    /**
     * Gets the value of the travelClub property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the travelClub property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTravelClub().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TravelClubType }
     * 
     * 
     */
    public List<TravelClubType> getTravelClub() {
        if (travelClub == null) {
            travelClub = new ArrayList<TravelClubType>();
        }
        return this.travelClub;
    }

    /**
     * Gets the value of the insurance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the insurance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInsurance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InsuranceType }
     * 
     * 
     */
    public List<InsuranceType> getInsurance() {
        if (insurance == null) {
            insurance = new ArrayList<InsuranceType>();
        }
        return this.insurance;
    }

    /**
     * 获取tpaExtensions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TPAExtensionsType }
     *     
     */
    public TPAExtensionsType getTPAExtensions() {
        return tpaExtensions;
    }

    /**
     * 设置tpaExtensions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TPAExtensionsType }
     *     
     */
    public void setTPAExtensions(TPAExtensionsType value) {
        this.tpaExtensions = value;
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

}
