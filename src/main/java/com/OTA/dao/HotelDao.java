package com.OTA.dao;

import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.OTA.config.Config;
import com.OTA.model.Entity.Book;
import com.OTA.model.Entity.Hotel;
import com.OTA.model.Entity.Locations;
import com.OTA.model.Entity.Room_layout;
import com.OTA.model.Entity.Room_layout_price_system;
import com.OTA.model.Entity.Room_layout_price_system_direct;
import com.OTA.model.Entity.Room_sell_layout;
import com.OTA.model.Entity.Room_sell_layout_ota_close;

import core.jdbc.mysql.DBQuery;
import core.jdbc.mysql.WhereRelation;
import core.jdbc.mysql.whereCriteria;

public class HotelDao {
	
	public static HotelDao instance() {
		return new HotelDao();
	}
	
	public Hotel getHotel(int hotel_id) throws SQLException {
		HashMap<String, Object> whereSQL = new HashMap<String, Object>();
		whereSQL.put("hotel_id", hotel_id);
		WhereRelation whereRelation = new WhereRelation();
		
		String dsn = Config.smartDsn;
		if(hotel_id > 5) dsn = Config.pmsDsn;
		
		Hotel hotel = DBQuery.instance(dsn).table(Hotel.class).getEntity(whereRelation.where(whereSQL));
		return hotel;
	}
	
	public List<Hotel> getHotel(int[] hotel_id) throws SQLException {
		HashMap<String, Object> whereSQL = new HashMap<String, Object>();
		whereSQL.put("hotel_id", hotel_id);
		
		String dsn = Config.smartDsn;
		if(hotel_id[0] > 5) dsn = Config.pmsDsn;
		
		List<Hotel> hotel = DBQuery.instance(dsn).table(Hotel.class).getEntityList(WhereRelation.instance().where(whereCriteria.IN, whereSQL));
		return hotel;
	}
	
	public int updateHotel(int hotel_id, String otaHotelId, String otaSubHotel) throws SQLException {
		HashMap<String, Object> whereSQL = new HashMap<String, Object>();
		whereSQL.put("hotel_id", hotel_id);
		
		HashMap<String, Object> updateData = new HashMap<>();
		updateData.put("ota_ctrip_hotel_id", otaHotelId);
		updateData.put("ota_ctrip_sub_hotel_id", otaSubHotel);
		String dsn = Config.smartDsn;
		if(hotel_id > 5) dsn = Config.pmsDsn;
		
		return DBQuery.instance(dsn).table(Hotel.class).update(updateData, WhereRelation.instance().where(whereSQL));
	}
	
	public Locations getLocation(int locations_id) throws SQLException {
		HashMap<String, Object> whereSQL = new HashMap<String, Object>();
		whereSQL.put("locations_id", locations_id);		
		Locations locations = DBQuery.instance(Config.pmsDsn).table(Locations.class).getEntity(WhereRelation.instance().where(whereSQL));
		return locations;
	}
	
	public List<Locations> getLocation(int[] locations_id) throws SQLException {
		HashMap<String, Object> whereSQL = new HashMap<String, Object>();
		whereSQL.put("locations_id", locations_id);
		List<Locations> locations = DBQuery.instance(Config.pmsDsn).table(Locations.class).getEntityList(WhereRelation.instance().where(whereCriteria.IN, whereSQL));
		return locations;
	}
	
	public List<Room_layout> getRoomLayout(int[] hotel_id) throws SQLException {
		HashMap<String, Object> whereSQL = new HashMap<String, Object>();
		whereSQL.put("hotel_id", hotel_id);
		

		String dsn = Config.smartDsn;
		if(hotel_id[0] > 5) dsn = Config.pmsDsn;
		
		List<Room_layout> roomLayout = DBQuery.instance(dsn).table(Room_layout.class).getEntityList(WhereRelation.instance().where(whereCriteria.IN, whereSQL));
		return roomLayout;
	}
	
	public List<Room_layout> getRoomLayout(int hotel_id, int layout_id) throws SQLException {
		HashMap<String, Object> whereSQL = new HashMap<String, Object>();
		whereSQL.put("hotel_id", hotel_id);
		whereSQL.put("room_layout_id", layout_id);

		String dsn = Config.smartDsn;
		if(hotel_id > 5) dsn = Config.pmsDsn;
		
		List<Room_layout> roomLayout = DBQuery.instance(dsn).table(Room_layout.class).getEntityList(WhereRelation.instance().where(whereCriteria.IN, whereSQL));
		return roomLayout;
	}
	
