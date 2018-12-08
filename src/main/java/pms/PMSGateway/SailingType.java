package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>SailingType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="SailingType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}SailingInfoType">
 *       &lt;sequence>
 *         &lt;element name="Dining" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Sitting" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Transportation" type="{http://www.opentravel.org/OTA/2003/05}GuestTransportationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Information" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="MaxCabinOccupancy" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="CategoryLocation" type="{http://www.opentravel.org/OTA/2003/05}CategoryLocationType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SailingType", propOrder = {
        "dining",
        "transportation",
        "information"
})
public class SailingType
        extends SailingInfoType {

    @XmlElement(name = "Dining")
    protected List<SailingType.Dining> dining;
    @XmlElement(name = "Transportation")
    protected List<GuestTransportationType> transportation;
    @XmlElement(name = "Information")
    protected List<ParagraphType> information;
    @XmlAttribute(name = "MaxCabinOccupancy")
    protected BigInteger maxCabinOccupancy;
    @XmlAttribute(name = "CategoryLocation")
    protected CategoryLocationType categoryLocation;

    /**
     * Gets the value of the dining property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dining property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDining().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link SailingType.Dining }
     */
    public List<SailingType.Dining> getDining() {
        if (dining == null) {
            dining = new ArrayList<SailingType.Dining>();
        }
        return this.dining;
    }

    /**
     * Gets the value of the transportation property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transportation property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransportation().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link GuestTransportationType }
     */
    public List<GuestTransportationType> getTransportation() {
        if (transportation == null) {
            transportation = new ArrayList<GuestTransportationType>();
        }
        return this.transportation;
    }

    /**
     * Gets the value of the information property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the information property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInformation().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link ParagraphType }
     */
    public List<ParagraphType> getInformation() {
        if (information == null) {
            information = new ArrayList<ParagraphType>();
        }
        return this.information;
    }

    /**
     * ��ȡmaxCabinOccupancy���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getMaxCabinOccupancy() {
        return maxCabinOccupancy;
    }

    /**
     * ����maxCabinOccupancy���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setMaxCabinOccupancy(BigInteger value) {
        this.maxCabinOccupancy = value;
    }

    /**
     * ��ȡcategoryLocation���Ե�ֵ��
     *
     * @return possible object is
     * {@link CategoryLocationType }
     */
    public CategoryLocationType getCategoryLocation() {
        return categoryLocation;
    }

    /**
     * ����categoryLocation���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link CategoryLocationType }
     */
    public void setCategoryLocation(CategoryLocationType value) {
        this.categoryLocation = value;
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
     *       &lt;attribute name="Sitting" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Dining {

        @XmlAttribute(name = "Sitting")
        protected String sitting;
        @XmlAttribute(name = "Status")
        protected String status;

        /**
         * ��ȡsitting���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getSitting() {
            return sitting;
        }

        /**
         * ����sitting���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setSitting(String value) {
            this.sitting = value;
        }

        /**
         * ��ȡstatus���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getStatus() {
            return status;
        }

        /**
         * ����status���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setStatus(String value) {
            this.status = value;
        }

    }

}
