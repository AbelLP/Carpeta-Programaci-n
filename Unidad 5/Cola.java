package cola;
import java.util.*;
public class Cola {
	static Scanner teclado=new Scanner (System.in);
	final int tamaño=7;
	String[]cola=new String[tamaño];
	int i=0;
	
	
	public Cola() {
		menu();
	}
	
	public void menu() {
		boolean salir=false;
		int opcion=0;
		while(salir==false) {
			while(opcion<1 && opcion>4){
				System.out.println("Inserta una opción: ");
				System.out.println("1-Meter en la cola");
				System.out.println("2-Sacar de la cola.");
				System.out.println("3-Salir.");
				opcion=teclado.nextInt();
			}
			switch (opcion) {
			case 1:
				meter();
				break;
			case 2:
				sacar();
				break;
			case 3:
				visualizar();
				break;
			case 4: 
				salir();
				salir=true;
				break;
			}
		}
	}
	
	public void meter() {
		if(i<cola.length) {
			System.out.println("Inserta nombre.");
			teclado.nextLine();
			cola[i]=teclado.nextLine();
			i++;
		}
		else {
			System.out.println("No hay sitio en la cola.");
		}
	}
	
	public void sacar() {
		cola
		for(int a=cola.length-1; a>0; a--) {
			cola[a]=cola[a-1];
		}
	}
	
	public void visualizar() {
		for(int a=0; a<tamaño; a++) {
			System.out.println("El que está en la posición "+a+ " es "+cola[a]+".");
		}
	}
	
	public void salir() {
		System.out.println("Hasta luego.");
	}
	
	public static void main(String[] args) {
		new Cola();
	}

}
