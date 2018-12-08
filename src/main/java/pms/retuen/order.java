package pms.retuen;

import pms.order.OTAHotelAvailRS;
import pms.order.SuccessType;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/2/10.
 */
public class order {
    public OTAHotelAvailRS check(){
        OTAHotelAvailRS OTA_HotelAvailRS=new OTAHotelAvailRS();
        List<Object> hotelStaysOrSuccessOrRoomStays=new ArrayList<Object>();
        hotelStaysOrSuccessOrRoomStays.add(new SuccessType());
        OTAHotelAvailRS.RoomStays RoomStay=new OTAHotelAvailRS.RoomStays();
        hotelStaysOrSuccessOrRoomStays.add(RoomStay);
        OTA_HotelAvailRS.setHotelStaysOrSuccessOrRoomStays(hotelStaysOrSuccessOrRoomStays);
        return  OTA_HotelAvailRS;
    }
}
