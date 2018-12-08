package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>InvCountType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="InvCountType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Inventory" type="{http://www.opentravel.org/OTA/2003/05}BaseInvCountType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ChainCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="BrandCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="HotelCityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="HotelCodeContext" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ChainName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="BrandName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvCountType", propOrder = {
        "inventory",
        "uniqueID"
})
public class InvCountType {

    @XmlElement(name = "Inventory")
    protected List<BaseInvCountType> inventory;
    @XmlElement(name = "UniqueID")
    protected UniqueIDType uniqueID;
    @XmlAttribute(name = "ChainCode")
    protected String chainCode;
    @XmlAttribute(name = "BrandCode")
    protected String brandCode;
    @XmlAttribute(name = "HotelCode")
    protected String hotelCode;
    @XmlAttribute(name = "HotelCityCode")
    protected String hotelCityCode;
    @XmlAttribute(name = "HotelName")
    protected String hotelName;
    @XmlAttribute(name = "HotelCodeContext")
    protected String hotelCodeContext;
    @XmlAttribute(name = "ChainName")
    protected String chainName;
    @XmlAttribute(name = "BrandName")
    protected String brandName;

    /**
     * Gets the value of the inventory property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inventory property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInventory().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link BaseInvCountType }
     */
    public List<BaseInvCountType> getInventory() {
        if (inventory == null) {
            inventory = new ArrayList<BaseInvCountType>();
        }
        return this.inventory;
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
     * ��ȡchainCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getChainCode() {
        return chainCode;
    }

    /**
     * ����chainCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setChainCode(String value) {
        this.chainCode = value;
    }

    /**
     * ��ȡbrandCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getBrandCode() {
        return brandCode;
    }

    /**
     * ����brandCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setBrandCode(String value) {
        this.brandCode = value;
    }

    /**
     * ��ȡhotelCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getHotelCode() {
        return hotelCode;
    }

    /**
     * ����hotelCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setHotelCode(String value) {
        this.hotelCode = value;
    }

    /**
     * ��ȡhotelCityCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getHotelCityCode() {
        return hotelCityCode;
    }

    /**
     * ����hotelCityCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setHotelCityCode(String value) {
        this.hotelCityCode = value;
    }

    /**
     * ��ȡhotelName���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getHotelName() {
        return hotelName;
    }

    /**
     * ����hotelName���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setHotelName(String value) {
        this.hotelName = value;
    }

    /**
     * ��ȡhotelCodeContext���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getHotelCodeContext() {
        return hotelCodeContext;
    }

    /**
     * ����hotelCodeContext���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setHotelCodeContext(String value) {
        this.hotelCodeContext = value;
    }

    /**
     * ��ȡchainName���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getChainName() {
        return chainName;
    }

    /**
     * ����chainName���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setChainName(String value) {
        this.chainName = value;
    }

    /**
     * ��ȡbrandName���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getBrandName() {
        return brandName;
    }

    /**
     * ����brandName���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setBrandName(String value) {
        this.brandName = value;
    }

}
