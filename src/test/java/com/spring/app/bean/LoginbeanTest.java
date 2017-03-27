package com.spring.app.bean;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SuppressWarnings("unused")
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "servlet-context.xml" })
public class LoginbeanTest {
	
	@Autowired
	private Loginbean loginbean;
	
	
	@Test
	public void test() {
		Loginbean loginbean = new Loginbean();
		loginbean.setUsername("hello");
		loginbean.setPassword("test");
        assertEquals("UserName is changed", "hello", loginbean.getUsername());
        assertEquals("Password is changed","test",loginbean.getPassword());
	}

}
