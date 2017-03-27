package com.spring.app.dao;

//import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.app.model.Complaint;


@Repository("Complaint_DAO")
public class ComplaintDAO_Impl implements Complaint_DAO {

 @Autowired
 private SessionFactory sessionFactory;
 
 public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}
 public void addComplaint(Complaint complaint) {
   sessionFactory.getCurrentSession().saveOrUpdate(complaint);
 }

}