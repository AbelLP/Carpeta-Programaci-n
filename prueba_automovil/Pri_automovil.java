package prueba_automovil;

public class Pri_automovil {
	public Pri_automovil() {
		Moto mot1= new Moto("4562LKI", 3, 2152, "Azul", true);
		Moto mot2=new Moto("7895MNA", 2, 4222, "Rojo", false);
		Camion cam=new Camion("6587HAQ", 8, 3024, "Negro", 1000, "diesel");
		System.out.println(mot1.toString());
		System.out.println(mot2.toString());
		System.out.println(cam.toString());
	}

	public static void main(String[] args) {
		Pri_automovil interfaz=new Pri_automovil();
	}

}
