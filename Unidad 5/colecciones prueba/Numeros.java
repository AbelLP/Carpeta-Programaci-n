package pruebaColecciones;
import java.util.*;
public class Numeros {
	static Scanner teclado=new Scanner(System.in);
	
	public Numeros() {
		Integer n;
		ArrayList<Integer>listNum=new ArrayList<Integer>();
		System.out.println("Inserte si quiere o no insertar datos: si o no.");
		String respuesta=teclado.nextLine();
		while (!respuesta.equalsIgnoreCase("no")) {
			n=meterNumero();
			cargarVector(listNum, n);
			visualizar(listNum);
			n=meterNumero();
			modificar(n, listNum);
			n=meterNumero();
			borrar(n, listNum);
			System.out.println("Inserte si quiere o no seguir metiendo datos.");
			respuesta=teclado.nextLine();
		}
		if(respuesta.equalsIgnoreCase("no")) {
			System.out.println("Hasta luego.");
		}
		
	}
	
	public Integer meterNumero() {
		System.out.println("Inserta un número.");
		Integer n=teclado.nextInt();
		teclado.nextLine();
		return n;
	}
	
	public void cargarVector(List<Integer>listNum, Integer n) {
		listNum.add(n);
	}
	
	public void visualizar(List<Integer>listNum) {
		Iterator<Integer> it=listNum.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	public void borrar(int n, List<Integer>listNum) {
		boolean salir=false;
		for(int i=0; i<listNum.size(); i++) {
			if(listNum.get(i)==n && salir==false) {
				listNum.remove(i);
				System.out.println("Numero borrado con éxito.");
				salir=true;
			}
		}
		if (salir==false) {
			System.out.println("No se ha encontrado el número a borrar.");
		}
	}
	
	public void modificar(int num, List<Integer>listNum) {
		boolean salir=false;
		for(int i=0; i<listNum.size(); i++) {
			int n=listNum.get(i);
			if(num==n) {
				listNum.set(i, n);
				salir=true;
			}
		}
	}
	
	public static void main(String[] args) {
		new Numeros();
	}

}
