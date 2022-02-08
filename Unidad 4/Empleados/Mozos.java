package ejercicios;

public class Mozos extends Trabajadores{
	private int trienios;

	public Mozos(int codigo, String nombre, double sueldoBase, int trienios) {
		super(codigo, nombre,sueldoBase);
		this.trienios = trienios;
	}

	public int getTrienios() {
		return trienios;
	}

	public void setTrienios(int trienios) {
		this.trienios = trienios;
	}

	@Override
	public String toString() {
		return "Mozos [trienios=" + trienios + ", codigo=" + codigo + ", nombre=" + nombre + ", Sueldo="
				+ calcularSueldo() + "]";
	}
	
	@Override
	public double calcularSueldo() {
		super.calcularSueldo();
		double Sueldo= getSueldoBase()+(60*trienios);
		return Sueldo;
	}
	
	public double años() {
		double años= 3*getTrienios();
		return años;
	}
	
	
	
}
