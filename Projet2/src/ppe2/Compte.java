package ppe2;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class Compte {
//	public static void main(String[] args) {

//	
	private String identifiant;
	private String motdepasse;
//	private String pseudo;
//	private int id;
//	private int idcli;



	  Conn p= new Conn();

	  public void comptePersonne() {
		  
		
	  p.Connect();
	  
	  /* variable */
	  int choixmenu = 0;
	  String identifiant1 = "";
	  String mdp = "";
	  int idcli = 0;
	  
	  /* variable */
	  Scanner sc = new Scanner(System.in);
	  
	  
	  System.out.println("Entrer 1 pour vous connectez, 2 pour vous inscrire");
	  choixmenu = sc.nextInt();
	 
	  
	  if(choixmenu == 1) {
		  System.out.println("***********CONNEXION***************");
		  System.out.println("Entrer votre identifiant");
		  identifiant1 = sc.next();
		  System.out.println("Entrer votre mot de passe");
		  motdepasse = sc.next();
		  
		  try {
			 	p.stmt = p.dbcon.createStatement();
			 	
			 	ResultSet results = p.stmt.executeQuery("SELECT id FROM compte WHERE identifiant='"+identifiant1+"' AND motdepasse='"+mdp+"'");
			 	while(results.next())
			 	{
			 	idcli = results.getInt(1);
			 	idcli=1;
			 	}
			 	
			 	results.close();
			 	p.stmt.close();
			 	}
			 	
			 	catch(SQLException sqlExcept)
			 	{	
			 	System.out.println("erreur.");
			 	
			 	}
		  
		  if(idcli == 1) {
			  /* CONNEXION OK ON LANCE LE JEUX */
			  System.out.println("Connexion OK");
		  }  
		  else  if(idcli == 0) {
			  System.out.println("identifiant ou mdp incorrect"); 
		  }
			  
			  
			  
			  }
			  	
			  	
			  	
		  
				  
		
		  else  if(choixmenu == 2) {
				
				nouvocompte();	  
				
		  }
		  
	
	  
	  }
		
		
		
 

	  
	

	  
	  
	  
	  
	  
	  
	  
	  
	  
//	  Scanner sc=new Scanner(System.in);
//	  
//	  System.out.println("Tapez votre identifiant :");
//	 	
//	 	this.identifiant=sc.next();
//	 	
//	 	System.out.println("Tapez votre mot de passe :");
//	 	
//	 	this.motdepasse=sc.next();
//	
//	 	
//	 	if (idcli == 0) {
//	  System.out.println("Identifiant ou mot de passe incorrect");
//	  
//	  System.out.println();
//	System.out.println("Tapez 1 -> CONNEXION");
//	   System.out.println("Tapez 2 -> INSCRIPTION");
//	   
//	   char n='p';
//	String r=""; 
//	   
//	r=sc.nextLine();
//	 n=r.charAt(0);
//	   
//	   while((r.length()!=1)||(r.length()== 1 && n !='1' && n!='2')){
//	   	
//	   	
//	   	System.out.println("Tapez 1 pour vous connectez ou 2 pour vous inscrire ");
//	   	
//	   	r=sc.nextLine();
//	   n=r.charAt(0);
//	   }
//	   
//	   if(n=='1') {
//	   	System.out.println("Tapez votre identifianttt :");
//	 	
//	 	this.identifiant=sc.next();
//	 	
//	 	System.out.println("Tapez votre mot de passe :");
//	 	
//	 	this.motdepasse=sc.next();
//	 	
//	 	
//	 	try {
//	 	p.stmt = p.dbcon.createStatement();
//	 	
//	 	ResultSet results = p.stmt.executeQuery("SELECT id FROM compte WHERE identifiant='"+identifiant+"' AND motdepasse='"+motdepasse+"'");
//	 	while(results.next())
//	 	{
//	 	idcli = results.getInt(1);
//	 /*	System.out.println("Connexion effectué avec succès ");*/
//	 	idcli=1;
//	 	}
//	 	results.close();
//	 	p.stmt.close();
//	 	}
//	 	
//	 	catch(SQLException sqlExcept)
//	 	{	
//	 	System.out.println("erreur.");
//	 	idcli=0;
//	 	}
//	 	
//	 	if(idcli == 1) {
//	 		System.out.println("co succès");
//	 	}
//	 	
//	 	else if(idcli == 0) {
//	 		System.out.println("Identifiants ou mot de passe incorrect");
//	 	}
//	   	
//	   }
//	   
//	   else if(n=='2') {
//	   	
//	   	créer();
//	   }
//	   
//	  }
//  
//	}

	public void nouvocompte() {
		Scanner sc =new Scanner(System.in);
		System.out.println("Chosissez votre identifiant : ");
		this.identifiant=sc.nextLine();
		
		System.out.println("Chosissez votre motdepasse : ");	
		this.motdepasse=sc.nextLine();

		try {
		p.stmt = p.dbcon.createStatement();
		p.stmt.execute("insert into compte(identifiant,motdepasse) values('"+this.identifiant+"', '"+this.motdepasse+"')");
	
		p.stmt.close();
		}
		catch (SQLException sqlExcept){
		sqlExcept.printStackTrace();
	
		} 
	
	
		System.out.println("Compte crée avec SUCCES");
	
	 }
 }


