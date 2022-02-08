package repaso;

public class Cartas {
	private int victoria;
	private int numeroCarta;
	
	
	public Cartas() {
		victoria=0;
		numeroCarta=0;
	}

	public int getVictoria() {
		return victoria;
	}

	public int getNumeroCarta() {
		return numeroCarta;
	}

	public void setNumeroCarta(int numeroCarta) {
		this.numeroCarta = numeroCarta;
	}

	public void setVictoria(int victoria) {
		this.victoria = victoria;
	}
	
	public void sacarCarta() {
		setNumeroCarta(0);
		int n=(int)(Math.random()*12+1);
		setNumeroCarta(n);
		System.out.println("El número que se ha sacado es " +n+ ".");	
	}
	
	
	
	
	
	
	

}
