package Ejercicios;
import java.util.*;
public class Principal_expendedora {
	static Scanner teclado=new Scanner(System.in);
	public static void main(String[] args) {
		Expendedora exp1= new Expendedora();
		do {
			System.out.println("Introduzca moneda. Solo se aceptan monedas de 10, 20 y 50 céntimos");
			exp1.tragarMoneda();
			System.out.println("Aquí tiene su producto.");
			System.out.println(exp1.toString());
		}while(exp1.getPrecio()!=999);	
	}
	
}
