package interfaces;

public class Cualidades {
	public void conocerAlimento(SerVivo ser) {
		ser.comer();
		if(ser instanceof Perro) {
			((Perro)ser).vacunar();
		}
		
	}
	
	
	

}
