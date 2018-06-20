package logica;

import modelo.Funcionario;
import modelo.Programador;
public class logica {
	public static void main(String[] args) {
		int numeroInt = 40;
		char caractere = 'a';
		
		//Cast Primitivo = INT para CHAR EXPLICITO
		char cast1 = (char)numeroInt;
		System.out.println(cast1);
		
		//Cast Primitivo = INT para CHAR IMPLICITO
		int cast2 = caractere;
		System.out.println(cast2);
		//ou
		cast2 = 'a';
		System.out.println(cast2);
		
		//Não se pode transformar um tipo maior em outro menor, EX:
		long numero1 = 10000;
		int numero2;
		numero2 = (int)numero1;
		System.out.println(numero2);
		
		// 
		float calculoErrado = (float) 5/2;
		System.out.println(calculoErrado);
		float calculoCorreto = 5/2;
		//System.out.println(calculoCorreto);
		
		//Cast de Classes - Depois do CAST é possivel imprimir dados específicos do PROGRAMADOR, caso o contrario, n.
		Funcionario funcionario = new Programador("Ocian");
		Programador programador = (Programador)funcionario;
		
		
	}
}
