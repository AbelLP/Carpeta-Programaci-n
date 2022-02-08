package interfaces;

public class Principal_animal {
	public Principal_animal() {
		SerVivo guau=new Perro("Chihuahua");
		SerVivo plant=new Planta("Ficus"); 
		Cualidades objCualidades=new Cualidades();
		objCualidades.conocerAlimento(guau);
		objCualidades.conocerAlimento(plant);
	}
	
	
	
	
	

	public static void main(String[] args) {
		Principal_animal interfaz=new Principal_animal();
	}

}
