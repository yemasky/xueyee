
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package ota.jw.ws.impl;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import ota.jw.AvailRes.AvailResSoap;
import ota.jw.AvailRes.OTAHotelAvailRQ;
import ota.jw.AvailRes.OTAHotelAvailRS;
import ota.jw.AvailRes.OTAHotelAvailRS.RoomStays;
import ota.jw.AvailRes.SuccessType;

/**
 * This class was generated by Apache CXF 3.2.4
 * 2018-08-02T16:14:55.205+08:00
 * Generated source version: 3.2.4
 *
 */

@javax.jws.WebService(
                      serviceName = "AvailRes",
                      portName = "AvailResSoap",
                      targetNamespace = "http://www.opentravel.org/OTA/2003/05",
                      wsdlLocation = "http://124.127.242.67:38196/GenericSeamlessGateway/AvailRes.asmx?wsdl",
                      endpointInterface = "ota.jw.AvailRes.AvailResSoap")

public class AvailResSoapImpl implements AvailResSoap {

    protected static Logger logger = LoggerFactory.getLogger(AvailResSoapImpl.class);
    protected static XmlMapper xml = new XmlMapper();
    /* (non-Javadoc)
     * @see ota.jw.AvailRes.AvailResSoap#checkAvailability(ota.jw.AvailRes.OTAHotelAvailRQ otaHotelAvailRQ)*
     */
    public OTAHotelAvailRS checkAvailability(OTAHotelAvailRQ otaHotelAvailRQ) {
        logger.info("Executing operation checkAvailability");
        try {
			logger.info(xml.writeValueAsString(otaHotelAvailRQ));
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println(otaHotelAvailRQ);

        OTAHotelAvailRS otaHotelAvailRS = new OTAHotelAvailRS();
        //
        SuccessType successType = new SuccessType();
        //
        List<Object> availRS = otaHotelAvailRS.getTPAExtensionsOrProfilesOrRebatePrograms();
        availRS.add(successType);
        //
        OTAHotelAvailRS.RoomStays roomStays = new RoomStays();
        
        
        return otaHotelAvailRS;


    }

}