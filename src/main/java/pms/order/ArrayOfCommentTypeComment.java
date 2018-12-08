package pms.order;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>ArrayOfCommentTypeComment complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="ArrayOfCommentTypeComment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Comment" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ParagraphType">
 *                 &lt;attribute name="CommentOriginatorCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="GuestViewable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
@XmlType(name = "ArrayOfCommentTypeComment", propOrder = {
        "comment"
})
public class ArrayOfCommentTypeComment {

    @XmlElement(name = "Comment")
    protected List<ArrayOfCommentTypeComment.Comment> comment;

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
     * {@link ArrayOfCommentTypeComment.Comment }
     */
    public List<ArrayOfCommentTypeComment.Comment> getComment() {
        if (comment == null) {
            comment = new ArrayList<ArrayOfCommentTypeComment.Comment>();
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
     *       &lt;attribute name="CommentOriginatorCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="GuestViewable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Comment
            extends ParagraphType {

        @XmlAttribute(name = "CommentOriginatorCode")
        protected String commentOriginatorCode;
        @XmlAttribute(name = "GuestViewable")
        protected Boolean guestViewable;

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

    }

}
