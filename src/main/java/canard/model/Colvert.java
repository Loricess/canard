package canard.model;

import canard.model.cancan.*;
import canard.model.vol.ComportementVol;
import canard.model.vol.VolerAvecDesAiles;

public class Colvert extends Canard {

	public Colvert(String nom, ComportementVol comportementVol,ComportementCancan comportementCancan) {
		super(nom, comportementVol, comportementCancan);
	}

	public Colvert(String nom) {
		this(nom, new VolerAvecDesAiles(), new Cancan());
	}
	
	@Override
	public String afficher() {
		return super.afficher() + "un vrai colvert";
	}

}
