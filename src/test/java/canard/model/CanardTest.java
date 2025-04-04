package canard.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import canard.model.cancan.*;
import canard.model.vol.*;

class CanardTest {
	private static final String NAGER = "Tous les canards flottent, même les leurres!";

	private static final String VOLER = "Je vole !";
	private static final String NE_PAS_VOLER = "Je ne sais pas voler";
	private static final String VOLER_AVEC_UN_REACTEUR = "Je vole avec un réacteur !" ;
	
	private static final String CANCAN = "Can-can";
	private static final String COINCOIN = "Coin-coin";
	private static final String SILENCE = "...Silence...";

	Canard colvert;
	Canard leurre;
	Canard mandarin;
	Canard canardPlastique;
	Canard prototypeCanard;

	@BeforeEach
	private void extracted() {
		colvert = new Colvert("Piero");
		leurre = new Leurre("Danny");
		mandarin = new Mandarin("Oshidori");
		canardPlastique = new CanardEnPlastique("Rubber");
		prototypeCanard = new PrototypeCanard("Michel");
		
	}

	@Test
	public void test_effectuerVol() {
		String texteVolColvert = colvert.effectuerVol();
		assertEquals(VOLER, texteVolColvert);

		assertEquals(VOLER, mandarin.effectuerVol());

		assertEquals(NE_PAS_VOLER, leurre.effectuerVol());
		assertEquals(NE_PAS_VOLER, canardPlastique.effectuerVol());
		assertEquals(NE_PAS_VOLER, prototypeCanard.effectuerVol());
	}

	@Test
	public void test_effectuerCancan() {

		assertEquals(CANCAN, colvert.effectuerCancan());
		assertEquals(CANCAN, mandarin.effectuerCancan());

		assertEquals(SILENCE, leurre.effectuerCancan());
		assertEquals(COINCOIN, canardPlastique.effectuerCancan());
		assertEquals(SILENCE, prototypeCanard.effectuerCancan());

	}

	@Test
	public void test_nager() {

		assertEquals(NAGER, colvert.nager());
		assertEquals(NAGER, mandarin.nager());

		assertEquals(NAGER, leurre.nager());
		assertEquals(NAGER, canardPlastique.nager());
		assertEquals(NAGER, prototypeCanard.nager());

	}

	@Test
	public void test_presentation_nom_et_afficher() {
		assertEquals("Piero", colvert.getNom());
		assertEquals("Je suis un vrai colvert", colvert.afficher());

		assertEquals("Oshidori", mandarin.getNom());
		assertEquals("Je suis un vrai mandarin", mandarin.afficher());

		assertEquals("Danny", leurre.getNom());
		assertEquals("Je suis un leurre", leurre.afficher());

		assertEquals("Rubber", canardPlastique.getNom());
		assertEquals("Je suis un canard en plastique", canardPlastique.afficher());
		
		assertEquals("Michel", prototypeCanard.getNom());
		assertEquals("Je suis un prototype de canard", prototypeCanard.afficher());
	}

	@Test
	public void test_changer_comportement_vol() {
		canardPlastique.changerComportementVol(new VolerAvecDesAiles());
		leurre.changerComportementVol(new VolerAvecDesAiles());
		colvert.changerComportementVol(new NePasVoler());
		mandarin.changerComportementVol(new NePasVoler());
		prototypeCanard.changerComportementVol(new PropulsionAReaction());
		
		assertEquals(NE_PAS_VOLER, colvert.effectuerVol());

		assertEquals(NE_PAS_VOLER, mandarin.effectuerVol());

		assertEquals(VOLER, leurre.effectuerVol());
		assertEquals(VOLER, canardPlastique.effectuerVol());
		assertEquals(VOLER_AVEC_UN_REACTEUR,prototypeCanard.effectuerVol());
	}
	
	@Test
	public void test_changer_comportement_cancan() {
		canardPlastique.changerComportementCancan(new CanardMuet());
		leurre.changerComportementCancan(new Cancan());
		colvert.changerComportementCancan(new Coincoin());
		mandarin.changerComportementCancan(new Coincoin());
		
		assertEquals(COINCOIN, colvert.effectuerCancan());

		assertEquals(COINCOIN, mandarin.effectuerCancan());

		assertEquals(CANCAN, leurre.effectuerCancan());
		assertEquals(SILENCE, canardPlastique.effectuerCancan());
	}
}