package abstracto;

public class Principal_instrumento {
	public Principal_instrumento() {
		Instrumento miGuitarra=new Guitarra("Guitarra");
		Instrumento miViolin=new Violin("Violin");
		Tocar obj=new Tocar();
		obj.visualizar(miGuitarra);
		obj.visualizar(miViolin);
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		Principal_instrumento interfaz=new Principal_instrumento();
	}

}
