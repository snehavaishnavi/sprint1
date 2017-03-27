package com.spring.app;


import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.app.bean.Loginbean;

import com.spring.app.bean.complaint_bean;
import com.spring.app.model.Complaint;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		return "home";
	}
	
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginPage(Model model) {
		Loginbean loginBean=new Loginbean();
		model.addAttribute("loginBean", loginBean);
		return "login";
	}
	
	@RequestMapping(value="/login.submit", method = RequestMethod.POST)
	public ModelAndView executeLogin(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("loginBean")Loginbean loginBean)
	{
		ModelAndView model= null;
		try
		{
			if(loginBean.getUsername().equals("hhundiwala@gmail.com")){
				if(loginBean.getPassword().equals("harsh")){
					System.out.println("User Login Successful");
					request.setAttribute("loggedInUser", loginBean.getUsername());
					model = new ModelAndView("welcome");
				}
			}else{
				request.setAttribute("message","Incorrect Username or Password");
				model = new ModelAndView("login");
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return model;
	}

}
