package com.OTA.model;

import java.util.HashMap;

public class CheckAvailability_result {
	private HashMap<String, HashMap<String, String>> forwardRoomState;
	private Room_layout_price resetSystemPrice;
	private String sell_name;

	public Room_layout_price getResetSystemPrice() {
		return resetSystemPrice;
	}
	public void setResetSystemPrice(Room_layout_price resetSystemPrice) {
		this.resetSystemPrice = resetSystemPrice;
	}
	public HashMap<String, HashMap<String, String>> getForwardRoomState() {
		return forwardRoomState;
	}
	public void setForwardRoomState(HashMap<String, HashMap<String, String>> forwardRoomState) {
		this.forwardRoomState = forwardRoomState;
	}
	public String getSell_name() {
		return sell_name;
	}
	public void setSell_name(String sell_name) {
		this.sell_name = sell_name;
	}
	
	
	
	
	
}
