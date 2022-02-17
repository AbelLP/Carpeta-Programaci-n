package interfaces_herencias;

public class Animal {
	protected String tipo;
	protected String comportamiento;
	
	public Animal() {
		this(null,null);
	}
	
	public Animal(String tipo, String comportamiento) {
		super();
		this.tipo = tipo;
		this.comportamiento = comportamiento;
	}

	@Override
	public String toString() {
		return "El "+tipo+ " es "+ comportamiento;
	}
	
	

}
