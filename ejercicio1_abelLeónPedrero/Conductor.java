package ejercicio1_abelLeónPedrero;

public class Conductor {
	private String licencia;
	private int experiencia;
	
	public Conductor(String licencia, int experiencia) {
		super();
		this.licencia = licencia;
		this.experiencia = experiencia;
	}

	public String getLicencia() {
		return licencia;
	}

	public void setLicencia(String licencia) {
		this.licencia = licencia;
	}

	public int getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}

	@Override
	public String toString() {
		return "Conductor [licencia=" + licencia + ", experiencia=" + experiencia + "]";
	}
	
	
	
	
}
