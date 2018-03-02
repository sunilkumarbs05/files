package com.aegbt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aegbt.dao.HotelBookingDao;
import com.aegbt.db.NoteRepository;
import com.aegbt.model.BookingDetails;
import com.aegbt.model.HotelDetail;
import com.aegbt.model.Note;

@Service
public class HotelBookingServiceImpl implements HotelBookingService {

	@Autowired
	HotelBookingDao hotelBookingDao;
	@Autowired
	private NoteRepository noteRepository;	

	@Override
	public List<String> getCities() {
		/*
		 * List<String> cities = new ArrayList<String>();
		 * cities.add("Bangalore"); cities.add("Mysore");
		 */
		 //apiRequestDao.create(apiRequest);
    	List<Note> notes = this.noteRepository.findAll();
    	for (Note note : notes) {
			System.out.println(note.getTitle());
		}
		return hotelBookingDao.getCities();
	}

	@Override
	public List<String> getHotels(String city) {
		List<String> hotels = new ArrayList<String>();
		hotels.add("Hotel 1");
		hotels.add("Hotel 2");
		return hotels;
	}

	@Override
	public String bookHotel(BookingDetails bookingDetails) {
		String respMessage;

		if (bookingDetails.getNumberRooms() > 7) {
			respMessage = "Requested Rooms are not available";
		} else {
			respMessage = "Successfully booked hotel. BookId is:"
					+ Math.random() * 10000;
		}
		// TODO Auto-generated method stub
		return respMessage;
	}

	@Override
	public List<HotelDetail> getHotelsDetails(String city) {
		List<HotelDetail> hotelDetails = new ArrayList<HotelDetail>();
		HotelDetail hotel1 = new HotelDetail();
		hotel1.setHotelName("Hotel1");
		hotel1.setNumberRooms(2);
		hotel1.setPrice(250);

		HotelDetail hotel2 = new HotelDetail();
		hotel2.setHotelName("Hotel2");
		hotel2.setNumberRooms(2);
		hotel2.setPrice(250);
		hotelDetails.add(hotel1);
		hotelDetails.add(hotel2);

		return hotelDetails;
	}

}
