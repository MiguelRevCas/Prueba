package graficos;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class Eventos_Ventana {

	public static void main(String[] args) {

		MarcoVentana mimarco = new MarcoVentana();
		mimarco.setTitle("Venatana 1");
		mimarco.setBounds(300,300,500,350);
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MarcoVentana mimarco2=new MarcoVentana();
		mimarco2.setTitle("Ventana 2");
		mimarco2.setBounds(900, 300, 500, 350);
		mimarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//SI SE CIERRA LA VENTANA 1 SIGUE EN EJECUCION
		
	}

}

class MarcoVentana extends JFrame {

	public MarcoVentana() {

		//setTitle("Respondiendo");

		//setBounds(300, 300, 500, 350);

		setVisible(true);

		M_Ventana oyenteVentana=new M_Ventana();
		addWindowListener(oyenteVentana);
	}

}

class M_Ventana implements WindowListener{

	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("Ventana abierta");
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
	System.out.println("Cerrando ventana");
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		
		System.out.println("La ventana ha sido cerrada");
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
	
		System.out.println("Ventana minimizada");
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		
		System.out.println("Ventana restaurada");
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("Ventana activada");
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
	System.out.println("Ventana desactivada");
		
	}
	
}