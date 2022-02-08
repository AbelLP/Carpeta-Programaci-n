package abstracto;

public abstract class Instrumento {
	private String tipo;

	public Instrumento(String tipo) {
		super();
		this.tipo = tipo;
	}
	
	public Instrumento() {
		this(null);
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Instrumento [tipo=" + tipo + "]";
	}
	
	public abstract void tocar();
	
	
}
