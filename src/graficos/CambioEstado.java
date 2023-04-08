package graficos;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

import javax.swing.JFrame;

public class CambioEstado {

	public static void main(String[] args) {
		
		MarcoEstado mimarco=new MarcoEstado();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
class MarcoEstado extends JFrame{
	public MarcoEstado() {
	setVisible(true);
	setBounds(300, 300, 500, 350);
	addWindowStateListener(new CambiaEstado());
	}
}

class CambiaEstado implements WindowStateListener{//ESTA INTERFAZ AVISA EN CADA CAMBIO DDE ESTADO

	@Override
	public void windowStateChanged(WindowEvent e) {//COMO LOS METODOS ANTERIORES ,ES UN METODO QUE RECOGE UN EVENTO CUANDO SE GENERA Y SE INVOCA AUUTOMATICAMENTE
	//ESTA EN ESPERA PARA EJECUTARSE	
		System.out.println("La ventana ha cambiado de estado");
		
		//System.out.println(e.getNewState());//WINDOWEVENTE TIENE METODOS,UNO DE ELLOS NOS DA EL NUEVO ESTADO DE LA VENTANA
		
		if(e.getNewState()==6){
			System.out.println("La ventana esta a pantalla completa");
		}else if(e.getNewState()==Frame.NORMAL) {//CAMPOS DE CLASE FRAME ,MIRAR EL METODO GETNEWSTATE
			System.out.println("La venta esta normal");
		}else if(e.getNewState()==Frame.ICONIFIED) {
			System.out.println("La ventana esta minimizada");
		}
		
	}
	
}