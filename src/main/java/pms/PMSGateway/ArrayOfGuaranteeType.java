package pms.PMSGateway;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>ArrayOfGuaranteeType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="ArrayOfGuaranteeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GuaranteePolicy" type="{http://www.opentravel.org/OTA/2003/05}GuaranteeType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfGuaranteeType", propOrder = {
        "guaranteePolicy"
})
public class ArrayOfGuaranteeType {

    @XmlElement(name = "GuaranteePolicy")
    protected List<GuaranteeType> guaranteePolicy;

    /**
     * Gets the value of the guaranteePolicy property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guaranteePolicy property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuaranteePolicy().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link GuaranteeType }
     */
    public List<GuaranteeType> getGuaranteePolicy() {
        if (guaranteePolicy == null) {
            guaranteePolicy = new ArrayList<GuaranteeType>();
        }
        return this.guaranteePolicy;
    }

}
