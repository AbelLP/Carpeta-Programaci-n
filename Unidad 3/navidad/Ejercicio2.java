package navidad;
import java.util.*;
public class Ejercicio2 {
	static Scanner teclado=new Scanner(System.in);
	static Saldo emp1;
	static Saldo emp2;
	static Saldo emp3;
	static Saldo puntero;
	
	public Ejercicio2() {
		String categoria=null;
		String antiguedad=null;
		emp1= new Saldo();
		System.out.println("Introduzca un noombre.");
		String nombre=teclado.nextLine();
		emp1.setNombre(nombre);
		System.out.println("Introduzca una edad.");
		int edad= teclado.nextInt();
		emp1.setEdad(edad);
		while (categoria!="empleado" || categoria!="encargado" || categoria!="directivo") {
			System.out.println("Introduzca una categoria.");
			categoria= teclado.nextLine();
		}
		emp1.setCategoria(categoria);
		while (antiguedad!="novato" && antiguedad!="maduro" && antiguedad!="experto") {
			System.out.println("Introduzca una antiguedad.");
			antiguedad=teclado.nextLine();
		emp1.setAntiguedad(antiguedad);
		
		emp2= new Saldo();
		System.out.println("Introduzca un noombre.");
		nombre=teclado.nextLine();
		emp2.setNombre(nombre);
		System.out.println("Introduzca una edad.");
		edad= teclado.nextInt();
		emp2.setEdad(edad);
		while (categoria!="empleado" && categoria!="encargado" && categoria!="directivo") {
			System.out.println("Introduzca una categoria.");
			categoria= teclado.nextLine();
		}
		emp2.setCategoria(categoria);
		while (antiguedad!="novato" && antiguedad!="maduro" && antiguedad!="experto") {
			System.out.println("Introduzca una antiguedad.");
			antiguedad=teclado.nextLine();
		emp2.setAntiguedad(antiguedad);
		
		emp3= new Saldo();
		System.out.println("Introduzca un noombre.");
		nombre=teclado.nextLine();
		emp3.setNombre(nombre);
		System.out.println("Introduzca una edad.");
		edad= teclado.nextInt();
		emp3.setEdad(edad);
		while (categoria!="empleado" && categoria!="encargado" && categoria!="directivo") {
			System.out.println("Introduzca una categoria.");
			categoria= teclado.nextLine();
		}
		emp3.setCategoria(categoria);
		while (antiguedad!="novato" && antiguedad!="maduro" && antiguedad!="experto") {
			System.out.println("Introduzca una antiguedad.");
			antiguedad=teclado.nextLine();
		emp3.setAntiguedad(antiguedad);	
		}
		
		}
	}	
}
	
	
	
	
	
	public static void main(String[] args) {
	Ejercicio2 interfaz= new Ejercicio2();
	calcularSueldo();
	}
	
	public static void calcularSueldo() {
		while (true) {
			int sueldoBase=607;
			int sueldoActual=0;
			int sueldoCategoria=0;
			int sueldoAntiguedad=0;
			String empleado=null;
			do {
			System.out.println("Inserte la palabra empleado más el número del empleado.");
			empleado= teclado.nextLine();
			} while(empleado!="Empleado 1" && empleado!="Empleado 2" && empleado!="Empleado 3");
			if (empleado=="Empleado 1") {
				puntero=emp1;
			}
			else if (empleado=="Empleado 2") {
				puntero=emp2;
			}
			else if (empleado=="Empleado 3") {
				puntero=emp3;
			}
			
			if (puntero.getCategoria()=="empleado") {
				sueldoCategoria=sueldoBase+(15/100);
			}
			else if (puntero.getCategoria()=="encargado") {
				sueldoCategoria=sueldoBase+(35/100);
			}
			else if (puntero.getCategoria()=="directivo") {
				sueldoCategoria=sueldoBase+(60/100);
			}
			
			if(puntero.getAntiguedad()=="novato") {
				sueldoAntiguedad=150;
			}
			else if(puntero.getAntiguedad()=="maduro") {
				sueldoAntiguedad=300;
			}
			else if (puntero.getAntiguedad()=="experto") {
				sueldoAntiguedad=600;
			}
			
			sueldoActual=sueldoBase+sueldoCategoria+sueldoAntiguedad;
			System.out.println("El sueldo de " +puntero.getNombre()+ " es " +sueldoActual);
			}	
	}

}
