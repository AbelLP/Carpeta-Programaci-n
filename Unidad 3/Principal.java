package Prueba;

public class Principal {
	Rectangulo rect1;
	Rectangulo rect2;
	public Principal() {
		//Rectangulo rect1=null;	//el rect1 es un puntero que guarda una direccion de memoria.
		Rectangulo rect1= new Rectangulo();                                               	//el new crea el objeto reservando memoria y devolviendo la direccion de esa memoria.
		Rectangulo rect2= new Rectangulo(4,8);  
	}
	public void run(){
		rect1.setBase(2);
		rect1.setAltura(8);
		System.out.println(rect1.toString());
		System.out.println("Área del rectángulo de base " +rect2.getBase()+ " y de altura " +rect2.getAltura()+ " es " + rect2.getBase());
		System.out.print("Se crearon");
			Rectangulo.contar_objetos();
		System.out.println("objetos");
	}

	public static void main(String[] args) {
		Principal interfaz=new Principal();
		interfaz.run();
	}

}
