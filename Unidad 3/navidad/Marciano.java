package navidad;

public class Marciano {
	private boolean vivo;
	private String nombre;
	private int num_Marcianos=0;
	static private String SOY;
	
	public Marciano(){
		vivo=true;
		nombre=null;
		num_Marcianos++;
		SOY="marciano";
	}
	
	public Marciano (String nombre) {
		vivo=true;
		setNombre(nombre);
		num_Marcianos++;
		SOY="marciano";
	}

	public boolean isVivo() {
		return vivo;
	}

	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNum_Marcianos() {
		return num_Marcianos;
	}

	public void setNum_Marcianos(int num_Marcianos) {
		this.num_Marcianos = num_Marcianos;
	}

	public static String getSOY() {
		return SOY;
	}

	public static void setSOY(String sOY) {
		SOY = sOY;
	}
	
	public void indicarNacimiento() {
		System.out.println("Hola, he nacido, soy el marciano " +getNombre());
	}
	
	public void indicarMuerte() {
		if (isVivo()==true) {
			setVivo(false);
			num_Marcianos--;
			System.out.println("El marciano " +getNombre()+ " ha muerto.");
		}
		else if(isVivo()==false) {
			System.out.println("Ese marciano ya está muerto.");
		}
	}
	
	public void comprobarVivo() {
		if (isVivo()==true) {
			System.out.println("Este marciano está vivo.");
		}
	}
	
	public void comprobarMarcianos() {
		System.out.println("Hay " +getNum_Marcianos()+ " marcianos vivos.");
	}
	
	
	
	
	
	

}
