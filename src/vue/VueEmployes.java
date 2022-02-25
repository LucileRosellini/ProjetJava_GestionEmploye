package vue;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlleur.Controleur;
import modele.Employe;
import modele.ModeleDynamiqueEmploye;

import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JSpinner;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Color;

public class VueEmployes extends JFrame {

	private JPanel contentPane;
	private Controleur controleur;
	private JTextField txtField_Name;
	private JTextField txtField_Prenom;
	private JTextField textField_Code;
	private JTextField textField_Quotite;
	private JTextField textField_Date_Birth;
	private JTextField textField_Date_Embauche;
	private JTextField textField_Sexe;
	private JTextField textField_input_id;
	private ModeleDynamiqueEmploye modeleEmploye;
	private JTable table;
	private JTextField textField_Rue;
	private JTextField textField_Code_Postal;
	private JTextField textField_Ville;
	private JTextField textField_Salaire;
	private JTextField textField_Fonction;

	/**
	 * Create the frame.
	 */
	public VueEmployes(Controleur controleur) {
		this.controleur = controleur;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1197, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel lb_name = new JLabel("Name");
		lb_name.setBounds(10, 11, 46, 14);

		txtField_Name = new JTextField();
		txtField_Name.setBounds(10, 23, 86, 20);
		lb_name.setLabelFor(txtField_Name);
		txtField_Name.setColumns(10);

		JLabel lb_prenom = new JLabel("Prenom");
		lb_prenom.setBounds(10, 54, 46, 14);

		txtField_Prenom = new JTextField();
		txtField_Prenom.setBounds(10, 65, 86, 20);
		lb_prenom.setLabelFor(txtField_Prenom);
		txtField_Prenom.setColumns(10);

		JLabel lb_sexe = new JLabel("Sexe");
		lb_sexe.setBounds(10, 103, 46, 14);

		JLabel lb_Code = new JLabel("Code");
		lb_Code.setBounds(10, 197, 46, 14);

		textField_Code = new JTextField();
		textField_Code.setBounds(10, 211, 86, 20);
		lb_Code.setLabelFor(textField_Code);
		textField_Code.setColumns(10);

		JLabel lb_Quotite = new JLabel("Quotite");
		lb_Quotite.setBounds(10, 242, 46, 14);

		textField_Quotite = new JTextField();
		textField_Quotite.setBounds(10, 255, 86, 20);
		lb_Quotite.setLabelFor(textField_Quotite);
		textField_Quotite.setColumns(10);

		JButton btnCreate = new JButton("Create");
		btnCreate.setBounds(23, 623, 86, 23);
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				formData();
			}
		});

		JButton btnRead = new JButton("Read");
		btnRead.setBounds(202, 623, 86, 23);
		btnRead.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				findOneEmploye();

			}
		});

		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBounds(23, 657, 86, 23);
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miseAJour();
			}
		});

		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(1074, 695, 86, 23);
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				removeEmploye();
			}
		});

		JLabel lb_Date_Birth = new JLabel("Date de naissance");
		lb_Date_Birth.setBounds(10, 154, 98, 14);

		textField_Date_Birth = new JTextField();
		textField_Date_Birth.setBounds(10, 166, 86, 20);
		lb_Date_Birth.setLabelFor(textField_Date_Birth);
		textField_Date_Birth.setColumns(10);

		JLabel lb_Date_Embauche = new JLabel("Date d'embauche");
		lb_Date_Embauche.setBounds(10, 286, 98, 14);

		textField_Date_Embauche = new JTextField();
		textField_Date_Embauche.setBounds(10, 301, 86, 20);
		lb_Date_Embauche.setLabelFor(textField_Date_Embauche);
		textField_Date_Embauche.setColumns(10);

		textField_Sexe = new JTextField();
		textField_Sexe.setBounds(10, 114, 86, 20);
		lb_sexe.setLabelFor(textField_Sexe);
		textField_Sexe.setColumns(10);

		textField_input_id = new JTextField();
		textField_input_id.setBounds(202, 592, 86, 20);
		textField_input_id.setColumns(10);
		contentPane.setLayout(null);

		JPanel panel_getAll = new JPanel();
		panel_getAll.setBounds(166, 11, 1005, 510);
		contentPane.add(panel_getAll);
		panel_getAll.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 985, 488);
		panel_getAll.add(scrollPane);

		modeleEmploye = new ModeleDynamiqueEmploye(getAllEmploye());
		table = new JTable(modeleEmploye);
		scrollPane.setViewportView(table);

		contentPane.add(lb_name);
		contentPane.add(lb_prenom);
		contentPane.add(lb_sexe);
		contentPane.add(txtField_Prenom);
		contentPane.add(txtField_Name);
		contentPane.add(textField_Sexe);
		contentPane.add(lb_Code);
		contentPane.add(lb_Date_Birth);
		contentPane.add(textField_Date_Embauche);
		contentPane.add(lb_Date_Embauche);
		contentPane.add(textField_input_id);
		contentPane.add(btnRead);
		contentPane.add(btnDelete);
		contentPane.add(textField_Date_Birth);
		contentPane.add(btnUpdate);
		contentPane.add(btnCreate);
		contentPane.add(textField_Code);
		contentPane.add(lb_Quotite);
		contentPane.add(textField_Quotite);
		
		JPanel panel_Adresse = new JPanel();
		panel_Adresse.setBackground(Color.WHITE);
		panel_Adresse.setBounds(10, 433, 114, 171);
		contentPane.add(panel_Adresse);
		panel_Adresse.setLayout(null);
		
		textField_Rue = new JTextField();
		textField_Rue.setBounds(10, 40, 86, 20);
		panel_Adresse.add(textField_Rue);
		textField_Rue.setColumns(10);
		
		textField_Code_Postal = new JTextField();
		textField_Code_Postal.setColumns(10);
		textField_Code_Postal.setBounds(10, 85, 86, 20);
		panel_Adresse.add(textField_Code_Postal);
		
		textField_Ville = new JTextField();
		textField_Ville.setColumns(10);
		textField_Ville.setBounds(10, 132, 86, 20);
		panel_Adresse.add(textField_Ville);
		
		JLabel lb_Rue = new JLabel("Rue");
		lb_Rue.setBounds(10, 24, 46, 14);
		panel_Adresse.add(lb_Rue);
		
		JLabel lb_Cp = new JLabel("Code postal");
		lb_Cp.setBounds(10, 71, 86, 14);
		panel_Adresse.add(lb_Cp);
		
		JLabel lb_Ville = new JLabel("Ville");
		lb_Ville.setBounds(10, 116, 46, 14);
		panel_Adresse.add(lb_Ville);
		
		textField_Salaire = new JTextField();
		textField_Salaire.setBounds(10, 346, 86, 20);
		contentPane.add(textField_Salaire);
		textField_Salaire.setColumns(10);
		
		textField_Fonction = new JTextField();
		textField_Fonction.setBounds(10, 390, 86, 20);
		contentPane.add(textField_Fonction);
		textField_Fonction.setColumns(10);
		
		JLabel lb_Salaire = new JLabel("Salaire");
		lb_Salaire.setBounds(10, 332, 46, 14);
		contentPane.add(lb_Salaire);
		
		JLabel lb_Fonction = new JLabel("Fonction");
		lb_Fonction.setBounds(10, 377, 46, 14);
		contentPane.add(lb_Fonction);
	}

	public void formData() {

		if (txtField_Name.getText().equals("") || txtField_Prenom.getText().equals("")
				|| textField_Sexe.getText().equals("") || textField_Date_Embauche.getText().equals("")
				|| textField_Date_Birth.getText().equals("") || textField_Code.getText().equals("")
				|| textField_Quotite.getText().equals("")) {
			JOptionPane.showMessageDialog(contentPane, "Complétez les informations svp", "Error",
					JOptionPane.ERROR_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(contentPane, "Nouvel employé enregistré!");
		}

		Employe em = new Employe(txtField_Name.getText(), txtField_Prenom.getText(),
				Integer.parseInt(textField_Sexe.getText()), formatStrToDate(textField_Date_Birth.getText()),
				textField_Code.getText(), Integer.parseInt(textField_Quotite.getText()),
				formatStrToDate(textField_Date_Embauche.getText()));

		controleur.create(em);
		reload();


	}

	public Date formatStrToDate(String s) {
		try {
			return new SimpleDateFormat("yyyy-mm-dd").parse(s);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public static String formatDateToString(Date d) {
		SimpleDateFormat sfd = new SimpleDateFormat("yyyy-mm-dd");
		Calendar c = Calendar.getInstance();
		c.setTime(d);
		Date date1 = c.getTime();
		return sfd.format(date1);
	}

	public void findOneEmploye() {
		int index = table.getSelectedRow();

		if (table.getSelectionModel().isSelectionEmpty()) {
			JOptionPane.showMessageDialog(contentPane, "Selectionnez un employé.", "Error", JOptionPane.ERROR_MESSAGE);
		} else {
			String id = table.getModel().getValueAt(index, 0).toString();
			Employe em = controleur.getShowEmploye(Integer.parseInt(id));
			if (em == null) {
				JOptionPane.showMessageDialog(contentPane, "Employé introuvable", "Error", JOptionPane.ERROR_MESSAGE);

			} else {
				txtField_Name.setText(em.getNom());
				txtField_Prenom.setText(em.getPrenom());
				textField_Sexe.setText("" + em.getSexe());
				textField_Date_Birth.setText("" + formatDateToString(em.getDateNaissance()));
				textField_Code.setText("" + em.getCode());
				textField_Quotite.setText("" + em.getQuotite());
				textField_Date_Embauche.setText("" + formatDateToString(em.getDateEmbauche()));
				JOptionPane.showMessageDialog(contentPane, "Employé trouvé!");
			}

		}

	}

	public void removeEmploye() {
		int index = table.getSelectedRow();
		int id = Integer.parseInt(table.getModel().getValueAt(index, 0).toString());
		controleur.deleteEmploye(id);

//     txtField_Name.setText(textField_input_id.getText());
		System.out.println("Employé supprimé!");
		reload();

	}

	public void miseAJour() {

		int index = table.getSelectedRow();
		if (txtField_Name.getText().equals("") || txtField_Prenom.getText().equals("")
				|| textField_Sexe.getText().equals("") || textField_Date_Embauche.getText().equals("")
				|| textField_Date_Birth.getText().equals("") || textField_Code.getText().equals("")
				|| textField_Quotite.getText().equals("")) {
			JOptionPane.showMessageDialog(contentPane, "Complétez les informations svp", "Error",
					JOptionPane.ERROR_MESSAGE);
		} else {

			if (table.getSelectionModel().isSelectionEmpty()) {
				JOptionPane.showMessageDialog(contentPane, "Selectionnez un employé.", "Error",
						JOptionPane.ERROR_MESSAGE);
			} else {
				Employe em = new Employe(txtField_Name.getText(), txtField_Prenom.getText(),
						Integer.parseInt(textField_Sexe.getText()), formatStrToDate(textField_Date_Birth.getText()),
						textField_Code.getText(), Integer.parseInt(textField_Quotite.getText()),
						formatStrToDate(textField_Date_Embauche.getText()));

				int id = Integer.parseInt(table.getModel().getValueAt(index, 0).toString());
				controleur.updateFormulaire(id, em);
				JOptionPane.showMessageDialog(contentPane, "Mise à jour enregistré!");
				reload();
			}

		}

	}

	public void reload() {
		controleur.refresh();
	}

	public ArrayList<Employe> getAllEmploye() {

		return controleur.getAll();

	}
}
