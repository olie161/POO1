package modelo;
import java.util.ArrayList;
import modelo.Objeto;

public class Pessoa {
	private String nome;
	private ArrayList<Objeto> listaDeObjetos = new ArrayList<Objeto>();
	
	public Pessoa(String nome, ArrayList<Objeto> listaDeObjetos) {
		super();
		this.nome = nome;
		this.listaDeObjetos = listaDeObjetos;
	}
	
	public String getNome() {
		return nome;
	}
	
	public ArrayList<Objeto> getListaDeObjetos() {
		return listaDeObjetos;
	}
	
	public void transferirObjeto(Objeto objeto, Pessoa pessoa) {
		for (Objeto ob : listaDeObjetos) {
			if(ob == objeto) {
				pessoa.getListaDeObjetos().add(objeto);
				listaDeObjetos.remove(ob);
			}
		}
	}
	
	
}
