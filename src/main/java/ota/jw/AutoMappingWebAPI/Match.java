
package ota.jw.AutoMappingWebAPI;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Match complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Match"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="otaRoomId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="score" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Match", propOrder = {
    "otaRoomId",
    "score"
})
public class Match {

    protected String otaRoomId;
    protected String score;

    /**
     * 获取otaRoomId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtaRoomId() {
        return otaRoomId;
    }

    /**
     * 设置otaRoomId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtaRoomId(String value) {
        this.otaRoomId = value;
    }

    /**
     * 获取score属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScore() {
        return score;
    }

    /**
     * 设置score属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScore(String value) {
        this.score = value;
    }

}
