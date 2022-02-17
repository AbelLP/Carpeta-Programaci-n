package ejercicios;

public class Automovil extends VehiculosMotorizados implements CapacidadLimite{
	private String estilo;
	private int pasajeros;

	public Automovil() {
		super();
	}

	public Automovil(String fabricante, String modelo, int año, double kilometraje, String estilo, int pasajeros) {
		super(fabricante, modelo, año, kilometraje);
		this.estilo=estilo;
		this.pasajeros=pasajeros;
	}

	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}

	public int getPasajeros() {
		return pasajeros;
	}

	public void setPasajeros(int pasajeros) {
		this.pasajeros = pasajeros;
	}

	@Override
	public String toString() {
		return "Automovil= "+" fabricante: "+fabricante+", modelo: "+modelo+", año: "+año+", kilometraje: "+kilometraje+", estilo: "+estilo+", pasajeros: "+pasajeros;
	}
	
	public void comprobarSeguridad() {
		if (estilo.equalsIgnoreCase("Van")) {
			if(pasajeros>LIMITE_AUTOMOVILES_VAN) {
				System.out.println("Este vehículo no cumple con las medidas de seguridad.");
			}
			else {
				System.out.println("Este vehículo cumple con las medidas de seguridad.");
			}
		}
		else {
			if(pasajeros>LIMITE_AUTOMOVILES) {
				System.out.println("Este vehículo no cumple con las medidas de seguridad.");
			}
			else {
				System.out.println("Este vehículo cumple con las medidas de seguridad.");
			}
		}
	}
	
	
	
	

}
