package org.tutorial.task02.solution;

public class Addierer {
	// Die beiden Integer Variablen. Als public definiert
	public int a;
	public int b;
	
	// Eine �ffentliche Methode mit einem Integer als R�ckgabewert
	public int getResult() {
		return a+b;
	}
	
	// @Override gibt an, dass die Methode aus einer �berklasse �berschrieben wurde. Alle Klassen erben ihre Methoden von Object. Dazu sp�ter mehr
	@Override
	public String toString() {
		return String.format("%d + %d = %d", a, b, getResult());
	}
}
