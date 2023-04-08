package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Persona {

	public static void main(String[] args) {
		
		Persona [] lasPersonas=new Persona[2];
		lasPersonas[0]=new Empleado2("Luis Conde",50000,2009,02,25);
		lasPersonas[1]=new Alumno("Ana Lopez","Biologicas");

		for(Persona p:lasPersonas) {
			System.out.println(p.dameNombre()+" , "+ p.dameDescripcion());
		}
		
	}

}
//UNA CLASE ABSTRACT NO SE PUEDE INSTANCIAR
abstract class Persona { // CREAMOS CLASE ABSTRACT ,SI QUEREMOS QUE VARIAS CLASES TENGO UN MISMO METODO
							// PERO DEVOLVIENDO COSAS DIFERENTES
	// NO VA A DEVOLVER LO MISMO UNA DESCRIPCION DE UNA PERSONA ALUMNO QUE DE UNA
	// PERSONA EMPLEADO NO?
	private String nombre;

	public Persona(String nom) {
		this.nombre = nom;
	}

	public String dameNombre() {
		return nombre;
	}

	public abstract String dameDescripcion(); // METODO ABSTRACTO NO USA {} AHORA TODAS LAS CLASES QUE HEREDEN DE
	
				// PERSONA DEBERAN TENER UN METODO DAMEDESCRIPCION
}

 class Empleado2 extends Persona {

	private double sueldo;
	private Date altacontrato;

	public Empleado2(String nom, double sue, int agno, int mes, int dia) {
		super(nom);
		sueldo = sue;
		GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1, dia);

		altacontrato = calendario.getTime();
	}

	public String dameDescripcion() { // ASI ESTE METODO IGUAL AL DEL PADRE,RETORNA ALGO DIFERENTE EN CADA CLASE
										// HEREDADA
		return "Este empleado tiene un ID";
	}

	public double damesueldo() {
		return sueldo;
	}

	public Date damefechacontrato() {
		return altacontrato;
	}

	public void subesueldo(double porcentaje) {
		double aumento = sueldo * porcentaje / 100;
		sueldo += aumento;
	}

}

class Alumno extends Persona {
	public Alumno(String nom, String car) {
		super(nom);
		this.carrera = car;
	}

	private String carrera;

	public String dameDescripcion() { // ASI ESTE METODO IGUAL AL DEL PADRE,RETORNA ALGO DIFERENTE EN CADA CLASE
										// HEREDADA
		return "Este alumno cursa " + carrera;
	}
}