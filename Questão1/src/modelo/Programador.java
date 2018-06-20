package modelo;

public class Programador extends Funcionario{
	private String marcaPC;
	
	public Programador(String nome) {
		super(nome);
		super.nome = nome;
		this.marcaPC = marcaPC;
	}
	
	public String getMarcaPC() {
		return marcaPC;
	}
	
	
}
