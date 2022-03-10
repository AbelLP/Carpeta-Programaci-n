package ejercicio_puertas;

public class Manual /*implements Bloqueo_Desbloqueo*/{
	protected boolean bloqueo;
	private int num;
	
	public Manual() {
		super();
	}

	public Manual(int num) {
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

	public void desbloquear() {
		setBloqueo(false);
		System.out.println("La puerta se ha abierto manualmente.");
	}
	
	public void bloquear(){
		setBloqueo(true);
		System.out.println("La puerta se ha cerrado manualmente.");
	}
	
	
	
	
}