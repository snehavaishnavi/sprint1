package com.spring.app.model;

import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.spring.app.dao.UserDAO;

import junit.framework.Assert;



@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration(locations = { "servlet-context.xml" })

@SuppressWarnings("unused")

public class UserTest {

	
	@Autowired
	private UserDAO userDao;
	@Test
	@Transactional
	public void test() {
		User users = new User();
		userDao.listUsers();
		users.setEmail("test@yahoo.com");
		users.setFirstname("linga");
		users.setLastname("babu");
		users.setPassword("alibaba");
		List<User> user1 = userDao.listUsers();
		Assert.assertEquals(users.getFirstname(), user1.get(0).getFirstname());
		Assert.assertEquals(users.getLastname(), user1.get(0).getLastname());
		Assert.assertEquals(users.getPassword(), user1.get(0).getPassword());
		Assert.assertEquals(users.getEmail(), user1.get(0).getEmail());
	}

}
