package graficos;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

public class Eventos_Raton {

	public static void main(String[] args) {
		
		MarcoRaton mimarco=new MarcoRaton();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}

class MarcoRaton extends JFrame {
	public MarcoRaton() {
	setVisible(true);
	setBounds(700,300,600,450);
	
	addMouseListener(new EventosDeRaton());
	addMouseMotionListener(new MovimientoRaton());
	}
}

class EventosDeRaton implements MouseListener{//CLASE ADAPTADORA MOUSEADAPTER

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("Has hecho click");
		System.out.println("Picaste en la cordenada X:"+e.getX()+" Y  en la cordenada Y:"+e.getY());
		System.out.println("Has hecho "+e.getClickCount()+" Click`s");
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("Acabas de presionar");
		System.out.println(e.getModifiersEx());//NOS DA EL BOTON PULSADO
		if(e.getModifiersEx()==1024) {
			System.out.println("Has pulsado el boton izquierdo");
		}else if(e.getModifiersEx()==MouseEvent.BUTTON2_DOWN_MASK) {
			System.out.println("Has pulsado la rueda del raton");
		}else if(e.getModifiersEx()==MouseEvent.BUTTON3_DOWN_MASK) {
			System.out.println("Has pulsado el boton derecho");
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("Acabas de levantar");
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("Acabas de entrar");
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("Acabas de salir");
		
	}
	
}
class MovimientoRaton implements MouseMotionListener{

	@Override
	public void mouseDragged(MouseEvent e) {
		System.out.println("Estas arrastrando el raton");
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
	System.out.println("Estas moviendo el raton");
		
	}
	
}