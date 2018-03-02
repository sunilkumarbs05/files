package com.aegbt.service;

import java.util.List;

import com.aegbt.model.BookingDetails;
import com.aegbt.model.HotelDetail;

public interface HotelBookingService {

	public List<String> getCities();

	public List<String> getHotels(String city);

	public String bookHotel(BookingDetails bookingDetails);

	public List<HotelDetail> getHotelsDetails(String city);

}
