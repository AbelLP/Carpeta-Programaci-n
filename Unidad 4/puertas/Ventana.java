package ejercicio_puertas;

public class Ventana implements Bloqueo_Desbloqueo{
	protected boolean bloqueo;
	private int num;

	public Ventana() {
	}

	public Ventana(int num) {
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

	public void desbloquear() {
		setBloqueo(false);
	}
	
	public void bloquear(){
		setBloqueo(true);
	}
	
}