	public List<Room_sell_layout> getRoomSellLayout(int[] hotel_id) throws SQLException {
		HashMap<String, Object> whereSQL = new HashMap<String, Object>();
		whereSQL.put("hotel_id", hotel_id);
		whereSQL.put("ota_direct", "1");
		
		String dsn = Config.smartDsn;
		if(hotel_id[0] > 5) dsn = Config.pmsDsn;
		
		List<Room_sell_layout> roomSellLayout = DBQuery.instance(dsn).table(Room_sell_layout.class).getEntityList(WhereRelation.instance().where(whereCriteria.IN, whereSQL));
		return roomSellLayout;
	}
	
	public List<Room_sell_layout> getRoomSellLayout(int hotel_id, int sell_id) throws SQLException {
		HashMap<String, Object> whereSQL = new HashMap<String, Object>();
		whereSQL.put("hotel_id", hotel_id);
		whereSQL.put("room_sell_layout_id", sell_id);
		whereSQL.put("ota_direct", "1");
		
		String dsn = Config.smartDsn;
		if(hotel_id > 5) dsn = Config.pmsDsn;
		
		List<Room_sell_layout> roomSellLayout = DBQuery.instance(dsn).table(Room_sell_layout.class).getEntityList(WhereRelation.instance().where(whereCriteria.IN, whereSQL));
		return roomSellLayout;
	}
	
	/*
	 * 获得直连的全部价格体系
	 */
	public List<Room_layout_price_system> getRoomLayoutPriceSystem(int[] hotel_ids) throws SQLException {
		Map<whereCriteria, HashMap<String, Object>> whereSQL = new HashMap<whereCriteria, HashMap<String, Object>>();
		HashMap<String, Object> whereIn = new HashMap<String, Object>();
		whereIn.put("hotel_id", hotel_ids);
		whereSQL.put(whereCriteria.IN, whereIn);
		HashMap<String, Object> whereEQ = new HashMap<String, Object>();
		whereEQ.put("ota_direct", "1");
		whereSQL.put(whereCriteria.EQ, whereEQ);
		
		String dsn = Config.smartDsn;
		if(hotel_ids[0] > 5) dsn = Config.pmsDsn;
		
		List<Room_layout_price_system> roomLayoutPriceSystem = DBQuery.instance(dsn).table(Room_layout_price_system.class).getEntityList(WhereRelation.instance().where(whereSQL));
		return roomLayoutPriceSystem;
	}
	
	public List<Room_layout_price_system> getRoomLayoutPriceSystem(int hotel_id, int system_id) throws SQLException {
		Map<whereCriteria, HashMap<String, Object>> whereSQL = new HashMap<whereCriteria, HashMap<String, Object>>();
		HashMap<String, Object> whereEQ = new HashMap<String, Object>();
		whereEQ.put("hotel_id", hotel_id);
		whereEQ.put("ota_direct", "1");
		whereEQ.put("room_layout_price_system_id", system_id);
		whereSQL.put(whereCriteria.EQ, whereEQ);
		
		String dsn = Config.smartDsn;
		if(hotel_id > 5) dsn = Config.pmsDsn;
		
		List<Room_layout_price_system> roomLayoutPriceSystem = DBQuery.instance(dsn).table(Room_layout_price_system.class).getEntityList(WhereRelation.instance().where(whereSQL));
		return roomLayoutPriceSystem;
	}
	
	//Room_layout_price_system_direct
	public List<Room_layout_price_system_direct> getRoomSystemDirect(int hotel_id) throws SQLException {
		Map<whereCriteria, HashMap<String, Object>> whereSQL = new HashMap<whereCriteria, HashMap<String, Object>>();
		HashMap<String, Object> whereEQ = new HashMap<String, Object>();
		whereEQ.put("hotel_id", hotel_id);
		whereSQL.put(whereCriteria.EQ, whereEQ);
		
		String dsn = Config.smartDsn;
		if(hotel_id > 5) dsn = Config.pmsDsn;
		
		List<Room_layout_price_system_direct> system_direct = DBQuery.instance(dsn).table(Room_layout_price_system_direct.class).getEntityList(WhereRelation.instance().where(whereSQL));
		return system_direct;
	}
	
