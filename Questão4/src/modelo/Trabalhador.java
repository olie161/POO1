package modelo;

public class Trabalhador implements Estudante {
	private String nome;
	
	public Trabalhador(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public void estudar() {
		System.out.println("O estudo tem mais retorno devido ter mais contato com o mercado de trabalho");		
	}

}
