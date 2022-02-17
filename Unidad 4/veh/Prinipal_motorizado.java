package ejercicios;

public class Prinipal_motorizado {
	public Prinipal_motorizado() {
		VehiculosMotorizados coch1=new Automovil("Peugeot", "407", 2001, 800000, "Urbano", 3);
		VehiculosMotorizados coch2=new Automovil("Ford", "Fiesta", 1980, 450000, "Van", 8);
		VehiculosMotorizados mot=new Motocicleta("Suzuki", "Turismo",2010, 752100, "Carretera");
		VehiculosMotorizados cam=new Camiones("Iveco", "GNC", 2015, 456000, 1, 3);
		Cualidad obj=new Cualidad();
		obj.mostrarCualidad(coch1);
		obj.mostrarCualidad(coch2);
		obj.mostrarCualidad(mot);
		obj.mostrarCualidad(cam);
	}
	
	

	public static void main(String[] args) {
		Prinipal_motorizado interfaz=new Prinipal_motorizado();
	}

}