	public List<Room_layout_price_system_direct> getRoomSystemDirect(int hotel_id, int system_id) throws SQLException {
		Map<whereCriteria, HashMap<String, Object>> whereSQL = new HashMap<whereCriteria, HashMap<String, Object>>();
		HashMap<String, Object> whereEQ = new HashMap<String, Object>();
		whereEQ.put("hotel_id", hotel_id);
		whereEQ.put("room_layout_price_system_id", system_id);
		whereSQL.put(whereCriteria.EQ, whereEQ);
		
		String dsn = Config.smartDsn;
		if(hotel_id > 5) dsn = Config.pmsDsn;
		
		List<Room_layout_price_system_direct> system_direct = DBQuery.instance(dsn).table(Room_layout_price_system_direct.class).getEntityList(WhereRelation.instance().where(whereSQL));
		return system_direct;
	}
	
	public List<Room_layout_price_system_direct> getRoomSystemDirect(int hotel_id, int system_id, int sell_id) throws SQLException {
		Map<whereCriteria, HashMap<String, Object>> whereSQL = new HashMap<whereCriteria, HashMap<String, Object>>();
		HashMap<String, Object> whereEQ = new HashMap<String, Object>();
		whereEQ.put("hotel_id", hotel_id);
		whereEQ.put("room_layout_price_system_id", system_id);
		whereEQ.put("room_sell_layout_id", sell_id);
		whereSQL.put(whereCriteria.EQ, whereEQ);
		
		String dsn = Config.smartDsn;
		if(hotel_id > 5) dsn = Config.pmsDsn;
		
		List<Room_layout_price_system_direct> system_direct = DBQuery.instance(dsn).table(Room_layout_price_system_direct.class).getEntityList(WhereRelation.instance().where(whereSQL));
		return system_direct;
	}
	
	public int updateRoomSystemDirect(int hotel_id, int system_id, int sell_id, HashMap<String, Object> updateData) throws SQLException {
		Map<whereCriteria, HashMap<String, Object>> whereSQL = new HashMap<whereCriteria, HashMap<String, Object>>();
		HashMap<String, Object> whereEQ = new HashMap<String, Object>();
		whereEQ.put("hotel_id", hotel_id);
		whereEQ.put("room_layout_price_system_id", system_id);
		whereEQ.put("room_sell_layout_id", sell_id);
		whereSQL.put(whereCriteria.EQ, whereEQ);
		
		String dsn = Config.smartDsn;
		if(hotel_id > 5) dsn = Config.pmsDsn;
		
		return DBQuery.instance(dsn).table(Room_layout_price_system_direct.class).update(updateData, WhereRelation.instance().where(whereSQL));
	}	
	
	public int updateSystemDirectMapping(int hotel_id, int system_id, int sell_id, int mapping) throws SQLException {
		HashMap<String, Object> whereSQL = new HashMap<String, Object>();
		whereSQL.put("hotel_id", hotel_id);
		whereSQL.put("room_layout_price_system_id", system_id);
		whereSQL.put("room_sell_layout_id", sell_id);
		HashMap<String, Object> updateData = new HashMap<String, Object>();
		updateData.put("mapping_status", mapping);
		updateData.put("excute_code", "0");//执行之后变成无操作
		
		String dsn = Config.smartDsn;
		if(hotel_id > 5) dsn = Config.pmsDsn;
		
		return DBQuery.instance(dsn).table(Room_layout_price_system_direct.class).update(updateData, WhereRelation.instance().where(whereSQL));
	}
	
	public int updateSystemDirectCreate(int hotel_id, int system_id, int sell_id) throws SQLException {
		HashMap<String, Object> whereSQL = new HashMap<String, Object>();
		whereSQL.put("hotel_id", hotel_id);
		whereSQL.put("room_layout_price_system_id", system_id);
		whereSQL.put("room_sell_layout_id", sell_id);
		HashMap<String, Object> updateData = new HashMap<String, Object>();
		updateData.put("is_create", "1");
		updateData.put("ota_sync_success", "1");
		updateData.put("excute_code", "0");//执行之后变成无操作
		
		String dsn = Config.smartDsn;
		if(hotel_id > 5) dsn = Config.pmsDsn;
		
		return DBQuery.instance(dsn).table(Room_layout_price_system_direct.class).update(updateData, WhereRelation.instance().where(whereSQL));
	}
	
