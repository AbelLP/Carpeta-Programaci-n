package objetos.empleados;

import java.util.Scanner;

public class Empleado {
	static Scanner teclado=new Scanner(System.in);
	private String nombre;
	private String apellidos;
	private int edad;
	private double salario;
	
	public Empleado(){
		nombre="";
		apellidos= "";
		edad=0;
		salario=0;
	}
	
	public Empleado(String nombre, String apellidos, int edad, double salario) {
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.edad=edad;
		this.salario=salario;
	}
	
	public static Empleado crearEmpleado() {
		System.out.print("Introduce el nombre: ");
		String nombre = teclado.nextLine();
		System.out.print("\nIntroduce el apellido: ");
		String apellido = teclado.nextLine();
		System.out.print("\nIntroduce la edad: ");
		int edad = teclado.nextInt();
		System.out.print("\nIntroduce el salario: ");
		int salario = teclado.nextInt();
		System.out.println();
		return new Empleado(nombre, apellido, edad, salario);
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public String getEmpleado() {
		String datosEmpleado="DATOS EMPLEADO\nNombre: "+nombre+"\nApellidos: "+apellidos+"\nEdad: "+edad+"\nSalario: "+salario;
		return datosEmpleado;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public void setApellidos(String apellidos) {
		this.apellidos=apellidos;
	}
	
	public void setEdad(int edad) {
		this.edad=edad;
	}
	
	public void setSalario(double salario) {
		this.salario=salario;
	}
	
	public void incrementarSalario() {
		if (edad>=18 && edad<=30) salario=salario+100;
		else if (edad>=31 && edad<=50) salario=salario+150;
		else if (edad>=50) salario=salario+200;
	}
}

