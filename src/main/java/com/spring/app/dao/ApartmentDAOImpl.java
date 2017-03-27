package com.spring.app.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.spring.app.model.Available_apartment;

@Repository
public class ApartmentDAOImpl implements ApartmentDAO {
	private static final Logger logger = LoggerFactory.getLogger(UserDAOImpl.class);

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Available_apartment> listApartments() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Available_apartment> apartmentList = session.createQuery("from Available_apartment").list();
		for(Available_apartment a : apartmentList){
			logger.info("Apartment List: "+a.getUnit());
		}
		return apartmentList;
	}

}
