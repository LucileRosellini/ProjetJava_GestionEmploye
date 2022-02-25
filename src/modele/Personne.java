package modele;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public  class Personne extends GestionDate {

	protected String nom;
	protected String prenom;
	protected int sexe;
	protected Date dateNaissance;

	public Personne(String nom, String prenom, int sexe, Date dateNaissance) {

		this.nom = nom;
		this.prenom = prenom;
		this.sexe = sexe;
		this.dateNaissance = dateNaissance;
	}
	
	public Personne() {

		this.nom = "nom";
		this.prenom = "prenom";
		this.sexe = 2;
		this.dateNaissance = null;
	}
	

	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", sexe=" + sexe + ", dateNaissance=" + dateNaissance
				+ "]";
	}

	public int age() {

		Calendar aujourdhui = Calendar.getInstance();
		int yearEnCour = aujourdhui.get(Calendar.YEAR);

		Calendar naissance = Calendar.getInstance();
		naissance.setTime(this.dateNaissance);

		int yearNaissance = naissance.get(Calendar.YEAR);

		return yearEnCour - yearNaissance;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getSexe() {
		return sexe;
	}

	public void setSexe(int sexe) {
		this.sexe = sexe;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

}
