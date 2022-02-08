package polimorfismo;

public class Delfin extends Mamiferos{
	private double tama�o;

	public Delfin(Especie especie, double tama�o) {
		super(especie);
		this.tama�o = tama�o;
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
		return "Delfin [tama�o=" + tama�o + "]";
	}
	
	public String cualidadesDelfin() {
		return "Amigables\nInteligentes\nCuriosos";
	}
	
	
	
}
