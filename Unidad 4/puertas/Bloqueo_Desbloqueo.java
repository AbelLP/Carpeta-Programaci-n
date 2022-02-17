package ejercicio_puertas;

public interface Bloqueo_Desbloqueo {
	public default void bloquear() {
		
	}
	
	public default void desbloquear() {
		setBloqueo(false);
	}
}
