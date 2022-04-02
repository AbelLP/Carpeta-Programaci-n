package ejerciciosVectoresObjetos;

enum Opcion{A, B, M};

public class Alumno {
	private String nombre;
	private String matricula;
	private Opcion opcion;
		
	public Alumno() {
		this.nombre="";
		this.matricula="";
		this.opcion=Opcion.B;
	}
	
	public Alumno(String nombre,String matricula, String opc){
		super();
		this.nombre = nombre;
		this.matricula = matricula;
		this.opcion=Opcion.valueOf(opc.toUpperCase());
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public String getOpcion() {
		String op="";
		switch (opcion) {
		case A: {op="A"; break;}
		case B: {op="B"; break;}
		case M: {op="M"; break;}
		}
		return op;
	}
	
	public void setOpcion(Opcion opcion ){
		this.opcion=opcion;
	}
	
	public String toString() {
		return "Alumno: "+matricula+" "+nombre+" "+getOpcion();	}
	}
