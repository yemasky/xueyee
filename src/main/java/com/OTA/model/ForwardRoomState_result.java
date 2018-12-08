package com.OTA.model;

import java.util.HashMap;

public class ForwardRoomState_result {
	private String success;
	private String message;
	private HashMap<String, HashMap<String, String>> itemData;
	private String redirect;
	private String nowDate;
	public String getSuccess() {
		return success;
	}
	public void setSuccess(String success) {
		this.success = success;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public HashMap<String, HashMap<String, String>> getItemData() {
		return itemData;
	}
	public void setItemData(HashMap<String, HashMap<String, String>> itemData) {
		this.itemData = itemData;
	}
	public String getRedirect() {
		return redirect;
	}
	public void setRedirect(String redirect) {
		this.redirect = redirect;
	}
	public String getNowDate() {
		return nowDate;
	}
	public void setNowDate(String nowDate) {
		this.nowDate = nowDate;
	}
	
}
