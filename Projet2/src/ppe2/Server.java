package ppe2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main (String args[]) {
		ServerSocket socketEcoute;
		Socket socketService;
		BufferedReader entreeSocket;
		PrintStream sortieSocket;
		try {
		// création du socket d’écoute (port numero 7898)
		socketEcoute = new ServerSocket(7898);
		while (true) {
		// attente d’une demande de connexion
		socketService = socketEcoute.accept();
		System.out.println("Nouvelle connexion : " + socketService);
		// récupération des flux d’entrée/sortie de la socket de service
		entreeSocket = new BufferedReader (new InputStreamReader(socketService.getInputStream()));
		sortieSocket = new PrintStream(socketService.getOutputStream());
		try {
		String b = entreeSocket.readLine();
		String addr = "";
		addr=socketService.getInetAddress().toString();
		System.out.println("Message du Client"+b);
		sortieSocket.println("Bonjour Mr. Client : "+addr);
		System.out.println("Fin de connexion");
		} // try
		catch (IOException ex)
		{
		// fin de connexion
		System.out.println("Fin de connexion : "+ex);
		ex.printStackTrace();
		}
		socketService.close();
		} // while (true)
		} // try
		catch (Exception ex)
		{
		// erreur de connexion
		System.err.println("Une erreur est survenue : "+ex);
		ex.printStackTrace();
		}
		} // main
		} // class


