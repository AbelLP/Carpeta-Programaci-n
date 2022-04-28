package prueba_excepciones;
import java.util.*;
public class Transformar2 {
	static Scanner teclado=new Scanner(System.in); 
	public Transformar2() {
		int num;
		try {
			num=transformar();
			System.out.println(num);
		}
		catch(NumberFormatException elem) {
			System.out.println("getMessage: "+ elem.getMessage()+ "toString: "+elem.toString()+" getClass: "+ elem.getClass());
			elem.printStackTrace();
		}
		catch(Exception el) {
			System.out.println("Hay un error de ejecución..");
		}
	}
	
	
	public int transformar() throws NumberFormatException,Exception{
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
		new Transformar2();
	}

}
