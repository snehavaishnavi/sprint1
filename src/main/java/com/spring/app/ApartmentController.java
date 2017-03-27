package com.spring.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.app.model.Available_apartment;
import com.spring.app.service.ApartmentService;

@Controller
public class ApartmentController {
	
	private ApartmentService apartmentService;
	
	@Autowired(required=true)
	@Qualifier(value = "apartmentService")
	public void setApartmentService(ApartmentService as){
		this.apartmentService = as;
	}
	
	@RequestMapping(value = "/apartment", method = RequestMethod.GET)
	public String listApartments(Model model) {
		model.addAttribute("apartment", new Available_apartment());
		model.addAttribute("listApartments", this.apartmentService.listApartments());
		return "apartment";
	}
}
