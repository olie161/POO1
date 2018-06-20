package modelo;

import java.util.ArrayList;

public class Objeto {
	ArrayList<Pessoa> listaDePessoas = new ArrayList<Pessoa>();
	ArrayList<Carro> listaDeCarros = new ArrayList<Carro>();
	ArrayList<Comida> listaDeComidas = new ArrayList<Comida>();
	
	public Objeto(ArrayList<Pessoa> listaDePessoas, ArrayList<Carro> listaDeCarros, ArrayList<Comida> listaDeComidas) {
		super();
		this.listaDePessoas = listaDePessoas;
		this.listaDeCarros = listaDeCarros;
		this.listaDeComidas = listaDeComidas;
	}

	@Override
	public String toString() {
		return "Objeto listaDePessoas=" + listaDePessoas + ", listaDeCarros=" + listaDeCarros + ", listaDeComidas="
				+ listaDeComidas + "]";
	}
	
	
}
