package modele;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	private java.sql.Date SqlDate;

	public  void mainTest(String[] args) {
		final String url = "jdbc:mysql:///gestion_employe";
		final String user = "root";
		final String password = "";

		try {
			Connection con = DriverManager.getConnection(url, user, password);

			if (con != null) {
//	        	System.out.println("It's okay ! ");
				// create JDBC statement object
				Statement st = con.createStatement();

				// prepare SQL query
//				String query = "SELECT id, nom, prenom, sexe, date_naissance, code, quotite, date_ambauche FROM employes";
				
//				PreparedStatement st2 = con.prepareStatement ("INSERT INTO employes (id, nom, prenom, sexe, date_naissance, code, quotite, date_ambauche) VALUES (  ?, ?, ?, ?, ?, ?, ?, ? )");
//				st2.setInt(1, 1);
//				st2.setString(2, "HADJ-ABDELKADER"); 
//				st2.setString(3, "Karim");
//				st2.setInt(4, 1);
//				st2.setDate(5, java.sql.Date.valueOf("2000-05-18"));
//				st2.setString(6, "Toto");
//				st2.setInt(7, 0);
//				st2.setDate(8, java.sql.Date.valueOf("2022-02-01"));
//				st2.executeUpdate();

//				PreparedStatement st3 = con.prepareStatement ("INSERT INTO employes (id, nom, prenom, sexe, date_naissance, code, quotite, date_ambauche) VALUES (  ?, ?, ?, ?, ?, ?, ?, ? )");
//				st3.setInt(1, 2);
//				st3.setString(2, "ROSELLINI"); 
//				st3.setString(3, "Lucile");
//				st3.setInt(4, 2);
//				st3.setDate(5, java.sql.Date.valueOf("2000-06-12"));
//				st3.setString(6, "Titi");
//				st3.setInt(7, 1);
//				st3.setDate(8, java.sql.Date.valueOf("2022-03-01"));
//				int rowsInserted = st3.executeUpdate();
//				if (rowsInserted > 0) {
//				    System.out.println("Un nouvel employé a été ajouté !");
//				}
				
				
//				String sql = "UPDATE employes SET id=?, nom=?, prenom=?, sexe=?, date_naissance=?, code=?, quotite=?, date_ambauche=? WHERE id=2";
//				 
//				PreparedStatement statement = con.prepareStatement(sql);
//				statement.setInt(1, 2);
//				statement.setString(2, "ROSELLINI"); 
//				statement.setString(3, "Coyote");
//				statement.setInt(4, 2);
//				statement.setDate(5, java.sql.Date.valueOf("2000-06-12"));
//				statement.setString(6, "Titi");
//				statement.setInt(7, 1);
//				statement.setDate(8, java.sql.Date.valueOf("2022-03-01"));
//				 
//				int rowsUpdated = statement.executeUpdate();
//				if (rowsUpdated > 0) {
//				    System.out.println("L'employé a bien été mis à jour !");
//				}
				
				String sql = "DELETE FROM employes WHERE id=2";
				 
				PreparedStatement st4 = con.prepareStatement(sql);
//				statement.setString(1, "bill");
				 
				int rowsDeleted = st4.executeUpdate();
				if (rowsDeleted > 0) {
				    System.out.println("Un employé a été supprimé !");
				}
				
				// send and execute SQL query in Database software
//				ResultSet resultat = st.executeQuery(query);

//				while (resultat.next()) {
//					System.out.println(resultat.getInt(1) + " - " + resultat.getString(2) + " - "
//							+ resultat.getString(3) + " - " + resultat.getInt(4) + " - " + resultat.getDate(5) + " - "
//							+ resultat.getString(6) + " - " + resultat.getInt(7) + " - " + resultat.getDate(8));
//				}
//
//				resultat.close();
				st4.close();
				con.close();
				
			}
			
			

			System.out.println("JDBC connexion Ok !");

		} catch (SQLException e1) {
			System.out.println("JDBC probleme de connexion" + e1);
			// e1.printStackTrace();
		}
		
		 
		

//		SimpleDateFormat sfd = new SimpleDateFormat("dd/MM/yyyy");
//		Date date1=null;
//		Date date2=null;
//		try {
//			date1=sfd.parse("22/02/1988");
//			date2=sfd.parse("25/02/1988");
//		} catch (ParseException e) {
//			System.out.println(e);
//			// TODO Auto-generated catch block
//		}

//		Employe employe = new Employe();

		/*
		 * Employe.stringToDate("01/03/1989");
		 * System.out.println(Employe.stringToDate("01/03/1989"));
		 * 
		 * ---------------------------------------
		 * 
		 * System.out.println(Employe.dateToString(date1, "dd-MM-yyyy à h:mm:ss"));
		 * 
		 * ---------------------------------------
		 * 
		 * 
		 * /*Employe employe = new Employe("nom", "prenom", 2, date1, "code",1, date2,
		 * new Adresse("rue","postal", "ville"), new Fonction (date2,
		 * "titre","departement", 10, 11), null, null);
		 * employe.stringToDate("22/02/1988");
		 * System.out.println(employe.stringToDate("22/02/1988"));
		 */

	}

	/*
	 * NE PAS EFFACER
	 * 
	 * Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse("31/12/1998"); Personne
	 * personne = new Personne("Toto", "Tata", 2, date1);
	 * System.out.println(personne.age());
	 */

}