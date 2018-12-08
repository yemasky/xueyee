package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>WeatherInfoType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="WeatherInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Precipitation" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="AveragePrecipitation" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="UnitOfMeasure" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Temperature" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="AverageHighTemp" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="AverageLowTemp" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="TempUnit">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="Celsius"/>
 *                       &lt;enumeration value="Fahrenheit"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="Period" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WeatherInfoType", propOrder = {
        "precipitation",
        "temperature"
})
public class WeatherInfoType {

    @XmlElement(name = "Precipitation")
    protected List<WeatherInfoType.Precipitation> precipitation;
    @XmlElement(name = "Temperature")
    protected List<WeatherInfoType.Temperature> temperature;
    @XmlAttribute(name = "Period")
    protected String period;

    /**
     * Gets the value of the precipitation property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the precipitation property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrecipitation().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link WeatherInfoType.Precipitation }
     */
    public List<WeatherInfoType.Precipitation> getPrecipitation() {
        if (precipitation == null) {
            precipitation = new ArrayList<WeatherInfoType.Precipitation>();
        }
        return this.precipitation;
    }

    /**
     * Gets the value of the temperature property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the temperature property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTemperature().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link WeatherInfoType.Temperature }
     */
    public List<WeatherInfoType.Temperature> getTemperature() {
        if (temperature == null) {
            temperature = new ArrayList<WeatherInfoType.Temperature>();
        }
        return this.temperature;
    }

    /**
     * ��ȡperiod���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getPeriod() {
        return period;
    }

    /**
     * ����period���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPeriod(String value) {
        this.period = value;
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
     *       &lt;attribute name="AveragePrecipitation" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="UnitOfMeasure" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Precipitation {

        @XmlAttribute(name = "AveragePrecipitation")
        protected BigDecimal averagePrecipitation;
        @XmlAttribute(name = "UnitOfMeasure")
        protected String unitOfMeasure;

        /**
         * ��ȡaveragePrecipitation���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigDecimal }
         */
        public BigDecimal getAveragePrecipitation() {
            return averagePrecipitation;
        }

        /**
         * ����averagePrecipitation���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigDecimal }
         */
        public void setAveragePrecipitation(BigDecimal value) {
            this.averagePrecipitation = value;
        }

        /**
         * ��ȡunitOfMeasure���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getUnitOfMeasure() {
            return unitOfMeasure;
        }

        /**
         * ����unitOfMeasure���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setUnitOfMeasure(String value) {
            this.unitOfMeasure = value;
        }

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
     *       &lt;attribute name="AverageHighTemp" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="AverageLowTemp" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="TempUnit">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="Celsius"/>
     *             &lt;enumeration value="Fahrenheit"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Temperature {

        @XmlAttribute(name = "AverageHighTemp")
        protected BigInteger averageHighTemp;
        @XmlAttribute(name = "AverageLowTemp")
        protected BigInteger averageLowTemp;
        @XmlAttribute(name = "TempUnit")
        protected String tempUnit;

        /**
         * ��ȡaverageHighTemp���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getAverageHighTemp() {
            return averageHighTemp;
        }

        /**
         * ����averageHighTemp���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setAverageHighTemp(BigInteger value) {
            this.averageHighTemp = value;
        }

        /**
         * ��ȡaverageLowTemp���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getAverageLowTemp() {
            return averageLowTemp;
        }

        /**
         * ����averageLowTemp���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setAverageLowTemp(BigInteger value) {
            this.averageLowTemp = value;
        }

        /**
         * ��ȡtempUnit���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getTempUnit() {
            return tempUnit;
        }

        /**
         * ����tempUnit���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setTempUnit(String value) {
            this.tempUnit = value;
        }

    }

}
