package com.OTA.controller;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.base.controller.AbstractController;

import ota.jw.impl.JwAutoMappingImpl;
import ota.jw.impl.JwPMSGatewayImpl;

@Controller
@RequestMapping("/OTA")
public class OtaController extends AbstractController {

	@Override
	public void check(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub

	}

	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub

	}

	@Override
	public void afterCheck(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		/*
		 * try { logger.info("关闭连接."); CommonDao.instance().closeAllConnection(); }
		 * catch (SQLException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); logger.error("关闭连接失败!", e); }
		 */// 关闭当前连接
	}

	@Override
	public String defaultAction(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return null;
	}

	@RequestMapping(value = "/otatest/{test}")
	@ResponseBody
	public Map<String, String> otatest(@PathVariable("test") String test, ModelMap model) throws SQLException {
		Map<String, String> testMap = new HashMap<>();
		testMap.put(test, test);

		return testMap;
	}

	/*
	 * 创建酒店产品
	 */
	@RequestMapping(value = "/createHotelSell/{hotel_id}/{system_id}/{sell_id}")
	@ResponseBody
	public Map<String, String> createHotelSell(@PathVariable("hotel_id") int hotel_id, @PathVariable("system_id") int system_id,
			@PathVariable("sell_id") int sell_id, ModelMap model) throws SQLException {
		try {
			JwAutoMappingImpl.createHotel(hotel_id, system_id, sell_id);
			this.afterCheck(request, response);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("createHotelSell Error", e);
		}
		return null;
	}

	@RequestMapping(value = "/getOtaHotel/{hotel_id}/{name}/{pass}")
	@ResponseBody
	public Map<String, String> getOtaHotel(@PathVariable("hotel_id") int hotel_id, @PathVariable("name") String name,
			@PathVariable("pass") String pass, ModelMap model) throws SQLException {
		try {
			JwAutoMappingImpl.GetCtripSubHotelInfoByEBK(hotel_id, name, pass);
			this.afterCheck(request, response);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("createHotelSell Error", e);
		}
		return null;
	}

	/*
	 * 匹配酒店产品
	 */
	@RequestMapping(value = "/mappingHotelSell/{hotel_id}/{system_id}/{sell_id}", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, String> mappingHotelSell(@PathVariable int hotel_id, @PathVariable int system_id, @PathVariable int sell_id)
			throws SQLException {
		try {
			JwAutoMappingImpl.mappingHotelProduct(hotel_id, system_id, sell_id);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("mappingHotelSell Error", e);
		}

		return null;
	}

	/*
	 * 4.8 产品审核结果查询
	 * 
	 * @param hotel_id,system_id,sell_id
	 */
	@RequestMapping(value = "/mappingStatusSearch/{hotel_id}/{system_id}/{sell_id}", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, String> mappingStatusSearch(@PathVariable int hotel_id, @PathVariable int system_id, @PathVariable int sell_id)
			throws SQLException {
		try {
			JwAutoMappingImpl.mappingStatusSearch(hotel_id, system_id, sell_id);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("mappingStatusSearch Error", e);
		}

		return null;
	}

	/*
	 * 5.1. 房态推送[EBK 规则] OTA_HotelAvailNotifRQ
	 * 
	 * @param hotel_id,system_id,startDate,endDate,open == 0 [关闭]
	 */
	@RequestMapping(value = "/hotelAvailNotif/{hotel_id}/{system_id}/{sell_id}/{startDate}_{endDate}/{open}", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, String> hotelAvailNotif(@PathVariable int hotel_id, @PathVariable int system_id, @PathVariable int sell_id,
			@PathVariable String startDate, @PathVariable String endDate, @PathVariable String open) {

		try {
			//执行表
			if (startDate.equals("0")) {
				JwPMSGatewayImpl.OTA_HotelAvailNotifRQ(hotel_id);
			} else {
				// 全开
				JwPMSGatewayImpl.OTA_HotelAvailNotifRQ(hotel_id, system_id, sell_id, startDate, endDate, open);
			}
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("5.1. 房态推送[EBK 规则] OTA_HotelAvailNotifRQ Error", e);
		}

		return null;
	}

	/*
	 * 5.3. 房价推送[EBK 规则]
	 * 
	 * @param hotel_id,system_id,startDate,endDate
	 */
	@RequestMapping(value = "/hotelRatePlanNotif/{hotel_id}/{system_id}/{sell_id}/{startDate}_{endDate}")
	@ResponseBody
	public Map<String, String> hotelRatePlanNotifRQ(@PathVariable("hotel_id") int hotel_id, @PathVariable int system_id,
			@PathVariable int sell_id, @PathVariable String startDate, @PathVariable String endDate, ModelMap model) {

		try {
			JwPMSGatewayImpl.OTA_HotelRatePlanNotifRQ(hotel_id, system_id, sell_id, startDate, endDate);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("5.3. 房价推送[EBK 规则] hotelRatePlanNotifRQ Error", e);
		}

		return null;
	}

	/*
	 * 5.5. 房量推送[EBK 规则]
	 * 
	 * @param hotel_id,sell_id,startDate,endDate
	 */
	@RequestMapping(value = "/hotelInvCountNotifRQ/{hotel_id}/{sell_id}/{startDate}_{endDate}")
	@ResponseBody
	public Map<String, String> hotelInvCountNotifRQ(@PathVariable("hotel_id") int hotel_id, @PathVariable int sell_id,
			@PathVariable String startDate, @PathVariable String endDate, ModelMap model) {
		try {
			JwPMSGatewayImpl.OTA_HotelInvCountNotifRQ(hotel_id, sell_id, startDate, endDate);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("5.5. 房量推送[EBK 规则] hotelInvCountNotifRQ Error", e);
		}
		return null;
	}

	/*
	 * 5.11. 订单审核 订单入住、离店、NoShow、取消时，PMS 及时将订单状态信息发送给入住通。审核状态
	 * 共四种，分别为：入住、离店、NoShow、取消（PMS 取消）。 此处，PMS 取消仅是酒店端和 客人协商后客人不来而做的释放房量动作，该订单入住通以
	 * NoShow 形式给 OTA，若想 OTA 端的订单取消只能让客人在 OTA 上发起取消动作， PMS/CRS 无法通过接口取消 OTA 订单。
	 * 接口调用方：合作方 接口返回方：入住通
	 */
	@RequestMapping(value = "/hotelStayInfoNotifRQ/{hotel_id}/{book_id}/{order_number_ourter}")
	@ResponseBody
	public Map<String, String> hotelStayInfoNotifRQ(@PathVariable("hotel_id") int hotel_id, @PathVariable int book_id,
			@PathVariable String order_number_ourter, ModelMap model) {
		try {
			// OTAHotelInvCountNotifRS invCountNotifRS
			JwPMSGatewayImpl.OTA_HotelStayInfoNotifRQ(hotel_id, book_id, order_number_ourter);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("5.11. 订单审核  hotelStayInfoNotifRQ Error", e);
		}
		return null;
	}

	/*
	 * 6.1. 闪住入住/NoShow 通知 闪住订单的客人在酒店入住或订单 NoShow 时，PMS 将状态信息传给入住通，以供携程 结算组扣款参考。
	 * 接口调用方：合作方 接口返回方：入住通
	 */
	@RequestMapping(value = "/orderCheckInNoticeRQ/{hotel_id}/{book_id}/{order_number_ourter}")
	@ResponseBody
	public Map<String, String> OrderCheckInNoticeRQ(@PathVariable("hotel_id") int hotel_id, @PathVariable int book_id,
			@PathVariable String order_number_ourter, ModelMap model) {
		try {
			// OTAHotelInvCountNotifRS invCountNotifRS
			JwPMSGatewayImpl.OrderCheckInNoticeRQ(hotel_id, book_id, order_number_ourter);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("6.1. 闪住入住/NoShow 通知  OrderCheckInNoticeRQ Error", e);
		}
		return null;
	}

	/*
	 * 6.2. 闪住离店扣款 闪住订单的客人在酒店离店时，PMS 将状态信息及结算信息传给入住通，以供携程结算 组扣款参考。 接口调用方：合作方
	 * 接口返回方：入住通
	 */
	@RequestMapping(value = "/orderCheckOutNoticeRQ/{hotel_id}/{book_id}/{order_number_ourter}")
	@ResponseBody
	public Map<String, String> orderApplyPaymentRQ(@PathVariable("hotel_id") int hotel_id, @PathVariable int book_id,
			@PathVariable String order_number_ourter, ModelMap model) {
		try {
			// OTAHotelInvCountNotifRS invCountNotifRS
			JwPMSGatewayImpl.OrderApplyPaymentRQ(hotel_id, book_id, order_number_ourter);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("6.2. 闪住离店扣款  orderApplyPaymentRQ Error", e);
		}
		return null;
	}

}
