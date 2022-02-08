package polimorfismo;

public class Perro extends Mamiferos{
	private String raza;

	public Perro(Especie especie, String raza) {
		super(especie);
		this.raza = raza;
	}
	
	public Perro() {
		this(null,null);
	}
	
	@Override
	public void moverse() {
		super.moverse();
		System.out.println("caminando"); 
	}

	@Override
	public String toString() {
		return "Perro [raza=" + raza + "]";
	}
	
	public void cualidadesPerro() {
		System.out.println("Los perros son fieles.");
		System.out.println("Los perros tienen buen olfato.");
		System.out.println("Los perros son muy sociables.");
	}
	
	
	                                  
}
