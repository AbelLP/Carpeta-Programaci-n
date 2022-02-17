package interfaces_herencias;

public interface Presa {
	public default void huir(Animal caza, Animal cazador) {
		System.out.println("El "+caza.tipo+" huye de "+cazador.tipo+".");
	}

}
