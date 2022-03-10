package prueba_automovil;

public class Camion extends Vehiculo{
	private double peso;
	private String motor;
	public Camion() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Camion(String matricula, int ruedas, double precio, String color, double peso, String motor) {
		super(matricula, ruedas, precio, color);
		this.peso=peso;
		this.motor=motor;
	}
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public String getMotor() {
		return motor;
	}
	
	public void setMotor(String motor) {
		this.motor = motor;
	}
	
	@Override
	public String toString() {
		return "Camion [peso=" + peso + ", motor=" + motor + ", matricula=" + matricula + ", ruedas=" + ruedas
				+ ", precio=" + precio + ", color=" + getColor() + "]";
	}
	
	@Override
	public double establecer_precio() {
		
	}
	
	
	
	
	
	
	
}
