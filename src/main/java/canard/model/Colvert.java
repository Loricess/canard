package canard.model;

import canard.model.vol.ComportementVol;
import canard.model.vol.VolerAvecDesAiles;

public class Colvert extends Canard {

	public Colvert(String nom, ComportementVol comportementVol) {
		super(nom, comportementVol);
	}

	public Colvert(String nom) {
		this(nom, new VolerAvecDesAiles());
	}
	
	@Override
	public String afficher() {
		return super.afficher() + "un vrai colvert";
	}

}
