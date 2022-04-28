package ejercicio1;
import java.util.*;
import java.io.*;
public class FichBeatles {
	static Scanner teclado=new Scanner (System.in);
	FileWriter fesc=null;
	BufferedWriter besc=null;
	FileReader flec=null;
	FileReader flec2=null;
	BufferedReader blec2=null;
	BufferedReader blec=null;
	String nombre, apellidos=null;
	String []nombres=new String[4];
	String []nombresCompletos=new String[4];
	
	public void crearVector() {
		for(int i=0; i<nombres.length; i++) {
			System.out.println("Inserte nombre.");	//John, Paul, George, Ringo
			nombres[i]=teclado.nextLine();
		}
	}
	
	public void pasarVectorAFichero() {
		try {
			fesc=new FileWriter("C:/Users/dam/Desktop/java_fich/nombres.txt");
			besc=new BufferedWriter(fesc);
			flec=new FileReader("C:/Users/dam/Desktop/java_fich/nombres.txt");
			blec=new BufferedReader(flec);
			for (int i=0; i<nombres.length; i++) {
				besc.write(nombres[i]);
				besc.newLine();
			}	
			besc.flush();
			for (int i=0; i<nombres.length; i++) {
				String linea=blec.readLine();
				System.out.println(linea);
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			if(fesc!=null) {
				try {
					fesc.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(besc!=null) {
				try {
					besc.close();
				} catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public void crearFicheroApellidos() {
		try {
			fesc=new FileWriter("C:/Users/dam/Desktop/java_fich/Apellidos.txt");
			besc=new BufferedWriter(fesc);
			for(int i=0; i<nombres.length; i++) {
				System.out.println("Inserta appellidos");	//Lennon, McCartney, Harrison, Starr
				
				apellidos=teclado.nextLine();
				besc.write(apellidos);
				besc.newLine();
			}
			besc.flush();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			if(fesc!=null) {
				try {
					fesc.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(besc!=null) {
				try {
					besc.close();
				} catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public void añadirApellidosFichero() {
		try {
			flec=new FileReader("C:/Users/dam/Desktop/java_fich/nombres.txt");
			blec=new BufferedReader(flec);
			flec2=new FileReader("C:/Users/dam/Desktop/java_fich/Apellidos.txt");
			blec2=new BufferedReader(flec2);
			String nombre="";
			String apellidos;
			String nombreCompleto;
			for(int i=0; i<nombresCompletos.length; i++) {
				nombre=blec.readLine();
				apellidos=blec2.readLine();
				nombreCompleto=nombre+apellidos;
				nombresCompletos[i]=nombreCompleto;
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/*public void pasarFicheroAVector() {
		try {
			flec=new FileReader("C:/Users/dam/Desktop/java_fich/nombres.txt");
			blec=new BufferedReader(flec);
			String linea;
			for (int i=0; i<nombresCompletos.length; i++) {
				linea=blec.readLine();
				nombresCompletos[i]=linea;
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			System.out.println(e.toString());
		} finally {
			if(flec!=null) {
				try {
					flec.close();
				}catch (IOException e) {
					e.printStackTrace();;
				}
			}
			if (blec!=null) {
				try {
					blec.close();
				} catch (IOException e) {
					e.printStackTrace();;
				}
			}
		}
	}*/
	
	public void mostrarVector() {
		for(int i=0; i<nombresCompletos.length; i++) {
			System.out.println("En la posición "+i+" está "+nombresCompletos[i]+".");
		}
	}
	
}
