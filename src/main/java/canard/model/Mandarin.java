package canard.model;

import canard.model.vol.ComportementVol;
import canard.model.vol.VolerAvecDesAiles;

public class Mandarin extends Canard {

	public Mandarin(String nom, ComportementVol comportementVol) {
		super(nom, comportementVol);
	}

	public Mandarin(String nom) {
		this(nom, new VolerAvecDesAiles());
	}
	
	@Override
	public String afficher() {
		return super.afficher() + "un vran mandarin";
	}
}
