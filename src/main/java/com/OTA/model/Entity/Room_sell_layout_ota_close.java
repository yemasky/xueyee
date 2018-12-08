package com.OTA.model.Entity;

import java.sql.Date;

public class Room_sell_layout_ota_close {
	private int direct_system_id;
	private int room_sell_layout_id;
	private int room_layout_price_system_id;
	private int hotel_id;
	private String ota_direct_type;
	private String ota_code;
	private Date close_date;
	private String ota_close;
	public int getDirect_system_id() {
		return direct_system_id;
	}
	public void setDirect_system_id(int direct_system_id) {
		this.direct_system_id = direct_system_id;
	}
	public int getRoom_sell_layout_id() {
		return room_sell_layout_id;
	}
	public void setRoom_sell_layout_id(int room_sell_layout_id) {
		this.room_sell_layout_id = room_sell_layout_id;
	}
	public int getRoom_layout_price_system_id() {
		return room_layout_price_system_id;
	}
	public void setRoom_layout_price_system_id(int room_layout_price_system_id) {
		this.room_layout_price_system_id = room_layout_price_system_id;
	}
	public int getHotel_id() {
		return hotel_id;
	}
	public void setHotel_id(int hotel_id) {
		this.hotel_id = hotel_id;
	}
	public String getOta_direct_type() {
		return ota_direct_type;
	}
	public void setOta_direct_type(String ota_direct_type) {
		this.ota_direct_type = ota_direct_type;
	}
	public String getOta_code() {
		return ota_code;
	}
	public void setOta_code(String ota_code) {
		this.ota_code = ota_code;
	}
	public Date getClose_date() {
		return close_date;
	}
	public void setClose_date(Date close_date) {
		this.close_date = close_date;
	}
	public String getOta_close() {
		return ota_close;
	}
	public void setOta_close(String ota_close) {
		this.ota_close = ota_close;
	}
	

}
