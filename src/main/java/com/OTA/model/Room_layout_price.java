package com.OTA.model;

import java.util.HashMap;

public class Room_layout_price {
	private int room_sell_layout_id;
	private int room_layout_id;
	private int hotel_id;;
	private int policy_id;
	private String poduct_type;
	private int booking_advance;
	private int ota_breakfast;
	private	String ota_price_system_type;
	private String system_name;
	private HashMap<String, HashMap<String, String>> day_price;
	public int getRoom_sell_layout_id() {
		return room_sell_layout_id;
	}
	public void setRoom_sell_layout_id(int room_sell_layout_id) {
		this.room_sell_layout_id = room_sell_layout_id;
	}
	public int getRoom_layout_id() {
		return room_layout_id;
	}
	public void setRoom_layout_id(int room_layout_id) {
		this.room_layout_id = room_layout_id;
	}
	public int getHotel_id() {
		return hotel_id;
	}
	public void setHotel_id(int hotel_id) {
		this.hotel_id = hotel_id;
	}
	public int getPolicy_id() {
		return policy_id;
	}
	public void setPolicy_id(int policy_id) {
		this.policy_id = policy_id;
	}
	public String getPoduct_type() {
		return poduct_type;
	}
	public void setPoduct_type(String poduct_type) {
		this.poduct_type = poduct_type;
	}
	public int getBooking_advance() {
		return booking_advance;
	}
	public void setBooking_advance(int booking_advance) {
		this.booking_advance = booking_advance;
	}
	public int getOta_breakfast() {
		return ota_breakfast;
	}
	public void setOta_breakfast(int ota_breakfast) {
		this.ota_breakfast = ota_breakfast;
	}
	public String getOta_price_system_type() {
		return ota_price_system_type;
	}
	public void setOta_price_system_type(String ota_price_system_type) {
		this.ota_price_system_type = ota_price_system_type;
	}
	public String getSystem_name() {
		return system_name;
	}
	public void setSystem_name(String system_name) {
		this.system_name = system_name;
	}
	public HashMap<String, HashMap<String, String>> getDay_price() {
		return day_price;
	}
	public void setDay_price(HashMap<String, HashMap<String, String>> day_price) {
		this.day_price = day_price;
	}
	
}
