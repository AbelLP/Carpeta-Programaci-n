 package ejercicio1;
 
 public class A { 
	 public A() { 
		 B objeto1=new B(); 
		 C objeto2=new C(); 
		 objeto2.metodo2(objeto1); 
	 } 
	 public static void main (String[ ] args){
		 A interfaz=new A(); 
	 } 
 } 
 class B { 
	 private int atributo1; 
	 public void metodo1() { 
		 System.out.println ("Estamos en el método 1"); 
	 } 
 } 
 class C { 
	 private int atributo2; 
	 public void metodo2(B puntero) {
		puntero.metodo1();
	 } 
 } 
