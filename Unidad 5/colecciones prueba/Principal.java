package pruebaColecciones;
import java.util.*;
public class Principal {
	public Principal() {
		ArrayList<Empleado>listaE=new ArrayList<Empleado>();
		listaE.add(new Empleado(45, "Ana", 2500));
		Empleado emp=new Empleado(50, "María", 2600);
		listaE.add(emp);
		listaE.add(1,new Empleado(33, "Carlos", 3320));
		//lista(listaE);
		System.out.println("La colección creada tiene una capacidad de "+listaE.size());
		System.out.println("El elemento situado en la tercera posición es: "+ listaE.get(2).toString());
		listaE.remove(1);
		Empleado borrar=listaE.get(1);
		listaE.remove(borrar);
		}
	
	public static void main(String[] args) {
		new Principal();
	}

}
