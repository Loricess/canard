package canard.model;

import canard.model.cancan.*;
import canard.model.vol.ComportementVol;
import canard.model.vol.NePasVoler;

public class PrototypeCanard extends Canard{

	public PrototypeCanard(String nom, ComportementVol comportementVol, ComportementCancan comportementCancan) {
		super(nom, comportementVol, comportementCancan);
	}

	public PrototypeCanard(String nom) {
		this(nom, new NePasVoler(), new CanardMuet());
	}

	@Override
	public String afficher() {
		return super.afficher() + " prototype de canard";
	}
}
