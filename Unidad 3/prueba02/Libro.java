package prueba02;

public class Libro {
	private String titulo;
	
	public Libro(String titulo) {
		super();
		this.titulo=titulo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public void compararLibro(Libro puntero) {
		if(titulo.equals(puntero.getTitulo())) {
			System.out.println("Ambos libros tienen el mismo título.");
		}
		else {
			System.out.println("No tienen el mismo título");
		}
	}
	

}
