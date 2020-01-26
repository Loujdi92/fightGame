package ppe2;

import java.util.Scanner;

public class Combat extends Choix{
	
	
	public void jeux() {
		Scanner sc = new Scanner(System.in);
		combattant();
		choixperso();
		System.out.println();
		equipes();

		player1();

		System.out.println();
		System.out.println("Voulez-vous :");
		System.out.println();
		System.out.println("1 -- Attaquer");
		System.out.println();

		String attaque="";
		char aa='k';
		attaque = sc.nextLine();
		aa=attaque.charAt(0);

		verif2(attaque,aa);

		if(aa == '1') {


		c1[0].attaquer(c2[0]);
		System.out.println();
		   System.out.println(c2[0]);	

		}

		System.out.println();


		player2();

		while (true){
		player12();
		System.out.println();
		player2();




		if(jONE[0].getPointvie() <=0  && jONE[1].getPointvie() <=0){
		System.out.println();
		System.out.println("Le joueur 1 a perdu");
		System.out.println();
		System.out.println("Le joueur 2 a gagner");
		experience2();
		break;

		}




		else if(jTWO[0].getPointvie()<=0 && jTWO[1].getPointvie()<=0 ){
		
		System.out.println();
		System.out.println("Le joueur 1 a gagner");
		System.out.println();
		System.out.println("Le joueur 2 a perdu");
		System.out.println();

		
		
		
		break;
		}



		}



		}

		public void experience1() {

		System.out.println("experience 1");


		}

		public void experience2() {
			System.out.println("experience 2");
//		for (int i = 0 ; i < jTWO.length;i++) {
//
//			jTWO[i].setPointexp(jTWO[i].getPointexp()+50);
//		}
//
//		for(int i = 0 ; i < jONE.length;i++) {
//		jTWO[i].toString();System.out.println();
//		}
//		
		}
	
	
	}

	
	

	


