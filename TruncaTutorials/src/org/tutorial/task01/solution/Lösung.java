package org.tutorial.task01.solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class L�sung {

	public static void main(String[] args) {
		String name = ""; // Initialisieren der String Variable. Nicht unbedingt n�tig aber empfohlen
		
		//Eine furchbare Schachtelung die einen BufferedReader mit einem InputStreamReader initialisiert der den System.in Input Stream ausliest
		//(Siehe Aufgabenbeschreibung f�r Details)
		BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in)); 
		
		try {
			//Beg��ung und Frage nach dem Namen
			System.out.println("Guten Tag. Wie hei�t du?");
			
			//Lesens einer Zeile aus der Konsole
			name = inputReader.readLine();
			
			//Der einfache Weg einer Ausgabe
			//System.out.println("Hallo " + name);
			
			//Der etwas sch�nere Weg einer Ausgabe. %s steht hierbei f�r einen String
			//Weitere Infos: http://openbook.rheinwerk-verlag.de/javainsel9/javainsel_04_010.htm#t2t31 (Strg+Klick zum �ffnen)
			System.out.println(String.format("Hallo %s", name));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}