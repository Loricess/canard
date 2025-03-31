package canard.application;

import java.util.*;

import canard.model.*;
import canard.model.vol.PropulsionAReaction;

public class Client {

	public static void main(String[] args) {
		Colvert colvert = new Colvert("Danny");
		PrototypeCanard prototypeCanard = new PrototypeCanard("Michel");

		System.out.println(colvert.afficher());
		System.out.println(colvert.nager());
		System.out.println(colvert.effectuerCancan());
		System.out.println(colvert.effectuerVol());
		System.out.println(prototypeCanard.afficher());
		System.out.println(prototypeCanard.effectuerVol());
		prototypeCanard.changerComportementVol(new PropulsionAReaction());
		System.out.println(prototypeCanard.effectuerVol());
	}

}
