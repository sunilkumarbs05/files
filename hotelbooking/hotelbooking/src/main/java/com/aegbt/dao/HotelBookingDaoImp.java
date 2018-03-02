package com.aegbt.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.aegbt.db.HotelDetailsRepository;

@Repository
@Transactional
public class HotelBookingDaoImp implements HotelBookingDao {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Autowired 
	private HotelDetailsRepository hotelDetailsRepository;

	@Override
	public List<String> getCities() {
		return hotelDetailsRepository.getCities();
	}
	

}
