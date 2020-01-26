package ppe2;

import java.util.Scanner;

public class Choix extends Menu {

	protected  Personnage[] jONE= new Personnage[2];
	protected  Personnage[] jTWO= new Personnage[2];

	protected  Personnage[] c1 = new Personnage [1];
	protected  Personnage[] c2 = new Personnage [1];

	    protected  Personnage[] z = {a,b,c,d,e,f};



	public void choixperso() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Bienvenue sur StreetFighter");
	  System.out.println();
	  System.out.println("Le jeux se joue par 2 , le premiere utilisateur va choisir 2 perso de son choix pareil pour le second utilisateur");
	  System.out.println();
	  System.out.println("Joueur 1 , quel est votre premier choix : ");

	String choix="";
	char q='k';
	choix = sc.nextLine();
	q=choix.charAt(0);


	verification6(choix,q);


	switch(q) {

	case '1' :
	jONE[0]=z[0];
	a.perso();
	break;
	case '2':
	jONE[0]=z[1];
	b.perso();
	break;
	case '3':
	jONE[0]=z[2];
	c.perso();
	break;
	case '4':
	jONE[0]=z[3];
	d.perso();
	break;
	case '5':
	jONE[0]=z[4];
	e.perso();
	break;
	case '6':
	jONE[0]=z[5];
	f.perso();
	break;

	}


	System.out.println();

	System.out.println("Donnez nous votre second choix joueur 1 :");

	String choix2="";
	char x='k';
	choix2 = sc.nextLine();
	x=choix2.charAt(0);


	verification6(choix2,x);


	switch(x) {

	case '1' :
	jONE[1]=z[0];
	a.perso();
	break;
	case '2':
	jONE[1]=z[1];
	b.perso();
	break;
	case '3':
	jONE[1]=z[2];
	c.perso();
	break;
	case '4':
	jONE[1]=z[3];
	d.perso();
	break;
	case '5':
	jONE[1]=z[4];
	e.perso();
	break;
	case '6' :
	jONE[1]=z[5];
	f.perso();
	break;

	}
	System.out.println();
	System.out.println("Maintenant Joueur 2 , quel est votre premier choix : ");


	String choice="";
	char j2='k';
	choice = sc.nextLine();
	j2=choice.charAt(0);


	verification6(choice,j2);


	switch(j2) {
	case '1' :
	jTWO[0]=z[0];
	a.perso();
	break;
	case '2':
	jTWO[0]=z[1];
	b.perso();
	break;
	case '3':
	jTWO[0]=z[2];
	c.perso();
	break;
	case '4':
	jTWO[0]=z[3];
	d.perso();
	break;
	case '5':
	jTWO[0]=z[4];
	e.perso();
	break;
	case '6' :
	jTWO[0]=z[5];
	f.perso();
	break;
	}


	System.out.println();

	System.out.println("Donnez nous votre second choix joueur 2 :");

	String choie="";
	char j3='k';
	choie = sc.nextLine();
	j3=choie.charAt(0);

	verification6(choie,j3);

