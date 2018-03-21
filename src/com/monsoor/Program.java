package com.monsoor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Initilisation de la liste chain�e
		LinkedList<String> listechaine = new LinkedList();
		// on ajoute dans la liste chainee
		listechaine.add("Nicolas");
		listechaine.add("Adrien");
		listechaine.add("Lucie");
		listechaine.add("Pierre");
		listechaine.add("Nicolas");
		listechaine.add("Laure");
		listechaine.add("Vita");
		listechaine.add("Alexandre");
		listechaine.add("Camille");
		//

		// On affiche la taille de ma liste chain�e
		System.out.println("taille de ma liste chain�e " + listechaine.size());
		// On cr�er un it�rateur qui est une sorte de tableau, il faut donc une boucle
		// pour le parcourir
		Iterator iterateur = listechaine.iterator();
		// On va parcourir le tableau de l'it�rateur avec un while
		while (iterateur.hasNext()) {
			System.out.println(iterateur.next());
		}
		// On va parcourir la liste sans it�rateur et avec une boucle for
		afficherListeMethodeSansIterateur(listechaine);
		// Affiche les �l�ments de la liste en mode for each
		afficherListeMethodeForEach(listechaine);
		// Scanner clavier=new Scanner(System.in);
		System.out.println("Quel �l�ment souhaites tu afficher");
		// On demande un num�ro � l'utilisateur, quel �l�ment il veut
		// int ChoixUtilisateur=clavier.nextInt();
		// afficherUnElementDuTableau(listechaine,ChoixUtilisateur);

		// Les listes ordonn�es, le TreeMap , pas besoin d'ordonn�
		TreeMap listeTriee = new TreeMap();
		listeTriee.put("ZZZ", "titi");
		listeTriee.put("Metivier", "Nicolas");
		listeTriee.put("Monsoor", "Misharl");
		listeTriee.put("XXX", "toto");
		Comparable c;

		// On va utiliser des Hashset
		HashSet listeNonTriee = new HashSet();
		// On peut rentrer directement un objet liste que j'avais cr�e pr�c�demment
		listeNonTriee.addAll(listechaine);
		listeNonTriee.addAll(listechaine);
		System.out.println(listeNonTriee);
		System.out.println(listeTriee);
		// Pour trier, il faut d'abord convertir en ArrayList , on d�gage les cl�s
		ArrayList tableATrier = new ArrayList(listeNonTriee);
		// L� on trie
		Collections.sort(tableATrier);
		// On imprime la liste tri�e
		System.out.println(tableATrier);
		
		// On va utiliser un Treeset
		TreeSet ListeTreeSet = new TreeSet(listechaine);
		System.out.println(ListeTreeSet);
		//On fait appel � la fonction de la classe TestCollection
		TestCollection.testerLesCollections();
		decouvrirSwitch();

	}

	/**
	 * Affiche les �l�ments de la liste sans it�rateur
	 * 
	 * @param listechaine
	 *            Prend en entr�e une liste qui contient que des strings
	 * @return Retourne un code d'ex�cution en int
	 * 
	 */
	private static int afficherListeMethodeSansIterateur(LinkedList<String> listechaine) {
		for (int i = 0; i < listechaine.size(); i++) {
			System.out.println("�l�ment � l'index " + i + " = " + listechaine.get(i));

			System.out.println("\n \tParcours avec un it�rateur ");
			System.out.println("-----------------------------------");
		}
		return 0;
	}

	/**
	 * Affiche les �l�ments de la liste en mode for each
	 * 
	 * @param listechaine
	 *            Prend en entr�e une liste qui contient que des strings
	 * @return Retourne un code d'ex�cution en int
	 */
	private static int afficherListeMethodeForEach(LinkedList<String> listechaine) {
		// Pour parcourir la liste en mode for each, il faut ajouter au d�but que la
		// liste va contenir que des string // LinkedList <String>listechaine = new
		// LinkedList();
		for (String prenom : listechaine) {
			System.out.println(prenom);
		}
		return 0;
	}

	private static int afficherUnElementDuTableau(LinkedList<String> listechaine, int i) {
		// Pour parcourir la liste en mode for each, il faut ajouter au d�but que la
		// liste va contenir que des string // LinkedList <String>listechaine = new
		// LinkedList();

		try {
			System.out.println("L'�l�ment d�sir� est la suivante: " + listechaine.get(i));
		} catch (Exception e) {
			System.out.println("Attention, le nombre entrer d�passe les limites du tableau");
		}

		return 0;
	}
	
	private static void decouvrirSwitch() {
		Scanner clavier= new Scanner(System.in);
		System.out.println("Entrer un age :");
		int age=clavier.nextInt();
		String etatPersonne=null;
		String stringMessage="Etat de la personne : ";
		if(age==0) {
			etatPersonne="Rien";		}
		else if (age<3) {
			etatPersonne="B�b�";
		
			
		}
		else if (age<12) {
			etatPersonne="Enfant";
			
		}
		else if (age<18) {
			etatPersonne="Ado";	
			
		}
		else if (age<31) {
			etatPersonne="Jeune";

			
		}
		else if (age<50) {
			etatPersonne="Adulte";

			
		}
		else if (age<60) {
			etatPersonne="Vieux";

			
		}
		else if (age<99) {
			etatPersonne="Senior";
			
		}
		else if(age<1000) {
			etatPersonne="Momie";
		}
		else {
			etatPersonne="Dinosaure";
					
		}
		
		System.out.println(stringMessage+etatPersonne);
		
		switch (etatPersonne) {
		case"Rien":
			System.out.println("Ce truc ne peut pas parler");
			break;
		case"B�b�":
			System.out.println("Areuuuuuu");
			break;
			
		case"Enfant":
			System.out.println("Haribo c'est beau la vie");
			break;
			
		case"Ado":
			System.out.println("Wesh ma gueule, sisi la family");
			break;
			
		case"Jeune":
			System.out.println("J'ai pas d'argent, je suis au ch�mage");
			break;
		case"Adulte":
			System.out.println("J'ai de l'argent mais j'ai pas le temps");
			break;
		case "Vieux":
			System.out.println("Bient�t la retraite");
			break;
		case "Senior":
			System.out.println("J'ai oubli� le nom de ma femme");
			break;
			
		case "Momie":
			System.out.println("Je suis poussi�reux");
			break;
			
		case "Dinosaure":
			System.out.println("Je m'appelle Denver, le dernier dinosaure");
			break;
		
		}
		
		/*
		 
		  sw
		  
		 */
	}
	

	
	

}
