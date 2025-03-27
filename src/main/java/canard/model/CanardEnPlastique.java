package canard.model;

public class CanardEnPlastique extends Canard {

	public CanardEnPlastique(String nom) {
		super(nom);
	}

	@Override
	public String afficher() {
		return super.afficher() + "un canard en plastique";
	}
}
