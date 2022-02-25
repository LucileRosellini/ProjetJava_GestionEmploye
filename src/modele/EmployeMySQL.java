package modele;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JOptionPane;

public class EmployeMySQL {

	private final String url = "jdbc:mysql:///gestion_employe";
	private final String user = "root";
	private final String password = "";

	public int add(Employe employe) {

		try {
			Connection con = DriverManager.getConnection(url, user, password);

			if (con != null) {

				DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");

				PreparedStatement st = con.prepareStatement(
						"INSERT INTO employes (nom, prenom, sexe, date_naissance,code, quotite, date_ambauche) VALUES (?, ?, ?, ?, ?, ?, ?)");

				st.setString(1, employe.getNom());
				st.setString(2, employe.getPrenom());
				st.setInt(3, employe.getSexe());
				st.setDate(4, java.sql.Date.valueOf(dateFormat.format(employe.getDateNaissance())));
				st.setString(5, employe.getCode());
				st.setInt(6, employe.getQuotite());
				st.setDate(7, java.sql.Date.valueOf(dateFormat.format(employe.getDateEmbauche())));
				st.executeUpdate();

				st.close();
				con.close();

				System.out.println("Okay ça marche");

				return 1;

			}

		} catch (SQLException e1) {
			System.out.println("JDBC probleme " + e1);
		}

		return 0;
	}

	public ArrayList<Employe> all() throws ParseException {

		try {
			Connection con = DriverManager.getConnection(url, user, password);

			if (con != null) {
				// create JDBC statement object
				Statement st = con.createStatement();

				// prepare SQL query
				String query = "SELECT id, nom, prenom, sexe, date_naissance, date_ambauche, code, quotite FROM employes";

				ResultSet rs = st.executeQuery(query);

				ArrayList<Employe> employes = new ArrayList<Employe>();

				while (rs.next()) {
					Employe employe = new Employe(rs.getString("nom"), rs.getString("prenom"), rs.getInt("sexe"),
							new SimpleDateFormat("yyyy-mm-dd").parse(rs.getString("date_naissance")),
							rs.getString("code"), rs.getInt("quotite"),
							new SimpleDateFormat("yyyy-mm-dd").parse(rs.getString("date_ambauche")));
					employe.setId(rs.getInt("id"));

					employes.add(employe);
				}

				rs.close();
				st.close();
				con.close();

				return employes;

			}

		} catch (SQLException e1) {
			System.out.println("JDBC connection is not established" + e1);
			// e1.printStackTrace();
		}

		return null;
	}

	public Employe getOneEmploye(int id) throws ParseException {
		

		try {
			Connection con = DriverManager.getConnection(url, user, password);

			if (con != null) {
				Statement st = con.createStatement();

				String query = "SELECT id, nom, prenom, sexe, date_naissance, code, quotite, date_ambauche FROM employes WHERE id="
						+ id;

				ResultSet rs = st.executeQuery(query);

				if (rs.next()) {
					// String nom, String prenom, int sexe, Date dateNaissance, String code, int
					// quotite, Date dateEmbauche
					Employe employe = new Employe(rs.getString("nom"), rs.getString("prenom"), rs.getInt("sexe"),
							new SimpleDateFormat("yyyy-mm-dd").parse(rs.getString("date_naissance")),
							rs.getString("code"), rs.getInt("quotite"),
							new SimpleDateFormat("yyyy-mm-dd").parse(rs.getString("date_ambauche")));
					employe.setId(rs.getInt("id"));
					return employe;

				}

				st.close();
				con.close();

				System.out.println("Okay ça marche");

			}

		} catch (SQLException e1) {
			System.out.println("JDBC probleme " + e1);
		}

		return null;
	}

	public Employe deleteOneEmploye(int id) {

		try {
			Connection con = DriverManager.getConnection(url, user, password);

			if (con != null) {
				Statement st = con.createStatement();

				String query = "DELETE FROM employes WHERE id=" + id;

				int rs = st.executeUpdate(query);
				// si select executeQuery , si action de modification executeUpdate >>> /!/ type
				// n'est pas resultSet
				st.close();
				con.close();

				System.out.println("Okay ça marche");

			}

		} catch (SQLException e1) {
			System.out.println("JDBC probleme" + e1);
		}

		return null;
	}

	public void updateOneEmploye(int id, Employe employe) {

		try {
			Connection con = DriverManager.getConnection(url, user, password);

			if (con != null) {

				DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");

				PreparedStatement st = con.prepareStatement(
						"UPDATE employes SET nom=?, prenom=?, sexe=?,date_naissance=?, code=?, quotite=?, date_ambauche=? WHERE id="
								+ id);

				st.setString(1, employe.getNom());
				st.setString(2, employe.getPrenom());
				st.setInt(3, employe.getSexe());
				st.setDate(4, java.sql.Date.valueOf(dateFormat.format(employe.getDateNaissance())));
				st.setString(5, employe.getCode());
				st.setInt(6, employe.getQuotite());
				st.setDate(7, java.sql.Date.valueOf(dateFormat.format(employe.getDateEmbauche())));
				st.executeUpdate();

				st.close();
				con.close();

				System.out.println("Okay Mise à jour");

			}

		} catch (SQLException e1) {
			System.out.println("JDBC probleme" + e1);
		}

	}
}
