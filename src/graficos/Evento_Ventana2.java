package graficos;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class Evento_Ventana2 {

	public static void main(String[] args) {

		MarcoVentanaII mimarco = new MarcoVentanaII();
		mimarco.setTitle("Venatana 1");
		mimarco.setBounds(300,300,500,350);
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MarcoVentanaII mimarco2=new MarcoVentanaII();
		mimarco2.setTitle("Ventana 2");
		mimarco2.setBounds(900, 300, 500, 350);
		mimarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//SI SE CIERRA LA VENTANA 1 SIGUE EN EJECUCION
		
	}

}

class MarcoVentanaII extends JFrame {

	public MarcoVentanaII() {

		//setTitle("Respondiendo");

		//setBounds(300, 300, 500, 350);

		setVisible(true);

		//M_Ventana oyenteVentana=new M_Ventana();
		//addWindowListener(oyenteVentana);
		
		addWindowListener(new M_Ventana());//PARA SIMPLIFICAR CODIGO
		
	}

}

class M_VentanaII extends WindowAdapter{//PARA NO ESCRIBIR TODOS LOS METODOS AL IMPLEMENTAR LA CLASE ,YA QUE SOLO USAREMOS UN METODO
	//SE USAN LAS CLASES ADAPTADORAS ,WINDOWADAPTER ES UNA CLASE QUE IMPLEMENTA TODOS LOSS METODOS DE LA INTERFAZ WINDOWADAPTER

	@Override
	public void windowIconified(WindowEvent e) {
	
		System.out.println("Ventana minimizada");
		
	}

	
}