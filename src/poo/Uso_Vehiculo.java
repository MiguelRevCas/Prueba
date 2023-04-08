package poo;
import javax.swing.*;
public class Uso_Vehiculo {

	public static void main(String[] args) {
	
		/*Coche Renault=new Coche();			//INSTANCIAR CLASE.Ejemplar CLASE //METODO constructor,"NEW"
											//ES PARA CREAR UN OBJETO DE UNA CLASE  CON EL
											//ESTADO INICIAL DE ESTA 
		

		
	
		
		
		
		Coche micoche=new Coche();
		System.out.println(micoche.dime_datos_generales());
		micoche.establece_color(JOptionPane.showInputDialog("Introduce color"));
		
		
		System.out.println(micoche.dime_color());
		
		micoche.configura_asientos(JOptionPane.showInputDialog("Tiene asientos?"));
		System.out.println(micoche.dime_asientos());
		
		micoche.configura_climatizador(JOptionPane.showInputDialog("Tiene climatizador?"));
		
		System.out.println(micoche.dime_climatizador());
		
		System.out.println(micoche.dime_peso_coche());
		System.out.println("El precio final del coche es "+ micoche.precio_coche());*/
		
		
		
		Coche micoche1=new Coche();
		micoche1.establece_color("Rojo");
		
		Furgoneta mifurgoneta1=new Furgoneta(7,580);
		mifurgoneta1.establece_color("Azul");
		mifurgoneta1.configura_climatizador("Si");
		mifurgoneta1.configura_climatizador("Si");
		
		System.out.println(micoche1.dime_datos_generales()+ micoche1.dime_color());
		System.out.println(mifurgoneta1.dime_datos_generales()+mifurgoneta1.dimeDatosFurgoneta());
		
	}

}
