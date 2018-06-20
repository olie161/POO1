package modelo;

import java.util.Comparator;

public class Lutador implements Comparable<Lutador> {
	private String nome;
	private double altura;
	private float força;
	
	public Lutador(String nome, double altura, float força) {
		super();
		this.nome = nome;
		this.altura = altura;
		this.força = força;
	}
	
	public double getAltura() {
		return altura;
	}

	public float getForça() {
		return força;
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
		return "Nome: " + this.getNome() + " Altura: " + this.getAltura() + " Força: " + this.getForça();
	}
	
	
	
}
