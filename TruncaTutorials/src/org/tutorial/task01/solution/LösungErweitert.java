package org.tutorial.task01.solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LösungErweitert {

	public static void main(String[] args) {
		String name = ""; // Initialisieren der String Variable. Nicht unbedingt nötig aber empfohlen
		String age = "";
		String livingPlace = "";
		
		//Eine furchbare Schachtelung die einen BufferedReader mit einem InputStreamReader initialisiert der den System.in Input Stream ausliest
		//(Siehe Aufgabenbeschreibung für Details)
		BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in)); 
		
		try {
			//Begüßung und Frage nach dem Namen
			System.out.println("Guten Tag. Wie heißt du?");
			
			//Lesens einer Zeile aus der Konsole
			name = inputReader.readLine();
			
			//Frage nach dem Alter
			System.out.println("Wie alt bist du?");
			
			//Lesens einer Zeile aus der Konsole
			age = inputReader.readLine();
			
			//Frage nach dem Alter
			System.out.println("Wo wohnst du?");
			
			//Lesens einer Zeile aus der Konsole
			livingPlace = inputReader.readLine();
			
			//Der einfache Weg einer Ausgabe
			//System.out.println("Hallo " + name + " aus " + livingPlace + ". Du bist " + age + " Jahre alt);
			
			//Der etwas schönere Weg einer Ausgabe. %s steht hierbei für einen String
			//Weitere Infos: http://openbook.rheinwerk-verlag.de/javainsel9/javainsel_04_010.htm#t2t31 (Strg+Klick zum öffnen)
			System.out.println(String.format("Hallo %s aus %s. Du bist %s Jahre alt", name, livingPlace, age));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}