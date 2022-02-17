package interfaces_herencias;

public class Principal_animal {
	
	public Principal_animal() {
		Perro guau= new Perro("Perro", "fiel");
		Gato miau= new Gato("Gato", "astuto");
		Raton raton=new Raton("Raton", "activo");
		miau.Caracteristicas(miau,guau,raton);
		guau.Caracteristicas(guau,miau);
		raton.Caracteristicas(raton,miau);
	}
	

	public static void main(String[] args) {
		Principal_animal interfaz=new Principal_animal();
	}

}
