
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package ota.jw.AutoMappingWebAPI;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.4
 * 2018-07-05T16:01:31.680+08:00
 * Generated source version: 3.2.4
 *
 */

@javax.jws.WebService(
                      serviceName = "AutoMappingServices",
                      portName = "AutoMappingServicesSoap",
                      targetNamespace = "http://www.opentravel.org/OTA/2003/05",
                      wsdlLocation = "http://124.127.242.67:38196/AutoMappingWebAPI/AutoMappingServices.asmx?WSDL",
                      endpointInterface = "ota.jw.AutoMappingWebAPI.AutoMappingServicesSoap")

public class AutoMappingServicesSoapImpl implements AutoMappingServicesSoap {

    private static final Logger LOG = Logger.getLogger(AutoMappingServicesSoapImpl.class.getName());

    /* (non-Javadoc)
     * @see ota.jw.AutoMappingWebAPI.AutoMappingServicesSoap#getCtripSubHotelInfo(java.lang.String masterHotelId)*
     */
    public ota.jw.AutoMappingWebAPI.CtripSubHotelInfoRS getCtripSubHotelInfo(java.lang.String masterHotelId) {
        LOG.info("Executing operation getCtripSubHotelInfo");
        System.out.println(masterHotelId);
        try {
            ota.jw.AutoMappingWebAPI.CtripSubHotelInfoRS _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see ota.jw.AutoMappingWebAPI.AutoMappingServicesSoap#getHotelInfo(ota.jw.AutoMappingWebAPI.GetHotelInfoRQ getHotelInfoRQ)*
     */
    public ota.jw.AutoMappingWebAPI.GetHotelInfoRS getHotelInfo(ota.jw.AutoMappingWebAPI.GetHotelInfoRQ getHotelInfoRQ) {
        LOG.info("Executing operation getHotelInfo");
        System.out.println(getHotelInfoRQ);
        try {
            ota.jw.AutoMappingWebAPI.GetHotelInfoRS _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see ota.jw.AutoMappingWebAPI.AutoMappingServicesSoap#setMappingInfo(ota.jw.AutoMappingWebAPI.SetMappingRQ setMappingRQ)*
     */
    public ota.jw.AutoMappingWebAPI.SetMappingRS setMappingInfo(SetMappingRQ setMappingRQ) {
        LOG.info("Executing operation setMappingInfo");
        System.out.println(setMappingRQ);
        try {
            ota.jw.AutoMappingWebAPI.SetMappingRS _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see ota.jw.AutoMappingWebAPI.AutoMappingServicesSoap#intelligentMapping(ota.jw.AutoMappingWebAPI.RoomMatchRQ roomMatchRQ)*
     */
    public ota.jw.AutoMappingWebAPI.RoomMatchRS intelligentMapping(RoomMatchRQ roomMatchRQ) {
        LOG.info("Executing operation intelligentMapping");
        System.out.println(roomMatchRQ);
        try {
            ota.jw.AutoMappingWebAPI.RoomMatchRS _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see ota.jw.AutoMappingWebAPI.AutoMappingServicesSoap#getRoomProductInfo(java.lang.String subHotelId, java.lang.String type)*
     */
    public ota.jw.AutoMappingWebAPI.ProductMappingInfoRS getRoomProductInfo(java.lang.String subHotelId, java.lang.String type) {
        LOG.info("Executing operation getRoomProductInfo");
        System.out.println(subHotelId);
        System.out.println(type);
        try {
            ota.jw.AutoMappingWebAPI.ProductMappingInfoRS _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see ota.jw.AutoMappingWebAPI.AutoMappingServicesSoap#mappingStatusSearch(ota.jw.AutoMappingWebAPI.MappingStatusSearchRQ mappingStatusSearchRQ)*
     */
    public ota.jw.AutoMappingWebAPI.MappingStatusSearchRS mappingStatusSearch(MappingStatusSearchRQ mappingStatusSearchRQ) {
        LOG.info("Executing operation mappingStatusSearch");
        System.out.println(mappingStatusSearchRQ);
        try {
            ota.jw.AutoMappingWebAPI.MappingStatusSearchRS _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see ota.jw.AutoMappingWebAPI.AutoMappingServicesSoap#getCtripSubHotelInfoByEBK(ota.jw.AutoMappingWebAPI.CtripSubHotelInfoByEBKRQ ctripSubHotelInfoByEBKRQ)*
     */
    public ota.jw.AutoMappingWebAPI.CtripSubHotelInfoByEBKRS getCtripSubHotelInfoByEBK(ota.jw.AutoMappingWebAPI.CtripSubHotelInfoByEBKRQ ctripSubHotelInfoByEBKRQ) {
        LOG.info("Executing operation getCtripSubHotelInfoByEBK");
        System.out.println(ctripSubHotelInfoByEBKRQ);
        try {
            ota.jw.AutoMappingWebAPI.CtripSubHotelInfoByEBKRS _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}