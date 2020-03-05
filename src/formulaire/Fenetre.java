package formulaire;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Fenetre extends JFrame{
	private Container cont;
	private PanneauFormulaire panneau;
	//private JLabel label;
	
	public Fenetre() {
		super("Insciption à l'IESN");
		//label = new JLabel("Inscritpion � l'IESN");
		//label.setBounds(100,100,100,100);
		setBounds(500,100,600,400);
		addWindowListener( new WindowAdapter(){public void windowClosing( WindowEvent e)    {System.exit(0);}});		
		
		panneau = new PanneauFormulaire();
		panneau.setLayout(new GridLayout(8,2,15,15));
		
		//panneau.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		//panneau.add(label);
		
		cont = getContentPane();
		cont.setLayout(new FlowLayout());
		cont.add(panneau);
		add(panneau);
		setVisible(true);
	}
	

}
