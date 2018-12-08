
package ota.jw.AvailRes;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfProfilesTypeProfileInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfProfilesTypeProfileInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProfileInfo" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="Profile" type="{http://www.opentravel.org/OTA/2003/05}ProfileType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfProfilesTypeProfileInfo", propOrder = {
    "profileInfo"
})
public class ArrayOfProfilesTypeProfileInfo {

    @XmlElement(name = "ProfileInfo")
    protected List<ArrayOfProfilesTypeProfileInfo.ProfileInfo> profileInfo;

    /**
     * Gets the value of the profileInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the profileInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProfileInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfProfilesTypeProfileInfo.ProfileInfo }
     * 
     * 
     */
    public List<ArrayOfProfilesTypeProfileInfo.ProfileInfo> getProfileInfo() {
        if (profileInfo == null) {
            profileInfo = new ArrayList<ArrayOfProfilesTypeProfileInfo.ProfileInfo>();
        }
        return this.profileInfo;
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
     *       &lt;sequence&gt;
     *         &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="Profile" type="{http://www.opentravel.org/OTA/2003/05}ProfileType" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "uniqueID",
        "profile"
    })
    public static class ProfileInfo {

        @XmlElement(name = "UniqueID")
        protected List<UniqueIDType> uniqueID;
        @XmlElement(name = "Profile")
        protected ProfileType profile;

        /**
         * Gets the value of the uniqueID property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the uniqueID property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getUniqueID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link UniqueIDType }
         * 
         * 
         */
        public List<UniqueIDType> getUniqueID() {
            if (uniqueID == null) {
                uniqueID = new ArrayList<UniqueIDType>();
            }
            return this.uniqueID;
        }

        /**
         * 获取profile属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ProfileType }
         *     
         */
        public ProfileType getProfile() {
            return profile;
        }

        /**
         * 设置profile属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ProfileType }
         *     
         */
        public void setProfile(ProfileType value) {
            this.profile = value;
        }

    }

}
