package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>CruiseProfileType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="CruiseProfileType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CruiseProfile" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="MaxQuantity" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="ProfileTypeIdentifier" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Modifiable"/>
 *             &lt;enumeration value="NotModifiable"/>
 *             &lt;enumeration value="Maximums"/>
 *             &lt;enumeration value="Mandatory"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
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
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cruiseProfile property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCruiseProfile().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link CruiseProfileType.CruiseProfile }
     */
    public List<CruiseProfileType.CruiseProfile> getCruiseProfile() {
        if (cruiseProfile == null) {
            cruiseProfile = new ArrayList<CruiseProfileType.CruiseProfile>();
        }
        return this.cruiseProfile;
    }

    /**
     * ��ȡprofileTypeIdentifier���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getProfileTypeIdentifier() {
        return profileTypeIdentifier;
    }

    /**
     * ����profileTypeIdentifier���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setProfileTypeIdentifier(String value) {
        this.profileTypeIdentifier = value;
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
     *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="MaxQuantity" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CruiseProfile {

        @XmlAttribute(name = "Code")
        protected String code;
        @XmlAttribute(name = "MaxQuantity")
        protected String maxQuantity;

        /**
         * ��ȡcode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getCode() {
            return code;
        }

        /**
         * ����code���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setCode(String value) {
            this.code = value;
        }

        /**
         * ��ȡmaxQuantity���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getMaxQuantity() {
            return maxQuantity;
        }

        /**
         * ����maxQuantity���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setMaxQuantity(String value) {
            this.maxQuantity = value;
        }

    }

}
