package Prueba;

public class Rectangulo_2 {
	private int base;
	private int altura;
	private static int contador=0;



	public static void contar_objetos() {
		System.out.println("Creamos " +Rectangulo_2.contador+ " objetos");
	}
	
	public int getAltura() {
		return altura;
	}
	
	public int getBase() {
		return base;
	}
	
	public void setAltura() {
		altura=Math.abs(altura);
	}
	
	public void setBase(int base) {
		this.base=base;
	}
	
	public String toString() {
		return "Rectangulo de base "+base+ " y de altura " +altura;
	}
	
	public int calcular_area(){
		return base*altura;
	}
	
	public Rectangulo_2() {
		base=0;
		altura=0;
		contador++;
	}
	
	public Rectangulo_2(int base, int altura) {
		setBase(base);
		setAltura(altura);
		contador++;
	}

}
