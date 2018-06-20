package modelo;
import modelo.Pessoa;
import java.util.ArrayList;

public class Familia {
	private String nome;
	ArrayList<Pessoa> listaDePessoas = new ArrayList<Pessoa>();
	
	public Familia(String nome, ArrayList<Pessoa> listaDePessoas) {
		super();
		this.nome = nome;
		this.listaDePessoas = listaDePessoas;
	}

	public void exibirTudo() {
		for (Pessoa pessoa : listaDePessoas) {
			System.out.println("Nome: " + pessoa.getNome());
			System.out.println("Objetos: ");
			for (Objeto objeto : pessoa.getListaDeObjetos()) {
				System.out.print(objeto.getNome() + " "); 
			}
		}
	}

}
