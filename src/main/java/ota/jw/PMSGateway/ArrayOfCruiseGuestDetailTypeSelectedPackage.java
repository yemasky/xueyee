
package ota.jw.PMSGateway;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfCruiseGuestDetailTypeSelectedPackage complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCruiseGuestDetailTypeSelectedPackage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SelectedPackage" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}CruisePackageType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="AirInfo" type="{http://www.opentravel.org/OTA/2003/05}AirInfoType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/extension&gt;
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
@XmlType(name = "ArrayOfCruiseGuestDetailTypeSelectedPackage", propOrder = {
    "selectedPackage"
})
public class ArrayOfCruiseGuestDetailTypeSelectedPackage {

    @XmlElement(name = "SelectedPackage")
    protected List<ArrayOfCruiseGuestDetailTypeSelectedPackage.SelectedPackage> selectedPackage;

    /**
     * Gets the value of the selectedPackage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectedPackage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectedPackage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfCruiseGuestDetailTypeSelectedPackage.SelectedPackage }
     * 
     * 
     */
    public List<ArrayOfCruiseGuestDetailTypeSelectedPackage.SelectedPackage> getSelectedPackage() {
        if (selectedPackage == null) {
            selectedPackage = new ArrayList<ArrayOfCruiseGuestDetailTypeSelectedPackage.SelectedPackage>();
        }
        return this.selectedPackage;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}CruisePackageType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="AirInfo" type="{http://www.opentravel.org/OTA/2003/05}AirInfoType" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "airInfo"
    })
    public static class SelectedPackage
        extends CruisePackageType
    {

        @XmlElement(name = "AirInfo")
        protected AirInfoType airInfo;

        /**
         * 获取airInfo属性的值。
         * 
         * @return
         *     possible object is
         *     {@link AirInfoType }
         *     
         */
        public AirInfoType getAirInfo() {
            return airInfo;
        }

        /**
         * 设置airInfo属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link AirInfoType }
         *     
         */
        public void setAirInfo(AirInfoType value) {
            this.airInfo = value;
        }

    }

}
