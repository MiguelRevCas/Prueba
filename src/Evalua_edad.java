import java.util.*;
public class Evalua_edad {

	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduce tu edad por favor");
		
		
		int edad=entrada.nextInt();
		
		
		
	//	if(edad>=18) {
		
	//		System.out.println("Eres mayor de edad");               //condicional "if"= y si?   
			
	//	}
	//	else { 
	//		System.out.println("Eres menor de edad");              //"else"= si no es así..
	//	}
		
	if (edad<18) {
		System.out.println("Eres un adolescente");
	}
	else if(edad<40) {
		System.out.println("Eres Joven");
	}
	else if(edad<65) {
		System.out.println("Eres maduro");
	}
	
	else {
		System.out.println("Cuidate");
	}
	
	
	
	}

}
