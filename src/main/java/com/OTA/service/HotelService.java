package com.OTA.service;

import java.sql.SQLException;
import java.util.List;

import com.OTA.model.Entity.Hotel;
import com.OTA.model.Entity.Locations;
import com.OTA.model.Entity.Room_layout;
import com.OTA.model.Entity.Room_layout_price_system;
import com.OTA.model.Entity.Room_layout_price_system_direct;
import com.OTA.model.Entity.Room_sell_layout;

public interface HotelService {
	public Hotel getHotel(int hotel_id) throws SQLException;
	
	public Locations getLocation(int locations_id) throws SQLException;
	
	public List<Locations> getLocation(int[] locations_id) throws SQLException;
	
	public List<Room_layout> getRoomLayout(int[] hotel_id) throws SQLException;
	
	public List<Room_sell_layout> getRoomSellLayout(int[] hotel_id) throws SQLException;
	
	public List<Room_layout_price_system> getRoomLayoutPriceSystem(int[] hotel_id) throws SQLException;
	
	public List<Room_layout_price_system_direct> getRoomSystemDirect(int hotel_id) throws SQLException;
	
}
