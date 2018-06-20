package logica;

import java.util.ArrayList;
import modelo.Lutador;
import java.util.Comparator;
import java.util.Collections;

public class Principal {
	public static void main(String[] args) {
		ArrayList<Lutador> listaDeLutadores = new ArrayList<Lutador>();
		
		Lutador lutador1 = new Lutador("Gabriel", 1.72, 10);
		Lutador lutador2 = new Lutador("Emerson", 1.77, 10);
		Lutador lutador3 = new Lutador("Baleião", 2, 20);
		
		listaDeLutadores.add(lutador1);
		listaDeLutadores.add(lutador2);
		listaDeLutadores.add(lutador3);
		
		Collections.sort(listaDeLutadores);
		
		for (Lutador lutador : listaDeLutadores) {
			System.out.println(lutador);
		}
		
	}
	
	
}



