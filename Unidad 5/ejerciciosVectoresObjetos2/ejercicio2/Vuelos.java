package ejerciciosVectoresObjetos2;

public class Vuelos {
	private int num;
	private String compa�ia;
	private String destino;
	
	public Vuelos(int num, String compa�ia, String destino) {
		super();
		this.num = num;
		this.compa�ia = compa�ia;
		this.destino = destino;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getCompa�ia() {
		return compa�ia;
	}

	public void setCompa�ia(String compa�ia) {
		this.compa�ia = compa�ia;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	@Override
	public String toString() {
		return "Vuelos [num=" + num + ", compa�ia=" + compa�ia + ", destino=" + destino + "]";
	}
	
	
	
	
	
}