package ejercicios_vectores2;
import java.util.*;

public class Ejercicio1 {
	static Scanner teclado=new Scanner(System.in);
	int[] v1=new int[7];
	
	public Ejercicio1() {
		cargar();
		ordenar();
		int n=meterNumero();
		buscar(n);
	}
	
	public void cargar() {
		for (int i=0; i<7; i++) {
			System.out.println("Inserte número.");
			v1[i]=teclado.nextInt();
		}
	}
	
	public void ordenar() {
		Arrays.sort(v1);
	}
	
	public int meterNumero() {
		int n=0;
		while(n<3 && n>10){
			System.out.println("Inserte un número.");
			n=teclado.nextInt();
		}	
		return n;
	}
	
	public void buscar(int n) {
		int cont=0;
		for (int i=0; i<7; i++) {
			if(v1[i]==n) {
				cont++;
				System.out.println("Este número se repite. Está en la posición "+i+".");
			}
		}
		if(cont==0) {
			System.out.println("El número insertado no coincide con ninguno de los del vector.");
		}
	}
	
	public static void main(String[] args) {
		Ejercicio1 interfaz=new Ejercicio1();
	}

}
