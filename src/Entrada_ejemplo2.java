import javax.swing.*;
public class Entrada_ejemplo2 {

	public static void main(String[] args) {
		
		String nombre_usuario=JOptionPane.showInputDialog("Introduce tu nombre por favor"); //pide datos en una ventana
		
		String edad=JOptionPane.showInputDialog("introduce tu edad por favor"); //el metodo showinputdialog devuelve un string por eso al sumar un valor concatena no suma
		
		int edad_usuario=Integer.parseInt(edad); //Integer sirve para convertir datos string a int o al reves y más
		
		edad_usuario++; //operador incremento ,aumenta en 1  // edad_usuario--,incrementa en 1
		
		System.out.println("Hola " + nombre_usuario + " El año que viene tendras " + (edad_usuario) + "años");
		
		
	}

}
