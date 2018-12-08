package pms.order;

import javax.xml.bind.annotation.*;


/**
 * <p>MealPrefType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="MealPrefType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="PreferLevel" type="{http://www.opentravel.org/OTA/2003/05}PreferLevelType" />
 *       &lt;attribute name="MealType" type="{http://www.opentravel.org/OTA/2003/05}MealType" />
 *       &lt;attribute name="FavoriteFood" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Beverage" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MealPrefType", propOrder = {
        "value"
})
public class MealPrefType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "PreferLevel")
    protected PreferLevelType preferLevel;
    @XmlAttribute(name = "MealType")
    protected MealType mealType;
    @XmlAttribute(name = "FavoriteFood")
    protected String favoriteFood;
    @XmlAttribute(name = "Beverage")
    protected String beverage;

    /**
     * ��ȡvalue���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getValue() {
        return value;
    }

    /**
     * ����value���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * ��ȡpreferLevel���Ե�ֵ��
     *
     * @return possible object is
     * {@link PreferLevelType }
     */
    public PreferLevelType getPreferLevel() {
        return preferLevel;
    }

    /**
     * ����preferLevel���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PreferLevelType }
     */
    public void setPreferLevel(PreferLevelType value) {
        this.preferLevel = value;
    }

    /**
     * ��ȡmealType���Ե�ֵ��
     *
     * @return possible object is
     * {@link MealType }
     */
    public MealType getMealType() {
        return mealType;
    }

    /**
     * ����mealType���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link MealType }
     */
    public void setMealType(MealType value) {
        this.mealType = value;
    }

    /**
     * ��ȡfavoriteFood���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getFavoriteFood() {
        return favoriteFood;
    }

    /**
     * ����favoriteFood���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFavoriteFood(String value) {
        this.favoriteFood = value;
    }

    /**
     * ��ȡbeverage���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getBeverage() {
        return beverage;
    }

    /**
     * ����beverage���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setBeverage(String value) {
        this.beverage = value;
    }

}
