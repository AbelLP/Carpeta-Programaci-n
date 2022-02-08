package Ejercicios;

public class Motor {
	private String tipo;
	private int potencia;
	
	public Motor(){
		tipo=null;
		potencia=0;
	}
	
	public Motor(String tipo, int potencia) {
		setTipo(tipo);
		setPotencia(potencia);
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
}

