package polimorfismo;

public class Mamiferos {
	protected Especie especie;

	public Mamiferos() {
		this(null);
	}
	
	public Mamiferos(Especie especie) {
		this.especie=especie;
	}
	
	public void moverse() {
		System.out.println("El " +especie.name().toLowerCase()+ " sé mueve.");
	}
	
	
	public Especie getEspecie() {
		return especie;
	}

	public void setEspecie(Especie especie) {
		this.especie = especie;
	}
	
	
	

}
