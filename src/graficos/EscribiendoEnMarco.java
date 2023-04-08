/*
 * UN MARCO ,SE COMPONE DE CAPAS DE LAMINAS O PANELES ,DONDE TENDRAN DIFERENTES OBJETOS...TEXTOS...DIBUJOS...ETC NO SE ESCRIBE EN LA VENTANA 
 * FUNCIONA COMO UN DIV MAS O MENOS 
 */


package graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;

public class EscribiendoEnMarco {
	public static void main(String[] args) {

		MarcoConTexto mimarco=new MarcoConTexto();	
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Lamina milamina=new Lamina();//CREAMOS LA LAMINA
		
		mimarco.add(milamina);//Y LA AÑADIMOS AL MARCO
		
		
		JPanel a=new JPanel();
		a.paintComponents(null);
		
	}
}

class MarcoConTexto extends JFrame {

	public MarcoConTexto() {

		setVisible(true);

		setSize(600, 400);

		setLocation(400, 200);
		
		setTitle("primer texto");
		
		//Lamina milamina=new Lamina();
		
		
		//add(milamina);
		
	}
}

class Lamina extends JPanel{
	
	public void paintComponent(Graphics g) {//ESTE METODO SE INVOCA AUTOMATICAMENTE ,ES UNA PARTICULARIDAD//
		//IMPORTANTE , GRAPHICS  CONTIENE LOS METODOS PARA PINTAR,ESCRIBIR...ETC
		
		super.paintComponent(g);//LLAMA AL METODO PADRE Y HAZ LO QUE HAGA ESE METODO 
		
		g.drawString("Estamos aprendiendo swing", 100, 100);//Y A MAYORES HAZ ESTO
		
	}
	
}
