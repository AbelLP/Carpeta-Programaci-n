package navidad;
import java.util.*;
public class Marte {
	
	

	public static void main(String[] args) {
		Marciano mar1=new Marciano("Alfredo");
		mar1.indicarNacimiento();
		mar1.comprobarMarcianos();
		Marciano mar2=new Marciano("Kyle");
		mar2.indicarNacimiento();
		mar2.comprobarMarcianos();
		Marciano mar3=new Marciano("Fernanda");
		mar3.indicarNacimiento();
		mar3.comprobarMarcianos();
		mar2.indicarMuerte();
		Marciano mar4=new Marciano("Sera");
		mar4.indicarNacimiento();
		mar1.comprobarVivo();
		mar2.comprobarVivo();
		mar4.comprobarVivo();
	}

}
