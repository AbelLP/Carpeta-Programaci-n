package ejercicio2;

public class A { 
	public A() { 
		B objeto1=new B(); 
		System.out.println(objeto1.objeto2.getCapacidad());
		
	} 
	public static void main (String[ ] args){
		A interfaz=new A(); 
	} 
	} 
	class B { 
		private int precio=3; 
		C objeto2=new C();
	} 
	class C { 
		private int capacidad=10; 
		public int getCapacidad() { 
			return capacidad; 
		} 
} 
