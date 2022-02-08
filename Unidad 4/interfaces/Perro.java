package interfaces;

public class Perro implements SerVivo,Animal{
	private String raza;
	
	public Perro(String raza) {
		setRaza(raza);
	}
	
	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public Perro() {
		this(null);
	}
	
	public void comer() {
		System.out.println("Los perros son carnivoros. Se alimentan de carne.");
	}
	
	public void vacunar() {
		System.out.println("Los cachorros necesitan 3 vacunas.");
	}
	

}
