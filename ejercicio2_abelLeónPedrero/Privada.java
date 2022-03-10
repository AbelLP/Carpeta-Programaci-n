package ejercicio2_abelLeónPedrero;

public class Privada extends Sanidad{
	private int ayudaExtra;
	private boolean reducirGastos;
	
	public Privada() {
		super();
	}
	
	public Privada(int pacientes, double gastoGeneral, int ayudaExtra) {
		super(pacientes, gastoGeneral);
		this.ayudaExtra=ayudaExtra;
		reducirGastos=false;
	}
	
	public int getAyudaExtra() {
		return ayudaExtra;
	}
	
	public void setAyudaExtra(int ayudaExtra) {
		this.ayudaExtra = ayudaExtra;
	}
	
	public boolean isReducirGastos() {
		return reducirGastos;
	}
	
	public void setReducirGastos(boolean reducirGastos) {
		this.reducirGastos = reducirGastos;
	}
	
	@Override
	public String toString() {
		return "Privada [ayudaExtra=" + ayudaExtra + ", reducirGastos=" + reducirGastos + ", pacientes=" + pacientes
				+ ", gastoGeneral=" + gastoGeneral + "]";
	}
	
	public double calcularAnual() {
		double gastoGeneralNuevo;
		gastoGeneralNuevo=(getGastoGeneral()+(120*ayudaExtra));
		return gastoGeneralNuevo;
	}
	
	public boolean calcularGasto() {
		if(getAyudaExtra()>230) {
			reducirGastos=true;
		}
		else {
			reducirGastos=false;
		}
		return reducirGastos;
	}
}
