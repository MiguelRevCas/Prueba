import java.util.Scanner;

public class Entrada_ejemplo1 {

	public static void main(String[] args) {
		
	
		Scanner entrada=new Scanner(System.in);//el valor de entrada es algo que entrara por teclado,pero hay que pedir el dato con los metodos
		
	
	
		System.out.println("Introduce tu nombre por favor");
		
		
		String nombre_usuario=entrada.nextLine();
		
		
		System.out.println("Introduce tu edad por favor");
	
		
		int edad=entrada.nextInt();
		
		System.out.println(" Hola " + nombre_usuario + " El año que viene tendras " + (edad+1) + " años ");
		
		
		
	}
	
	

}
