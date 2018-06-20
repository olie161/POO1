package logica;
import java.util.ArrayList;
import modelo.Estudante;
import modelo.Universitario;
import modelo.Trabalhador;

public class Principal {
	public static void main(String[] args) {
		ArrayList<Estudante> Estudante = new ArrayList<Estudante>();
		
		Universitario Uni1 = new Universitario("Gabriel");
		Trabalhador Tra1 = new Trabalhador("Ocian");
		Universitario Uni2 = new Universitario("Emerson");
		
		Estudante.add(Uni1);
		Estudante.add(Tra1);
		Estudante.add(Uni2);
		
		System.out.println("Estudantes:");
		int count=1;
		for (Estudante estudante : Estudante) {
			System.out.println("\nEstudante: " + count);
			estudante.estudar();
			count+=1;
		}
	}
}
