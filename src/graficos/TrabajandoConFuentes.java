package graficos;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TrabajandoConFuentes {

	public static void main(String[] args) {
		
		MarcoConFuentes mimarco=new MarcoConFuentes();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);
		

	}

}

class MarcoConFuentes extends JFrame {

	public MarcoConFuentes() {

		setTitle("Prueba con Fuentes");
		
		setSize(400, 400);
		LaminaConFuentes milamina=new LaminaConFuentes();
		
		add(milamina);
		
		milamina.setForeground(Color.blue);//PONE TODO EL TEXTO EN AZUL
	}

}

class LaminaConFuentes extends JPanel {

	public void paintComponent(Graphics g) {

		super.paintComponent(g);

		Graphics2D g2 = (Graphics2D) g;
		
		Font miFuente=new Font("Courier",Font.BOLD,26);//CLASE PARA LA FUENTE DE LETRA,ESTE CONSTRUCTOR LLEVA EL NOMBRE DE LA LETRA,UNA CONSTANTE DE CLASE 
		//QUE ESPECIFICA EL ESTILO A DAR A LA LETRA,Y EL TAMAÑO
		
		g2.setFont(miFuente);//INTRODUCIMOS EL CAMBIO DE LETRA
		//g2.setColor(Color.red);//Y UN COLOR
		g2.drawString("Juan", 100, 100);
		
		g2.setFont(new Font("Arial", Font.ITALIC, 14));
		//g2.setColor(new Color(128,98,50).brighter());
		g2.drawString("Curos de Java", 100, 200);

	}

}