package pms.test;

//import cn.other.serialize;
import core.util.Serialize;
import pms.order.OTAHotelAvailRS;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/2/10.
 */
public class test {
    public static void main(String[] args) {
        OTAHotelAvailRS OTA_HotelAvailRS=new OTAHotelAvailRS();
        List<Object> objs=new ArrayList<Object>();
        OTAHotelAvailRS.RoomStays RoomStays=new OTAHotelAvailRS.RoomStays();
        objs.add(RoomStays);

        OTA_HotelAvailRS.setHotelStaysOrSuccessOrRoomStays(objs);
        System.out.println(Serialize.objectToXml(OTA_HotelAvailRS, OTAHotelAvailRS.class));
    }
}
