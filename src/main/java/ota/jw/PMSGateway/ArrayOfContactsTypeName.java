
package ota.jw.PMSGateway;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>ArrayOfContactsTypeName complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfContactsTypeName"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PersonNameType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="JobTitle" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;simpleContent&gt;
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                           &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/simpleContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="CodeDetail" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="Gender"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;enumeration value="Male"/&gt;
 *                       &lt;enumeration value="Female"/&gt;
 *                       &lt;enumeration value="Unknown"/&gt;
 *                       &lt;enumeration value="Male_NoShare"/&gt;
 *                       &lt;enumeration value="Female_NoShare"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="SrvcCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="Location" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="CorporatePosition" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="OKToPublish" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="NameOrdered" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
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
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the name property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfContactsTypeName.Name }
     * 
     * 
     */
    public List<ArrayOfContactsTypeName.Name> getName() {
        if (name == null) {
            name = new ArrayList<ArrayOfContactsTypeName.Name>();
        }
        return this.name;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PersonNameType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="JobTitle" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                 &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="CodeDetail" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="Gender"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;enumeration value="Male"/&gt;
     *             &lt;enumeration value="Female"/&gt;
     *             &lt;enumeration value="Unknown"/&gt;
     *             &lt;enumeration value="Male_NoShare"/&gt;
     *             &lt;enumeration value="Female_NoShare"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="SrvcCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="Location" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="CorporatePosition" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="OKToPublish" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="NameOrdered" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "jobTitle"
    })
    public static class Name
        extends PersonNameType
    {

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
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the jobTitle property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getJobTitle().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ArrayOfContactsTypeName.Name.JobTitle }
         * 
         * 
         */
        public List<ArrayOfContactsTypeName.Name.JobTitle> getJobTitle() {
            if (jobTitle == null) {
                jobTitle = new ArrayList<ArrayOfContactsTypeName.Name.JobTitle>();
            }
            return this.jobTitle;
        }

        /**
         * 获取codeDetail属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodeDetail() {
            return codeDetail;
        }

        /**
         * 设置codeDetail属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodeDetail(String value) {
            this.codeDetail = value;
        }

        /**
         * 获取gender属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGender() {
            return gender;
        }

        /**
         * 设置gender属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGender(String value) {
            this.gender = value;
        }

        /**
         * 获取srvcCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSrvcCode() {
            return srvcCode;
        }

        /**
         * 设置srvcCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSrvcCode(String value) {
            this.srvcCode = value;
        }

        /**
         * 获取location属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLocation() {
            return location;
        }

        /**
         * 设置location属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLocation(String value) {
            this.location = value;
        }

        /**
         * 获取corporatePosition属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCorporatePosition() {
            return corporatePosition;
        }

        /**
         * 设置corporatePosition属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCorporatePosition(String value) {
            this.corporatePosition = value;
        }

        /**
         * 获取okToPublish属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isOKToPublish() {
            return okToPublish;
        }

        /**
         * 设置okToPublish属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setOKToPublish(Boolean value) {
            this.okToPublish = value;
        }

        /**
         * 获取nameOrdered属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNameOrdered() {
            return nameOrdered;
        }

        /**
         * 设置nameOrdered属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNameOrdered(String value) {
            this.nameOrdered = value;
        }

        /**
         * 获取id属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getID() {
            return id;
        }

        /**
         * 设置id属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setID(String value) {
            this.id = value;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;simpleContent&gt;
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/extension&gt;
         *   &lt;/simpleContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
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
             * 获取value属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * 设置value属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * 获取type属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getType() {
                return type;
            }

            /**
             * 设置type属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setType(String value) {
                this.type = value;
            }

        }

    }

}
