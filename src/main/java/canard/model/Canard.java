package canard.model;

public class Canard {
	@SuppressWarnings("unused")
	private String nom ;
	
	public Canard(String nom) {
		this.nom = nom;
	}

	public String nager() {
		return "Tous les canards flottent, même les leurres! ";
	}
	
	public String afficher() {
		return nom + " : Je suis un ";
	}
}
