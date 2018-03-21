package com.monsoor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestCollection {
	/**
	 * 
	 */
	public static void testerLesCollections() {
		// Collection a un objet fille. Je crée une variable de type Collection
		Collection names = new ArrayList();
		//On ajoutes des éléments (String) dans le names
		names.add("tmp.txt");
		names.add("toto.odt");
		// La toute première fois qu'on rentre dans la boucle,
		// On va créer une variable de type Iterator qui sera initialisé.
		//à partir  de la fonction '.iterator()' disponible dans l'objet names
		//Et à chaque passage dans la boucle, on vérifie qu'il existe un élément suivant.
		for (Iterator it = names.iterator(); it.hasNext();) {
			String name = (String) it.next();
			System.out.println("Nom trouvé : " + name);
		}

	}

}
