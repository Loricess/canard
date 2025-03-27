package canard.model;

import canard.model.vol.ComportementVol;
import canard.model.vol.NePasVoler;

public class CanardEnPlastique extends Canard {

	public CanardEnPlastique(String nom, ComportementVol comportementVol) {
		super(nom, comportementVol);
	}

	public CanardEnPlastique(String nom) {
		this(nom, new NePasVoler());
	}
	
	@Override
	public String afficher() {
		return super.afficher() + "un canard en plastique";
	}
}
