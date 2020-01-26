package ppe2;

public class Soigneur extends Personnage {


	public Soigneur(String nom,int pointvie, int nbreatt,String type) {
		
		super(nom,pointvie,nbreatt,type);
		
	}
	
	
	public String getNom() {
		return nom;
	}

	
	
	public void setNom(String nom) {
		this.nom = nom;
	}

	public void perso() {
		System.out.println("Type : "+getType());
		System.out.println("Nom : "+getNom());
		System.out.println("niveau: "+getNiveau());
		System.out.println("Point d'experience : "+getPointexp());
		System.out.println("Point de vie : "+getPointvie());
		System.out.println("nbreAttaque : "+getNbreatt());

	}
	
  
	
//	public void attaquer() {
//		
//		
//		// Ajout de 1 a 3% en fonction du nombre generer aleatoirement
//		if (nbrAle == 0) { this.nbreatt = this.nbreatt*(1+1/100);}
//		else if (nbrAle == 1) {	this.nbreatt = this.nbreatt*(1+2/100);}
//		else if (nbrAle == 2) { this.nbreatt = this.nbreatt*(1+3/100);}
//		// Retirer 1 a 3% en fonction du nombre generer aleatoirement
//		else if (nbrAle == 3) { this.nbreatt = this.nbreatt*(1-1/100);}
//		else if (nbrAle == 4) {	this.nbreatt = this.nbreatt*(1-2/100);}
//		else if (nbrAle == 5) {	this.nbreatt = this.nbreatt*(1-3/100);}
//		
//		pointvie = pointvie - nbreatt;
//
//	}
//
	
	
	
}
