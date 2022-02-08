package objetos.empleados;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		Empleado emp1= Empleado.crearEmpleado();
		Empleado emp2= new Empleado("Agustín","Alvarado",60,1500);	
		
		System.out.println(emp1.getEmpleado());
		emp1.incrementarSalario();
		System.out.println("Su nuevo salario es: "+emp1.getSalario()+"\n");
		
		System.out.println(emp2.getEmpleado());
		emp2.incrementarSalario();
		System.out.println("Su nuevo salario es: "+emp2.getSalario());
		
		
		/*System.out.print("\nEMPLEADO 1\n");
		System.out.println("Nombre: "+emp1.getNombre());
		System.out.println("Apellidos: "+emp1.getApellidos());
		System.out.println("Edad: "+ emp1.getEdad());
		System.out.println("Salario: "+emp1.getSalario());
				
		System.out.print("\nEMPLEADO 2\n");
		System.out.println("Nombre: "+emp2.getNombre());
		System.out.println("Apellidos: "+emp2.getApellidos());
		System.out.println("Edad: "+emp2.getEdad());
		System.out.println("Salario: "+emp2.getSalario());*/	
		
	}	
}
