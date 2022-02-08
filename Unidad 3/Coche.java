package Ejercicios;

public class Coche {
	private String matricula;
	private int plazas;
	private boolean reservado;
	private Motor motor;
	
	public Coche() {
		matricula=null;
		plazas=5;
		reservado=false;
		motor=null;
	}
	
	public Coche(String matricula, int plazas, Motor motor) {
		setMatricula(matricula);
		setPlazas(plazas);
		reservado=false;
		setMotor(motor);
	}
	
	public String getMatricula() {
		return matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public int getPlazas() {
		return plazas;
	}
	
	public void setPlazas(int plazas) {
		this.plazas = plazas;
	}
	
	public boolean getReservado() {
		return reservado;
	}
	
	public void setReservado(boolean reservado) {
		this.reservado = reservado;
	}
	
	public Motor getMotor() {
		return motor;
	}
	
	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public String toString() {
		return "Coche [matricula=" + matricula + ", plazas=" + plazas + ", reservado=" + reservado + ", tipo de motor=" + motor.getTipo() + ", potencia=" +motor.getPotencia() +"]";
	}
}
