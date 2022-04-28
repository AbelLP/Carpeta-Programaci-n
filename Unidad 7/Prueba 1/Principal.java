package prueba_ficheros;

public class Principal {
	FichTexto gestion=new FichTexto();
	
	public Principal() {
		gestion.crearFichero();
		gestion.visualizarFicheros();
	}
	
	public static void main(String[] args) {
		new Principal();
	}

}
