package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;


/**
 * <p>ImageItemType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="ImageItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="URL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="UnitOfMeasureCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Width" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="Height" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImageItemType", propOrder = {
        "url"
})
@XmlSeeAlso({
        pms.PMSGateway.ImageDescriptionType.ImageFormat.class
})
public class ImageItemType {

    @XmlElement(name = "URL")
    @XmlSchemaType(name = "anyURI")
    protected String url;
    @XmlAttribute(name = "UnitOfMeasureCode")
    protected String unitOfMeasureCode;
    @XmlAttribute(name = "Width")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger width;
    @XmlAttribute(name = "Height")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger height;

    /**
     * ��ȡurl���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getURL() {
        return url;
    }

    /**
     * ����url���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setURL(String value) {
        this.url = value;
    }

    /**
     * ��ȡunitOfMeasureCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getUnitOfMeasureCode() {
        return unitOfMeasureCode;
    }

    /**
     * ����unitOfMeasureCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setUnitOfMeasureCode(String value) {
        this.unitOfMeasureCode = value;
    }

    /**
     * ��ȡwidth���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getWidth() {
        return width;
    }

    /**
     * ����width���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setWidth(BigInteger value) {
        this.width = value;
    }

    /**
     * ��ȡheight���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getHeight() {
        return height;
    }

    /**
     * ����height���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setHeight(BigInteger value) {
        this.height = value;
    }

}
