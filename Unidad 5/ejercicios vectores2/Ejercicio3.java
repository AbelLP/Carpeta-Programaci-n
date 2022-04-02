package ejercicios_vectores2;
import java.util.*;
public class Ejercicio3 {
	static Scanner teclado=new Scanner(System.in);
	int dimension=49;
	int[] urna=new int[dimension];
	int i=0;
	
	public Ejercicio3() {
		String respuesta="";
		cargar();
			while(!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("no")) {
				System.out.println("Inserte respuesta: si o no");
				respuesta=teclado.nextLine();
			}	
			if(respuesta.equalsIgnoreCase("si")) {
				int bola=sacarBola();
				contabilizarBola(bola);
				i++;
				respuesta="";
				System.out.println("Inserte respuesta: si o no.");
				teclado.nextLine();
				respuesta=teclado.nextLine();
			}
			else{
				visualizar();
				System.out.println("Hasta luego.");
			}
	}
	
	public void cargar() {
		for(int i=0; i<dimension; i++) {
			System.out.println("Inserte número.");
			urna[i]=teclado.nextInt();
		}
	}
	
	public int sacarBola() {
		int bola= (int) (Math.random()*48);
		System.out.println("Ha salido el número: "+bola);
		return bola;
	}
	
	public void contabilizarBola(int bola) {
		if(bola<dimension){
			urna[bola]++;
		}
		
	}
	
	public void visualizar() {
		for(int m=0; m<i; m++){
			System.out.println("En el intento "+m+" salió: "+urna[m]+".");
		}	
	}
	
	public static void main(String[] args) {
		Ejercicio3 interfaz=new Ejercicio3();
	}

}
