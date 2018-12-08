package com.OTA.service.impl;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import com.OTA.dao.HotelDao;
import com.OTA.model.Entity.Book;
import com.OTA.model.Entity.Hotel;
import com.OTA.model.Entity.Locations;
import com.OTA.model.Entity.Room_layout;
import com.OTA.model.Entity.Room_layout_price_system;
import com.OTA.model.Entity.Room_layout_price_system_direct;
import com.OTA.model.Entity.Room_sell_layout;
import com.OTA.model.Entity.Room_sell_layout_ota_close;
import com.OTA.service.HotelService;

public class HotelServiceImpl implements HotelService {

	@Override
	public Hotel getHotel(int hotel_id) throws SQLException {
		// TODO Auto-generated method stub
		return HotelDao.instance().getHotel(hotel_id);
	}
	public int updateHotel(int hotel_id, String otaHotelId, String otaSubHotel) throws Exception {
		return HotelDao.instance().updateHotel(hotel_id, otaHotelId, otaSubHotel);
	}
	@Override
	public Locations getLocation(int locations_id) throws SQLException {
		// TODO Auto-generated method stub
		return HotelDao.instance().getLocation(locations_id);
	}

	@Override
	public List<Locations> getLocation(int[] locations_id) throws SQLException {
		// TODO Auto-generated method stub
		return HotelDao.instance().getLocation(locations_id);
	}

	@Override
	public List<Room_layout> getRoomLayout(int[] hotel_id) throws SQLException {
		// TODO Auto-generated method stub
		return HotelDao.instance().getRoomLayout(hotel_id);
	}
	
	public List<Room_layout> getRoomLayout(int hotel_id, int layout_id) throws SQLException {
		// TODO Auto-generated method stub
		return HotelDao.instance().getRoomLayout(hotel_id, layout_id);
	}

	@Override
	public List<Room_sell_layout> getRoomSellLayout(int[] hotel_id) throws SQLException {
		// TODO Auto-generated method stub
		return HotelDao.instance().getRoomSellLayout(hotel_id);
	}
	
	public List<Room_sell_layout> getRoomSellLayout(int hotel_id, int sell_id) throws SQLException {
		// TODO Auto-generated method stub
		return HotelDao.instance().getRoomSellLayout(hotel_id, sell_id);
	}

	//Room_layout_price_system
	@Override
	public List<Room_layout_price_system> getRoomLayoutPriceSystem(int[] hotel_id) throws SQLException {
		// TODO Auto-generated method stub
		return HotelDao.instance().getRoomLayoutPriceSystem(hotel_id);
	}
	
	public List<Room_layout_price_system> getRoomLayoutPriceSystem(int hotel_id,int system_id) throws SQLException {
		return HotelDao.instance().getRoomLayoutPriceSystem(hotel_id, system_id);
	}
	
	//Room_layout_price_system_direct
	public List<Room_layout_price_system_direct> getRoomSystemDirect(int hotel_id) throws SQLException{
		return HotelDao.instance().getRoomSystemDirect(hotel_id);
	}
	public List<Room_layout_price_system_direct> getRoomSystemDirect(int hotel_id,int system_id) throws SQLException{
		return HotelDao.instance().getRoomSystemDirect(hotel_id, system_id);
	}
	public List<Room_layout_price_system_direct> getRoomSystemDirect(int hotel_id,int system_id, int sell_id) throws SQLException{
		return HotelDao.instance().getRoomSystemDirect(hotel_id, system_id, sell_id);
	}
	public int updateSystemDirectMapping(int hotel_id, int system_id, int sell_id, int mapping) throws Exception {
		return HotelDao.instance().updateSystemDirectMapping(hotel_id, system_id, sell_id, mapping);
	}
	public int updateSystemDirectCreate(int hotel_id, int system_id, int sell_id) throws Exception {
		return HotelDao.instance().updateSystemDirectCreate(hotel_id, system_id, sell_id);
	}
	public int updateRoomSystemDirect(int hotel_id, int system_id, int sell_id, HashMap<String, Object> updateData) throws Exception {
		return HotelDao.instance().updateRoomSystemDirect(hotel_id, system_id, sell_id, updateData);
	}
	//
	public int checkOtaISBook(int hotel_id, String order_number) throws SQLException {
		return HotelDao.instance().checkOtaISBook(hotel_id, order_number);
	}
	
	public Book checkOtaBookStatus(int hotel_id, String order_number) throws SQLException {
		return HotelDao.instance().checkOtaBookStatus(hotel_id, order_number);
	}
	
	public List<Book> getBook(int hotel_id, String order_number) throws SQLException {
		return HotelDao.instance().getBook(hotel_id, order_number);
	}
	
	public List<Book> getBook(int hotel_id, int book_id) throws SQLException {
		return HotelDao.instance().getBook(hotel_id, book_id);
	}
	
	public int updateBook(int hotel_id, int book_id, String ota_status) throws Exception {
		return HotelDao.instance().updateBook(hotel_id, book_id, ota_status);
	}

	public List<Room_sell_layout_ota_close> getOtaClose(int hotel_id) throws SQLException {
		return HotelDao.instance().getOtaClose(hotel_id);
	}
}
