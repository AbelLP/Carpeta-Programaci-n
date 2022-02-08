package polimorfismo;

public class Caracteristicas {
	public void imprimir(Mamiferos animal) {
		animal.moverse();
		System.out.println(animal.toString());
		if (animal instanceof Perro) {
			System.out.println("Cualidades de perro: ");
			((Perro) animal).cualidadesPerro();
		}
		else if(animal instanceof Delfin) {
			System.out.println("Cualidades de delfín: ");
			System.out.println(((Delfin) animal).cualidadesDelfin());
		}
		
	}

}
