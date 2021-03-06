package Ejercicios;
import java.util.*;
public class Banco {
	static Scanner teclado=new Scanner(System.in);
	
	private String nombreUsuario;
	private int numeroCuenta;
	private int clave;
	private int saldo;
	
	public Banco()
	{
	}
	
	public Banco(String nombreUsuario, int numeroCuenta, int clave, int saldo) {
		super();
		setNombreUsuario(nombreUsuario);
		setNumeroCuenta(numeroCuenta);
		setClave(clave);
		setSaldo(saldo);
	}
	
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	public int getNumeroCuenta() {
		return numeroCuenta;
	}
	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	public int getClave() {
		return clave;
	}
	public void setClave(int clave) {
		this.clave = clave;
	}
	public int getSaldo() {
		return saldo;
	}
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	
	public String toString() {
		return "Banco [nombreUsuario=" + nombreUsuario + ", numeroCuenta=" + numeroCuenta + ", clave=" + clave
				+ ", saldo=" + saldo + "]";
	}
	
	public void ingresar() {
		int cantidad=0;
		cantidad= validarCantidad();
		saldo= saldo+cantidad;
		System.out.println("Se han ingresado " +cantidad+ " euros.");
		System.out.println("Operación completada.");
	}
	
	public void reintegrar() {
		int cantidad=0;
		cantidad= validarCantidad();
	//	if (saldo>0) {
		if (saldo>=cantidad)
		{
			saldo=saldo-cantidad;
			System.out.println("Se ha retirado "+cantidad+ " euros.");
			System.out.println("Operación completada.");
		}
		else {
			//System.out.println("No se puede retirar nada de esta cuenta.");
			System.out.println("No hay suficiente saldo.");
		}
	}
	
	public void transferir(Banco destino) {
		int cantidad=0;
		cantidad=validarCantidad();
		if (saldo >cantidad) {
			saldo= saldo-cantidad;
			destino.saldo= destino.saldo+cantidad;
			System.out.println("Operación completada.");
		}
		else {
			System.out.println("No hay suficiente saldo para transferir.");
		}
	
	}
	
	public void cambiarClave() {
		System.out.println("Introduzca la clave actual.");
		clave= teclado.nextInt();
		if (clave==getClave()) {
			System.out.println("Introduzca una nueva clave.");
			clave= teclado.nextInt();
			setClave(clave);
			System.out.println("Operación completada");
		}
		else {
			System.out.println("Esta clave no es correcta.");
		}
	}
	
	public int validarCantidad() {
		int cantidad=0;
		do {
			System.out.println("Introduzca una cantidad.");
			cantidad= teclado.nextInt();
		} while (cantidad<=0);
		return cantidad;
		
	}	

}