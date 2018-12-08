package com.OTA.model;

import java.util.HashMap;

public class BookMultipleData {
	private String layout_id;
	private String system_id;
	private String policy_id;
	private String order_amount;
	private String room_id;
	private String corp_id;
	private String discount_id;
	private String discount_type;
	private String discount;
	private HashMap<String, Date_price> date;
	
	public String getLayout_id() {
		return layout_id;
	}

	public void setLayout_id(String layout_id) {
		this.layout_id = layout_id;
	}

	public String getSystem_id() {
		return system_id;
	}

	public void setSystem_id(String system_id) {
		this.system_id = system_id;
	}

	public String getPolicy_id() {
		return policy_id;
	}

	public void setPolicy_id(String policy_id) {
		this.policy_id = policy_id;
	}

	public String getOrder_amount() {
		return order_amount;
	}

	public void setOrder_amount(String order_amount) {
		this.order_amount = order_amount;
	}

	public String getRoom_id() {
		return room_id;
	}

	public void setRoom_id(String room_id) {
		this.room_id = room_id;
	}

	public String getCorp_id() {
		return corp_id;
	}

	public void setCorp_id(String corp_id) {
		this.corp_id = corp_id;
	}

	public String getDiscount_id() {
		return discount_id;
	}

	public void setDiscount_id(String discount_id) {
		this.discount_id = discount_id;
	}

	public String getDiscount_type() {
		return discount_type;
	}

	public void setDiscount_type(String discount_type) {
		this.discount_type = discount_type;
	}

	public String getDiscount() {
		return discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}

	public HashMap<String, Date_price> getDate() {
		return date;
	}

	public void setDate(HashMap<String, Date_price> date) {
		this.date = date;
	}

	
	
}


