package ejercicio2_abelLeónPedrero;
import java.util.*;
public class Publica extends Sanidad{
	private boolean operaciones;
	static Scanner teclado=new Scanner(System.in);

	public Publica() {
		super();
	}

	public Publica(int pacientes, double gastoGeneral, boolean operaciones) {
		super(pacientes, gastoGeneral);
		this.operaciones=operaciones;
	}

	public boolean isOperaciones() {
		return operaciones;
	}

	public void setOperaciones(boolean operaciones) {
		this.operaciones = operaciones;
	}

	@Override
	public String toString() {
		return "Publica [operaciones=" + operaciones + ", pacientes=" + pacientes + ", gastoGeneral=" + gastoGeneral
				+ "]";
	}
	
	public double calcularAnual() {
		double gastoBenefico=0;
		double gastoGeneralNuevo;
		if(isOperaciones()==true){
			System.out.println("Introduce el gasto de las operaciones benéficas.");
			gastoBenefico=teclado.nextDouble();
			gastoGeneralNuevo=(gastoBenefico+getGastoGeneral());
		}
		else {
			gastoGeneralNuevo=getGastoGeneral();
		}
		return gastoGeneralNuevo;
	}
	
	
	
}
