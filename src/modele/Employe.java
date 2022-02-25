package modele;

import java.util.Date;

public class Employe extends Personne {
	private int id;
	private String code;
	private int quotite;
	private Date dateEmbauche;
	private Adresse adresse;
	private Fonction fonction;
	private Salaire salaire;
	private Conges[] conges;

	public Employe(String nom, String prenom, int sexe, Date dateNaissance, String code, int quotite, Date dateEmbauche,
			Adresse adresse, Fonction fonction, Salaire salaire, Conges[] conges) {
		super(nom, prenom, sexe, dateNaissance);
		this.setId(0);
		this.code = code;
		this.quotite = quotite;
		this.dateEmbauche = dateEmbauche;
		this.adresse = adresse;
		this.fonction = fonction;
		this.salaire = salaire;
		this.conges = conges;
	}
	

	public Employe(String nom, String prenom, int sexe, Date dateNaissance, String code, int quotite, Date dateEmbauche) {
		super(nom, prenom, sexe, dateNaissance);
		this.code = code;
		this.quotite = quotite;
		this.dateEmbauche = dateEmbauche;
	}
	

	public Employe() {
		super();
		this.code = "code";
		this.quotite = 0;
		this.dateEmbauche = null;
		this.adresse = null;
		this.fonction = null;
		this.salaire = null;
		this.conges = null;
	}
		
	
	
	public int congesRestants() {
		return 0;

	}

	public int congesTotaux() {

		return 0;
	}

	public int congesPris() {
		return 0;
	}

	public void prendreConges() {

	}
	
	
	public void changerSalaire() {
		
	}
	
	
	
	

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getQuotite() {
		return quotite;
	}

	public void setQuotite(int quotite) {
		this.quotite = quotite;
	}

	public Date getDateEmbauche() {
		return dateEmbauche;
	}

	public void setDateEmbauche(Date dateEmbauche) {
		this.dateEmbauche = dateEmbauche;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public Fonction getFonction() {
		return fonction;
	}

	public void setFonction(Fonction fonction) {
		this.fonction = fonction;
	}

	public Salaire getSalaire() {
		return salaire;
	}

	public void setSalaire(Salaire salaire) {
		this.salaire = salaire;
	}

	public Conges[] getConges() {
		return conges;
	}

	public void setConges(Conges[] conges) {
		this.conges = conges;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}

}
