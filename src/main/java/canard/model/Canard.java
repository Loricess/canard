package canard.model;

import canard.model.cancan.ComportementCancan;
import canard.model.vol.ComportementVol;

public abstract class Canard {
    private ComportementVol comportementVol;
	private final String nom ;
    private ComportementCancan comportementCancan;
    
    public Canard(String nom ,ComportementVol comportementVol,ComportementCancan comportementCancan) {
        this.comportementVol = comportementVol;
		this.nom = nom;
		this.comportementCancan = comportementCancan;
    }
    
    public void changerComportementVol(ComportementVol comportementVol) {
		this.comportementVol = comportementVol;
	}

	public void changerComportementCancan(ComportementCancan comportementCancan) {
		this.comportementCancan = comportementCancan;
	}
    
    public String getNom() {
		return nom;
	}

    public String effectuerVol() {
        return comportementVol.voler();
    }
    
    public String effectuerCancan() {
    	return comportementCancan.cancaner();
    }

    public String afficher() {
    	return "Je suis un" ;
    }
    
    public String nager() {
    	return "Tous les canards flottent, même les leurres!";
    }

	
}
