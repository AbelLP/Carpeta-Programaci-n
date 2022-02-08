package ejercicios;
import java.util.*;
public class Empresa {
	private String denominacion;
	private int cif;
	private int empleados;
	private double total_pagado;
	static Scanner teclado=new Scanner(System.in);
	
	public String getDenominacion() {
		return denominacion;
	}
	
	public void setDenominacion(String denominacion) {
		this.denominacion = denominacion;
	}
	
	public int getCif() {
		return cif;
	}
	
	public void setCif(int cif) {
		this.cif = cif;
	}
	
	public int getEmpleados() {
		return empleados;
	}
	
	public void setEmpleados(int empleados) {
		this.empleados = empleados;
	}
	
	public double getTotal_pagado() {
		return total_pagado;
	}
	
	public void setTotal_pagado(double total_pagado) {
		this.total_pagado = total_pagado;
	}
	
	public Empresa(String denominacion, int cif, int empleados, double total_pagado) {
		super();
		this.denominacion = denominacion;
		this.cif = cif;
		this.empleados = empleados;
		this.total_pagado = total_pagado;
	}
	
	
	
	public void controlarGasto() {
		String respuesta="b";
		if (getTotal_pagado()>=10000) {
			System.out.println("La empresa tiene que recortar gastos.");
		}
		else if (getTotal_pagado()<10000) {
			while (!respuesta.equalsIgnoreCase("V") && !respuesta.equalsIgnoreCase("A")) {
				System.out.println("Elige a quien contratamos: V (vendedor) o A (administrativo).");
				respuesta=teclado.nextLine();
			}
			if (respuesta.equalsIgnoreCase("V")) {
				System.out.println("Prefieres un vendedor.");
			}
			else if (respuesta.equalsIgnoreCase("A")) {
				System.out.println("Prefieres un adminstrativo.");
			}
			
		}
	}


	
	
	
	
	
	

}
