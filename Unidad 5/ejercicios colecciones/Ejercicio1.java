package ejercicios_colecciones;
import java.util.*;
public class Ejercicio1 {
	static Scanner teclado=new Scanner(System.in);
	static ArrayList<Alumno> clase=new ArrayList<Alumno>();
	
	public Ejercicio1() {
		menu();
	}
	
	public void menu() {
		boolean salir=false;
		int opcion=0;
		while(salir==false) {
			 do{
				System.out.println("Inserte opcion: ");
				System.out.println("1-Añadir");		 
				System.out.println( "2-Borrar");
				System.out.println("3-Modificar");
				System.out.println("4-Visualizar");		
				System.out.println("5-Salir");
				opcion=teclado.nextInt();
			}while(opcion<1 || opcion>5);
			switch (opcion) {
			case 1:
				añadirAlumno();
				break;
			case 2:
				borrarAlumno();
				break;
			case 3:
				modificarAlumno();
				break;
			case 4:
				visualizarAlumno();
				break;
			case 5:
				salir();
				salir=true;
				break;
			}
		}
	}
	
	public void añadirAlumno() {
		System.out.println("Inserte nombre.");
		teclado.nextLine();
		String nombre=teclado.nextLine();
		System.out.println("Inserte dni.");
		String dni=teclado.nextLine();
		System.out.println("Inserte edad.");
		int edad=teclado.nextInt();
		clase.add(new Alumno(nombre, edad, dni));
	}
	
	public void borrarAlumno() {
		boolean encontrado=false;
		System.out.println("Inserte dni.");
		teclado.nextLine();
		String dni=teclado.nextLine();
		Iterator <Alumno> it=clase.iterator();
		Alumno aux;
		while(it.hasNext() && encontrado==false) {
			aux=it.next();
			if(aux.getDni().equals(dni)) {
				clase.remove(aux);
				encontrado=true;
			}
		}
		if(encontrado==true) {
			System.out.println("El alumno con dni "+dni+" ha sido elimindado.");
		}
		else {
			System.out.println("El alumno con dni "+dni+" no ha sido localizado.");
		}
	}
	
	public void modificarAlumno() {
		boolean encontrado=false;
		System.out.println("Inserte dni.");
		teclado.nextLine();
		String dni=teclado.nextLine();
		Iterator <Alumno> it=clase.iterator();
		Alumno aux;
		while(it.hasNext() && encontrado==false) {
			aux=it.next();
			if(aux.getDni().equals(dni)) {
				System.out.println("Inserte nuevo nombre.");
				String nombre=teclado.nextLine();
				aux.setNombre(nombre);
				encontrado=true;
			}
		}
	}
	
	public void visualizarAlumno() {
		System.out.println("Listado de alumnos.");
		Iterator <Alumno> it=clase.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().toString());
		}
	}
	
	public void salir() {
		System.out.println("Hasta luego.");
	}
	
	public static void main(String[] args) {
		new Ejercicio1();
	}

}
