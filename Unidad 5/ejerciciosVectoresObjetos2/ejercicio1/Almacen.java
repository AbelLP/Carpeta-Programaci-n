package ejerciciosVectoresObjetos2;
import java.util.*;

public class Almacen {
	static Scanner teclado=new Scanner(System.in); 
	private int capacidad;
	private int tama�o=3;
	private Producto vec[];
	
	public Almacen(int capacidad) {
		this.capacidad=capacidad;
		this.vec=new Producto[tama�o];
	}
	
	public void cargar() {
		for(int cont=0; cont<tama�o; cont++) {
			vec[cont]=leerDatos();
		}
	}
	
	public Producto leerDatos() {
		Producto pr;
		String descripcion;
		double precio;
		String identificador;
		String respuesta="";
		int descuento;
		System.out.println("Inserta la descripci�n del producto.");
		descripcion=teclado.nextLine();
		teclado.nextLine();
		System.out.println("Inserta el identificador del producto.");
		identificador=teclado.nextLine();
		teclado.nextLine();
		System.out.println("Inserta el precio del producto.");
		precio=teclado.nextDouble();
		while(!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("no")) {
			System.out.println("Inserte si el producto est� en oferta: si o no.");
			respuesta=teclado.nextLine();
		}
		if(respuesta.equalsIgnoreCase("si")) {
			System.out.println("Inserte el porcentaje de la oferta.");
			descuento=teclado.nextInt();
			pr=new Oferta(identificador, descripcion, precio, descuento);
		}
		else {
			pr=new Producto(identificador, descripcion, precio);
		}
		return pr;
	}
	
	public void buscar() {
		String identificador;
		System.out.println("Inserte un identificador.");
		identificador=teclado.nextLine();
		for(int cont=0; cont<tama�o; cont++) {
			if(vec[cont].getIdentificador()==identificador) {
				System.out.println(vec[cont].toString());
			}
		}
	}
	
	
	
	
}
