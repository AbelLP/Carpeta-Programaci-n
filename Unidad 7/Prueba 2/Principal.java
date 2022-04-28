package prueba_ficheros2;

public class Principal {
	FichVehiculos gestion=new FichVehiculos();
	public Principal() {
		//gestion.crearFichero();
		gestion.crearArrayList();
		gestion.listarArrayList();
	}

	public static void main(String[] args) {
		new Principal();
	}

}
