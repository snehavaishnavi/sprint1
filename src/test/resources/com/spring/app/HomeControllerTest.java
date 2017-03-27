package com.spring.app;

import static org.junit.Assert.*;
import org.junit.Test;


@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations ={"classpath:app-context.xml"}} // not sure what needs to be defined

public class HomeControllerTest {

	private MockMvc mockMvc;

	@Before
	public void setUp(){
		mockMvc = MockMvcBuilders
				//.annotationConfigSetup(); //need to set the same from the @contextConfiguration
				.standaloneSetup(new HomeController())
				.build();	
	}

	
	@Test
	public void testHome() throws Exception {
		mockMvc.perform(get('/'));
			.andExpect(status().isOk());
			.andExpect(forwardedUrl('WEB-INF/pages/home.jsp'));
	}

	@Test
	public void testLoginPage() throws Exception {
		mockMvc.perform(get('/login'));
		.andExpect(status().isOk());
		.andExpect(forwardedUrl('WEB-INF/pages/login.jsp'));
		.andExpect(model().attributeExists('login');
	}

	@Test
	public void testExecuteLogin() {
		mockMvc.perform(post('/login.submit')).param("username", "hhundiwala@gmail.com").param("password", "harsh").andDo(print());
		.andExpect(status().isOk());
		.andExpect(view().name('welcome'));
	}
	
	@Test
	public void testExecuteLoginFail() {
		mockMvc.perform(post('/login.submit')).param("username", "jagan@gmail.com").param("password", "harsh1").andDo(print());
		.andExpect(status().isOk());
		.andExpect(view().name('login'));
		
	}

}
