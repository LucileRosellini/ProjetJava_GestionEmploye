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

import javax.swing.JOptionPane;

public class AdresseMySQL {
	
	
	
	private final String url = "jdbc:mysql:///gestion_employe";
	private final String user = "root";
	private final String password = "";

	public int addAdresse(Adresse adresse, int id) {

		try {
			Connection con = DriverManager.getConnection(url, user, password);

			if (con != null) {


				PreparedStatement st = con.prepareStatement(
						"INSERT adresses (rue, postal, ville,adresse_employe_id) VALUES (?, ?, ?,?)");

				st.setString(1, adresse.getRue());
				st.setString(2, adresse.getPostal());
				st.setString(3, adresse.getVille());
				st.setInt(4, id);
				st.executeUpdate();

				st.close();
				con.close();

				System.out.println("Okay adresse ajoutée");

				return 1;

			}

		} catch (SQLException e1) {
			System.out.println("JDBC probleme " + e1);
		}

		return 0;
	}	
	
	

	}



