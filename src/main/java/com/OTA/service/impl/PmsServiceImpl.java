package com.OTA.service.impl;

import com.OTA.model.BookRoomData;
import com.OTA.service.PmsService;

import core.util.HttpRequest;
import core.util.ReadProperties;

public class PmsServiceImpl implements PmsService {

	/*
	 * (non-Javadoc)
	 * 远期房态
	 */
	@Override
	public String forwardRoomState(int hotel_id, int sell_id, String startDate, String endDate, int check) {
		// TODO Auto-generated method stub
		String param = "module=Jointwisdom&action=forwardRoomState&hotel_id="+hotel_id+"&sell_id="+sell_id+"&check_in="+startDate+"&check_out="+endDate
				+"&checkAvailability="+check;
		
		String url = ReadProperties.instance().read("smartApiServer");
		if(hotel_id > 5) url = ReadProperties.instance().read("pmsApiServer");
		
		String result = HttpRequest.sendGet(url, param);
		return result;
	}

	@Override
	public String hotelRatePlan(int hotel_id, int system_id, int sell_id, String startDate, String endDate) {
		String param = "module=Jointwisdom&action=hotelRatePlan&ota_direct=1&hotel_id="+hotel_id+"&history_begin="+startDate+"&history_end="+endDate+
				"&system_id="+system_id+"&sell_layout="+sell_id;
		
		String url = ReadProperties.instance().read("smartApiServer");
		if(hotel_id > 5) url = ReadProperties.instance().read("pmsApiServer");
		
		String result = HttpRequest.sendGet(url, param);
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 可订检查
	 */
	@Override
	public String checkAvailability(int hotel_id, int system_id, int sell_id, String startDate, String endDate, int check) {
		//action=checkAvailability&hotel_id=3&check_in=2018-08-14&check_out=2018-08-31&ota_direct=1&system_id=38&sell_layout=14
		String param = "module=Jointwisdom&action=checkAvailability&ota_direct=1&hotel_id="+hotel_id+"&check_in="+startDate+"&check_out="+endDate+
				"&system_id="+system_id+"&sell_layout="+sell_id+"&checkAvailability="+check;
		
		String url = ReadProperties.instance().read("smartApiServer");
		if(hotel_id > 5) url = ReadProperties.instance().read("pmsApiServer");
		
		String result = HttpRequest.sendGet(url, param);
		return result;
	}

	@Override
	public String bookRoom(BookRoomData bookRoomData) {
		//;int hotel_id, String bookMultiple, int book_type, String sell_key, String contact_name, String guarantee, String number_ourter, String note
		String param = "module=Jointwisdom&action=bookRoom&hotel_id="+bookRoomData.getHotel_id()+
				"&bookMultipleData="+bookRoomData.getBookMultiple()+"&book_type="+bookRoomData.getBook_type()+"&contact_name="+bookRoomData.getContact_name()
				+"&number_ourter="+bookRoomData.getNumber_ourter()+"&notes="+bookRoomData.getNote()+"&sell_key="+bookRoomData.getSell_key()
				+"&client="+bookRoomData.getClient()+"&guarantee="+bookRoomData.getGuarantee()+"&cash_pledge="+bookRoomData.getBook_cash_pledge()
				+"&direct_system_id="+bookRoomData.getSystem_id();
		
		String url = ReadProperties.instance().read("smartApiServer");
		if(bookRoomData.getHotel_id() > 5) url = ReadProperties.instance().read("pmsApiServer");
		
		String result = HttpRequest.sendPost(url, param);
		return result;
	}
	
	public String cancelBookRoom(int hotel_id, long order_number) {
		String param = "module=Jointwisdom&action=cancel&hotel_id="+hotel_id+"&book_order_number="+order_number;
		
		String url = ReadProperties.instance().read("smartApiServer");
		if(hotel_id > 5) url = ReadProperties.instance().read("pmsApiServer");
		
		String result = HttpRequest.sendGet(url, param);
		return result;
		
	}

	
	
}
