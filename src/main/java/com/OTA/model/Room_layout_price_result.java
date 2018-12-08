package com.OTA.model;

public class Room_layout_price_result {
	private String success;
	private String message;
	private Room_layout_price itemData;
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
	public Room_layout_price getItemData() {
		return itemData;
	}
	public void setItemData(Room_layout_price itemData) {
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
