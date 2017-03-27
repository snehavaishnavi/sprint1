package com.spring.app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.app.bean.complaint_bean;
import com.spring.app.model.Complaint;
import com.spring.app.service.ComplaintService;

@Controller
public class ComplaintController {
	@RequestMapping(value = "/complaint", method = RequestMethod.GET)
	public String listApartments(Model model) {
			return "complaint";
}
@RequestMapping(value="/complaint.submit", method = RequestMethod.POST)
	
	public ModelAndView saveComplaint(@ModelAttribute("command")complaint_bean complaintbean, 
			   BindingResult result) {
			Complaint complaint= new Complaint();
			complaint.setComplaint_type(complaintbean.getComplaint_type());
			complaint.setComplaint_severity(complaintbean.getComplaint_severity());
			complaint.setComplaint_Description(complaintbean.getComplaint_Description());
			 ComplaintService.addComplaint(complaint);
			  return new ModelAndView("redirect:/complaint_rec.html");
			 }
}