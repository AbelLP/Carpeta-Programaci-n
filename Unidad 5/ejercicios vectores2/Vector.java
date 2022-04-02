package ejercicios_vectores2;
import java.util.*;
public class Vector {
	static Scanner teclado=new Scanner(System.in);
	int[]v;
	int dimension;
	int a=0;
	
	public Vector(int dimension) {
		this.dimension=dimension;
		v=new int[dimension];
	}
	
	public void cargar(int[]v) {
		for(int i=0; i<dimension; i++) {
			System.out.println("Inserte número.");
			v[i]=teclado.nextInt();
		}
	}
	
	public void ordenar() {
		Arrays.sort(v);
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
		for (int i=0; i<dimension; i++) {
			if(v[i]==n) {
				cont++;
				System.out.println("Este número se repite. Está en la posición "+i+".");
			}
		}
		if(cont==0) {
			System.out.println("El número insertado no coincide con ninguno de los del vector.");
		}
	}
	
	public void apuntarLLamada() {
		System.out.println("Inserte un número de llamadas.");
		v[a]=teclado.nextInt();
		a++;
	}
	
	

}
