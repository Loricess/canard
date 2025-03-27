package canard.application;

import canard.model.*;
public class CanardMain {

	public static void main(String[] args) {
		
		Colvert piero = new Colvert("Piero");
		Leurre danny = new Leurre("Danny");
		Mandarin oshidori = new Mandarin("Oshidori");
		CanardEnPlastique rubber = new CanardEnPlastique("Rubber");
		
		String LIGNE = "-------------------";
		
		System.out.println(LIGNE);
		System.out.println("Afficher et Nager");
		System.out.println(LIGNE);
		System.out.println(piero.afficher());
		System.out.println(piero.nager());
		System.out.println(danny.afficher());
		System.out.println(danny.nager());
		System.out.println(oshidori.afficher());
		System.out.println(oshidori.nager());
		System.out.println(rubber.afficher());
		System.out.println(rubber.nager());

	}

}
