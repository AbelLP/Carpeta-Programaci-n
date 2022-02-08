package polimorfismo;

public class Delfin extends Mamiferos{
	private double tamaño;

	public Delfin(Especie especie, double tamaño) {
		super(especie);
		this.tamaño = tamaño;
	}
	
	public Delfin() {
		super();
	}
	
	@Override
	public void moverse() {
		super.moverse();
		System.out.println("nadando");
	}

	@Override
	public String toString() {
		return "Delfin [tamaño=" + tamaño + "]";
	}
	
	public String cualidadesDelfin() {
		return "Amigables\nInteligentes\nCuriosos";
	}
	
	
	
}
