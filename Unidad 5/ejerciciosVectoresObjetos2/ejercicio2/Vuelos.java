package ejerciciosVectoresObjetos2;

public class Vuelos {
	private int num;
	private String compañia;
	private String destino;
	
	public Vuelos(int num, String compañia, String destino) {
		super();
		this.num = num;
		this.compañia = compañia;
		this.destino = destino;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getCompañia() {
		return compañia;
	}

	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	@Override
	public String toString() {
		return "Vuelos [num=" + num + ", compañia=" + compañia + ", destino=" + destino + "]";
	}
	
	
	
	
	
}