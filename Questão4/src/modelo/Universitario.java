package modelo;

public class Universitario implements Estudante {
	private String nome;
	
	public Universitario(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public void estudar() {
		System.out.println("Estudo sem contato imediato com o mercado de trabalho.");
	}
}
