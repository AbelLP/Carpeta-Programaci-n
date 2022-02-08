package entregar;

public class Superheroe2 extends Persona2 {
	private String nombreHeroe;
	private Categoria categoria;
	
	
	public String getNombreHeroe() {
		return nombreHeroe;
	}
	public void setNombreHeroe(String nombreHeroe) {
		this.nombreHeroe = nombreHeroe;
	}
	
	public Superheroe2(String nombre, int edad, String nombreHeroe, Categoria categoria) {
		super(nombre, edad);
		this.nombreHeroe = nombreHeroe;
		this.categoria=categoria;
	}
	
	public Superheroe2() {
		super();
		nombreHeroe=null;
	}
	
	public void Volar() {
		System.out.println("Puedo volar.");
	}
	
	public void Corre() {
		System.out.println("Puedo correr, además tengo otros poderes");
	}
	@Override
	public String toString() {
		return "Superheroe [nombreHeroe=" + nombreHeroe + "]";
	}
	
	
}
