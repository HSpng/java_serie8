package formulaire;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PanneauFormulaire extends JPanel{
	//private Container cont;
	private JLabel labelMatricule, labelPrenom, labelNom, labelNaissance, labelSection, labelOrigine, labelNetu, labelReinsc;
	private JTextField zoneTexteMatricule, zoneTextePrenom, zoneTexteNom, zoneTexteNaissance, zoneTexteSection;
	private JCheckBox boxBoursier, boxEtranger;
	private JRadioButton buttonNetu, buttonReinsc;
	private ButtonGroup groupBout;
	private JComboBox origine;
	
	public PanneauFormulaire() {
		labelMatricule = new JLabel("Matricule : ");
		labelMatricule.setHorizontalAlignment(SwingConstants.RIGHT);
		//cont.add(labelMatricule);
		zoneTexteMatricule = new JTextField(30);
		//zoneTexteMatricule.setPreferredSize(new Dimension(100,12));
		zoneTexteMatricule.setSize(200,24);
		//cont.add(zoneTexteMatricule);
		labelPrenom = new  JLabel("Prénom : ");
		labelPrenom.setHorizontalAlignment(SwingConstants.RIGHT);
		//cont.add(labelPrenom);
		zoneTextePrenom = new JTextField(30);
		//cont.add(zoneTextePrenom);
		labelNom = new  JLabel("Nom : ");
		labelNom.setHorizontalAlignment(SwingConstants.RIGHT);
		//cont.add(labelNom);
		zoneTexteNom = new JTextField(30);
		//cont.add(zoneTexteNom);
		labelNaissance = new  JLabel("Date de naissance : ");
		labelNaissance.setHorizontalAlignment(SwingConstants.RIGHT);
		//cont.add(labelNaissance);
		zoneTexteNaissance = new JTextField(30);
		//cont.add(labelSection);
		labelSection = new  JLabel("Section : ");
		labelSection.setHorizontalAlignment(SwingConstants.RIGHT);
		zoneTexteSection = new JTextField(30);
		
		boxBoursier = new JCheckBox("Boursier");
		boxBoursier.setHorizontalAlignment(SwingConstants.RIGHT);
		boxEtranger = new JCheckBox("Etranger");
		
		buttonNetu = new JRadioButton("Nouvel étudiant", true);
		buttonNetu.setHorizontalAlignment(SwingConstants.RIGHT);
		buttonReinsc = new JRadioButton("Réinscription", false);
		groupBout = new ButtonGroup();
		groupBout.add(buttonNetu);
		groupBout.add(buttonReinsc);
		
		labelOrigine = new JLabel("Origine : ");
		labelOrigine.setHorizontalAlignment(SwingConstants.RIGHT);
		String[] continent = {"Europe", "Afrique", "Asie", "Amérique", "Océanie"};
		origine = new JComboBox(continent);
		origine.setSelectedItem("Europe");
		
		add(labelMatricule);
		add(zoneTexteMatricule);
		add(labelNom);
		add(zoneTexteNom);
		add(labelNaissance);
		add(zoneTexteNaissance);
		add(labelSection);
		add(zoneTexteSection);
		add(boxBoursier);
		add(boxEtranger);
		add(buttonNetu);
		add(buttonReinsc);
		add(labelOrigine);
		add(origine);
		
	}

}











