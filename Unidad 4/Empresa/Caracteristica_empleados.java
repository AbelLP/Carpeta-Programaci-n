package ejercicios;

public class Caracteristica_empleados {
	public void visualizar(Empleados empl) {
		System.out.println("Nombre: "+ empl.getNombre());
		System.out.println("C�digo: "+ empl.getCodigo());
		System.out.println("Sueldo fijo: "+ empl.getSueldoFijo());
		System.out.println("Empresa: "+ empl.getEmpresa());
		System.out.println("Denominaci�n: "+ empl.empresa.getDenominacion());
		System.out.println("Sueldo mensual: "+ empl.calcularSueldoMensual());
	}

}
