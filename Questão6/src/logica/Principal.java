package logica;

import modelo.Pessoa;
import modelo.Carro;
import modelo.Objeto;
import modelo.Comida;

import java.util.ArrayList;

public class Principal {
	public static void main(String[] args) {
		
		//Povoamento Simples/complicado
		ArrayList<Pessoa> Pessoas1 = new ArrayList<Pessoa>();
		ArrayList<Pessoa> Pessoas2 = new ArrayList<Pessoa>();
		ArrayList<Pessoa> Pessoas3 = new ArrayList<Pessoa>();
		
		ArrayList<Carro> Carros1 = new ArrayList<Carro>();
		ArrayList<Carro> Carros2 = new ArrayList<Carro>();
		ArrayList<Carro> Carros3 = new ArrayList<Carro>();
		
		ArrayList<Comida> Comidas1 = new ArrayList<Comida>();
		ArrayList<Comida> Comidas2 = new ArrayList<Comida>();
		ArrayList<Comida> Comidas3 = new ArrayList<Comida>();
		
		Pessoa pessoa1 = new Pessoa("Isadora");
		Pessoa pessoa2 = new Pessoa("Thaias");
		Pessoa pessoa3 = new Pessoa("Mariana");
		Pessoa pessoa4 = new Pessoa("Marcus");
		
		Carro carro1 = new Carro("Amarok");
		Carro carro2 = new Carro("AMG GT");
		Carro carro3 = new Carro("Accord");
		
		Comida comida1 = new Comida("Laranja");
		Comida comida2 = new Comida("Arroz");
		Comida comida3 = new Comida("Chocolate");
		Comida comida4 = new Comida("Maçã");
		Comida comida5 = new Comida("Feijão");
		Comida comida6 = new Comida("Macarrão");
		
		//Ob 1
		ArrayList<Pessoa> listaPessoas1 = new ArrayList<Pessoa>();
		listaPessoas1.add(pessoa1);
		listaPessoas1.add(pessoa2);
		ArrayList<Comida> listaComidas1 = new ArrayList<Comida>();
		listaComidas1.add(comida1);
		listaComidas1.add(comida2);
		listaComidas1.add(comida3);
		ArrayList<Carro> listaCarros1 = new ArrayList<Carro>();
		listaCarros1.add(carro1);
		Objeto objetos1 = new Objeto(listaPessoas1,listaCarros1,listaComidas1);
		//Ob 2
		ArrayList<Pessoa> listaPessoas2 = new ArrayList<Pessoa>();
		listaPessoas1.add(pessoa3);
		ArrayList<Comida> listaComidas2 = new ArrayList<Comida>();
		listaComidas1.add(comida4);
		listaComidas1.add(comida5);
		ArrayList<Carro> listaCarros2 = new ArrayList<Carro>();
		listaCarros1.add(carro2);
		Objeto objetos2 = new Objeto(listaPessoas2,listaCarros2,listaComidas2);
		
		//Ob 3
		ArrayList<Pessoa> listaPessoas3 = new ArrayList<Pessoa>();
		listaPessoas1.add(pessoa4);
		ArrayList<Comida> listaComidas3 = new ArrayList<Comida>();
		listaComidas1.add(comida6);
		ArrayList<Carro> listaCarros3 = new ArrayList<Carro>();
		listaCarros1.add(carro3);
		Objeto objetos3 = new Objeto(listaPessoas3,listaCarros3,listaComidas3);
		
		ArrayList<Objeto> listaDeObjetos = new ArrayList<Objeto>();
		listaDeObjetos.add(objetos1);
		listaDeObjetos.add(objetos2);
		listaDeObjetos.add(objetos3);
		
		for (Objeto objeto : listaDeObjetos) {
			System.out.println(objeto);
		}
		
		
		
		
	
		
		
		
		
		
		
		ArrayList<Objeto> Objetos1 = new ArrayList<Objeto>();

	}
		
	
}
