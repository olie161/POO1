package logica;

import modelo.Objeto;
import modelo.Pessoa;
import modelo.Familia;
import java.util.ArrayList;

public class Principal {
	public static void main(String[] args) {
		
		Objeto objeto1 = new Objeto("Espada");
		Objeto objeto2 = new Objeto("Faca");
		Objeto objeto3 = new Objeto("Revolver");
		Objeto objeto4 = new Objeto("Bomba");
		
		ArrayList<Objeto> listaDeObjetos1 = new ArrayList<Objeto>();
		listaDeObjetos1.add(objeto1);
		listaDeObjetos1.add(objeto4);
		
		ArrayList<Objeto> listaDeObjetos2 = new ArrayList<Objeto>();
		listaDeObjetos2.add(objeto2);
		listaDeObjetos2.add(objeto4);
		
		ArrayList<Objeto> listaDeObjetos3 = new ArrayList<Objeto>();
		listaDeObjetos3.add(objeto2);
		listaDeObjetos3.add(objeto2);
		
		ArrayList<Objeto> listaDeObjetos4 = new ArrayList<Objeto>();
		listaDeObjetos4.add(objeto4);
		listaDeObjetos4.add(objeto3);
		
		Pessoa pessoa1 = new Pessoa("Gabriel", listaDeObjetos4);
		Pessoa pessoa2 = new Pessoa("Emerson", listaDeObjetos3);
		Pessoa pessoa3 = new Pessoa("João", listaDeObjetos2);
		Pessoa pessoa4 = new Pessoa("Baleião", listaDeObjetos1);
		
		ArrayList<Pessoa> listaPessoa1 = new ArrayList<Pessoa>();
		listaPessoa1.add(pessoa1);
		listaPessoa1.add(pessoa2);
		
		ArrayList<Pessoa> listaPessoa2 = new ArrayList<Pessoa>();
		listaPessoa2.add(pessoa3);
		listaPessoa2.add(pessoa4);
		
		Familia familia1 = new Familia("Familia Amigões", listaPessoa1);
		Familia familia2 = new Familia("Familia Não Amigões", listaPessoa2);
		
		System.out.println("Familia 1: ");
		familia1.exibirTudo();
		System.out.println("Familia 2: ");
		familia2.exibirTudo();
		
		pessoa1.transferirObjeto(objeto4, pessoa4);
		
		System.out.println("Familia 1: ");
		familia1.exibirTudo();
		System.out.println("Familia 2: ");
		familia2.exibirTudo();
	}
}
