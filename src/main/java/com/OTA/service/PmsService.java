package com.OTA.service;

import com.OTA.model.BookRoomData;

public interface PmsService {
	public String forwardRoomState(int hotel_id, int sell_id, String startDate, String endDate, int check);
	
	/*
	 *  取得酒店价格体系房型价格
	 */
	public String hotelRatePlan(int hotel_id, int system_id, int sell_id, String startDate, String endDate);
	
	/*
	 * 可定检查
	 */
	public String checkAvailability(int hotel_id, int system_id, int sell_id, String startDate, String endDate, int check);
	
	/*
	 * 创建订单
	 */
	public String bookRoom(BookRoomData bookRoomData);

}
