package com.spring.app.service;
//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.spring.app.dao.Complaint_DAO;
import com.spring.app.model.Complaint;

@Service("ComplaintService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class ComplaintService_impl implements ComplaintService {

 @Autowired
 private Complaint_DAO complaintdao;
 public void setPersonDAO(Complaint_DAO complaintdao) {
		this.complaintdao = complaintdao;
	}
 
 @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
 public void addComplaint(Complaint complaint) {
  complaintdao.addComplaint(complaint);
 }
 

}
