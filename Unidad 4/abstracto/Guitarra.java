package abstracto;

public class Guitarra extends Instrumento{
	public Guitarra (String tipo) {
		super(tipo);
	}
	
	@Override
	public void tocar() {
		System.out.println("Se toca con los dedos.");
	}
	
	
	
	
}
