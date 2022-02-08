package prueba02;

public class Principal_libro {
	public Principal_libro() {
		Libro primero=new Libro("Oracle");
		Libro segundo=new Libro("Java");
		primero.compararLibro(segundo);
        segundo.compararLibro(primero);
	}
	

	public static void main(String[] args) {
		Principal_libro interfaz=new Principal_libro();

	}

}
