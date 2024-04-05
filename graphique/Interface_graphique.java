package graphique;

import javax.swing.*;
import java.awt.event.*;
import tache.Tache;

public class Interface_graphique implements ActionListener {
	JTextField titre, description, date_echeance, result_titre, result_description;
	JButton click;

	public Interface_graphique() {

		JFrame frame = new JFrame("Ajout d'un élement");
		titre = new JTextField();
		titre.setBounds(20, 50, 280, 30);
		description = new JTextField();
		description.setBounds(20, 90, 200, 28);
		result_titre = new JTextField();
		result_description = new JTextField();
		result_titre.setBounds(20,130,200,28);
		result_description.setBounds(20,170,200,28);
		result_titre.setEditable(false);
		result_description.setEditable(false);
		click = new JButton("Valider votre saisie");
		click.setBounds(100, 210, 200, 40);
		click.addActionListener(this);
		frame.add(titre);
		frame.add(description);
		frame.add(click);
		frame.add(result_titre);
		frame.add(result_description);
		frame.setSize(350, 300);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		String affichageTitre = titre.getText();
		String affichageDescrption = description.getText();
		if(e.getSource() == click) {
			result_titre.setText(affichageTitre);
			result_description.setText(affichageDescrption);
		}
	}
	
	public static void main(String[] args) {
		new Interface_graphique();
	}
}
