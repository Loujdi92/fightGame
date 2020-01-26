package ppe2;

public class Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("  __ _____ ___ ___ ___ _____   ___ _  __ _  _ _____ ___ ___  \r\n" + 
				"/' _/_   _| _ \\ __| __|_   _| | __| |/ _] || |_   _| __| _ \\ \r\n" + 
				"`._`. | | | v / _|| _|  | |   | _|| | [/\\ >< | | | | _|| v / \r\n" + 
				"|___/ |_| |_|_\\___|___| |_|   |_| |_|\\__/_||_| |_| |___|_|_\\ ");
		System.out.println();
		
		Compte m =new Compte();
		Combat s = new Combat();
		
		   m.comptePersonne();
		   System.out.println("Bienvenue sur StreetFighter");
		   System.out.println();
		   System.out.println("Le jeux se joue par 2 , le premiere utilisateur va choisir 2 perso de son choix pareil pour le second utilisateur");
		   System.out.println();
		
		   s.jeux();
		
		
	}

}
