package prueba_ficheros;
import java.util.*;
import java.io.*;
public class FichTexto {
	static Scanner teclado=new Scanner(System.in);	
	FileWriter fesc=null;
	BufferedWriter besc=null;
	FileReader flec=null;
	BufferedReader blec=null;
	String cadena="";
	
	public void crearFichero(){
		try {
			fesc=new FileWriter("C:/Users/dam/Desktop/java_fich/texto.txt");
			besc=new BufferedWriter(fesc);
			System.out.println("Introduce una línea. Fin para terminar.");
			cadena=teclado.nextLine();
			while(!cadena.equalsIgnoreCase("fin")) {
				besc.write(cadena);
				besc.newLine();
				System.out.println("Introduce una cadena. Fin parar terminar.");
				cadena=teclado.nextLine();
			}
			besc.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			if(fesc!=null) {
				try {
					fesc.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	
	public void visualizarFicheros() {
		int numero;
		try {
			flec=new FileReader("C:/Users/dam/Desktop/java_fich/texto.txt");
			blec=new BufferedReader(flec);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			cadena=blec.readLine();
			while(cadena!=null) {
				System.out.println(cadena);
				cadena=blec.readLine();
			}
		} catch(IOException e) {
			System.out.println(e.toString());
		}
		finally {
			if(flec!=null) {
				try {
					flec.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
