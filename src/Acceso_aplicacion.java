import javax.swing.*;


public class Acceso_aplicacion {

	public static void main(String[] args) {
	
		
		String clave="miguel";
		
		String pass="";
		
		while(clave.equals(pass)==false){
			pass=JOptionPane.showInputDialog("Introduce la contraseña, por favor");    //While es un bucle,mientras....
			
			if(clave.equals(pass)==false) {
				System.out.println("Contraseña incorrecta");  //si comentaramos el if ,funcionaria igual,ya qu es un bucle
			}
			
		}
		
		System.out.println("Contraseña correcta.Acceso permitido");
		
	
		
		
	}

}
