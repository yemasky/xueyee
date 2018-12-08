package pms.order;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>ArrayOfProfileTypeComment complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="ArrayOfProfileTypeComment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Comment" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ParagraphType">
 *                 &lt;sequence>
 *                   &lt;element name="AuthorizedViewer" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="ViewerCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="CommentOriginatorCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="GuestViewable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="Category" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="AirlineVendorPrefRPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="TransferAction" type="{http://www.opentravel.org/OTA/2003/05}TransferActionType" />
 *                 &lt;attribute name="ActionDate" type="{http://www.w3.org/2001/XMLSchema}date" />
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
@XmlType(name = "ArrayOfProfileTypeComment", propOrder = {
        "comment"
})
public class ArrayOfProfileTypeComment {

    @XmlElement(name = "Comment")
    protected List<ArrayOfProfileTypeComment.Comment> comment;

    /**
     * Gets the value of the comment property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comment property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComment().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfProfileTypeComment.Comment }
     */
    public List<ArrayOfProfileTypeComment.Comment> getComment() {
        if (comment == null) {
            comment = new ArrayList<ArrayOfProfileTypeComment.Comment>();
        }
        return this.comment;
    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * <p/>
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * <p/>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ParagraphType">
     *       &lt;sequence>
     *         &lt;element name="AuthorizedViewer" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="ViewerCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="CommentOriginatorCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="GuestViewable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="Category" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="AirlineVendorPrefRPH" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="TransferAction" type="{http://www.opentravel.org/OTA/2003/05}TransferActionType" />
     *       &lt;attribute name="ActionDate" type="{http://www.w3.org/2001/XMLSchema}date" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "authorizedViewer"
    })
    public static class Comment
            extends ParagraphType {

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
         * <p/>
         * <p/>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the authorizedViewer property.
         * <p/>
         * <p/>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAuthorizedViewer().add(newItem);
         * </pre>
         * <p/>
         * <p/>
         * <p/>
         * Objects of the following type(s) are allowed in the list
         * {@link ArrayOfProfileTypeComment.Comment.AuthorizedViewer }
         */
        public List<ArrayOfProfileTypeComment.Comment.AuthorizedViewer> getAuthorizedViewer() {
            if (authorizedViewer == null) {
                authorizedViewer = new ArrayList<ArrayOfProfileTypeComment.Comment.AuthorizedViewer>();
            }
            return this.authorizedViewer;
        }

        /**
         * ��ȡcommentOriginatorCode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getCommentOriginatorCode() {
            return commentOriginatorCode;
        }

        /**
         * ����commentOriginatorCode���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setCommentOriginatorCode(String value) {
            this.commentOriginatorCode = value;
        }

        /**
         * ��ȡguestViewable���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isGuestViewable() {
            return guestViewable;
        }

        /**
         * ����guestViewable���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setGuestViewable(Boolean value) {
            this.guestViewable = value;
        }

        /**
         * ��ȡcategory���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getCategory() {
            return category;
        }

        /**
         * ����category���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setCategory(String value) {
            this.category = value;
        }

        /**
         * ��ȡairlineVendorPrefRPH���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getAirlineVendorPrefRPH() {
            return airlineVendorPrefRPH;
        }

        /**
         * ����airlineVendorPrefRPH���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setAirlineVendorPrefRPH(String value) {
            this.airlineVendorPrefRPH = value;
        }

        /**
         * ��ȡtransferAction���Ե�ֵ��
         *
         * @return possible object is
         * {@link TransferActionType }
         */
        public TransferActionType getTransferAction() {
            return transferAction;
        }

        /**
         * ����transferAction���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link TransferActionType }
         */
        public void setTransferAction(TransferActionType value) {
            this.transferAction = value;
        }

        /**
         * ��ȡactionDate���Ե�ֵ��
         *
         * @return possible object is
         * {@link XMLGregorianCalendar }
         */
        public XMLGregorianCalendar getActionDate() {
            return actionDate;
        }

        /**
         * ����actionDate���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link XMLGregorianCalendar }
         */
        public void setActionDate(XMLGregorianCalendar value) {
            this.actionDate = value;
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
         *       &lt;attribute name="ViewerCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class AuthorizedViewer {

            @XmlAttribute(name = "ViewerCode")
            protected String viewerCode;

            /**
             * ��ȡviewerCode���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getViewerCode() {
                return viewerCode;
            }

            /**
             * ����viewerCode���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setViewerCode(String value) {
                this.viewerCode = value;
            }

        }

    }

}
