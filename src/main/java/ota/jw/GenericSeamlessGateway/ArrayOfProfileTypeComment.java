
package ota.jw.GenericSeamlessGateway;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>ArrayOfProfileTypeComment complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfProfileTypeComment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Comment" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ParagraphType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="AuthorizedViewer" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="ViewerCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="CommentOriginatorCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="GuestViewable" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="Category" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="AirlineVendorPrefRPH" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="TransferAction" type="{http://www.opentravel.org/OTA/2003/05}TransferActionType" /&gt;
 *                 &lt;attribute name="ActionDate" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
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
@XmlType(name = "ArrayOfProfileTypeComment", propOrder = {
    "comment"
})
public class ArrayOfProfileTypeComment {

    @XmlElement(name = "Comment")
    protected List<ArrayOfProfileTypeComment.Comment> comment;

    /**
     * Gets the value of the comment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfProfileTypeComment.Comment }
     * 
     * 
     */
    public List<ArrayOfProfileTypeComment.Comment> getComment() {
        if (comment == null) {
            comment = new ArrayList<ArrayOfProfileTypeComment.Comment>();
        }
        return this.comment;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ParagraphType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="AuthorizedViewer" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="ViewerCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="CommentOriginatorCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="GuestViewable" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="Category" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="AirlineVendorPrefRPH" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="TransferAction" type="{http://www.opentravel.org/OTA/2003/05}TransferActionType" /&gt;
     *       &lt;attribute name="ActionDate" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "authorizedViewer"
    })
    public static class Comment
        extends ParagraphType
    {

        @XmlElement(name = "AuthorizedViewer")
        protected List<ArrayOfProfileTypeComment.Comment.AuthorizedViewer> authorizedViewer;
        @XmlAttribute(name = "CommentOriginatorCode")
        protected String commentOriginatorCode;
        @XmlAttribute(name = "GuestViewable")
        protected Boolean guestViewable;
        @XmlAttribute(name = "Category")
        protected String category;
        @XmlAttribute(name = "AirlineVendorPrefRPH")
        protected String airlineVendorPrefRPH;
        @XmlAttribute(name = "TransferAction")
        protected TransferActionType transferAction;
        @XmlAttribute(name = "ActionDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar actionDate;

        /**
         * Gets the value of the authorizedViewer property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the authorizedViewer property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAuthorizedViewer().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ArrayOfProfileTypeComment.Comment.AuthorizedViewer }
         * 
         * 
         */
        public List<ArrayOfProfileTypeComment.Comment.AuthorizedViewer> getAuthorizedViewer() {
            if (authorizedViewer == null) {
                authorizedViewer = new ArrayList<ArrayOfProfileTypeComment.Comment.AuthorizedViewer>();
            }
            return this.authorizedViewer;
        }

        /**
         * 获取commentOriginatorCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCommentOriginatorCode() {
            return commentOriginatorCode;
        }

        /**
         * 设置commentOriginatorCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCommentOriginatorCode(String value) {
            this.commentOriginatorCode = value;
        }

        /**
         * 获取guestViewable属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isGuestViewable() {
            return guestViewable;
        }

        /**
         * 设置guestViewable属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setGuestViewable(Boolean value) {
            this.guestViewable = value;
        }

        /**
         * 获取category属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCategory() {
            return category;
        }

        /**
         * 设置category属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCategory(String value) {
            this.category = value;
        }

        /**
         * 获取airlineVendorPrefRPH属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAirlineVendorPrefRPH() {
            return airlineVendorPrefRPH;
        }

        /**
         * 设置airlineVendorPrefRPH属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAirlineVendorPrefRPH(String value) {
            this.airlineVendorPrefRPH = value;
        }

        /**
         * 获取transferAction属性的值。
         * 
         * @return
         *     possible object is
         *     {@link TransferActionType }
         *     
         */
        public TransferActionType getTransferAction() {
            return transferAction;
        }

        /**
         * 设置transferAction属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link TransferActionType }
         *     
         */
        public void setTransferAction(TransferActionType value) {
            this.transferAction = value;
        }

        /**
         * 获取actionDate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getActionDate() {
            return actionDate;
        }

        /**
         * 设置actionDate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setActionDate(XMLGregorianCalendar value) {
            this.actionDate = value;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;attribute name="ViewerCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class AuthorizedViewer {

            @XmlAttribute(name = "ViewerCode")
            protected String viewerCode;

            /**
             * 获取viewerCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getViewerCode() {
                return viewerCode;
            }

            /**
             * 设置viewerCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setViewerCode(String value) {
                this.viewerCode = value;
            }

        }

    }

}
