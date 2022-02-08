	package Ejercicios;
	import java.util.*;
	
	public class Principal_banco {
		static Scanner teclado=new Scanner(System.in);
		static Banco cl1= new Banco("Marta", 927362, 1234, 0);
		static Banco cl2= new Banco("Julio", 765897, 5678, 0);
		static Banco puntero;
		static Banco cuentaDestino;
		
		public static void main(String[] args) {
			int opcion=0;
			puntero=identificarCliente();
		
		
			System.out.println("El nombre del cliente es "+puntero.getNombreUsuario());	
			do {
				System.out.println("\nIntroduzca un número dependiendo de su opción:\n 1=Ingresar dinero\n 2=Realizar transferencia\n 3=Reintegrar dinero\n 4=Cambiar clave\n 5=Conocer saldo\n 6=Salir\n");
				opcion= teclado.nextInt();
				if (opcion==1) {
					puntero.ingresar();
				}
				else if (opcion==2) {
					puntero.transferir(cuentaDestino);
				}
				else if(opcion==3) {
					puntero.reintegrar();
				}
			
				else if (opcion==4) {
					puntero.cambiarClave();
				}
				else if(opcion==5) {
					System.out.println("El saldo de la cuenta es "+puntero.getSaldo());
				}
				else {
					System.out.println("Esta opción no es válida.");
				}
			}while (opcion!=6);
			System.out.println("Adios. Vuelva pronto.");
		}
		
			
		
		public static Banco identificarCliente() {
			boolean correcta;
			do {
			correcta=true;	
			System.out.println("Introduzca la clave de usuario");
			int clave=teclado.nextInt();
			if (clave==cl1.getClave())
				puntero=cl1; 
			else if (clave==cl2.getClave())
				puntero=cl2;
			else {
				System.out.println("Clave errónea");
				correcta=false;
			    }
			}while (correcta==false);
			return puntero;
		}	
	}
	
