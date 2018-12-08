package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>ArrayOfMembershipTypeMembership complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="ArrayOfMembershipTypeMembership">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Membership" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="ProgramCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="BonusCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="AccountID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="PointsEarned" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="TravelSector" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
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
@XmlType(name = "ArrayOfMembershipTypeMembership", propOrder = {
        "membership"
})
public class ArrayOfMembershipTypeMembership {

    @XmlElement(name = "Membership")
    protected List<ArrayOfMembershipTypeMembership.Membership> membership;

    /**
     * Gets the value of the membership property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the membership property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMembership().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfMembershipTypeMembership.Membership }
     */
    public List<ArrayOfMembershipTypeMembership.Membership> getMembership() {
        if (membership == null) {
            membership = new ArrayList<ArrayOfMembershipTypeMembership.Membership>();
        }
        return this.membership;
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
     *       &lt;attribute name="ProgramCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="BonusCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="AccountID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="PointsEarned" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="TravelSector" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Membership {

        @XmlAttribute(name = "ProgramCode")
        protected String programCode;
        @XmlAttribute(name = "BonusCode")
        protected String bonusCode;
        @XmlAttribute(name = "AccountID")
        protected String accountID;
        @XmlAttribute(name = "PointsEarned")
        protected BigInteger pointsEarned;
        @XmlAttribute(name = "TravelSector")
        protected String travelSector;

        /**
         * ��ȡprogramCode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getProgramCode() {
            return programCode;
        }

        /**
         * ����programCode���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setProgramCode(String value) {
            this.programCode = value;
        }

        /**
         * ��ȡbonusCode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getBonusCode() {
            return bonusCode;
        }

        /**
         * ����bonusCode���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setBonusCode(String value) {
            this.bonusCode = value;
        }

        /**
         * ��ȡaccountID���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getAccountID() {
            return accountID;
        }

        /**
         * ����accountID���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setAccountID(String value) {
            this.accountID = value;
        }

        /**
         * ��ȡpointsEarned���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getPointsEarned() {
            return pointsEarned;
        }

        /**
         * ����pointsEarned���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setPointsEarned(BigInteger value) {
            this.pointsEarned = value;
        }

        /**
         * ��ȡtravelSector���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getTravelSector() {
            return travelSector;
        }

        /**
         * ����travelSector���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setTravelSector(String value) {
            this.travelSector = value;
        }

    }

}
