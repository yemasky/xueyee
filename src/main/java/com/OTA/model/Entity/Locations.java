package com.OTA.model.Entity;

public class Locations {
	private int locations_id;
	private String locations_type;
	private String country;
	private int province_id;
	private int city_id;
	private String location_name;
	
	public int getLocations_id() {
		return locations_id;
	}
	public void setLocations_id(int locations_id) {
		this.locations_id = locations_id;
	}
	public String getLocations_type() {
		return locations_type;
	}
	public void setLocations_type(String locations_type) {
		this.locations_type = locations_type;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getProvince_id() {
		return province_id;
	}
	public void setProvince_id(int province_id) {
		this.province_id = province_id;
	}
	public int getCity_id() {
		return city_id;
	}
	public void setCity_id(int city_id) {
		this.city_id = city_id;
	}
	public String getLocation_name() {
		return location_name;
	}
	public void setLocation_name(String location_name) {
		this.location_name = location_name;
	}
}
