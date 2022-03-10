package prueba;
import java.util.*;
public class Gestion_vectores {
	final int MAX=3;
	int []v1=new int[MAX];
	static Scanner teclado=new Scanner(System.in);
	public int[] cargarVector() {

		int suma=0;
		for(int i=0; i<v1.length; i++) {
			System.out.println("Meter valor en la posición.");
			v1[i]=teclado.nextInt();
		}
		for(int i=0; i<v1.length;i++) {
			suma=suma+v1[i];
		}
		System.out.println("La suma es "+suma);
		return v1;	
	}
	
	public void visualizar(int []v1) {
		for (int i=0; i<v1.length; i++) {
			System.out.println("El valor de la posición "+i+" del vector es: "+v1[i]+".");
		}
	}
	
	public void buscar(int []v1) {
		System.out.println("Número a buscar.");
		int valor=teclado.nextInt();
		int indice=0, sw=0;
		while(indice<v1.length && sw==0) {
			if(v1[indice]>=valor) {
				sw=1;
			}
			else {
				indice++;
			}
		}
		
		if(sw==1 && v1[indice]==valor) {
			System.out.println("El valor está en la posición "+indice);
		}
		else {
			System.out.println("El número no existe.");
		}
	}

}
