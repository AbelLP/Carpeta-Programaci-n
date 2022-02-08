package entregar;
import java.util.Scanner;

public class Principal_heroes2 {
	static Scanner teclado= new Scanner(System.in);
	public Principal_heroes2() {
		Categoria cat1=new Categoria(1.50);
		Superheroe2 superPersona= new Superheroe2("Alfredo", 30, "Superman", cat1);
		System.out.println("Este héroe se llama " +superPersona.getNombreHeroe());
		System.out.println("Su verdadero nombre es " +superPersona.getNombre());
		System.out.println(superPersona.getNombreHeroe()+ " tiene " +superPersona.getEdad()+ " años.");
		System.out.println("Su altura es de " +cat1.getAltura()+ " metros.");
	}
	

	public static void main(String[] args) {
		Principal_heroes2 interfaz= new Principal_heroes2();
	}

}