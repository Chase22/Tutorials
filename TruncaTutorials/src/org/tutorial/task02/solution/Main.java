package org.tutorial.task02.solution;

public class Main {

	public static void main(String[] args) {
		//Addierer mit Standardkonstruktor initialisieren
		Addierer add1 = new Addierer();
		add1.a = 1; // Wert A befüllen
		add1.b = 1; // Wert B befüllen
		
		Addierer add2 = new Addierer();
		add2.a = 10;
		add2.b = 25;
		
		Addierer add3 = new Addierer();
		add3.a = 8;
		add3.b = 7;
		
		Addierer add4 = new Addierer();
		add4.a = 15;
		add4.b = 255;
		
		// Ausgabe über toString Methode
		System.out.println(add1.toString());
		System.out.println(add2.toString());
		System.out.println(add3.toString());
		System.out.println(add4); //println ruft automatisch die toString Methode auf wenn ein Objekt übergeben wird

	}

}
