package ejercicios;

public class Vendedor extends Empleados{
	private double ganancias;
	
	public Vendedor() {
		super();
		ganancias=0;
	}

	public Vendedor(int codigo, String nombre, double sueldoFijo, Empresa  empresa, double ganancias) {
		super(codigo, nombre, sueldoFijo, empresa);
		this.ganancias = ganancias;
	}

	public double getGanancias() {
		return ganancias;
	}

	public void setGanancias(double ganancias) {
		this.ganancias = ganancias;
	}
	
	@Override
	public double calcularSueldoMensual(){
		double comision= (ganancias*10)/100;
		double sueldoMensual= getSueldoFijo()+comision;
		return sueldoMensual;
	}
	
	
	
	
	

}
