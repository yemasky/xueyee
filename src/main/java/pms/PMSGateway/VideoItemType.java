package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.math.BigInteger;


/**
 * <p>VideoItemType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="VideoItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="URL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="UnitOfMeasureCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Width" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="Height" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="BitRate" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="Length" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="Language" type="{http://www.w3.org/2001/XMLSchema}language" />
 *       &lt;attribute name="Format" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="FileSize" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="FileName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoItemType", propOrder = {
        "url"
})
@XmlSeeAlso({
        pms.PMSGateway.VideoDescriptionType.VideoFormat.class
})
public class VideoItemType {

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
    @XmlAttribute(name = "BitRate")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger bitRate;
    @XmlAttribute(name = "Length")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger length;
    @XmlAttribute(name = "Language")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String language;
    @XmlAttribute(name = "Format")
    protected String format;
    @XmlAttribute(name = "FileSize")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger fileSize;
    @XmlAttribute(name = "FileName")
    protected String fileName;

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

    /**
     * ��ȡbitRate���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getBitRate() {
        return bitRate;
    }

    /**
     * ����bitRate���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setBitRate(BigInteger value) {
        this.bitRate = value;
    }

    /**
     * ��ȡlength���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getLength() {
        return length;
    }

    /**
     * ����length���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setLength(BigInteger value) {
        this.length = value;
    }

    /**
     * ��ȡlanguage���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getLanguage() {
        return language;
    }

    /**
     * ����language���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * ��ȡformat���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getFormat() {
        return format;
    }

    /**
     * ����format���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFormat(String value) {
        this.format = value;
    }

    /**
     * ��ȡfileSize���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getFileSize() {
        return fileSize;
    }

    /**
     * ����fileSize���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setFileSize(BigInteger value) {
        this.fileSize = value;
    }

    /**
     * ��ȡfileName���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * ����fileName���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

}
