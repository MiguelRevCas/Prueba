package graficos;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class EventosTeclado {

	public static void main(String[] args) {
		
		
		MarcoConTeclas mimarco=new MarcoConTeclas();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
class MarcoConTeclas extends JFrame{
	public MarcoConTeclas() {
		setVisible(true);
		setBounds(700, 300, 600, 450);
		EventoDeTeclado tecla=new EventoDeTeclado();
		addKeyListener(tecla);
	}
}
class EventoDeTeclado implements KeyListener{//LISTENER DE TECLADO
	@Override
	public void keyPressed(KeyEvent e) {//ACCION AL PULSAR UNA TECLA
	//	System.out.println(e.getKeyCode());//DIME EL CODIGO DE LA TECLA PULSADA
		
	}

	@Override
	public void keyTyped(KeyEvent e) {//ACCION AL SOLTAR UNA TECLA
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {//ACCION DE AMBAS
		// TODO Auto-generated method stub
		System.out.println(e.getKeyChar());
		
	}
}