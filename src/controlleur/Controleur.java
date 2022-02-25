package controlleur;

import java.text.ParseException;
import java.util.ArrayList;

import modele.Adresse;
import modele.Employe;
import modele.EmployeMySQL;
import modele.AdresseMySQL;
import vue.VueEmployes;

public class Controleur {

	private VueEmployes vueEmployes;
	private EmployeMySQL db;
	private AdresseMySQL dbAd;

	public Controleur() {
		db = new EmployeMySQL();
		vueEmployes = new VueEmployes(this);
		vueEmployes.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Controleur();

	}

	public void create(Employe em) {
		db.add(em);
	}

	public Employe getShowEmploye(int id) {

		Employe employe;
		try {
			employe = db.getOneEmploye(id);
			return employe;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		return null;
	}

	public void deleteEmploye(int id) {

		db.deleteOneEmploye(id);

	}

	public ArrayList<Employe> getAll() {

		try {
			return db.all();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	public void updateFormulaire(int id, Employe em) {
		db.updateOneEmploye(id, em);
	}
	
	public void refresh() {
		new Controleur();
	}
	
	public void createAdresse(Adresse ad) {
		dbAd.addAdresse(ad);
	}

	
	
	

}
