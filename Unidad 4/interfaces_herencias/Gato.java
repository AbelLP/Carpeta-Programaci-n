package interfaces_herencias;

public class Gato extends Animal implements Cazador, Presa{

	public Gato() {
		super();
	}

	public Gato(String tipo, String comportamiento) {
		super(tipo, comportamiento);
	}
	
	public void Caracteristicas(Animal gato, Animal perro, Animal raton) {
		perseguir(gato, raton);
		huir(gato, perro);
		System.out.println(toString());;
	}
	
	@Override
	public String toString() {
		return "El "+tipo+" es "+comportamiento+".";
	}
	
	


	
	
	
	
	
	
	
	
}
