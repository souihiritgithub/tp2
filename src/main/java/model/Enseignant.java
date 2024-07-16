package model;

public class Enseignant {
         private int identif;
         private String nom;
         private String fonction;
         private int nbHCours ;
         private int nbHTp;
		public Enseignant() {
			super();
		}
		public Enseignant(int identif, String nom, String fonction, int nbHCours, int nbHTp) {
			super();
			this.identif = identif;
			this.nom = nom;
			this.fonction = fonction;
			this.nbHCours = nbHCours;
			this.nbHTp = nbHTp;
		}
		public int getIdentif() {
			return identif;
		}
		public void setIdentif(int identif) {
			this.identif = identif;
		}
		public String getNom() {
			return nom;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
		public String getFonction() {
			return fonction;
		}
		public void setFonction(String fonction) {
			this.fonction = fonction;
		}
		public int getNbHCours() {
			return nbHCours;
		}
		public void setNbHCours(int nbHCours) {
			this.nbHCours = nbHCours;
		}
		public int getNbHTp() {
			return nbHTp;
		}
		public void setNbHTp(int nbHTp) {
			this.nbHTp = nbHTp;
		}
         
         
         
         
         
}
