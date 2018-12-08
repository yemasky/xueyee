package pms.order;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"donationInformation", "rebatePrograms"})
@XmlRootElement(name = "OTA_HotelResRQ")
public class OTAHotelResRQ extends HotelResRequestType {
    @XmlElement(name = "DonationInformation")
    protected DonationType donationInformation;
    @XmlElement(name = "RebatePrograms")
    protected ArrayOfRebateType rebatePrograms;

    /**
     * ��ȡdonationInformation���Ե�ֵ��
     *
     * @return possible object is
     * {@link DonationType }
     */
    public DonationType getDonationInformation() {
        return donationInformation;
    }

    /**
     * ����donationInformation���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link DonationType }
     */
    public void setDonationInformation(DonationType value) {
        this.donationInformation = value;
    }

    /**
     * ��ȡrebatePrograms���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArrayOfRebateType }
     */
    public ArrayOfRebateType getRebatePrograms() {
        return rebatePrograms;
    }

    /**
     * ����rebatePrograms���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArrayOfRebateType }
     */
    public void setRebatePrograms(ArrayOfRebateType value) {
        this.rebatePrograms = value;
    }

}
