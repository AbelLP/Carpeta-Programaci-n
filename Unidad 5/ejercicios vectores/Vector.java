package ejercicios_vectores;
import java.util.*;
public class Vector {
	int[]vec;
	int dimension;
	static Scanner teclado= new Scanner(System.in);
	
	public Vector(int dimension) {
		this.dimension=dimension;
		vec=new int[dimension];
	}
	
	public void cargar() {
		for(int i=0; i<dimension; i++) {
			System.out.println("Inserte número.");
			 vec[i]=teclado.nextInt();
		}
	}
	
	public void buscar() {
		for(int i=0; i<5; i++) {
			if(vec[i]==vec[i]) {
				System.out.println("En la posición "+i+" se repite el mismo número: "+vec[i]+".");
			}
		}
	}
	
	public int buscar(int num) {
		int i=0;
		int pos=-1;
		boolean existe=false;
		while (i<dimension && !existe) {
			if (vec[i]==num) {
				pos=i;
				existe=true;		
			}
		}
		return pos;
	}
	
	public int devolverElemento(int pos) {
		return vec[pos];
	}

	public void setElemento(int pos, int valor) {
		vec[pos]=valor;
	}
	
	public int devolverDimension() {
		return dimension;
	}
	
	public Vector rellenarVector()
	{
		Vector vec2=new Vector(dimension);
	
	for (int i=0; i<dimension;i++)
	{
		if (i==0) vec2.setElemento(i+1,devolverElemento(i)*6);
		else if (i%2 !=0)
		{System.out.println("impar: "+i);
			  vec2.setElemento(i-1,devolverElemento(i)+2);
		}
		else vec2.setElemento(i+1,devolverElemento(i)*6);
	}
	return vec2;
	}
	
	public void visualizarVector() {
		for(int i=0; i<dimension; i++) {
			System.out.println("El  valor de la posición "+i+" del primer vector es "+vec[i]+".");
			
		}
	}
}
