package pms.PMSGateway;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>ArrayOfProfilesTypeProfileInfo complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="ArrayOfProfilesTypeProfileInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProfileInfo" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="Profile" type="{http://www.opentravel.org/OTA/2003/05}ProfileType" minOccurs="0"/>
 *                 &lt;/sequence>
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
@XmlType(name = "ArrayOfProfilesTypeProfileInfo", propOrder = {
        "profileInfo"
})
public class ArrayOfProfilesTypeProfileInfo {

    @XmlElement(name = "ProfileInfo")
    protected List<ArrayOfProfilesTypeProfileInfo.ProfileInfo> profileInfo;

    /**
     * Gets the value of the profileInfo property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the profileInfo property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProfileInfo().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfProfilesTypeProfileInfo.ProfileInfo }
     */
    public List<ArrayOfProfilesTypeProfileInfo.ProfileInfo> getProfileInfo() {
        if (profileInfo == null) {
            profileInfo = new ArrayList<ArrayOfProfilesTypeProfileInfo.ProfileInfo>();
        }
        return this.profileInfo;
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
     *         &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="Profile" type="{http://www.opentravel.org/OTA/2003/05}ProfileType" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
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
         * <p/>
         * <p/>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the uniqueID property.
         * <p/>
         * <p/>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getUniqueID().add(newItem);
         * </pre>
         * <p/>
         * <p/>
         * <p/>
         * Objects of the following type(s) are allowed in the list
         * {@link UniqueIDType }
         */
        public List<UniqueIDType> getUniqueID() {
            if (uniqueID == null) {
                uniqueID = new ArrayList<UniqueIDType>();
            }
            return this.uniqueID;
        }

        /**
         * ��ȡprofile���Ե�ֵ��
         *
         * @return possible object is
         * {@link ProfileType }
         */
        public ProfileType getProfile() {
            return profile;
        }

        /**
         * ����profile���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link ProfileType }
         */
        public void setProfile(ProfileType value) {
            this.profile = value;
        }

    }

}