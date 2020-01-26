package ppe2;


import java.io.*;
import java.net.*;
import java.util.Scanner;
public class Client {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		String reponse;
		Socket leSocket;
		PrintStream fluxSortieSocket;
		BufferedReader fluxEntreeSocket;
		String champs;
		while (true) {
			System.out.println("ecriver votre message");
			champs = sc.nextLine();
			
		try {
			
			/* boucle pour repeter */
		
		// creation d’une socket et connexion �  la machine marine sur le port numéro 7
		leSocket = new Socket("localhost", 7898);
		System.out.println("Connecter sur : "+leSocket);
		// création d’un flux de type PrintStream lié au flux de sortie de la socket
		fluxSortieSocket = new PrintStream(leSocket.getOutputStream());
		// creation d’un flux de type BufferedReader lié au flux d’entrée de la socket
		fluxEntreeSocket= new BufferedReader(new InputStreamReader(leSocket.getInputStream()));
		// envoi de données vers le serveur
		
		fluxSortieSocket.println("  "+champs);
		// attente puis réception de données envoyées par le serveur
		reponse = fluxEntreeSocket.readLine();

		System.out.println("Reponse du serveur : " + reponse);
		leSocket.close();
		} // try
		catch (UnknownHostException ex)
		{
		System.err.println("Machine inconnue : "+ex);
		ex.printStackTrace();
		}
		catch (IOException ex)
		{
		System.err.println("Erreur : "+ex);
		ex.printStackTrace();
		}
		
		
		} // main
	
	
		
}
}

