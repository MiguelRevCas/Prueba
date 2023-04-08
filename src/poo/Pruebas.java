package poo;

/**
 * VARIABLES ESTATICAS Y METODOS ESTATICOS
 * 
 * ESTATICA ,LAS ""VARIABLES"" ESTATICAS SIEMPRE ES LA MISMA
 * ,NO COMO UN VARIBALE NORMAL,QUE CADA COPIA DEL OBJTEO TIENE UNA COPIA
 * DE SUS PROPIEDADES PARA EL SOLO 
 * EJEMPLO->ID,1 TODOS TENDRIAN UN ID 1,SUMAMOS
 * EN EL CONSTRUCTOR ,Y CADA OBJETO CREADO TENDRIA SU ID UNICO Y COMPARTIDO
 * ,SUMANDOLE 1
 * 
 * 
 * UN METODO ESTATICO SIGNIFICA QUE NO NECESITA NINGUN OBJETO PARA FUNCIONAR 
 * RECUERDA QUE UNA VARIABLE ESTATICA COMO SE USA? PRECEDIDA DE SU CLASE
 * Empleados.IdSiguiente;
 * 
 * LO MISMO CON EL METODO  NOMBRE_CLASE+METODO
 *  LOS METODOS STATIC SOLO ACTUAN SOBRE VARIABLES O
 * CAMPOS DE CLASE ESTATICOS
 * 
 * LOS MODIFICADORES DE ACCESO EN VARIABLES INDICAN SI SE PUEDEN MODIFICAR O NO DENTRO DE LA CLASE
 * PRIVATE SIGNIFICA QUE SE PODRA MODIFICAR SOLO DENTRO DE LA CLASE,PUBLIC QUE SE PUEDE TANTO FUERA COMO DENTRO ,ENCAPSULACION
 *  EN UN METODO QUE SIGNIFICA?QUE SE PUEDA USAR O NO FUERA DE
 * LA CLASE
 * FINAL SIGNIFICA QUE NO SE PUEDA MODIFICAR EL VALOR DE LA VARIABLE UNA VEZ TENGA UN DATO
 * 
 **/
public class Pruebas {

	public static void main(String[] args) {

		Empleados trabajador1 = new Empleados("Paco");
		Empleados trabajador2 = new Empleados("Ana");
		Empleados trabajador3 = new Empleados("Antonio");

		trabajador1.cambiaSeccion("RRHH");

		System.out.println(
				trabajador1.devuelveDatos() + "\n" + trabajador2.devuelveDatos() + "\n" + trabajador3.devuelveDatos());

		System.out.println(Empleados.dameIdSiguiente());

	}

}

class Empleados {

	private final String nombre;
	private String seccion;
	private int Id;
	private static int IdSiguiente = 1;

	public Empleados(String nom) {
		this.nombre = nom;
		seccion = "Administracion";
		Id = IdSiguiente;
		IdSiguiente++;
	}

	public void cambiaSeccion(String seccion) {// setter
		this.seccion = seccion;
	}

	public String devuelveDatos() {
		return "El nombre es " + nombre + " y la seccion es " + seccion + " y el Id " + Id;// getter
	}

	public static String dameIdSiguiente() {
		return "El IdSiguiente es :" + IdSiguiente;
	}

}