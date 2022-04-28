package prueba_excepciones;
import java.util.*;
public class Transformar {
	//Hacer un programa que implemente un método llamado transformar, que nos permita meter una cadena de caracteres, y transformarla en un número. El método debe devolver un número, y capturar las posibles excepciones.
	static Scanner teclado=new Scanner(System.in);
	public Transformar() {
		int n=transformar();
		System.out.println(n);
	
		
	}
	
	public int transformar() {
		int n =0;
		System.out.println("Inserta una cadena.");
		String linea=teclado.nextLine();
		try {
			n= Integer.parseInt(linea);
		}
		catch(NumberFormatException a) {
			System.out.println("getMessage :"+a.getMessage()+	"toString: "+a.toString()+	"getClass: "+a.getClass());
			a.printStackTrace();
		}
		return n;
	}
	
	public static void main(String[] args) {
		new Transformar();
	}

}
