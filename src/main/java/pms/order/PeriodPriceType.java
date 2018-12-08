package pms.order;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>PeriodPriceType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="PeriodPriceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}OperationScheduleType">
 *       &lt;sequence>
 *         &lt;element name="Price" type="{http://www.opentravel.org/OTA/2003/05}PkgPriceType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Category">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Room"/>
 *             &lt;enumeration value="Booking"/>
 *             &lt;enumeration value="Person"/>
 *             &lt;enumeration value="Adult"/>
 *             &lt;enumeration value="Child"/>
 *             &lt;enumeration value="Car"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Type">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Base"/>
 *             &lt;enumeration value="AddOn"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="DurationPeriod" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PriceBasis" type="{http://www.opentravel.org/OTA/2003/05}PricingType" />
 *       &lt;attribute name="BasePeriodRPHs">
 *         &lt;simpleType>
 *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="GuidePriceIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="MaximumPeriod" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PeriodPriceType", propOrder = {
        "price"
})
public class PeriodPriceType
        extends OperationScheduleType {

    @XmlElement(name = "Price")
    protected List<PkgPriceType> price;
    @XmlAttribute(name = "RPH")
    protected String rph;
    @XmlAttribute(name = "Category")
    protected String category;
    @XmlAttribute(name = "Type")
    protected String type;
    @XmlAttribute(name = "DurationPeriod")
    protected String durationPeriod;
    @XmlAttribute(name = "PriceBasis")
    protected PricingType priceBasis;
    @XmlAttribute(name = "BasePeriodRPHs")
    protected List<String> basePeriodRPHs;
    @XmlAttribute(name = "GuidePriceIndicator")
    protected Boolean guidePriceIndicator;
    @XmlAttribute(name = "MaximumPeriod")
    protected String maximumPeriod;

    /**
     * Gets the value of the price property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the price property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrice().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link PkgPriceType }
     */
    public List<PkgPriceType> getPrice() {
        if (price == null) {
            price = new ArrayList<PkgPriceType>();
        }
        return this.price;
    }

    /**
     * ��ȡrph���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getRPH() {
        return rph;
    }

    /**
     * ����rph���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRPH(String value) {
        this.rph = value;
    }

    /**
     * ��ȡcategory���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getCategory() {
        return category;
    }

    /**
     * ����category���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * ��ȡtype���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getType() {
        return type;
    }

    /**
     * ����type���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * ��ȡdurationPeriod���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getDurationPeriod() {
        return durationPeriod;
    }

    /**
     * ����durationPeriod���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDurationPeriod(String value) {
        this.durationPeriod = value;
    }

    /**
     * ��ȡpriceBasis���Ե�ֵ��
     *
     * @return possible object is
     * {@link PricingType }
     */
    public PricingType getPriceBasis() {
        return priceBasis;
    }

    /**
     * ����priceBasis���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PricingType }
     */
    public void setPriceBasis(PricingType value) {
        this.priceBasis = value;
    }

    /**
     * Gets the value of the basePeriodRPHs property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the basePeriodRPHs property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBasePeriodRPHs().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     */
    public List<String> getBasePeriodRPHs() {
        if (basePeriodRPHs == null) {
            basePeriodRPHs = new ArrayList<String>();
        }
        return this.basePeriodRPHs;
    }

    /**
     * ��ȡguidePriceIndicator���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isGuidePriceIndicator() {
        return guidePriceIndicator;
    }

    /**
     * ����guidePriceIndicator���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setGuidePriceIndicator(Boolean value) {
        this.guidePriceIndicator = value;
    }

    /**
     * ��ȡmaximumPeriod���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getMaximumPeriod() {
        return maximumPeriod;
    }

    /**
     * ����maximumPeriod���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMaximumPeriod(String value) {
        this.maximumPeriod = value;
    }

}
