package com.monsoor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestCollection {
	/**
	 * 
	 */
	public static void testerLesCollections() {
		// Collection a un objet fille. Je cr�e une variable de type Collection
		Collection names = new ArrayList();
		//On ajoutes des �l�ments (String) dans le names
		names.add("tmp.txt");
		names.add("toto.odt");
		// La toute premi�re fois qu'on rentre dans la boucle,
		// On va cr�er une variable de type Iterator qui sera initialis�.
		//� partir  de la fonction '.iterator()' disponible dans l'objet names
		//Et � chaque passage dans la boucle, on v�rifie qu'il existe un �l�ment suivant.
		for (Iterator it = names.iterator(); it.hasNext();) {
			String name = (String) it.next();
			System.out.println("Nom trouv� : " + name);
		}

	}

}
