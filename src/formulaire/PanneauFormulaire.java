package formulaire;

import java.awt.event.*;
import javax.swing.*;

public class PanneauFormulaire extends JPanel{
	private static final long serialVersionUID = 1L;
	private JLabel labelMatricule, labelPrenom, labelNom, labelNaissance, labelSection, labelOrigine;
	private JTextField zoneTexteMatricule, zoneTextePrenom, zoneTexteNom, zoneTexteNaissance, zoneTexteSection;
	private JCheckBox boxBoursier, boxEtranger;
	private JRadioButton buttonNetu, buttonReinsc;
	private ButtonGroup groupBout;
	private JComboBox<String> origine;
	
	public PanneauFormulaire() {
		labelMatricule = new JLabel("Matricule : ");
		labelMatricule.setHorizontalAlignment(SwingConstants.RIGHT);
		zoneTexteMatricule = new JTextField(20);
		//zoneTexteMatricule.setPreferredSize(new Dimension(100,12));
		//zoneTexteMatricule.setSize(200,24);

		labelPrenom = new  JLabel("Prénom : ");
		labelPrenom.setHorizontalAlignment(SwingConstants.RIGHT);
		zoneTextePrenom = new JTextField(20);

		labelNom = new  JLabel("Nom : ");
		labelNom.setHorizontalAlignment(SwingConstants.RIGHT);
		zoneTexteNom = new JTextField(20);

		labelNaissance = new  JLabel("Date de naissance : ");
		labelNaissance.setHorizontalAlignment(SwingConstants.RIGHT);
		zoneTexteNaissance = new JTextField(20);
		
		labelSection = new  JLabel("Section : ");
		labelSection.setHorizontalAlignment(SwingConstants.RIGHT);
		zoneTexteSection = new JTextField(20);
		zoneTexteSection.setEditable(false);
		
		boxBoursier = new JCheckBox("Boursier");
		boxBoursier.setHorizontalAlignment(SwingConstants.RIGHT);
		boxEtranger = new JCheckBox("Etranger");
		
		buttonNetu = new JRadioButton("Nouvel étudiant", false);
		buttonNetu.setHorizontalAlignment(SwingConstants.RIGHT);
		buttonReinsc = new JRadioButton("Réinscription", false);

		groupBout = new ButtonGroup();
		groupBout.add(buttonNetu);
		groupBout.add(buttonReinsc);
		
		labelOrigine = new JLabel("Origine : ");
		labelOrigine.setHorizontalAlignment(SwingConstants.RIGHT);
		String[] continent = {"Europe", "Afrique", "Asie", "Amérique", "Océanie"};
		origine = new JComboBox<>(continent);
		origine.setSelectedItem("Europe");
		labelOrigine.setVisible(false);
		origine.setVisible(false);
		
		add(labelMatricule);
		add(zoneTexteMatricule);
		add(labelNom);
		add(zoneTexteNom);
		add(labelPrenom);
		add(zoneTextePrenom);
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
		
		
		GestActionSection actionSection = new GestActionSection();
		zoneTexteMatricule.addActionListener(actionSection);
		GestActionOrigine actionOrigine = new GestActionOrigine();
		boxEtranger.addItemListener(actionOrigine);
		GestActionRadio actionRadio = new GestActionRadio();
		buttonNetu.addItemListener(actionRadio);
		buttonReinsc.addItemListener(actionRadio);

	}

	private class GestActionSection implements ActionListener{
		public void actionPerformed(ActionEvent e){
			int i = Integer.parseInt(zoneTexteMatricule.getText());
			switch (i / 1000) {
				case 1:
					zoneTexteSection.setText("Technologie de l'informatique");
					break;
				case 2:
					zoneTexteSection.setText("Sécurité des systèmes");
					break;
				case 3:
					zoneTexteSection.setText("Informatiques de gestion");
					break;
				case 4:
					zoneTexteSection.setText("Marketing");
					break;
				case 5:
					zoneTexteSection.setText("Automatique");
					break;
				case 6:
					zoneTexteSection.setText("Droit");
					break;
				case 7:
					zoneTexteSection.setText("Comptabilité");
					break;
				case 8:
					zoneTexteSection.setText("Régendat");
					break;
				default:
					JOptionPane.showMessageDialog(null, "Érreur de matricule", "Érreur", JOptionPane.WARNING_MESSAGE);
					break;
			}
		}
	}

	private class GestActionOrigine implements ItemListener{
		public void itemStateChanged(ItemEvent e){
			if(e.getStateChange() == ItemEvent.DESELECTED){
				labelOrigine.setVisible(false);
				origine.setVisible(false);
			}else{
				labelOrigine.setVisible(true);
				origine.setVisible(true);
			}
		}
	}
	
	private class GestActionRadio implements ItemListener{
		public void itemStateChanged(ItemEvent e){
			if(e.getSource() == buttonNetu && e.getStateChange() == ItemEvent.SELECTED){
				JOptionPane.showMessageDialog(null, "Rendez-vous au secrétariat");
			}else if(e.getSource() == buttonReinsc && e.getStateChange() == ItemEvent.SELECTED){
				JOptionPane.showMessageDialog(null, "N'oubliez pas de rendre au secréteriat la liste des dispenses demandées");
			}
		}
		
	}

}















