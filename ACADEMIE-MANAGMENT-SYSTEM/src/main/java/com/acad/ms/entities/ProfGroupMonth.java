package com.acad.ms.entities;

import java.io.Serializable;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="profgroupmounth")
public class ProfGroupMonth implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "group_id")
	private GroupST group;
	
	@Id
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "prof_id")
	private Professor prof;
	
	@Id
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "month_id")
	private Month month;
	
	private Date datePayement;
	
	private int amount;

	public ProfGroupMonth() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProfGroupMonth(GroupST group, Professor prof, Month month, Date datePayement, int amount) {
		super();
		this.group = group;
		this.prof = prof;
		this.month = month;
		this.datePayement = datePayement;
		this.amount = amount;
	}

	public GroupST getGroup() {
		return group;
	}

	public void setGroup(GroupST group) {
		this.group = group;
	}

	public Professor getProf() {
		return prof;
	}

	public void setProf(Professor prof) {
		this.prof = prof;
	}

	public Month getMonth() {
		return month;
	}

	public void setMonth(Month month) {
		this.month = month;
	}

	public Date getDatePayement() {
		return datePayement;
	}

	public void setDatePayement(Date datePayement) {
		this.datePayement = datePayement;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	
	
	
}
