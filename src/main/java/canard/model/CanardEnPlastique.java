package canard.model;

import canard.model.cancan.*;
import canard.model.vol.ComportementVol;
import canard.model.vol.NePasVoler;

public class CanardEnPlastique extends Canard {

	public CanardEnPlastique(String nom, ComportementVol comportementVol,ComportementCancan comportementCancan) {
		super(nom, comportementVol, comportementCancan);
	}

	public CanardEnPlastique(String nom) {
		this(nom, new NePasVoler(), new Coincoin());
	}
	
	@Override
	public String afficher() {
		return super.afficher() + "un canard en plastique";
	}
}
