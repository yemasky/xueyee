package pms.prdPayment;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"orderPaymentInfo"})
@XmlRootElement(name = "OTA_HotelResPrdPaymentNotifRQ")
public class OTAHotelResPrdPaymentNotifRQ {
    @XmlElement(name = "OrderPaymentInfo")
    protected OTAHotelResPrdPaymentNotifRQ.OrderPaymentInfo orderPaymentInfo;

    public OTAHotelResPrdPaymentNotifRQ.OrderPaymentInfo getOrderPaymentInfo() {
        return orderPaymentInfo;
    }

    public void setOrderPaymentInfo(OTAHotelResPrdPaymentNotifRQ.OrderPaymentInfo value) {
        this.orderPaymentInfo = value;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {"orderID", "hotelId", "confirmationID", "payType", "roomAmount", "depositAmount", "ticketAmount"})
    public static class OrderPaymentInfo {
        @XmlElement(name = "OrderID")
        protected String orderID;
        @XmlElement(name = "HotelId")
        protected String hotelId;
        @XmlElement(name = "ConfirmationID")
        protected String confirmationID;
        @XmlElement(name = "PayType")
        protected String payType;
        @XmlElement(name = "RoomAmount")
        protected String roomAmount;
        @XmlElement(name = "DepositAmount")
        protected String depositAmount;
        @XmlElement(name = "Ticket_Amount")
        protected String ticketAmount;

        public String getOrderID() {
            return orderID;
        }

        public void setOrderID(String value) {
            this.orderID = value;
        }

        public String getHotelId() {
            return hotelId;
        }

        public void setHotelId(String value) {
            this.hotelId = value;
        }

        public String getConfirmationID() {
            return confirmationID;
        }

        public void setConfirmationID(String value) {
            this.confirmationID = value;
        }

        public String getPayType() {
            return payType;
        }

        public void setPayType(String value) {
            this.payType = value;
        }

        public String getRoomAmount() {
            return roomAmount;
        }

        public void setRoomAmount(String value) {
            this.roomAmount = value;
        }

        public String getDepositAmount() {
            return depositAmount;
        }

        public void setDepositAmount(String value) {
            this.depositAmount = value;
        }

        public String getTicketAmount() {
            return ticketAmount;
        }

        public void setTicketAmount(String value) {
            this.ticketAmount = value;
        }
    }
}