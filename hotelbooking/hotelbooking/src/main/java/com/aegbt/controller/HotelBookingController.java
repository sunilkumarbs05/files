package com.aegbt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.aegbt.model.BookingDetails;
import com.aegbt.model.HotelDetail;
import com.aegbt.service.HotelBookingService;

@Controller
public class HotelBookingController {

	@Autowired
	HotelBookingService hotelBookingService;

	@RequestMapping(value = "/home")
	public String loadHomePage() {
		return "home";
	}

	@RequestMapping(value = "/loadHotelBook")
	public ModelAndView loadHotelBookPage() {
		ModelAndView andView = new ModelAndView("hotelbook");
		andView.addObject("cities", hotelBookingService.getCities());
		return andView;
	}

	@RequestMapping(value = "/getHotels/{city}")
	@ResponseBody
	public List<String> getHotels(@PathVariable("city") String city) {
		return hotelBookingService.getHotels(city);
	}

	@RequestMapping(value = "/bookHotel", method = RequestMethod.POST)
	@ResponseBody
	public String bookHotel(@RequestBody BookingDetails bookingDetails) {
		return hotelBookingService.bookHotel(bookingDetails);
	}

	@RequestMapping(value = "/loadViewHotel")
	public ModelAndView loadVeiwHotelPage() {
		ModelAndView andView = new ModelAndView("viewhotel");
		andView.addObject("cities", hotelBookingService.getCities());
		return andView;
	}

	@RequestMapping(value = "getHotelsDetails/{city}")
	@ResponseBody
	public List<HotelDetail> getHotelsDetails(@PathVariable("city") String city) {
		return hotelBookingService.getHotelsDetails(city);
	}
}
