package org.tutorial.task02.solution;

public class Addierer {
	// Die beiden Integer Variablen. Als public definiert
	public int a;
	public int b;
	
	// Eine öffentliche Methode mit einem Integer als Rückgabewert
	public int getResult() {
		return a+b;
	}
	
	// @Override gibt an, dass die Methode aus einer Überklasse überschrieben wurde. Alle Klassen erben ihre Methoden von Object. Dazu später mehr
	@Override
	public String toString() {
		return String.format("%d + %d = %d", a, b, getResult());
	}
}
