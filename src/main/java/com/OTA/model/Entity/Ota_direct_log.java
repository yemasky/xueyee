package com.OTA.model.Entity;

import java.sql.Timestamp;

public class Ota_direct_log {
	private int ota_direct_log_id;
	private int hotel_id;
	private String execute_function;
	private String execute_title;
	private String ota_result;
	private String ota_request;
	private Timestamp add_datetime;
	
	public int getOta_direct_log_id() {
		return ota_direct_log_id;
	}
	public void setOta_direct_log_id(int ota_direct_log_id) {
		this.ota_direct_log_id = ota_direct_log_id;
	}
	public int getHotel_id() {
		return hotel_id;
	}
	public void setHotel_id(int hotel_id) {
		this.hotel_id = hotel_id;
	}
	public String getExecute_function() {
		return execute_function;
	}
	public void setExecute_function(String execute_function) {
		this.execute_function = execute_function;
	}
	public String getExecute_title() {
		return execute_title;
	}
	public void setExecute_title(String execute_title) {
		this.execute_title = execute_title;
	}
	public String getOta_result() {
		return ota_result;
	}
	public void setOta_result(String ota_result) {
		this.ota_result = ota_result;
	}
	public String getOta_request() {
		return ota_request;
	}
	public void setOta_request(String ota_request) {
		this.ota_request = ota_request;
	}
	public Timestamp getAdd_datetime() {
		return add_datetime;
	}
	public void setAdd_datetime(Timestamp add_datetime) {
		this.add_datetime = add_datetime;
	}
	
}
