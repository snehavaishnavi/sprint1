package com.spring.app.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.app.dao.ApartmentDAO;
import com.spring.app.model.Available_apartment;

@Service
public class ApartmentServiceImpl implements ApartmentService {


	private ApartmentDAO apartmentDAO;

	public void setApartmentDAO(ApartmentDAO apartmentDAO) {
		this.apartmentDAO = apartmentDAO;
	}
	
	@Override
	@Transactional
	public List<Available_apartment> listApartments() {
		return this.apartmentDAO.listApartments();
	}

}
