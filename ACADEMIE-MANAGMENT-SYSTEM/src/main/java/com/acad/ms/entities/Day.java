package com.acad.ms.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="day")
public class Day implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private int day;
	
	@OneToMany(mappedBy = "day", cascade = CascadeType.ALL)
	private List<Seance> seances;

	public Day() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Day(int day, List<Seance> seances) {
		super();
		this.day = day;
		this.seances = seances;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public List<Seance> getSeances() {
		return seances;
	}

	public void setSeances(List<Seance> seances) {
		this.seances = seances;
	}
	
	
}
