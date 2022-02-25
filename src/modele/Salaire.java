package modele;

import java.util.Calendar;
import java.util.Date;

public class Salaire  {

	private Date dateDebut;
	private Date dateFin;
	private float chargePatronale;
	private float chargeSalariale;
	private float brut;

	public Salaire(Date dateDebut, Date dateFin, float chargePatronale, float chargeSalariale, float brut) {
		super();
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.chargePatronale = chargePatronale;
		this.chargeSalariale = chargeSalariale;
		this.brut = brut;
	}
	
	/*public Salaire() {
		super();
		this.dateDebut = new Date("01/27/2022");
		this.dateFin = new Date("01/30/2022");;
		this.chargePatronale = 200;
		this.chargeSalariale = 1000;
		this.brut = 3000;
	}*/
	
	
	public float salaireCharge() {
		float totalCharges = chargePatronale + chargeSalariale;
		//System.out.println("totalCharges : " + totalCharges);
		return totalCharges;
	}

	public float salaireNet() {
		float netSalaire = brut - this.salaireCharge();
		//System.out.println("netSalaire : " + netSalaire);
		return netSalaire;
	}

	public boolean salaireEnCours() {
		
		Calendar toDay = Calendar.getInstance();
		Calendar dateFinC= Calendar.getInstance();
		Calendar dateDebutC= Calendar.getInstance();
		dateFinC.setTime(this.dateFin);
		dateDebutC.setTime(this.dateDebut);
		
		if(toDay.before(dateFinC) && toDay.after(dateDebutC)) {
			//System.out.println("L'employé travaille actuellement et touche un salaire");
			return true;
		} else {
			//System.out.println("L'employé ne touche pas de salaire");
			return false;
			}
		}	

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	public float getChargePatronale() {
		return chargePatronale;
	}

	public void setChargePatronale(float chargePatronale) {
		this.chargePatronale = chargePatronale;
	}

	public float getChargeSalariale() {
		return chargeSalariale;
	}

	public void setChargeSalariale(float chargeSalariale) {
		this.chargeSalariale = chargeSalariale;
	}

	public float getBrut() {
		return brut;
	}

	public void setBrut(float brut) {
		this.brut = brut;
	}

}
