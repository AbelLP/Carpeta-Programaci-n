package ejercicio_puertas;

public class Puerta implements Bloqueo_Desbloqueo{
	private boolean bloqueo;
	private int num;
	
	public Puerta() {
		super();
	}

	public Puerta (int num) {
		super();
		bloqueo=false;
		this.num=num;
	}
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public boolean isBloqueo() {
		return bloqueo;
	}

	public void setBloqueo(boolean bloqueo) {
		this.bloqueo = bloqueo;
	}

	public void bloquear() {
		setBloqueo(true);
	}
	
	public void desbloquear() {
		setBloqueo(false);
	}
	
}
