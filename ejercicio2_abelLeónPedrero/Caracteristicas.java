package ejercicio2_abelLeónPedrero;

public class Caracteristicas {
	public void imprimir(Sanidad san) {
		boolean reducirGasto;
		double gastoGeneralNuevo;
		gastoGeneralNuevo=san.calcularAnual();
		System.out.println("Se ha gastado "+gastoGeneralNuevo+" euros.");
		if(san instanceof Privada ){
			reducirGasto=((Privada)san).calcularGasto();
			if(reducirGasto==true) {
				System.out.println("Hay que reducir el gasto.");
			}
			else {
				System.out.println("No hay que reducir el gasto.");
			}
		}
	}
}
