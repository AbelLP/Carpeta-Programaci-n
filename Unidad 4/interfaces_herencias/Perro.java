package interfaces_herencias;
import java.util.*;
public class Perro extends Animal implements Cazador{
	static Scanner teclado=new Scanner(System.in);
	public Perro() {
		super();
	}

	public Perro(String tipo, String comportamiento) {
		super(tipo, comportamiento);
	}
	
	public void Caracteristicas(Animal perro, Animal gato) {
		perseguir(perro, gato);
		System.out.println(toString());
	}
	
	@Override
	public String toString() {
		return "El "+tipo+" es "+comportamiento+".";
	}
	
	
	
}