	//
	public int checkOtaISBook(int hotel_id, String order_number) throws SQLException {
		HashMap<String, Object> whereSQL = new HashMap<String, Object>();
		whereSQL.put("book_order_number_ourter", order_number);
		
		String dsn = Config.smartDsn;
		if(hotel_id > 5) dsn = Config.pmsDsn;
		
		Book book = DBQuery.instance(dsn).table(Book.class).getEntity(WhereRelation.instance().where(whereSQL));
		if(book != null) return book.getBook_id();
		return 0;
	}
	
	public Book checkOtaBookStatus(int hotel_id, String order_number) throws SQLException {
		HashMap<String, Object> whereSQL = new HashMap<String, Object>();
		whereSQL.put("book_order_number_ourter", order_number);
		
		String dsn = Config.smartDsn;
		if(hotel_id > 5) dsn = Config.pmsDsn;
		
		Book book = DBQuery.instance(dsn).table(Book.class).getEntity(WhereRelation.instance().where(whereSQL));
		return book;
	}
	
	public List<Book> getBook(int hotel_id, String order_number_ourter) throws SQLException {
		HashMap<String, Object> whereSQL = new HashMap<String, Object>();
		whereSQL.put("book_order_number_ourter", order_number_ourter);
		//whereSQL.put("book_change", "0");
		
		String dsn = Config.smartDsn;
		if(hotel_id > 5) dsn = Config.pmsDsn;
		
		List<Book> book = DBQuery.instance(dsn).table(Book.class).getEntityList(WhereRelation.instance().where(whereSQL));
		return book;
	}
	
	public List<Book> getBook(int hotel_id, int book_id) throws SQLException {
		Map<whereCriteria, HashMap<String, Object>> whereSQL = new HashMap<whereCriteria, HashMap<String, Object>>();
		HashMap<String, Object> whereEQ = new HashMap<String, Object>();
		whereEQ.put("book_id", book_id);
		//whereEQ.put("book_change", "0");
		whereSQL.put(whereCriteria.EQ, whereEQ);
		HashMap<String, Object> whereNE = new HashMap<String, Object>();
		whereNE.put("book_order_number_ourter", "");
		whereSQL.put(whereCriteria.NE, whereNE);
		
		String dsn = Config.smartDsn;
		if(hotel_id > 5) dsn = Config.pmsDsn;
		
		List<Book> book = DBQuery.instance(dsn).table(Book.class).getEntityList(WhereRelation.instance().where(whereSQL));
		return book;
	}
	
	public int updateBook(int hotel_id, int book_id, String ota_status) throws Exception {
		HashMap<String, Object> whereSQL = new HashMap<String, Object>();
		whereSQL.put("book_id", book_id);
		HashMap<String, Object> updateData = new HashMap<String, Object>();
		updateData.put("book_ota_status", ota_status);

		String dsn = Config.smartDsn;
		if(hotel_id > 5) dsn = Config.pmsDsn;
		
		return DBQuery.instance(dsn).table(Book.class).update(updateData, WhereRelation.instance().where(whereSQL));
		
	}
	
	public List<Room_sell_layout_ota_close> getOtaClose(int hotel_id) throws SQLException {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String thisDay = dateFormat.format(new Date());
		
		Map<whereCriteria, HashMap<String, Object>> whereSQL = new HashMap<whereCriteria, HashMap<String, Object>>();
		HashMap<String, Object> whereEQ = new HashMap<String, Object>();
		whereEQ.put("hotel_id", hotel_id);
		whereSQL.put(whereCriteria.EQ, whereEQ);
		HashMap<String, Object> whereGE = new HashMap<String, Object>();
		whereGE.put("close_date", thisDay);
		whereSQL.put(whereCriteria.GE, whereGE);
		
		String dsn = Config.smartDsn;
		if(hotel_id > 5) dsn = Config.pmsDsn;
		
		List<Room_sell_layout_ota_close> ota_close = DBQuery.instance(dsn).table(Room_sell_layout_ota_close.class).getEntityList(WhereRelation.instance().where(whereSQL));
		return ota_close;
	}
}


