package prueba_ficheros2;
import java.util.*;
import java.io.*;
public class FichVehiculos {
	 static Scanner teclado=new Scanner(System.in);
	 List<Vehiculo>datos=new ArrayList<Vehiculo>();
	 FileWriter fesc=null;
	 BufferedWriter besc=null;
	 FileReader flec=null;
	 BufferedReader blec=null;
	 String matricula, modelo, cadena=null;
	 
	/* public void crearFichero() {
		 boolean sw=false;
		 try {
			 fesc=new FileWriter("C:/Users/dam/Desktop/java_fich/texto2.txt");
			 besc=new BufferedWriter(fesc);
			 System.out.println("Introduce matricula, fin para terminar.");
			 matricula=teclado.nextLine();
			 while(!matricula.equalsIgnoreCase("fin") && sw==false) {
				 System.out.println("Introduce modelo, fin para terminar.");
				 modelo=teclado.nextLine();
				 if(!modelo.equalsIgnoreCase("fin")) {
					 besc.write(matricula);
					 besc.newLine();
					 besc.write(modelo);
					 besc.newLine();
					 System.out.println("Inserte matricula, fin para terminar.");
					 matricula=teclado.nextLine();
				 }
				 else {
					 sw=true;
				 }
				besc.flush(); 
			 }
		 } catch (IOException e) {
			 System.out.println(e.getMessage());
		 }
		 finally {
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
	 }*/
	 
	 public void crearArrayList() {
		 try {
			 flec=new FileReader("C:/Users/dam/Desktop/java_fich/texto2.txt");
			 blec=new BufferedReader(flec);
			 cadena=blec.readLine();
			 while(cadena!=null) {				 
				 Vehiculo car=new Vehiculo();
				 car.setMatricula(cadena);
				 cadena=blec.readLine();
				 car.setModelo(cadena);
				 datos.add(car);
				 cadena=blec.readLine();
				
				 
			 }
		 } catch(FileNotFoundException e) {
			 e.printStackTrace();
		 } catch (IOException e) {
			 System.out.println(e.toString());
		 }
		 finally {
			 if(flec!=null) {
				 try {
					 flec.close();
				 } catch(IOException e) {
					 e.printStackTrace();
				 }
				 
			 }
			 if(blec!=null) {
				 try {
					 blec.close();
				 } catch(IOException e) {
					 e.printStackTrace();
				 }
			 }
		 }
		 
		 
	 }
	 
	 public void listarArrayList() {
		Iterator<Vehiculo>it=datos.iterator();
		Vehiculo coche=null;
		while(it.hasNext()) {
			coche=it.next();
			System.out.println("Matricula: "+coche.getMatricula()+"\nModelo: "+coche.getModelo());
		}
	 }	 
	 
}