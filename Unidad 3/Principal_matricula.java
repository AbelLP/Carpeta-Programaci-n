package prueba;

public class Principal_matricula {
		public static void main(String[] args) {
			Principal_matricula interfaz=new Principal_matricula();
			Matricula ies=new Matricula("1DAM", "123");
			Alumno alum=new Alumno();
			Alumno alum1=new Alumno("Mateo", ies);
			System.out.println(alum1.toString());
		}

}
