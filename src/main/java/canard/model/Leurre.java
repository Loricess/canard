package canard.model;

import canard.model.vol.ComportementVol;
import canard.model.vol.NePasVoler;

public class Leurre extends Canard {

	public Leurre(String nom, ComportementVol comportementVol) {
		super(nom, comportementVol);
	}

	public Leurre(String nom) {
		this(nom, new NePasVoler());
	}
	
	@Override
	public String afficher() {
		return super.afficher() + "un leurre";
	}
	
}
