package com.spring.app.dao;

import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import com.spring.app.model.Available_apartment;
import junit.framework.Assert;


@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration(locations = { "servlet-context.xml" })

public class ApartmentDAOTest {
	
	@Autowired
	private ApartmentDAO apartmentDAO;

	@Test
	@Transactional
	
	public void testListApartments() {
		Available_apartment availableapartments = new Available_apartment();
		apartmentDAO.listApartments();
		List<Available_apartment> availableapartments1 = apartmentDAO.listApartments();
		Assert.assertEquals(availableapartments.getUnit(), availableapartments1.get(0).getUnit());
		
	}

}
