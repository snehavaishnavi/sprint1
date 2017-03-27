package com.spring.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//import io.com.bean.complaint_bean;

@Entity
@Table(name="Complaint")

public class Complaint {
	
	@Id
	@Column(name="Complaint_number")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Complaint_number;
	private String Complaint_type;
	private String Complaint_severity;
	private String Complaint_Description;
	
	public String getComplaint_type() {
		return Complaint_type;
	}
	public void setComplaint_type(String complaint_type) {
		Complaint_type = complaint_type;
	}
	public String getComplaint_severity() {
		return Complaint_severity;
	}
	public void setComplaint_severity(String complaint_severity) {
		Complaint_severity = complaint_severity;
	}
	public String getComplaint_Description() {
		return Complaint_Description;
	}
	public void setComplaint_Description(String complaint_Description) {
		Complaint_Description = complaint_Description;
	}
	
	
}
