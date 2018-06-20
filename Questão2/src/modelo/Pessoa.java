package modelo;

import java.util.ArrayList;

public class Pessoa {
	private String nome;
	private int idade;
	
	public Pessoa(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}
	
	public void exibirtudo(ArrayList<Pessoa> listaDePessoas) {
		System.out.println(this.getNome() + " "+ getIdade());
	}
	
}
