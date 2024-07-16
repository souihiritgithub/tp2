package model;

public class Surveillance {
	private int identificateurS;
	private String matiere ;
	private int jour ;
	private String groupe;
	public Surveillance() {
		super();
	}
	public Surveillance(int identificateurS, String matiere, int jour, String groupe) {
		super();
		this.identificateurS = identificateurS;
		this.matiere = matiere;
		this.jour = jour;
		this.groupe = groupe;
	}
	public int getIdentificateurS() {
		return identificateurS;
	}
	public void setIdentificateurS(int identificateurS) {
		this.identificateurS = identificateurS;
	}
	public String getMatiere() {
		return matiere;
	}
	public void setMatiere(String matiere) {
		this.matiere = matiere;
	}
	public int getJour() {
		return jour;
	}
	public void setJour(int jour) {
		this.jour = jour;
	}
	public String getGroupe() {
		return groupe;
	}
	public void setGroupe(String groupe) {
		this.groupe = groupe;
	}
	
	
	

}
