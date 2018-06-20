package modelo;

import java.util.Comparator;

public class Lutador implements Comparable<Lutador> {
	private String nome;
	private double altura;
	private float for�a;
	
	public Lutador(String nome, double altura, float for�a) {
		super();
		this.nome = nome;
		this.altura = altura;
		this.for�a = for�a;
	}
	
	public double getAltura() {
		return altura;
	}

	public float getFor�a() {
		return for�a;
	}

	public String getNome() {
		return nome;
	}
	
	@Override
    public int compareTo(Lutador t) {
        return nome.compareTo(t.getNome());
    }

	@Override
	public String toString() {
		return "Nome: " + this.getNome() + " Altura: " + this.getAltura() + " For�a: " + this.getFor�a();
	}
	
	
	
}
