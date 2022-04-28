package prueba_ficheros2;

public class Vehiculo {
	private String matricula;
	private String modelo;
	
	public Vehiculo() {
		super();
	}
	
	public Vehiculo(String matricula, String modelo) {
		super();
		this.matricula = matricula;
		this.modelo = modelo;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", modelo=" + modelo + "]";
	}
	
	
}
