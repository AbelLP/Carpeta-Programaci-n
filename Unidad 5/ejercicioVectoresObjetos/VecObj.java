package ejerciciosVectoresObjetos;
import java.util.*;



public class VecObj {
	static Scanner teclado=new Scanner(System.in);
	private int tamaño;
	private Alumno[] vec;
	private Alumno[] vec1;
	

	
		public VecObj(int tamaño) {
			this.tamaño=tamaño;
			this.vec=new Alumno[tamaño];
			this.vec1=new Alumno[tamaño];
		}
	
	
		public void cargar(){
			int cont;
			for(cont=0; cont<tamaño; cont++) 
				this.vec[cont]=leerDatos();
		}
		
		private Alumno leerDatos() {
			Alumno alum;	
			String nombre;
			String matricula;
			String opcion="";
		
			System.out.println("Inserte matricula.");
			matricula=teclado.nextLine();
			System.out.println("Inserte nombre.");
			nombre=teclado.nextLine();
			System.out.println("Inserte opción.");
			opcion=teclado.nextLine();
		
				
			while(!opcion.equalsIgnoreCase("a") && !opcion.equalsIgnoreCase("b") && !opcion.equalsIgnoreCase("m")) {
				opcion=teclado.nextLine();
			}	
			alum=new Alumno(nombre, matricula, opcion);	
			return alum;		
		}	
		


		public void visualizar(){ 
			System.out.println("VECTOR");
			for (int i=0; i<tamaño; i++) 
				System.out.println(vec[i].toString());
		
			System.out.println();
		
			System.out.println("VECTOR 1");
			for (int i=0; i<tamaño; i++) 			
				System.out.println(vec1[i].toString());
		 	}

	
	
			public void modificar(int i, Alumno alum) {
			vec[i]=alum;
			}
		

			public Alumno getPosicion(int i) {
				return vec[i];
			}
			
		
	public void pasar() {
			String opcion="";
			Alumno alum;
			int i;
			for (i=0; i<vec.length;i++) {
				String nombre=vec[i].getNombre();
				String matricula=vec[i].getMatricula();
		    	opcion=vec[i].getOpcion();
		    	if (opcion=="A")  { 
		    		vec1[i]=new Alumno(nombre,matricula,opcion);	
		      	}
		    	else if (opcion=="B")
		    		vec1[i]=new Alumno();
		    	else if (opcion=="M") {
		    		vec[i].setNombre(nombre);
		    		vec1[i]=new Alumno(nombre,matricula,opcion);	
		    	}
			
			}
		}
	
	
	public static void main(String[] args) {
		VecObj vec=new VecObj(5);
		VecObj vec1=new VecObj(5);
		vec.cargar();
		vec.pasar();
		vec.visualizar();

	}

}
