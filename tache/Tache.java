package tache;

public class Tache {
	private String titre;
	private String description;
	private int date_echeance;
	
	public Tache(String titre, String description, int date_echeance) {
		this.titre = titre;
		this.date_echeance = date_echeance;
		this.description = description;
	}
}
