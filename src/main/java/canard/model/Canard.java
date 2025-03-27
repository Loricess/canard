package canard.model;

import canard.model.vol.ComportementVol;

public abstract class Canard {
    private final ComportementVol comportementVol;
    private final String nom ;
    
    
    public Canard(String nom ,ComportementVol comportementVol) {
        this.comportementVol = comportementVol;
		this.nom = nom;
    }
    
    public String getNom() {
		return nom;
	}

    public String effectuerVol() {
        return comportementVol.voler();
    }

    public String afficher() {
    	return "Je suis un " ;
    }
    
    public String nager() {
    	return "Tous les canards flottent, même les leurres !";
    }

	
}
