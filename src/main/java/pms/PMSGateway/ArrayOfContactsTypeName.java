package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>ArrayOfContactsTypeName complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="ArrayOfContactsTypeName">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PersonNameType">
 *                 &lt;sequence>
 *                   &lt;element name="JobTitle" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="CodeDetail" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Gender">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="Male"/>
 *                       &lt;enumeration value="Female"/>
 *                       &lt;enumeration value="Unknown"/>
 *                       &lt;enumeration value="Male_NoShare"/>
 *                       &lt;enumeration value="Female_NoShare"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="SrvcCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Location" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="CorporatePosition" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="OKToPublish" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="NameOrdered" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "ArrayOfContactsTypeName", propOrder = {
        "name"
})
public class ArrayOfContactsTypeName {

    @XmlElement(name = "Name")
    protected List<ArrayOfContactsTypeName.Name> name;

    /**
     * Gets the value of the name property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the name property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getName().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfContactsTypeName.Name }
     */
    public List<ArrayOfContactsTypeName.Name> getName() {
        if (name == null) {
            name = new ArrayList<ArrayOfContactsTypeName.Name>();
        }
        return this.name;
    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * <p/>
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * <p/>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PersonNameType">
     *       &lt;sequence>
     *         &lt;element name="JobTitle" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="CodeDetail" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Gender">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="Male"/>
     *             &lt;enumeration value="Female"/>
     *             &lt;enumeration value="Unknown"/>
     *             &lt;enumeration value="Male_NoShare"/>
     *             &lt;enumeration value="Female_NoShare"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="SrvcCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Location" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="CorporatePosition" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="OKToPublish" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="NameOrdered" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "jobTitle"
    })
    public static class Name
            extends PersonNameType {

        @XmlElement(name = "JobTitle")
        protected List<ArrayOfContactsTypeName.Name.JobTitle> jobTitle;
        @XmlAttribute(name = "CodeDetail")
        protected String codeDetail;
        @XmlAttribute(name = "Gender")
        protected String gender;
        @XmlAttribute(name = "SrvcCode")
        protected String srvcCode;
        @XmlAttribute(name = "Location")
        protected String location;
        @XmlAttribute(name = "CorporatePosition")
        protected String corporatePosition;
        @XmlAttribute(name = "OKToPublish")
        protected Boolean okToPublish;
        @XmlAttribute(name = "NameOrdered")
        protected String nameOrdered;
        @XmlAttribute(name = "ID")
        protected String id;

        /**
         * Gets the value of the jobTitle property.
         * <p/>
         * <p/>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the jobTitle property.
         * <p/>
         * <p/>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getJobTitle().add(newItem);
         * </pre>
         * <p/>
         * <p/>
         * <p/>
         * Objects of the following type(s) are allowed in the list
         * {@link ArrayOfContactsTypeName.Name.JobTitle }
         */
        public List<ArrayOfContactsTypeName.Name.JobTitle> getJobTitle() {
            if (jobTitle == null) {
                jobTitle = new ArrayList<ArrayOfContactsTypeName.Name.JobTitle>();
            }
            return this.jobTitle;
        }

        /**
         * ��ȡcodeDetail���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getCodeDetail() {
            return codeDetail;
        }

        /**
         * ����codeDetail���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setCodeDetail(String value) {
            this.codeDetail = value;
        }

        /**
         * ��ȡgender���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getGender() {
            return gender;
        }

        /**
         * ����gender���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setGender(String value) {
            this.gender = value;
        }

        /**
         * ��ȡsrvcCode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getSrvcCode() {
            return srvcCode;
        }

        /**
         * ����srvcCode���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setSrvcCode(String value) {
            this.srvcCode = value;
        }

        /**
         * ��ȡlocation���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getLocation() {
            return location;
        }

        /**
         * ����location���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setLocation(String value) {
            this.location = value;
        }

        /**
         * ��ȡcorporatePosition���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getCorporatePosition() {
            return corporatePosition;
        }

        /**
         * ����corporatePosition���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setCorporatePosition(String value) {
            this.corporatePosition = value;
        }

        /**
         * ��ȡokToPublish���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isOKToPublish() {
            return okToPublish;
        }

        /**
         * ����okToPublish���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setOKToPublish(Boolean value) {
            this.okToPublish = value;
        }

        /**
         * ��ȡnameOrdered���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getNameOrdered() {
            return nameOrdered;
        }

        /**
         * ����nameOrdered���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setNameOrdered(String value) {
            this.nameOrdered = value;
        }

        /**
         * ��ȡid���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getID() {
            return id;
        }

        /**
         * ����id���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setID(String value) {
            this.id = value;
        }


        /**
         * <p>anonymous complex type�� Java �ࡣ
         * <p/>
         * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
         * <p/>
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "value"
        })
        public static class JobTitle {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "Type")
            protected String type;

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

        }

    }

}
