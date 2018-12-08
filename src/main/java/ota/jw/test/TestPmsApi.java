package ota.jw.test;

import java.io.IOException;
import java.math.BigInteger;
import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.OTA.model.BookRoomData;
import com.OTA.model.CheckAvailability_result;
import com.OTA.model.ForwardRoomState_result;
import com.OTA.model.Room_layout_price;
import com.OTA.model.Room_layout_price_result;
import com.OTA.service.impl.PmsServiceImpl;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class TestPmsApi {
	protected static XmlMapper xml = new XmlMapper();
	protected static ObjectMapper mapper = new ObjectMapper();
	protected static Logger logger = LoggerFactory.getLogger(TestPmsApi.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//forwardRoomState();
		//hotelRatePlan();
		//checkAvailability();
		//bookRoom();
		cancelBookRoom();
	}

	public static void forwardRoomState() {
		PmsServiceImpl pmsServiceImpl = new PmsServiceImpl();
		String forwardRoomStateResult = pmsServiceImpl.forwardRoomState(3, 14, "2018-08-14", "2018-08-31", 0);
		//
		logger.info(forwardRoomStateResult);
		try {//
			ForwardRoomState_result forwardRoomState = mapper.readValue(forwardRoomStateResult,
					ForwardRoomState_result.class);
			HashMap<String, HashMap<String, String>> jsonResult = forwardRoomState.getItemData();
			for (String key : jsonResult.keySet()) {
				System.out.println(key);
				HashMap<String, String> layoutRoom = jsonResult.get(key);
				for (String layout_id : layoutRoom.keySet()) {
					System.out.println(layout_id + ":" + layoutRoom.get(layout_id));
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// logger.info(result);
	}

	public static void hotelRatePlan() {
		PmsServiceImpl pmsServiceImpl = new PmsServiceImpl();
		String result = pmsServiceImpl.hotelRatePlan(3, 38, 14, "2018-05-02", "2018-08-02");
		try {
			JsonNode nodeResult = mapper.readTree(result);
			if (nodeResult.get("itemData").asText() != "-1") {
				Room_layout_price_result room_layout_price_result = mapper.readValue(result, Room_layout_price_result.class);
				Room_layout_price room_layout_price = room_layout_price_result.getItemData();
				HashMap<String, HashMap<String, String>> dayPrice = room_layout_price.getDay_price();
				for (String key : dayPrice.keySet()) {
					System.out.println(key);
					HashMap<String, String> price = dayPrice.get(key);
					for (String x : price.keySet()) {
						System.out.println(x + ":" + price.get(x));
					}
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void checkAvailability() {
		PmsServiceImpl pmsServiceImpl = new PmsServiceImpl();
		String result = pmsServiceImpl.checkAvailability(3, 38, 14, "2018-05-02", "2018-08-02", 1);
		try {
			JsonNode nodeResult = mapper.readTree(result);
			if (nodeResult.get("forwardRoomState").asText() != "-1" && nodeResult.get("resetSystemPrice").asText() != "-1") {
				CheckAvailability_result checkAvailability = mapper.readValue(result, CheckAvailability_result.class);
				HashMap<String, HashMap<String, String>> forwardRoomState = checkAvailability.getForwardRoomState();
				Room_layout_price hotelRatePlanList = checkAvailability.getResetSystemPrice();
				for (String key : forwardRoomState.keySet()) {
					System.out.println(key);
					HashMap<String, String> layoutRoom = forwardRoomState.get(key);
					for (String layout_id : layoutRoom.keySet()) {
						System.out.println(layout_id + ":" + layoutRoom.get(layout_id));
					}
				}
				HashMap<String, HashMap<String, String>> dayPrice = hotelRatePlanList.getDay_price();
				for (String key : dayPrice.keySet()) {
					System.out.println(key);
					HashMap<String, String> price = dayPrice.get(key);
					for (String x : price.keySet()) {
						System.out.println(x + ":" + price.get(x));
					}
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void bookRoom() {
		PmsServiceImpl pmsServiceImpl = new PmsServiceImpl();
		String bookMultiple = "{\"2018-08-21 13:55:02|2018-08-22 12:00:00\":{\"16-33-11\":{\"layout_id\":\"11\",\"system_id\":\"33\",\"policy_id\"" + 
				":\"3\",\"order_amount\":\"2\",\"room_id\":\"\",\"corp_id\":\"0\",\"discount_id\":0,\"discount_type\":\"0\",\"discount\":\"100\"" + 
				",\"date\":{\"2018-8-21\":{\"price\":\"595\",\"discount_price\":\"595\",\"discount_id\":0,\"discount_type\":\"0\",\"discount\"" + 
				":\"100\",\"package\":{\"0\":{\"8\":{\"service_id\":\"8\",\"service_num\":\"1\",\"room_id\":0,\"price\":\"60\",\"service_price\"" + 
				":60}},\"-1\":{\"8\":{\"service_id\":\"8\",\"service_num\":\"1\",\"room_id\":-1,\"price\":\"60\",\"service_price\":60}}}}" + 
				"}}}}";
		int book_type = 29;
		String contact_name = "111";
		String guarantee = "";
		String number_ourter = "";
		String note = "";
		String sell_key = "16-33-11";
		BookRoomData bookRoomData = new BookRoomData();
		
		bookRoomData.setHotel_id(3);
		bookRoomData.setBook_type(book_type);
		bookRoomData.setContact_name(contact_name);
		bookRoomData.setGuarantee(guarantee);
		bookRoomData.setNumber_ourter(number_ourter);
		bookRoomData.setNote(note);
		bookRoomData.setBookMultiple(bookMultiple);
		bookRoomData.setSell_key(sell_key);
		bookRoomData.setClient("ctrip");//CTRIP
	
		
		String result = pmsServiceImpl.bookRoom(bookRoomData);
		try {
			JsonNode nodeResult = mapper.readTree(result);
			logger.info(nodeResult.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void cancelBookRoom() {
		PmsServiceImpl pmsServiceImpl = new PmsServiceImpl();
		int hotel_id = 3;
		long book_order_number = 1111;//new BigInteger("2018082117999099");
		String result = pmsServiceImpl.cancelBookRoom(hotel_id, book_order_number);
		try {
			JsonNode nodeResult = mapper.readTree(result);
			logger.info(nodeResult.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
