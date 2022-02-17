package ejercicios;

public class Cualidad {
	public void mostrarCualidad(VehiculosMotorizados veh) {
		if(veh instanceof Automovil) {
			System.out.println(((Automovil)veh).toString());
			((Automovil)veh).comprobarSeguridad();
		}
		else if(veh instanceof Camiones) {
			System.out.println(((Camiones)veh).toString());
			((Camiones)veh).comprobarSeguridad();
		}
		else {
			System.out.println(veh.toString());
		}	
	}
}
