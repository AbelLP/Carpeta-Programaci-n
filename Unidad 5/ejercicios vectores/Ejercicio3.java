package ejercicios_vectores;
import java.util.*;
public class Ejercicio3 {
	static Scanner teclado=new Scanner(System.in);
	final int MAX=5;
	int[]v1=new int [MAX];
	int []v2=new int [MAX];
	int []v3;
	
	public Ejercicio3() {
		cargarVector(v1);
		cargarVector(v2);
		v3=multiplicar(v1, v2);
		visualizar();
	}
	
	public void cargarVector(int[]v) {
		for(int i=0; i<MAX; i++) {
			System.out.println("Inserte número.");
			v[i]=teclado.nextInt();
		}
	}
	
	public int[] multiplicar(int[]v1, int[]v2) {
		for(int i=0; i<MAX; i++) {
			v3[i]=v1[i]*v2[i];
		}
		return v3;
	}
	
	public void visualizar() {
		for(int i=0; i<MAX; i++) {
			System.out.println("El  valor de la posición "+i+" del primer vector es "+v1[i]+".");
			System.out.println("El  valor de la posición "+i+" del segundo vector es "+v2[i]+".");
			System.out.println("El  valor de la posición "+i+" del tercer vector es "+v3[i]+".");
		}
	}
	
	public static void main(String[] args) {
		Ejercicio3 interfaz=new Ejercicio3();
	}

}
