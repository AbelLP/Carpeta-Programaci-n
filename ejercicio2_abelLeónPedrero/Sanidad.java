package ejercicio2_abelLeónPedrero;

public abstract class Sanidad {
	protected int pacientes;
	protected double gastoGeneral;
	
	public Sanidad() {
		super();
	}

	public Sanidad(int pacientes, double gastoGeneral) {
		super();
		this.pacientes = pacientes;
		this.gastoGeneral = gastoGeneral;
	}

	public int getPacientes() {
		return pacientes;
	}

	public void setPacientes(int pacientes) {
		this.pacientes = pacientes;
	}

	public double getGastoGeneral() {
		return gastoGeneral;
	}

	public void setGastoGeneral(double gastoGeneral) {
		this.gastoGeneral = gastoGeneral;
	}

	@Override
	public String toString() {
		return "Sanidad [pacientes=" + pacientes + ", gastoGeneral=" + gastoGeneral + "]";
	}
	
	public abstract double calcularAnual();
	
	
}
