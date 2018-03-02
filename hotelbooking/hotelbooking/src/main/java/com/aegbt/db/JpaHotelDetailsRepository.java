/*
 * Copyright 2012-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aegbt.db;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.aegbt.model.HotelDetail;

@Repository
class JpaHotelDetailsRepository implements HotelDetailsRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<String> getCities() {
		List<HotelDetail> details= this.entityManager.createQuery("SELECT h FROM HotelDetail h",
				HotelDetail.class).getResultList();
		for (HotelDetail hotelDetail : details) {
			System.out.println(hotelDetail.getCity());
		}
		List<String> list = new ArrayList<String>();
		list.add("Hotel");
		return list; 
	}

	@Override
	public List<HotelDetail> findAll() {
		return this.entityManager.createQuery("SELECT t FROM HotelDetail t",
				HotelDetail.class).getResultList();
	}
}
