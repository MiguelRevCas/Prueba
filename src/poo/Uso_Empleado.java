package poo;

import java.util.*;

public class Uso_Empleado {

	public static void main(String[] args) {

		Jefatura jefe_RRHH = new Jefatura("Juan", 55000, 2006, 9, 25);

		jefe_RRHH.estableceIncentivo(2570);

		// EJEMPLO HECHO CON ARRAY
		Empleado[] misEmpleados = new Empleado[6]; // ES LO MISMO QUE UN CONSTRUCTOR ,PERO AÑADIENDO []
		misEmpleados[0] = new Empleado("Paco Gomez", 85000, 1990, 12, 17);
		misEmpleados[1] = new Empleado("Ana Lopez", 95000, 1995, 06, 02);
		misEmpleados[2] = new Empleado("Maria Martin", 10500, 2002, 03, 15);
		misEmpleados[3] = new Empleado("Antonio Fernández");

		misEmpleados[4] = jefe_RRHH;// POLIMORFISMO,SUSTITUCIÓN , JEFATURA PERTENECE ,HERADA DE EMPLEADO ,ASI QUE
									// ,AUNQUE EL ARRAY ESPERA OBJETOS EMPLEADOS, DEJA TAMBIE OBJETOS JEFES ,POR QUE
									// JEFES PERTECENECE A EMPLEADOS,ES SUBCLASE
		// DE EMPLEADOS AL FINAL ,PERO LA CLASE PRINCIPLA ES EMPLEADOS
		misEmpleados[5] = new Jefatura("Maria", 95000, 1999, 5, 26);

		Jefatura jefa_finanzas = (Jefatura) misEmpleados[5];// CASTING ,CONVERTIMOS UN OBJETO EMPLEADOS A JEFATURA PARA
															// PODER SUBIR EL INCENTIVO
		jefa_finanzas.estableceIncentivo(55000);

		Empleado director_comercial = new Jefatura("Sandra", 85000, 2012, 05, 05);

		Comparable ejemplo = new Empleado("Elisabeth", 9800, 2011, 06, 07);

		System.out.println(jefa_finanzas.tomar_decisiones("Dar mas dias de vacaciones"));
		
		
		
		
		
	
		// CON BUCLE FOR MEJORADO
		for (Empleado e : misEmpleados) {
			e.subesueldo(5);
			System.out.println(e.damesueldo());
		}

		Arrays.sort(misEmpleados);

		for (Empleado e : misEmpleados) {
			System.out.println("Nombre: " + e.damenombre() + " Sueldo; " + e.damesueldo() + "Fecha de Alta: "
					+ e.damefechacontrato());
		}

	}

}

// LO MEJOR ES SEPARAR EN ARCHIVOS LA CLASE DEL PROGRAMA,ESTE EJEMPLO SE AHRA
// TODO JUNTO
// AL HACERLO TODO JUNTO HAY QUE TENER EN CUENTA QUE:
// SOLO PUEDE EXISTIR UNA CLASE PUBLICA POR ARCHIVO,Y UNA TIENE LA OBLIGACION DE
// LLEVAR EL METODO MAIN

class Empleado implements Comparable ,trabajadores {

	// VAMOS HACER UN CONSTRUCTOR PERO SIN DATOS ESTABLECIDOS,VAMOS EXIGIR QUE SE
	// RELLENEN LOS CAMPOS SI SE CREA NUESTRO OBJETO
	
	public Empleado(String nom, double sue, int agno, int mes, int dia) {

		nombre = nom;
		sueldo = sue;
		GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1, dia); // GREGORIANCALENDAR PARA CREAR
																					// OBJETOS DE TIPO CALENDARIO
		altacontrato = calendario.getTime(); // GETTIME DA LA FEHCA ALMACENADA FUNCIONA PARECIDO A SCANNER

	}

	public Empleado(String nom) { // PARA HACER UN POR DEFECTO
		// nom=nombre;
		this(nom, 3000, 2000, 01, 01); // ESTE THIS LLAMA AL OTRO CONSTRUCTOR ,COMO EN UNA VARIABLE HACE REFERENCIA A
										// LA VARIABLE,AQUI HACE AL CONSTRUCTOR QUE COINCIDA CON EL NUMERO DE VALORES DE
										// LOS PARAMETROS PARA DARLE VALORES POR DEFECTO
	}

	private String nombre; // LAS PROPIEDADES O ATRIBUTOS DEL OBJETO,SE PUEDEN PONER TANTO AL PRINCIPIO
							// (DESPUES DE HABER CREADO LA CLASE,LO NORMAL,O DESPUES DEL CONSTRUCTOR
	private double sueldo;
	private Date altacontrato; // DATE CLASE NUEVA PARA RECOGER FECHAS
	
	
	public String damenombre() {// GETTER
	
		return  nombre;
		
	}

	public double damesueldo() {// GETTER
		return sueldo;
	}

	public  Date damefechacontrato() {// GETTER
		
		return altacontrato;
	}
	
	public void subesueldo(double porcentaje) {// SETTER
		double aumento = sueldo * porcentaje / 100;
		sueldo += aumento;
		
	}

	public int compareTo(Object miObjeto) {
		
		Empleado otroEmpleado = (Empleado) miObjeto;
		if (this.sueldo < otroEmpleado.sueldo) {
			return -1;
		}
		if (this.sueldo > otroEmpleado.sueldo) {
			return 1;
		}
		return 0;
	}

	public double  establece_bonus(double gratificación) {
		return trabajadores.bonus_base+gratificación;
	}
	
	
}

class Jefatura extends Empleado implements Jefes {

	private double incentivo;

	public Jefatura(String nom, double sue, int agno, int mes, int dia) { // EL CONSTRUCTOR HEREDADO,TIENE Q TENER LOS
																			// PARAMETROS DEL PADRE

		super(nom, sue, agno, mes, dia);// LLAMAMOS AL CONSTRUCTOR PADRE SEGUN EL VALOR DE PARAMETROS INTRODUCUIDOS
										// ESCOGERA UNO U OTRO
	}

	public void estableceIncentivo(double b) {
		incentivo = b;
		
	}

	
	
	public double damesueldo() {
		double sueldoJefe = super.damesueldo(); // SUPER FUNCIONA COMO THIS ,LLAMA AL METODO DE LA CLASE PADRE
												// DAMESUELDO,NO AL DAMESUELDO QUE ESTAMOS ESCRIBIENDO AHORA
		return sueldoJefe + incentivo;
	}

	
	public double  establece_bonus(double gratificación) {
		double prima =2000;
		return trabajadores.bonus_base+gratificación+prima;
	}
	
	public String tomar_decisiones(String decision) {
		return "Un miembro de la direccion ha tomado la decision de " + decision;
	}
}
