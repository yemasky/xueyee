package pms.service;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Endpoint;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.OTA.config.Config;
import com.OTA.service.impl.HotelServiceImpl;
import com.OTA.service.impl.OtaServiceImpl;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import core.util.Serialize;
import pms.autoMapping.ArrayOfOnOffHotelInfo;
import pms.autoMapping.ArrayOfOnOffProductInfo;
//import cn.other.serialize;
import pms.autoMapping.NotifyOnOffInfo;
import pms.autoMapping.NotifyOnOffInfoRS;
import pms.autoMapping.OnOffHotelInfo;
import pms.autoMapping.OnOffProductInfo;
import pms.autoMapping.PMSHotelMapingRS;
import pms.autoMapping.PMSNotifyOTAModelRQ;
import pms.autoMapping.PmsHotelInfoRQ;
import pms.autoMapping.SuccessType;

@WebService(targetNamespace = "http://www.opentravel.org/OTA/2003/05", name = "GetPmsInfoSoap")
@XmlSeeAlso({ pms.autoMapping.ObjectFactory.class })
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public class PmsInfoService {
	protected static Logger logger = LoggerFactory.getLogger(PmsInfoService.class);
	protected static XmlMapper xml = new XmlMapper();
	private static Endpoint pmsEndpoint = null;

	public static void main(String[] args) {
		startOtaServer();
	}

	public static void startOtaServer() {
		if (pmsEndpoint == null) {
			PmsInfoService pmsInfo = new PmsInfoService();
			pmsEndpoint = Endpoint.publish("http://localhost:8888/pmsInfo", pmsInfo);// System.out.println("发布成功！！！！");
			logger.debug("Starting pmsServer");
		} else {
			logger.debug("pmsEndpoint 已经发布成功！！！！");
		}
	}

	/**
	 * 4.7. 通知厂商绑定结果 
	 */
	@WebResult(name = "NotifyOnOffInfoRS", targetNamespace = "http://www.opentravel.org/OTA/2003/05", partName = "PMSNotifyOnOfflineResult")
	@WebMethod(operationName = "NotifyOnOffInfoRQ", action = "http://htng.org/2014B/HTNG_ARIAndReservationPushService#PMSNotifyOnOffInfo")
	public NotifyOnOffInfoRS pmsNotifyOnOffline(
			@WebParam(partName = "NotifyOnOffInfoRQ", name = "NotifyOnOffInfoRQ", targetNamespace = "http://www.opentravel.org/OTA/2003/05") PMSNotifyOTAModelRQ pmsNotifyOnOffInfoRQ) {
		String request = Serialize.objectToXml(pmsNotifyOnOffInfoRQ, PMSNotifyOTAModelRQ.class);
		
		try {
			//String ota_request = 
			xml.writeValueAsString(pmsNotifyOnOffInfoRQ);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		HotelServiceImpl hotelServiceImpl = new HotelServiceImpl();
		//
		//
		ArrayOfOnOffHotelInfo hotelInfo = pmsNotifyOnOffInfoRQ.getNotityOnoffInfos();
		List<OnOffHotelInfo> onOffHotelInfo = hotelInfo.getOnOffHotelInfo();
		if(onOffHotelInfo != null) {
			int onOffHotelSize = onOffHotelInfo.size();
			for(int i = 0; i < onOffHotelSize; i++) {
				OnOffHotelInfo onHotelInfo = onOffHotelInfo.get(i);
				String hotelCode = onHotelInfo.getHotelCode();
				int hotel_id = Integer.parseInt(hotelCode.replace(Config.hotelCodePrefix, ""));
				OtaServiceImpl.instent().saveDirectLog(hotel_id, "pmsNotifyOnOffline", "4.7. 通知厂商绑定结果 ", request, "");
				ArrayOfOnOffProductInfo allProductInfo = onHotelInfo.getOnOffProductInfos();
				List<OnOffProductInfo> onOffProductInfos = allProductInfo.getOnOffProductInfo();
				if(onOffProductInfos != null) {
					int onOffProductSize = onOffProductInfos.size();
					for(int j = 0; j < onOffProductSize; j++) {
						OnOffProductInfo offProductInfo = onOffProductInfos.get(j);
						//厂商价格代码 system_id + "-" + sell_id
						String ratePlanCode = offProductInfo.getRatePlanCode();
						String[] ratePlanKey = ratePlanCode.split("-");
						int system_id = Integer.parseInt(ratePlanKey[0]);
						int sell_id = Integer.parseInt(ratePlanKey[1]);
						//厂商房价代码  hotel_id + "-" + layout_id + "-" + sell_id
						//String roomTypeCode = offProductInfo.getRoomTypeCode();
						//String channelCode  = offProductInfo.getChannelCode();
						String onLineStatus = offProductInfo.getOnlineStatus();
						//0 通过审核
						if(onLineStatus.equals("0")) {
							try {//审核通过
								hotelServiceImpl.updateSystemDirectMapping(hotel_id, system_id, sell_id, 2);
							} catch (Exception e) {
								// TODO Auto-generated catch block
								logger.error(e.getMessage(), e);
								e.printStackTrace();
							}
						} else {
							
						}
					}
				}
			}
		}
		
		//
		logger.debug(request);
		NotifyOnOffInfoRS NotifyOnOffInfoRs = new NotifyOnOffInfoRS();
		NotifyOnOffInfo notifyOnOffInfo = new NotifyOnOffInfo();
		List<Object> objList = new ArrayList<Object>();
		objList.add(new SuccessType());
		notifyOnOffInfo.setErrorOrSuccess(objList);
		NotifyOnOffInfoRs.setNotifyOnOffInfo(notifyOnOffInfo);
		String result = Serialize.objectToXml(NotifyOnOffInfoRs, NotifyOnOffInfoRS.class);
		logger.debug(result);
		return NotifyOnOffInfoRs;
	}

	/**
	 * 获取PMS酒店信息
	 */
	@WebResult(name = "PmsHotelInfoRS", targetNamespace = "http://www.opentravel.org/OTA/2003/05", partName = "GetAllPmsHotelInfoResult")
	@WebMethod(operationName = "GetAllPmsHotelInfo", action = "http://htng.org/2014B/HTNG_ARIAndReservationPushService#GetPMSHotelInfo")
	public PMSHotelMapingRS getAllPmsHotelInfo(
			@WebParam(partName = "PmsHotelInfoRQ", name = "PmsHotelInfoRQ", targetNamespace = "http://www.opentravel.org/OTA/2003/05") PmsHotelInfoRQ pmsHotelInfoRQ) {
		String result = Serialize.objectToXml(pmsHotelInfoRQ, PmsHotelInfoRQ.class);
		logger.debug(result);
		return null;
	}
	
	

}
