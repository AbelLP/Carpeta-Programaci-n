import java.util.*;
public class prueba {

	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		System.out.println("Seleccione un n�mero del m�s.");
		int mes= teclado.nextInt();
		while (mes <1 && mes >12) {
			System.out.println("Por favor, escoja un n�mero del m�s CORRECTO.");
			mes= teclado.nextInt();
		}
		switch (mes){
			case 1:
				System.out.println("El m�s seleccionado es enero.");
				break;
			case 2:
				System.out.println("El m�s seleccionado es febrero.");
				break;
			case 3:
				System.out.println("El m�s seleccionado es marzo.");
				break;	
			case 4:
				System.out.println("El m�s seleccionado es abril.");
				break;
			case 5:
				System.out.println("El m�s seleccionado es mayo");
				break;
			case 6:
				System.out.println("El m�s seleccionado es junio");
				break;
			case 7:
				System.out.println("El m�s seleccionado es julio;");
				break;
			case 8:
				System.out.println("El m�s seleccionado es agosto.");
				break;
			case 9:
				System.out.println("El m�s seleccionado es septiembre.");
				break;
			case 10:	
				System.out.println("El m�s seleccionado es octubre.");
				break;
			case 11:
				System.out.println("El m�s seleccionado es noviembre.");
				break;
			case 12:
				System.out.println("El m�s seleccionado es diciembre");
				break;
		}

	}

}
