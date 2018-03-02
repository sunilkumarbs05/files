package com.aegbt.model;

import java.util.Date;

public class BookingDetails {
	
	private String city;
	private String hotelName;
	private Date checkin;
	private Date checkout;
	private int numberRooms;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public Date getCheckin() {
		return checkin;
	}
	public void setCheckin(Date checkin) {
		this.checkin = checkin;
	}
	public Date getCheckout() {
		return checkout;
	}
	public void setCheckout(Date checkout) {
		this.checkout = checkout;
	}
	public int getNumberRooms() {
		return numberRooms;
	}
	public void setNumberRooms(int numberRooms) {
		this.numberRooms = numberRooms;
	}

}
