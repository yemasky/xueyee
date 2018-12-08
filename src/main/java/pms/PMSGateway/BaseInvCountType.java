package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;


/**
 * <p>BaseInvCountType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="BaseInvCountType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StatusApplicationControl" type="{http://www.opentravel.org/OTA/2003/05}StatusApplicationControlType" minOccurs="0"/>
 *         &lt;element name="InvCounts" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfBaseInvCountTypeInvCount" minOccurs="0"/>
 *         &lt;element name="OffSell" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="OffSellValueType">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="Total"/>
 *                       &lt;enumeration value="Adjustment"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="OffSellValue" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseInvCountType", propOrder = {
        "statusApplicationControl",
        "invCounts",
        "offSell",
        "uniqueID"
})
public class BaseInvCountType {

    @XmlElement(name = "StatusApplicationControl")
    protected StatusApplicationControlType statusApplicationControl;
    @XmlElement(name = "InvCounts")
    protected ArrayOfBaseInvCountTypeInvCount invCounts;
    @XmlElement(name = "OffSell")
    protected BaseInvCountType.OffSell offSell;
    @XmlElement(name = "UniqueID")
    protected UniqueIDType uniqueID;

    /**
     * ��ȡstatusApplicationControl���Ե�ֵ��
     *
     * @return possible object is
     * {@link StatusApplicationControlType }
     */
    public StatusApplicationControlType getStatusApplicationControl() {
        return statusApplicationControl;
    }

    /**
     * ����statusApplicationControl���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link StatusApplicationControlType }
     */
    public void setStatusApplicationControl(StatusApplicationControlType value) {
        this.statusApplicationControl = value;
    }

    /**
     * ��ȡinvCounts���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArrayOfBaseInvCountTypeInvCount }
     */
    public ArrayOfBaseInvCountTypeInvCount getInvCounts() {
        return invCounts;
    }

    /**
     * ����invCounts���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArrayOfBaseInvCountTypeInvCount }
     */
    public void setInvCounts(ArrayOfBaseInvCountTypeInvCount value) {
        this.invCounts = value;
    }

    /**
     * ��ȡoffSell���Ե�ֵ��
     *
     * @return possible object is
     * {@link BaseInvCountType.OffSell }
     */
    public BaseInvCountType.OffSell getOffSell() {
        return offSell;
    }

    /**
     * ����offSell���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BaseInvCountType.OffSell }
     */
    public void setOffSell(BaseInvCountType.OffSell value) {
        this.offSell = value;
    }

    /**
     * ��ȡuniqueID���Ե�ֵ��
     *
     * @return possible object is
     * {@link UniqueIDType }
     */
    public UniqueIDType getUniqueID() {
        return uniqueID;
    }

    /**
     * ����uniqueID���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link UniqueIDType }
     */
    public void setUniqueID(UniqueIDType value) {
        this.uniqueID = value;
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
     *       &lt;attribute name="OffSellValueType">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="Total"/>
     *             &lt;enumeration value="Adjustment"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="OffSellValue" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class OffSell {

        @XmlAttribute(name = "OffSellValueType")
        protected String offSellValueType;
        @XmlAttribute(name = "OffSellValue")
        protected BigDecimal offSellValue;

        /**
         * ��ȡoffSellValueType���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getOffSellValueType() {
            return offSellValueType;
        }

        /**
         * ����offSellValueType���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setOffSellValueType(String value) {
            this.offSellValueType = value;
        }

        /**
         * ��ȡoffSellValue���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigDecimal }
         */
        public BigDecimal getOffSellValue() {
            return offSellValue;
        }

        /**
         * ����offSellValue���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigDecimal }
         */
        public void setOffSellValue(BigDecimal value) {
            this.offSellValue = value;
        }

    }

}
