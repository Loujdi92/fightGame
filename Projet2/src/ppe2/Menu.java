package ppe2;

import java.util.Scanner;

public class Menu  {
	
		Nuker a = new Nuker("Jiraya", 100, 1000,"Nuker");
		Soigneur b = new Soigneur("Zabuza",90, 45,"Soigneur");
		
		Nuker c = new Nuker("Kakashi",40, 30,"Nuker");
		Soigneur d = new Soigneur("Kakuzu",60,20,"Soigneur");
		
		Nuker e = new Nuker("Sasuke",80,60,"Nuker");
		Soigneur f = new Soigneur("Naruto",80,40,"Soigneur");

		
		public void combattant() {
		System.out.println("Voici la liste des 6 personnages :");
		
		System.out.println("Perso -> 1");
		    a.perso();
		    System.out.println();
		    System.out.println("Perso -> 2");
			b.perso();
			System.out.println();
			System.out.println("Perso -> 3");
			c.perso();
			System.out.println();
			System.out.println("Perso -> 4");
			d.perso();
			System.out.println();
			System.out.println("Perso -> 5");
			e.perso();
			System.out.println();
			System.out.println("Perso -> 6");
			f.perso();
	        System.out.println();
		}


		
		public void verification6(String choix , char j) {
			
			Scanner sc = new Scanner(System.in);
			
			
			while( (choix.length() != 1) || (choix.length() == 1 && j !='1' && j !='2' && j !='3' && j!='4' && j!='5' && j!='6')){
				
				System.out.println("Tapez un chiffre compris ci dessus pour le choix de votre personnage");
				choix = sc.nextLine();
				j=choix.charAt(0);
			}
			
		}
		

		public void verif2(String choix, char j) {
			
			Scanner sc = new Scanner(System.in);
				
			while((choix.length() != 1) || (choix.length() == 1 && j !='1' && j !='2')){
					
					System.out.println("Tapez un chiffre compris entre 1 et 2");
					choix = sc.nextLine();
					j=choix.charAt(0);
				}
			
		}
		
	
		
		
			
}
		
		
		
		
	
	
	
	

	


