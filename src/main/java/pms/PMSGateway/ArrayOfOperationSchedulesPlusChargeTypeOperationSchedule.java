package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>ArrayOfOperationSchedulesPlusChargeTypeOperationSchedule complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="ArrayOfOperationSchedulesPlusChargeTypeOperationSchedule">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OperationSchedule" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}OperationSchedulePlusChargeType">
 *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "ArrayOfOperationSchedulesPlusChargeTypeOperationSchedule", propOrder = {
        "operationSchedule"
})
public class ArrayOfOperationSchedulesPlusChargeTypeOperationSchedule {

    @XmlElement(name = "OperationSchedule")
    protected List<ArrayOfOperationSchedulesPlusChargeTypeOperationSchedule.OperationSchedule> operationSchedule;

    /**
     * Gets the value of the operationSchedule property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operationSchedule property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperationSchedule().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfOperationSchedulesPlusChargeTypeOperationSchedule.OperationSchedule }
     */
    public List<ArrayOfOperationSchedulesPlusChargeTypeOperationSchedule.OperationSchedule> getOperationSchedule() {
        if (operationSchedule == null) {
            operationSchedule = new ArrayList<ArrayOfOperationSchedulesPlusChargeTypeOperationSchedule.OperationSchedule>();
        }
        return this.operationSchedule;
    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * <p/>
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * <p/>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}OperationSchedulePlusChargeType">
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class OperationSchedule
            extends OperationSchedulePlusChargeType {

        @XmlAttribute(name = "Name")
        protected String name;

        /**
         * ��ȡname���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getName() {
            return name;
        }

        /**
         * ����name���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setName(String value) {
            this.name = value;
        }

    }

}
