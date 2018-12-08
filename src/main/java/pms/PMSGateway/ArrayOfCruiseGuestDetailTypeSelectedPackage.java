package pms.PMSGateway;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>ArrayOfCruiseGuestDetailTypeSelectedPackage complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="ArrayOfCruiseGuestDetailTypeSelectedPackage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SelectedPackage" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}CruisePackageType">
 *                 &lt;sequence>
 *                   &lt;element name="AirInfo" type="{http://www.opentravel.org/OTA/2003/05}AirInfoType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
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
@XmlType(name = "ArrayOfCruiseGuestDetailTypeSelectedPackage", propOrder = {
        "selectedPackage"
})
public class ArrayOfCruiseGuestDetailTypeSelectedPackage {

    @XmlElement(name = "SelectedPackage")
    protected List<ArrayOfCruiseGuestDetailTypeSelectedPackage.SelectedPackage> selectedPackage;

    /**
     * Gets the value of the selectedPackage property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectedPackage property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectedPackage().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfCruiseGuestDetailTypeSelectedPackage.SelectedPackage }
     */
    public List<ArrayOfCruiseGuestDetailTypeSelectedPackage.SelectedPackage> getSelectedPackage() {
        if (selectedPackage == null) {
            selectedPackage = new ArrayList<ArrayOfCruiseGuestDetailTypeSelectedPackage.SelectedPackage>();
        }
        return this.selectedPackage;
    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * <p/>
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * <p/>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}CruisePackageType">
     *       &lt;sequence>
     *         &lt;element name="AirInfo" type="{http://www.opentravel.org/OTA/2003/05}AirInfoType" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "airInfo"
    })
    public static class SelectedPackage
            extends CruisePackageType {

        @XmlElement(name = "AirInfo")
        protected AirInfoType airInfo;

        /**
         * ��ȡairInfo���Ե�ֵ��
         *
         * @return possible object is
         * {@link AirInfoType }
         */
        public AirInfoType getAirInfo() {
            return airInfo;
        }

        /**
         * ����airInfo���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link AirInfoType }
         */
        public void setAirInfo(AirInfoType value) {
            this.airInfo = value;
        }

    }

}
