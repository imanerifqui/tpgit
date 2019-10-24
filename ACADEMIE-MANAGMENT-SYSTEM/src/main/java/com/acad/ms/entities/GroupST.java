package com.acad.ms.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="groupST")
public class GroupST implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private String id;
	
	private String profPaymentMethode;
	
	private int studentAmount;
	
	private int profAmount;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "subject_id")
	private Subject subject;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "professor_id")
	private Professor professor;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "schoolyear_id")
	private SchoolYear schoolYear;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "level_id")
	private Level level;
	
	@OneToMany(mappedBy = "group", cascade = CascadeType.ALL)
	private List<StudentGroup> students;
	
	@OneToMany(mappedBy = "group", cascade = CascadeType.ALL)
	private List<ProfGroupMonth> payements;
	
	@OneToMany(mappedBy = "group", cascade = CascadeType.ALL)
	private List<Seance> seances;

	public GroupST() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GroupST(String id, String profPaymentMethode, int studentAmount, int profAmount, Subject subject,
			Professor professor, SchoolYear schoolYear, Level level, List<StudentGroup> students,
			List<ProfGroupMonth> payements, List<Seance> seances) {
		super();
		this.id = id;
		this.profPaymentMethode = profPaymentMethode;
		this.studentAmount = studentAmount;
		this.profAmount = profAmount;
		this.subject = subject;
		this.professor = professor;
		this.schoolYear = schoolYear;
		this.level = level;
		this.students = students;
		this.payements = payements;
		this.seances = seances;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getProfPaymentMethode() {
		return profPaymentMethode;
	}

	public void setProfPaymentMethode(String profPaymentMethode) {
		this.profPaymentMethode = profPaymentMethode;
	}

	public int getStudentAmount() {
		return studentAmount;
	}

	public void setStudentAmount(int studentAmount) {
		this.studentAmount = studentAmount;
	}

	public int getProfAmount() {
		return profAmount;
	}

	public void setProfAmount(int profAmount) {
		this.profAmount = profAmount;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public SchoolYear getSchoolYear() {
		return schoolYear;
	}

	public void setSchoolYear(SchoolYear schoolYear) {
		this.schoolYear = schoolYear;
	}

	public Level getLevel() {
		return level;
	}

	public void setLevel(Level level) {
		this.level = level;
	}

	public List<StudentGroup> getStudents() {
		return students;
	}

	public void setStudents(List<StudentGroup> students) {
		this.students = students;
	}

	public List<ProfGroupMonth> getPayements() {
		return payements;
	}

	public void setPayements(List<ProfGroupMonth> payements) {
		this.payements = payements;
	}

	public List<Seance> getSeances() {
		return seances;
	}

	public void setSeances(List<Seance> seances) {
		this.seances = seances;
	}

	
	
	
	
	}
