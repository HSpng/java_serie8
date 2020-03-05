package formulaire;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Fenetre extends JFrame{
	private Container cont;
	private PanneauFormulaire panneau;
	//private JLabel label;
	
	public Fenetre() {
		super("Insciption à l'IESN");
		//label = new JLabel("Inscritpion à l'IESN");
		//label.setBounds(100,100,100,100);
		setBounds(500,100,700,500);
		addWindowListener( new WindowAdapter(){public void windowClosing( WindowEvent e)    {System.exit(0);}});		
		
		panneau = new PanneauFormulaire();
		panneau.setLayout(new GridLayout(8,2,10,10));
		
		//panneau.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		//panneau.add(label);
		
		cont = getContentPane();
		cont.setLayout(new FlowLayout());
		cont.add(panneau);
		add(panneau);
		setVisible(true);
	}
	

}
