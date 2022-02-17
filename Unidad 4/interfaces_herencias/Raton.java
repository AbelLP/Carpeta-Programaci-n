package interfaces_herencias;

public class Raton extends Animal implements Presa{

	public Raton() {
		super();
	}

	public Raton(String tipo, String comportamiento) {
		super(tipo, comportamiento);
	}
	
	public void Caracteristicas(Animal raton, Animal gato) {
		huir(raton, gato);
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "El "+tipo+" es "+comportamiento+".";
	}
	
	
	
}
