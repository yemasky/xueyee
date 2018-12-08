package pms.order;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>AreasType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="AreasType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Area" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AreaDescription" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="AreaID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="CityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="StateProvCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "AreasType", propOrder = {
        "area"
})
public class AreasType {

    @XmlElement(name = "Area")
    protected List<AreasType.Area> area;

    /**
     * Gets the value of the area property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the area property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArea().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link AreasType.Area }
     */
    public List<AreasType.Area> getArea() {
        if (area == null) {
            area = new ArrayList<AreasType.Area>();
        }
        return this.area;
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
     *         &lt;element name="AreaDescription" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="AreaID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="CityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="StateProvCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "areaDescription"
    })
    public static class Area {

        @XmlElement(name = "AreaDescription")
        protected ParagraphType areaDescription;
        @XmlAttribute(name = "AreaID")
        protected String areaID;
        @XmlAttribute(name = "CityCode")
        protected String cityCode;
        @XmlAttribute(name = "StateProvCode")
        protected String stateProvCode;
        @XmlAttribute(name = "CountryCode")
        protected String countryCode;

        /**
         * ��ȡareaDescription���Ե�ֵ��
         *
         * @return possible object is
         * {@link ParagraphType }
         */
        public ParagraphType getAreaDescription() {
            return areaDescription;
        }

        /**
         * ����areaDescription���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link ParagraphType }
         */
        public void setAreaDescription(ParagraphType value) {
            this.areaDescription = value;
        }

        /**
         * ��ȡareaID���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getAreaID() {
            return areaID;
        }

        /**
         * ����areaID���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setAreaID(String value) {
            this.areaID = value;
        }

        /**
         * ��ȡcityCode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getCityCode() {
            return cityCode;
        }

        /**
         * ����cityCode���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setCityCode(String value) {
            this.cityCode = value;
        }

        /**
         * ��ȡstateProvCode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getStateProvCode() {
            return stateProvCode;
        }

        /**
         * ����stateProvCode���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setStateProvCode(String value) {
            this.stateProvCode = value;
        }

        /**
         * ��ȡcountryCode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getCountryCode() {
            return countryCode;
        }

        /**
         * ����countryCode���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setCountryCode(String value) {
            this.countryCode = value;
        }

    }

}
