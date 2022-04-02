//ABEL LE�N PEDRERO
package entregar;
import java.util.*;
public class Ejercicio {
	static Scanner teclado=new Scanner(System.in);
	final int tama�o=5;
	int[]v=new int[tama�o];
	
	
	public Ejercicio() {
		cargarVector();
		v=insertarNumero();
		visualizarVector(v);
	}
	
	public void cargarVector() {
		for(int i=0; i<4; i++) {
			System.out.println("Inserte n�mero.");
			v[i]=teclado.nextInt();
		}
	}
	
	public int[] insertarNumero() {
		System.out.println("Inserta un n�mero.");
		int n=teclado.nextInt();
		for(int i=v.length-1; i>0; i--){
            v[i]=v[i-1];
        }
		v[0]=n;
		return v;
	}
	
	public void visualizarVector(int[] v) {
		for(int i=0; i<tama�o; i++) {
			System.out.println("El n�mero en este vector es "+v[i]+".");
		}
	}
	
	public static void main(String[] args) {
		new Ejercicio();
	}

}
