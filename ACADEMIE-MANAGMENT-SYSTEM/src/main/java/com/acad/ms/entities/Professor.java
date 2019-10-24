package com.acad.ms.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="professor")
public class Professor implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String fname;
	
	private String lname;
	
	private String phone;
	
	private Date firstContact;
	
	private String remarks;
	
	@OneToMany(mappedBy = "prof", cascade = CascadeType.ALL)
	private List<ProfGroupMonth> payements;

	public Professor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Professor( String fname, String lname, String phone, Date firstContact, String remarks,
			List<ProfGroupMonth> payements) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.phone = phone;
		this.firstContact = firstContact;
		this.remarks = remarks;
		this.payements = payements;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getFirstContact() {
		return firstContact;
	}

	public void setFirstContact(Date firstContact) {
		this.firstContact = firstContact;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public List<ProfGroupMonth> getPayements() {
		return payements;
	}

	public void setPayements(List<ProfGroupMonth> payements) {
		this.payements = payements;
	}

	public int getId() {
		return id;
	}
	
	
}
