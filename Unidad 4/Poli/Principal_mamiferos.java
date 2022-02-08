package polimorfismo;
import java.util.*;
public class Principal_mamiferos {
	static Scanner teclado=new Scanner(System.in);
	public Principal_mamiferos() {
		Mamiferos dog=new Perro(Especie.PERRO, "labrador");
		Mamiferos dolphin=new Delfin(Especie.DELFIN,2.3);
		Caracteristicas obj=new Caracteristicas();
		obj.imprimir(dog);
		obj.imprimir(dolphin);
		
		
		
		
	}
	
	
	
	
	

	public static void main(String[] args) {
		Principal_mamiferos interfaz=new Principal_mamiferos();
	}

}
