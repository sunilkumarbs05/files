package com.aegbt.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class HotelDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String city;
	private String hotelName;
	private int numberRooms;
	private int price;
	private float star;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	public int getNumberRooms() {
		return numberRooms;
	}

	public void setNumberRooms(int numberRooms) {
		this.numberRooms = numberRooms;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public float getStar() {
		return star;
	}

	public void setStar(float star) {
		this.star = star;
	}


}
