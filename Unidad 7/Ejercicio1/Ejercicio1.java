package ejercicio1;

public class Ejercicio1 {
	FichBeatles gestion=new FichBeatles();
	public Ejercicio1() {
		gestion.crearVector();
		gestion.pasarVectorAFichero();
		//gestion.crearFicheroApellidos();
		gestion.añadirApellidosFichero();
		//gestion.pasarFicheroAVector();
		gestion.mostrarVector();
	}

	public static void main(String[] args) {
		new Ejercicio1();
	}

}
