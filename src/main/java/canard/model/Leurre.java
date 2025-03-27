package canard.model;

import canard.model.cancan.*;
import canard.model.vol.ComportementVol;
import canard.model.vol.NePasVoler;

public class Leurre extends Canard {

	public Leurre(String nom, ComportementVol comportementVol,ComportementCancan comportementCancan) {
		super(nom, comportementVol, comportementCancan);
	}

	public Leurre(String nom) {
		this(nom, new NePasVoler(), new CanardMuet());
	}
	
	@Override
	public String afficher() {
		return super.afficher() + "un leurre";
	}
	
}
