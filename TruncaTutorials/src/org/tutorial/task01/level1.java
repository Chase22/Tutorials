package org.tutorial.task01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class level1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// Chasetorial 1 Ein- und Ausgabe:
	// Name: Martin Durmich aka Truncatus
		
		InputStreamReader leser = new InputStreamReader(System.in); //inputs werden in Datenfetzen gewandelt
	    BufferedReader wandler = new BufferedReader(leser); // Buffer wandelt Datenfetzen in W�rter um.
	    String a_name = ""; // Variable f�r den Namen
	    String a_alter = ""; // Variable f�r das Alter
	    String a_ort = ""; // Name f�r den Wohnort
		try { // Mittels Try/Catch werden potentielle Fehler verhindert und als Fehler-Meldung zur�ckgeschickt.
			System.out.print("Bitte gebe deinen Namen ein: ");
			a_name = wandler.readLine(); // Einschreiben des Namens
			System.out.print("Bitte gebe dein Alter ein: ");
			a_alter = wandler.readLine(); // Einschreiben des Alters
			System.out.print("Bitte gebe deinen Wohnort ein: ");
			a_ort = wandler.readLine(); // Einschreiben des Wohnortes
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    System.out.println("Hallo, Welt. Ich hei�e " + a_name + ", bin " + a_alter + " Jahre alt und wohne in " + a_ort + ".");
		/* Kennst du GOptionPane? es ist eine Texteingabeformatierung, 
		 * welche wir fr�her in der Ausbildung gelernt haben.
		 * Blub*/
	}

}
