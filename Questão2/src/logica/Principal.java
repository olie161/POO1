package logica;

import java.util.ArrayList;
import modelo.Pessoa;

public class Principal {
	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa("Gabriel", 20);
		Pessoa pessoa2 = new Pessoa("Emerson", 18);
		Pessoa pessoa3 = new Pessoa("João", 27);
		
		ArrayList<Pessoa> listaDePessoas = new ArrayList<Pessoa>();
		
		listaDePessoas.add(pessoa1);
		listaDePessoas.add(pessoa2);
		listaDePessoas.add(pessoa3);
		
		System.out.println("For normal:");
		for(int i = 0; i < listaDePessoas.size(); i++) {
			System.out.println("Pessoa " + (i + 1));
			System.out.println("Nome: " + listaDePessoas.get(i).getNome());
			System.out.println("Idade: " + listaDePessoas.get(i).getIdade() + "\n");
		}
		
		System.out.println("Foreach:");
		int count = 1;
		for(Pessoa pessoa : listaDePessoas) {
			System.out.println("Pessoa " + count);
			System.out.println("Nome: " + pessoa.getNome());		
			System.out.println("Idade: " + pessoa.getIdade() + "\n");
			count+=1;
		}		
		
		System.out.println("Metodo forEach dentro de pessoa");
		listaDePessoas.forEach(item->item.exibirtudo(listaDePessoas));
		
	}
}
