package ejercicios_vectores2;
import java.util.*;
public class Telefono {
	static Scanner teclado=new Scanner(System.in);
	private int memoria;
	private String telefono;
	int[] tel;
	
	
	
	public Telefono(int memoria, String telefono) {
		this.memoria = memoria;
		this.telefono = telefono;
		tel=new int[memoria];
		
	}

	public int getMemoria() {
		return memoria;
	}
	
	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}
	
	public String getTelefono() {
		return telefono;
	}
	
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public void apuntarLlamada(){
		for(int i=0; i<memoria; i++) {
			System.out.println("Inserte número de llamadas.");
			tel[i]=teclado.nextInt();
		}
	}
	
	public void visualizar() {
		int llamadas=0;
		for(int i=0; i<memoria; i++) {
			llamadas=llamadas+tel[i];
		}
		System.out.println("Este teléfono ha tenido "+llamadas+" llamadas.");
	}

}
