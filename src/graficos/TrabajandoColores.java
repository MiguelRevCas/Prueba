package graficos;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TrabajandoColores {

	public static void main(String[] args) {

		MarcoConColor mimarco = new MarcoConColor();

		LaminaConColor milamina=new LaminaConColor();
		
		mimarco.add(milamina);
		
		mimarco.setVisible(true);
		
		milamina.setBackground(Color.pink);
	}

}

class MarcoConColor extends JFrame {

	public MarcoConColor() {
		setTitle("Prueba con colores");

		setSize(400, 400);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class LaminaConColor extends JPanel {

	public void paintComponent(Graphics g) {

		super.paintComponent(g);

		Graphics2D g2 = (Graphics2D) g;
//RECTANGULO
		Rectangle2D rectangulo = new Rectangle2D.Double(100, 100, 200, 150); 
		
		g2.setPaint(Color.blue);
		g2.draw(rectangulo);
		
		g2.setPaint(Color.red);//METODO PARA ESTABLECER EL COLOR A LA SIGUIENTE INSTRUCCION UQE VAYA A PINTAR (CON EL COLOR EN LA MANO,PINTA...ESTO) , 
		//LA CLASE COLOR TIENE CONSTANTES CON COLORES
		
		g2.fill(rectangulo);//ESTE METODO RELLENA LA FIGURA DEL COLOR ESCOGIDO , Y SI FUERA CON DRAW ,PINTARIA LA LINEA SOLO
//ELIPSE		
		Ellipse2D elipse =new Ellipse2D.Double();
		
		elipse.setFrame(rectangulo);
		
		//Color micolor=new Color(125,189,200);
		
		g2.setPaint(new Color(109,172,59)/*.brighter()*/);//COLOR A PARTE DE LAS CONSTANTES TIENE UN CONSTRUCTOR PARA LOS COLORES
		/*SI USAMOS SETCOLOR FUNCIONA IGUAL*/
		g2.fill(elipse);
		

	}
}
