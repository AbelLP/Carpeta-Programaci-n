package Ejercicios;
import java.util.*;
public class Principal_banco {
	static Scanner teclado=new Scanner(System.in);
	public static void main(String[] args) {
		int opcion=0;
		Banco cl1= new Banco("Marta", 927362, 1234, 0);
		Banco cl2= new Banco("Julio", 765897, 5678, 0);
		identificarCliente();
		do {
			System.out.println("Introduzca un número dependiendo de su opción: 1= Ingresar dinero, 2= Realizar transferencia, 3 =Reintegrar dinero, 4= Cambiar clave, 5=Conocer saldo, 6 =Salir");
			opcion= teclado.nextInt();
			if (opcion==1) {
				puntero.integrar();
			}
			else if (opcion==2) {
				puntero.transferir();
			}
			else if(opcion==3) {
				puntero.reintegrar();
			}
		
			else if (opcion==4) {
				puntero.cambiarClave();
			}
			else if(opcion==5) {
				puntero.getSaldo();
			}
			else {
				System.out.println("Esta opción no es válida.");
			}
		}while (opcion!=6);
		System.out.println("Adios. Vuelva pronto.");
	}
	
	public static String identificarCliente() {
		int compClave=0;
		System.out.println("Introduzca su clave.");
		compClave= teclado.nextInt();
		if(compClave.equals(puntero.getClave())) {
			return ; 
		}
		
	}	

}
