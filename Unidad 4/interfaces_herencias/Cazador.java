package interfaces_herencias;

public interface Cazador {
	public default void perseguir(Animal perseguidor, Animal perseguido) {
		System.out.println("El "+perseguidor.tipo+" persigue a " +perseguido.tipo+ ".");
	}
	
	

}
