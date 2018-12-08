package com.OTA.model;

import java.util.HashMap;

public class Date_price {
	private String price;
	private String discount_price;
	private String discount_id;
	private String discount_type;
	private String discount;
	private HashMap<String, HashMap<String, Service_pkg>> pkg;
	
	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getDiscount_price() {
		return discount_price;
	}

	public void setDiscount_price(String discount_price) {
		this.discount_price = discount_price;
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

	public HashMap<String, HashMap<String, Service_pkg>> getPkg() {
		return pkg;
	}

	public void setPkg(HashMap<String, HashMap<String, Service_pkg>> pkg) {
		this.pkg = pkg;
	}

	
}
