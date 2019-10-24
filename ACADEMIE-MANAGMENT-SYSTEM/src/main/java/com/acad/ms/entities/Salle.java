package com.acad.ms.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="salle")
public class Salle implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private int numero;
	
	private String type;
	
	
	@OneToMany(mappedBy = "salle", cascade = CascadeType.ALL)
	private List<Seance> seances;
	


	public Salle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Salle(int numero, String type, List<Seance> seances) {
		super();
		this.numero = numero;
		this.type = type;
		this.seances = seances;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Seance> getSeances() {
		return seances;
	}

	public void setSeances(List<Seance> seances) {
		this.seances = seances;
	}
	
	
}
