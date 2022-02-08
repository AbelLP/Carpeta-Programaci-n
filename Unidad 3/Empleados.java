package Ejercicios;
import java.util.*;
public class Empleados {
	static Scanner teclado=new Scanner(System.in);
	private String nombre;
	private String apellidos;
	private int edad;
	private double salario;
	
	public Empleados(){
		nombre=null;
		apellidos= null;
		edad=0;
		salario=0;
	}
	
	public Empleados(String nombre, String apellidos, int edad, double salario) {
		setNombre(nombre);
		setApellidos(apellidos);
	}


	

}
