package graficos;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.*;
public class PruebaDibujo {

	public static void main(String[] args) {
	
		
		MarcoConDibujos mimarco=new MarcoConDibujos();
		
		mimarco.setVisible(true);
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

}

class MarcoConDibujos extends JFrame{//CREAMOS LA VENTANA
	
	public MarcoConDibujos(){
		
		setTitle("Prueba de dibujo");//ESTABLECEMOS UN TITULO
		setSize(400, 400);//UN TAMAÑO
		
		LaminaConFiguras milamina= new LaminaConFiguras();//INSTANCIAMOS UNA LAMINA O PANEL
		
		add(milamina); //AÑADIMOS EL PANEL A LA VENTANA O MARCO
		//EL METODO ADD ,HEREDADO ,PIDE UN OBJETO COMPONENT ,PERO JPANEL ,HERADA DE EL ,POR ESO LO ACEPTA
	}
	
}

class LaminaConFiguras extends JPanel{//CREACION DEL PANEL
	
	@Override
	protected void paintComponent(Graphics g) {//ESTE METODO SE INVOCA SOLO AL INSTANCIAR LA CLASE LAMINACONFIGURAS
		
		super.paintComponent(g);//HAZ LO QUE TENGAS QUE HACER ,OSEA NO SOBREESCRIBOS EL METODO ENTERO,LLAMAMOS AL METODO PADRE PARA QUUUE HAGA SUS COSAS
		//Y AÑADIMOS LO QUE QUERAMOS QUE HAGA DESPUES
		
	//	g.drawRect(50, 50, 200, 200);//DIBUJA CUADRADO O RECTANGULO
		
	//	g.drawLine(100, 100,300, 200);//DIBUJA LINEA 
		
	//	g.drawArc(50, 100, 100, 200, 120, 150);//DIBUJA ARCO
		
		/*************************************************GRAPHICS2D****************************************************************************************/
		
		Graphics2D g2=(Graphics2D) g;  //GRAPHICS 2D ES MÁS POTENTO,PERMITE  HACER MAS COSAS PERO ES MAS COMPLICADO
		//EL METODO GRAPHICS ES EL QUE CONTIENE LOS METODOS PARA ESCRIBIR Y INSERTAR TEXTO
		Rectangle2D.Double rectangulo=new Rectangle2D.Double(100,100,200,150);//CREAMOS EL RECTANGULO,YA QUE EL METODO DRAW EXIGE UN OBJETO SHAPE
		//TODOS LOS OBJETOS DE LAS CLASES RECTANGLE2D ,ELLIPSE2D TIENEE IMPLEMENTADA LA CLASE SHAPE
		
		g2.draw(rectangulo);
		
		/*ELIPSE*/
		Ellipse2D elipse=new Ellipse2D.Double();//ELLIPSE2D.DOUBLE HEREDA DE ELLIPSE2D
		//AL CONSTRUIR UN CIRCULO O ELIPSE,NO HAY UN PUNTO INICIAL X e Y(CUUAL ES EL PUNTO INICIAL DE UN CIRCULO,PIENSALO),
		//POR ELLO ,SE CREA UN CUADRADO "FRAME" Y SE METE DENTRO DE ESTE O USAR ALGUNO QUUE TENGAMOS
		
		elipse.setFrame(rectangulo);
		
		g2.draw(elipse);
		
		/**LINEA**/
		g2.draw(new Line2D.Double(100,100,300,250));
		
		double CentroenX=rectangulo.getCenterX();
		double CentroenY=rectangulo.getCenterY();
		double radio=150;
		Ellipse2D circulo=new Ellipse2D.Double();
		
		circulo.setFrame(CentroenX,CentroenY,CentroenX+radio,CentroenY+radio);
		
		g2.draw(circulo);
	}
	
}