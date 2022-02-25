package modele;

import java.util.Date;

public class Fonction {

	private Date date;
	private String titre;
	private String departement;
	private int niveau;
	private int rtt;

	public Fonction(Date date, String titre, String departement, int niveau, int rtt) {
		super();
		this.date = date;
		this.titre = titre;
		this.departement = departement;
		this.niveau = niveau;
		this.rtt = rtt;
	}
	

	
	

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDepartement() {
		return departement;
	}

	public void setDepartement(String departement) {
		this.departement = departement;
	}

	public int getNiveau() {
		return niveau;
	}

	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}

	public int getRtt() {
		return rtt;
	}

	public void setRtt(int rtt) {
		this.rtt = rtt;
	}

}
