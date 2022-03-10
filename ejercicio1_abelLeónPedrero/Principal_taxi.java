package ejercicio1_abelLeónPedrero;

public class Principal_taxi {
	public Principal_taxi() {
		boolean adecuado=false;
		int llamadas=1;
		Conductor con=new Conductor("458L", 13);
		Taxi tax=new Taxi("6587S", "amarillo", true, con);
		while(llamadas<=30) {
			adecuado=tax.recoger();
			if(adecuado==true) {
				tax.transportar();
				System.out.println(tax.toString());
			}
		llamadas++;	
		}
	}

	public static void main(String[] args) {
		Principal_taxi interfaz=new Principal_taxi();
	}

}
