package modele;

import java.util.Date;

public class Conges {

	private Date debut;
	private Date fin;
	
	
	public Conges(Date debut, Date fin) {
		super();
		this.debut = debut;
		this.fin = fin;
	}
	
	
	

	public int nbjours() {
		return 0;
	}


	


	
	

	public Date getDebut() {
		return debut;
	}

	public void setDebut(Date debut) {
		this.debut = debut;
	}

	public Date getFin() {
		return fin;
	}

	public void setFin(Date fin) {
		this.fin = fin;
	}

}