	switch(j3) {

	case '1' :
	jTWO[1]=z[0];
	a.perso();
	break;
	case '2':
	jTWO[1]=z[1];
	b.perso();
	break;
	case '3':
	jTWO[1]=z[2];
	c.perso();
	break;
	case '4':
	jTWO[1]=z[3];
	d.perso();
	break;
	case '5':
	jTWO[1]=z[4];
	e.perso();
	break;
	case '6' :
	jTWO[1]=z[5];
	f.perso();
	break;


	}






	}

	public void equipes() {

	System.out.println("Joueur 1");
	System.out.println();
	for (int i = 0 ; i < jONE.length;i++) {
	  
	  System.out.println(jONE[i].toString());
	  System.out.println();
	  }
	  
	  System.out.println();
	  System.out.println("Joueur 2");
	  
	  for (int i = 0 ; i < jTWO.length;i++) {
	  
	  System.out.println(jTWO[i].toString());
	  System.out.println();
	  }

	}


	public void player1() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Joueur 1 avec quel perso voulez vous agir");
	char joueur1='k';
	String jj="";

	jj = sc.nextLine();
	   joueur1=jj.charAt(0);
	   
	   verif2(jj,joueur1);
	   System.out.println();
	   
	  
	   	
	   	if(joueur1 == '1') {
	   	
	   	System.out.println(jONE[0].toString());
	   	
	   	c1[0]=jONE[0];
	   	System.out.println();	
	   	
	   	
	   	
	   	}
	   	
	   	else if (joueur1 == '2') {
	   	
	   	c1[0]=jONE[1];
	   	System.out.println(jONE[1].toString());
	   	System.out.println();
	   	}
	   	
	   
	   
	   
	   
	System.out.println("Joueur 1 SUR quel personnage adverse voulez vous agir ? :");
	   
	   String che="";
	char o='k';
	che = sc.nextLine();
	o=che.charAt(0);


	verif2(che,o);


	if( o == '1') {
	System.out.println(jTWO[0].toString());
	System.out.println();
	    c2[0]=jTWO[0];


	}

	else if (o =='2') {
	System.out.println(jTWO[1].toString());
	System.out.println();
	c2[0]=jTWO[1];

	}
	}



	public void player12(){
	Scanner sc = new Scanner(System.in);

	System.out.println("Joueur 1 avec quel perso voulez vous agir");
	char joueur1='k';
	String jj="";

	jj = sc.nextLine();
	   joueur1=jj.charAt(0);
	   
	   verif2(jj,joueur1);
	   System.out.println();
	   
	  
	   	
	   	if(joueur1 == '1') {
	   	
	   	System.out.println(jONE[0].toString());
	   	
	   	c1[0]=jONE[0];
	   	System.out.println();	
	   	
	   	
	   	
	   	}
	   	
	   	else if (joueur1 == '2') {
	   	
	   	c1[0]=jONE[1];
	   	System.out.println(jONE[1].toString());
	   	System.out.println();
	   	}
	   	
	   
	   
	   
	   
	System.out.println("Joueur 1 SUR quel personnage adverse voulez vous agir ? :");
	   
	   String che="";
	char o='k';
	che = sc.nextLine();
	o=che.charAt(0);


	verif2(che,o);


	if( o == '1') {
	System.out.println(jTWO[0].toString());
	System.out.println();
	    c2[0]=jTWO[0];


	}

	else if (o =='2') {
	System.out.println(jTWO[1].toString());
	System.out.println();
	c2[0]=jTWO[1];

	}



	System.out.println();
	System.out.println("Joueur 1 SUR quel groupe (soit 1 ou 2)  voulez vous agir ? :");
	   
	String che3="";
	char o3='k';
	che3 = sc.nextLine();
	o3=che3.charAt(0);

	verif2(che3,o3);

	if(o3=='1') {

	System.out.println("Groupe 1");
	System.out.println();
	for(int i =0; i <jONE.length;i++) {

	System.out.println(jONE[i].toString());

	System.out.println();
	}



	System.out.println("Sur quel personnage voulez vous agir");
	String che4="";
	char o4='k';
	che4 = sc.nextLine();
	o4=che4.charAt(0);
	System.out.println();

	verif2(che4,o4);

	if(o4 == '1') {

	System.out.println(jONE[0].toString());
	System.out.println();
	   	c2[0]=jONE[0];
	   	
	}
	else if(o4 == '2') {
	System.out.println(jONE[1].toString());
	System.out.println();
	   	c2[0]=jONE[1];
	   	
	}

	}

	else if (o3=='2') {

	System.out.println("Groupe 2");
	System.out.println();
	for(int i =0; i <jTWO.length;i++) {

	System.out.println(jTWO[i].toString());
	System.out.println();
	}


	String che5="";
	char o5='k';
	che5 = sc.nextLine();
	o5=che5.charAt(0);

	System.out.println("Sur quel personnage voulez vous agir");
	System.out.println();

	verif2(che5,o5);

	if(o5 == '1') {

	System.out.println(jTWO[0].toString());
	System.out.println();
	c2[0]=jTWO[0];

	}
	else if(o5 == '2') {

	System.out.println(jTWO[1].toString());
	System.out.println();
	c2[0]=jTWO[1];

	}

	   }

	System.out.println();
	System.out.println("Voulez vous :");
	System.out.println((" 1 - Attaquer"));
	System.out.println((" 2 - Soigner"));
	System.out.println((" 3 - Controler"));
	System.out.println((" 4 - Evader"));


	String attaque2="";
	char aa2='k';
	attaque2 = sc.nextLine();
	aa2=attaque2.charAt(0);

	while((attaque2.length() != 1) || (attaque2.length() == 1 && aa2 !='1' && aa2 !='2' && aa2 !='3' && aa2 !='4' )) {

	System.out.println("Veuillez taper un chiffre ci-dessus");
	attaque2 = sc.nextLine();
	aa2=attaque2.charAt(0);
	}



	if(o3=='1') {
	if(aa2 == '1') {

	c1[0].attaquer(c2[0]);
	   System.out.println(c2[0]);	
	}
	else if(aa2 =='2') {

	c2[0].soigner(c1[0]);


	}
	else if( aa2 == '3') {

	c2[0].controle(c1[0]);


	}
	else if(aa2 == '4') {
	c2[0].evasion();
	}

	}


	else if(o3=='2') {
	if(aa2 == '1') {

	c1[0].attaquer(c2[0]);
	   System.out.println(c2[0]);	
	   mort();
	   
	}
	else if(aa2 =='2') {

	c1[0].soigner(c2[0]);
	mort();

	}
	else if( aa2 == '3') {

	c1[0].controle(c2[0]);
	mort();

	}
	else if(aa2 == '4') {
	c1[0].evasion();
	mort();
	}

	}


	}
	public void player2() {


	Scanner sc = new Scanner(System.in);
	System.out.println("Joueur 2 avec quel perso voulez vous agir");
	char joueur2='k';
	String jj2="";

	jj2 = sc.nextLine();
	   joueur2=jj2.charAt(0);
	   
	   
	   verif2(jj2,joueur2);
	   
	   System.out.println();
	 
	   	
	   	if(joueur2 == '1') {
	   	
	   	System.out.println(jTWO[0].toString());
	   	c1[0]=jTWO[0];
	   	System.out.println();	
	   	
	   	
	   	
	   	}
	   	
	   	else if (joueur2 == '2') {
	   	
	   	c1[0]=jTWO[1];
	   	System.out.println(jTWO[1].toString());
	   	System.out.println();
	   	
	   	}
	   	
	   
	   System.out.println(c1[0].toString());

	System.out.println();
	System.out.println("Joueur 2 SUR quel groupe (soit 1 ou 2)  voulez vous agir ? :");
	   
	String che3="";
	char o3='k';
	che3 = sc.nextLine();
	 	o3=che3.charAt(0);

	 	verif2(che3,o3);
	 	
	if(o3=='1') {

	System.out.println("Groupe 1");
	System.out.println();
	for(int i =0; i <jONE.length;i++) {

	System.out.println(jONE[i].toString());

	System.out.println();
	}



	System.out.println("Sur quel personnage voulez vous agir");
	String che4="";
	char o4='k';
	che4 = sc.nextLine();
	o4=che4.charAt(0);
	System.out.println();

	verif2(che4,o4);

	if(o4 == '1') {

	System.out.println(jONE[0].toString());
	System.out.println();
	    c2[0]=jONE[0];
	    
	}
	else if(o4 == '2') {
	System.out.println(jONE[1].toString());
	System.out.println();
	    c2[0]=jONE[1];
	    
	}

	}

	else if (o3=='2') {

	System.out.println("Groupe 2");
	System.out.println();
	for(int i =0; i <jTWO.length;i++) {

	System.out.println(jTWO[i].toString());
	System.out.println();
	}


	String che5="";
	char o5='k';
	che5 = sc.nextLine();
	o5=che5.charAt(0);

	System.out.println("Sur quel personnage voulez vous agir");
	System.out.println();

	verif2(che5,o5);

	if(o5 == '1') {

	System.out.println(jTWO[0].toString());
	System.out.println();
	c2[0]=jTWO[0];

	}
	else if(o5 == '2') {

	System.out.println(jTWO[1].toString());
	System.out.println();
	c2[0]=jTWO[1];

	}

	    }

	System.out.println();
	System.out.println("Voulez vous :");
	System.out.println((" 1 - Attaquer"));
	System.out.println((" 2 - Soigner"));
	System.out.println((" 3 - Controler"));
	System.out.println((" 4 - Evader"));


	String attaque2="";
	char aa2='k';
	attaque2 = sc.nextLine();
	aa2=attaque2.charAt(0);

	while((attaque2.length() != 1) || (attaque2.length() == 1 && aa2 !='1' && aa2 !='2' && aa2 !='3' && aa2 !='4' )) {

	System.out.println("Veuillez taper un chiffre ci-dessus");
	attaque2 = sc.nextLine();
	aa2=attaque2.charAt(0);
	}



	if(o3=='1') {
	if(aa2 == '1') {

	c1[0].attaquer(c2[0]);
	   System.out.println(c2[0]);
	   mort();
	}
	else if(aa2 =='2') {

	c2[0].soigner(c1[0]);
	System.out.println();
	mort();

	}
	else if( aa2 == '3') {

	c2[0].controle(c1[0]);
	System.out.println();
	mort();

	}
	else if(aa2 == '4') {
	c2[0].evasion();
	System.out.println();
	mort();
	}

	}


	else if(o3=='2') {
	if(aa2 == '1') {

	c2[0].attaquer(c1[0]);
	System.out.println();
	   mort();
	   
	   
	}
	else if(aa2 =='2') {

	c1[0].soigner(c2[0]);
	System.out.println();
	mort();

	}
	else if( aa2 == '3') {

	c1[0].controle(c2[0]);
	System.out.println();
	mort();

	}
	else if(aa2 == '4') {
	c1[0].evasion();
	System.out.println();
	mort();
	}

	}





	  }

	public void mort() {


	if(jONE[0].getPointvie() <=0 ){
	System.out.println();
	System.out.println("le joueur  "+jONE[0].toString()+" est mort");

	}

	else if(jONE[1].getPointvie()<=0 ){
	System.out.println();
	System.out.println("le joueur "+jONE[1].toString()+ " est mort");
	}

	else if (jTWO[0].getPointvie() <=0 ){
	System.out.println();
	System.out.println("le joueur  "+jTWO[0].toString()+" est mort");
	}
	else if (jTWO[1].getPointvie() <=0 ){
	System.out.println();
	System.out.println("le joueur  "+jTWO[1].toString()+" est mort");
	}

	}
	
	
	
	
	
	
}


