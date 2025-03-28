package canard.model;

import canard.model.cancan.*;
import canard.model.vol.ComportementVol;
import canard.model.vol.VolerAvecDesAiles;

public class Mandarin extends Canard {

	public Mandarin(String nom, ComportementVol comportementVol,ComportementCancan comportementCancan) {
		super(nom, comportementVol, comportementCancan);
	}

	public Mandarin(String nom) {
		this(nom, new VolerAvecDesAiles(), new Cancan());
	}
	
	@Override
	public String afficher() {
		return super.afficher() + " vrai mandarin";
	}
}
