package com.acad.ms.entities;

import java.io.Serializable;



import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="seance")
public class Seance implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "day_id")
	private Day day;
	
	@Id
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn
	private Hour startHour;
	
	@Id
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn
	private Hour endHour;
	
	@Id
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "salle_id")
	private Salle salle;
	
	@Id
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "groupts_id")
	private GroupST group;

	public Seance() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Seance(Day day, Hour startHour, Hour endHour, Salle salle, GroupST group) {
		super();
		this.day = day;
		this.startHour = startHour;
		this.endHour = endHour;
		this.salle = salle;
		this.group = group;
	}

	public Day getDay() {
		return day;
	}

	public void setDay(Day day) {
		this.day = day;
	}

	public Hour getStartHour() {
		return startHour;
	}

	public void setStartHour(Hour startHour) {
		this.startHour = startHour;
	}

	public Hour getEndHour() {
		return endHour;
	}

	public void setEndHour(Hour endHour) {
		this.endHour = endHour;
	}

	public Salle getSalle() {
		return salle;
	}

	public void setSalle(Salle salle) {
		this.salle = salle;
	}

	public GroupST getGroup() {
		return group;
	}

	public void setGroup(GroupST group) {
		this.group = group;
	}
	
	
}
