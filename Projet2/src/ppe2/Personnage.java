package ppe2;

import java.util.Random;

public class Personnage {
	
	protected String nom;
	protected int niveau=0;
	protected int pointexp=0;
	protected int pointvie;
	protected int nbreatt;
	protected String type;
	
	
	public Personnage() {
		
		this.niveau=0;
		this.pointexp=0;
	}
	
	public Personnage(String nom, int pointvie, int nbreatt,String type){
		this.nom=nom;
		this.pointvie=pointvie;
		this.nbreatt=nbreatt;
		this.type=type;
	}

	
	public void perso() {
		System.out.println("Type : "+getType());
		System.out.println("Nom : "+getNom());
		System.out.println("niveau: "+getNiveau());
		System.out.println("Point d'experience : "+getPointexp());
		System.out.println("Point de vie : "+getPointvie());
		System.out.println("nbreAttaque : "+getNbreatt());
	}
	

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getNbreatt() {
		return nbreatt;
	}

	public void setNbreatt(int nbreatt) {
		this.nbreatt = nbreatt;
	}

	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public int getNiveau() {
		return niveau;
	}



	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}



	public int getPointexp() {
		return pointexp;
	}



	public void setPointexp(int pointexp) {
		this.pointexp = pointexp;
	}



	public int getPointvie() {
		return pointvie;
	}



	public void setPointvie(int pointvie) {
		this.pointvie = pointvie;
	}

	
	public  String toString() {
		
		return "Type : "+getType()+"\n"
			  +"Nom : "+getNom()+"\n"
			  +"niveau: "+getNiveau()+"\n"
			  +"Point d'experience : "+getPointexp()+"\n"
			  +"Point de vie : "+getPointvie()+"\n"
			  +"nbreAttaque : "+getNbreatt();
		
	}

	public void attaquer(Personnage p) {
		
		Random rnd = new Random();
		int atq = (rnd.nextInt(this.nbreatt - (this.nbreatt * 3 / 100)+1));
		p.setPointvie(p.pointvie - atq*p.getEviter());		

	}
	
	public void soigner(Personnage p) {
		
		Random rnd = new Random();
		int soin = rnd.nextInt((this.nbreatt - (this.nbreatt * 3 / 100)+1) + this.nbreatt - this.nbreatt * 3/100);
		System.out.println("Soin : "+soin);
		p.setPointvie(p.getPointvie()+soin);
		System.out.println(p.toString());
	}
	
	private int eviter = 1;
	
	public int getEviter() {
		return eviter;
	}

	public void setEviter(int eviter) {
		this.eviter = eviter;
	}

	public void evasion() {
		System.out.println("Effet d'evasion activé sur "+nom);
		
		eviter = 0;	
		
	}

	public boolean controle =false, controle1 = false;
	
	public void controle(Personnage p) {
		System.out.println("Effet de Controle activé sur "+p.nom);
				 
		p.controle=true;
		
	}

	
	
	


}
