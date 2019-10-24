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
@Table(name="student")
public class Student implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String fname;
	
	private String lname;
	
	private String personnalPhone;
	
	private String parentsPhone;
	
	private String address;
	
	private Date birthDate;
	
	@OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
	private List<StudentGroup> groups;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String fname, String lname, String personnalPhone, String parentsPhone, String address,
			Date birthDate, List<StudentGroup> groups) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.personnalPhone = personnalPhone;
		this.parentsPhone = parentsPhone;
		this.address = address;
		this.birthDate = birthDate;
		this.groups = groups;
	}

	public int getId() {
		return id;
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

	public String getPersonnalPhone() {
		return personnalPhone;
	}

	public void setPersonnalPhone(String personnalPhone) {
		this.personnalPhone = personnalPhone;
	}

	public String getParentsPhone() {
		return parentsPhone;
	}

	public void setParentsPhone(String parentsPhone) {
		this.parentsPhone = parentsPhone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public List<StudentGroup> getGroups() {
		return groups;
	}

	public void setGroups(List<StudentGroup> groups) {
		this.groups = groups;
	}
	
	
	
}
