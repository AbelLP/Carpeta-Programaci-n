package Ejercicios;
import java.util.*;
public class Principal_expendedora {
	static Scanner teclado=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Introduzca existencias.");
		int existencias= teclado.nextInt();
		Expendedora exp1= new Expendedora();
		exp1.setExistencias(existencias);
		do {
			exp1.tragarMoneda();
			System.out.println("Aquí tiene su producto.");
			System.out.println(exp1.toString());
		}while(exp1.getPrecio()!=999);	
	}
	
}
