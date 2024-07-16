package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Affectation {
	@Id
	private int identificateurA;
	@ManyToOne
	@JoinColumn(name="identif") 
	private Enseignant ens;
	
	@ManyToOne
	@JoinColumn(name="identificateurS")
	private Surveillance Sur;
	
	public Affectation() {
		super();
	}

	public Affectation(int identificateurA, Enseignant ens, Surveillance sur) {
		super();
		this.identificateurA = identificateurA;
		this.ens = ens;
		Sur = sur;
	}

	public int getIdentificateurA() {
		return identificateurA;
	}

	public void setIdentificateurA(int identificateurA) {
		this.identificateurA = identificateurA;
	}

	public Enseignant getEns() {
		return ens;
	}

	public void setEns(Enseignant ens) {
		this.ens = ens;
	}

	public Surveillance getSur() {
		return Sur;
	}

	public void setSur(Surveillance sur) {
		Sur = sur;
	}
	
	
	
	
	
	

}
