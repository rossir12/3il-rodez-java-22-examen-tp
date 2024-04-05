package graphique;

import javax.swing.*;
import java.awt.event.*;

/**
 * La classe Interface_graphique permet d'afficher une fenêtre dans laquelle
 * on saisie un titre et une description.
 * Un bouton valider permet d'afficher le titre et la description dans
 * un encadré ci-dessous.
 */
public class Interface_graphique implements ActionListener {
	JTextField titre, description, date_echeance, result_titre, result_description;
	JButton click;
/**
 * Construction Interface_graphique
 *	setBounds permet d'ajuster la taille de la zone de saisie
 *	setEditable(false) permet de rendre la zone de saisie non editable
 *	JButton permet de créer un bouton 
 *	addActionListener permet d'ajouter un événement lors d'un click sur le bouton
 *	frame.add permet d'ajouter les différents éléments à la fenêtre d'affichage
 *	setText permet d'afficher le texte saisie auparavant
 *	getText permet de récuperer le texte saisie dans les champs
 *	setSize permet de définir la taille de la fenêtre
 *	setVisible permet de rendre visible ou non un élement
 *	JTextField permet de créer la zone de saisie dans laquelle on indiquera un titre ou une description
 */
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
	
	/**
	 * Méthode sans retour (void)
	 * Cette méthode permet de recupérer le texte saisie et de l'afficher 
	 * dans les zone non éditable
	 */
	public void actionPerformed(ActionEvent e) {
		String affichageTitre = titre.getText();
		String affichageDescrption = description.getText();
		if(e.getSource() == click) {
			result_titre.setText(affichageTitre);
			result_description.setText(affichageDescrption);
		}
	}
	
	/**
	 * Méthode permettant de lancer la fenêtre permettant la saisie des tâches
	 * @param args
	 */
	public static void main(String[] args) {
		// création de la fenêtre d'affichage
		new Interface_graphique();
	}
}
