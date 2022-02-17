package ejercicios;

public class Camiones extends VehiculosMotorizados implements CapacidadLimite{
	private int remolques;
	private int pasajeros;
	
	public Camiones() {
		super();
	}
	
	public Camiones(String fabricante, String modelo, int a�o, double kilometraje, int remolques, int pasajeros) {
		super(fabricante, modelo, a�o, kilometraje);
		this.remolques=remolques;
		this.pasajeros=pasajeros;
	}

	public int getRemolques() {
		return remolques;
	}

	public void setRemolques(int remolques) {
		this.remolques = remolques;
	}

	public int getPasajeros() {
		return pasajeros;
	}

	public void setPasajeros(int pasajeros) {
		this.pasajeros = pasajeros;
	}

	@Override
	public String toString() {
		return "Cami�n= "+" fabricante: "+fabricante+", modelo: "+modelo+", a�o: "+a�o+", kilometraje: "+kilometraje+", remolques: "+remolques+", pasajeros: "+pasajeros;
	}
	
	public void comprobarSeguridad() {
		if(pasajeros>LIMITE_CAMIONES) {
			System.out.println("Este veh�culo no cumple con las medidas de seguridad.");
		}
		else {
			System.out.println("Este veh�culo cumple con las medidas de seguridad.");
		}
	}
	

}
