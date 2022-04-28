package ejercicios_colecciones;
import java.util.*;
public class Ejercicio2 {
		static Scanner teclado=new Scanner(System.in);
		static ArrayList<Deportistas> deporte=new ArrayList<Deportistas>();
		static ArrayList<Integer> sitios=new ArrayList<Integer>();
		static Deportistas[] vector;
		
		public void Principal_Deportes() {
			boolean salir=false;
			String opcion;
					
				do {		
						System.out.println("Inserta una de las siguientes opciones, fin para salir: ");
						System.out.println("1-Crear Deportistas");
						System.out.println("2-Crear Sitios");
						System.out.println("3-Cargar Datos.");
						System.out.println("4-Copiar Vector.");
						System.out.println("5-Visualizar deportistas");
						System.out.println("6-Visualizar sitios.");
						System.out.println("7-Visualizar Vector");
				     	opcion=teclado.nextLine();
				if (opcion.equals("fin") || opcion.equals("FIN") ){
				salir=true;
				System.out.println("Fin del programa");
			}
			else{
				
					switch (opcion) {
					case "1":
						crearDeportista();
						break;
					case "2":
						crearSitio();
						break;
					case "3":
						cargarDatos();
						break;
					case "4": 
						copiarVector();
						break;
					case "5":
						visualizarDeportistas();
						break;
					case "6": 
						visualizarSitios();
						break;
					case "7":
						visualizarEstatico();
						break;
						
					}
				}	
				
			}	while (salir==false);
		}
		
		public void crearDeportista() {
			System.out.println("Inserte nombre.");
			String nombre=teclado.nextLine();
			System.out.println("Inserta deporte que practica.");
			String dep= teclado.nextLine();
			deporte.add(new Deportistas(nombre, dep));
		}
		
		
		public void crearSitio() {
			String respuesta;
			int n=-1;
			boolean salir= false;
			Random rand=new Random();
			
			int longitud=deporte.size();
			
			while(salir==false) {
				respuesta="";
				while(!respuesta.equalsIgnoreCase("no") && !respuesta.equalsIgnoreCase("si")) {
					System.out.println("Indique si quiere o no insertar un número.");
					respuesta=teclado.nextLine();
				}
				if(respuesta.equalsIgnoreCase("si")) {
					n=rand.nextInt(longitud)+1;
					sitios.add(n);	
				}
				else if(respuesta.equalsIgnoreCase("no")) {
					salir=true;
				}
			}
		}
		
		
		public void cargarDatos() {
			int posicion;
			Iterator <Integer> it=sitios.iterator();
			while(it.hasNext()) {
				posicion=it.next();
				
				System.out.println("Inserte nombre.");
				String nombre=teclado.nextLine();
				System.out.println("Inserta deporte que practica.");
				String dep= teclado.nextLine();
				deporte.add(posicion,  new Deportistas(nombre, dep));
				
			}		
		}
		
		
		public void copiarVector() {
			int numElementos=deporte.size();
			vector=new Deportistas[numElementos]; 
			for (int i=0; i<numElementos; i++)
				vector[i]=deporte.get(i);
			System.out.println("Operación con éxito.");
		}
		
		public void visualizarDeportistas() {
			System.out.println();
			System.out.println("Listado de deportistas.");
			Iterator <Deportistas> it=deporte.iterator();
			while(it.hasNext()) {
				System.out.println(it.next().toString());
			}
		}
		
		public void visualizarSitios() {
			System.out.println("Listado de sitios.");
			Iterator <Integer> it=sitios.iterator();
			while(it.hasNext()) {
				System.out.println(it.next().toString());
			}
		}	
		public void visualizarEstatico() {
			System.out.println("listado del vector");
			for (int i=0; i<vector.length; i++) {
				System.out.println(vector[i].toString());
			}
		}
				
			
	public static void main(String[] args) {
		new Ejercicio2();
	}

}