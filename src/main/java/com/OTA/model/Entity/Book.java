package com.OTA.model.Entity;

import java.sql.Timestamp;

public class Book {
	private int book_id;
	private String book_order_number_ourter;
	private int book_order_number_status;
	private long book_order_number;
	private double book_cash_pledge;
	private double book_cash_pledge_returns;
	private Timestamp book_check_in_actual;
	private Timestamp book_check_out_actual;
	private int room_id;
	private int room_layout_id;
	private int room_sell_layout_id;
	private String book_ota_status;
	private String book_ota_code;
	
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	public String getBook_order_number_ourter() {
		return book_order_number_ourter;
	}
	public void setBook_order_number_ourter(String book_order_number_ourter) {
		this.book_order_number_ourter = book_order_number_ourter;
	}
	public int getBook_order_number_status() {
		return book_order_number_status;
	}
	public void setBook_order_number_status(int book_order_number_status) {
		this.book_order_number_status = book_order_number_status;
	}
	public long getBook_order_number() {
		return book_order_number;
	}
	public void setBook_order_number(long book_order_number) {
		this.book_order_number = book_order_number;
	}
	public double getBook_cash_pledge() {
		return book_cash_pledge;
	}
	public void setBook_cash_pledge(double book_cash_pledge) {
		this.book_cash_pledge = book_cash_pledge;
	}
	public double getBook_cash_pledge_returns() {
		return book_cash_pledge_returns;
	}
	public void setBook_cash_pledge_returns(double book_cash_pledge_returns) {
		this.book_cash_pledge_returns = book_cash_pledge_returns;
	}
	public Timestamp getBook_check_in_actual() {
		return book_check_in_actual;
	}
	public void setBook_check_in_actual(Timestamp book_check_in_actual) {
		this.book_check_in_actual = book_check_in_actual;
	}
	public Timestamp getBook_check_out_actual() {
		return book_check_out_actual;
	}
	public void setBook_check_out_actual(Timestamp book_check_out_actual) {
		this.book_check_out_actual = book_check_out_actual;
	}
	public int getRoom_id() {
		return room_id;
	}
	public void setRoom_id(int room_id) {
		this.room_id = room_id;
	}
	public int getRoom_layout_id() {
		return room_layout_id;
	}
	public void setRoom_layout_id(int room_layout_id) {
		this.room_layout_id = room_layout_id;
	}
	public int getRoom_sell_layout_id() {
		return room_sell_layout_id;
	}
	public void setRoom_sell_layout_id(int room_sell_layout_id) {
		this.room_sell_layout_id = room_sell_layout_id;
	}
	public String getBook_ota_status() {
		return book_ota_status;
	}
	public void setBook_ota_status(String book_ota_status) {
		this.book_ota_status = book_ota_status;
	}
	public String getBook_ota_code() {
		return book_ota_code;
	}
	public void setBook_ota_code(String book_ota_code) {
		this.book_ota_code = book_ota_code;
	}
	
	
}
