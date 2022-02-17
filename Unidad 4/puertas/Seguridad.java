package ejercicio_puertas;

public abstract class Seguridad {
	protected boolean bloqueo;
	
	public Seguridad() {
		this(false);
	}

	public Seguridad(boolean bloqueo) {
		super();
		this.bloqueo=bloqueo;
	}

	public boolean getBloqueo() {
		return bloqueo;
	}

	public void setBloqueo(boolean bloqueo) {
		this.bloqueo = bloqueo;
	}
	
	public abstract void desbloquear();
	public abstract void bloquear();
}