package pms.test;

//import cn.other.serialize;
import core.util.Serialize;
import pms.order.ErrorType;
import pms.order.ErrorsType;
import pms.order.OTAHotelAvailRS;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/2/17.
 */
public class pmsTest {
    public static void main(String[] args) {
        OTAHotelAvailRS otaHotelAvailRS=new OTAHotelAvailRS();
        List<Object> suOrEeOrHo=new ArrayList<Object>();
        ErrorsType errors=new ErrorsType();
        List<ErrorType> errorList=new ArrayList<ErrorType>();
        ErrorType error=new ErrorType();
        error.setValue("Error");
        errorList.add(error);
        errors.setError(errorList);
        suOrEeOrHo.add(errors);
        OTAHotelAvailRS.HotelStays hotelStays=new OTAHotelAvailRS.HotelStays();
        suOrEeOrHo.add(hotelStays);
        otaHotelAvailRS.setHotelStaysOrSuccessOrRoomStays(suOrEeOrHo);
        System.out.println(Serialize.objectToXml(otaHotelAvailRS, OTAHotelAvailRS.class));
    }
}
