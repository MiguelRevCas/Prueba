
public class manipula_cadenas {

	public static void main(String[] args) {
		
		
		String nombre= "Miguel";
		
		System.out.println("Mi nombre es " + nombre);
		
		System.out.println("Mi nombre tiene " + nombre.length()  + " letras");  //lenght dice cuantas letras tiene una palabra

		System.out.println("La primera letra de " + nombre + " es la " + nombre.charAt(0));  // charAt muestra la letra en la posición "x"
		
		
		
		int ultima_letra;
		
		ultima_letra=nombre.length();
		
		System.out.println("Y la ultima letra es " + nombre.charAt(ultima_letra-1));
		
		
		
		
		
		
	}

}
