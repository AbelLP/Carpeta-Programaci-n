package prueba;

public class Matricula {
	private String curso;
	private String expediente;
	
	public Matricula(String curso, String expediente) {
		this.expediente=expediente;
		this.curso=curso;
	}
	
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getExpediente() {
		return expediente;
	}
	public void setExpediente(String expediente) {
		this.expediente = expediente;
	}

}