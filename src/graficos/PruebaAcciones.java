package graficos;

import java.awt.Color;
import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

public class PruebaAcciones {

	public static void main(String[] args) {
	
		MarcoAccion marco=new MarcoAccion();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setVisible(true);
	}

}
class MarcoAccion extends JFrame {
	
	public MarcoAccion() {
		
		setTitle("Prueba Acciones");
		setBounds(600,350,600,300);
		add(new PanelAccion());
	}
	
}
class PanelAccion extends JPanel{
	
	
	
	public PanelAccion() {
		
		AccionColor accionAmarillo=new AccionColor("Amarillo", new ImageIcon("icono.png"), Color.YELLOW);
		AccionColor accionAzul=new AccionColor("Azul", new ImageIcon("icono.png"), Color.BLUE);
		AccionColor accionRojo=new AccionColor("Rojo", new ImageIcon("icono.png"), Color.RED);
		
		JButton botonAmarillo=new JButton(accionAmarillo);
		
		add(botonAmarillo);
		add(new JButton(accionRojo));
		add(new JButton(accionAzul));
		
		InputMap mapaEntrada=getInputMap(WHEN_IN_FOCUSED_WINDOW);/*CREA EL MAPA DE ENTRADA,ES DECIDIR A QUE OBJETO INCIDIRÁ LA COMBINACIÓN DE TECLAS*/
		KeyStroke teclAmarillo=KeyStroke.getKeyStroke("ctrl A");/*CREAMOS LA COMBINACION DE TECLAS*/
		mapaEntrada.put(teclAmarillo, "fondo_amarillo");/*ASIGNAMOS LA COMBINACION DE TECLAS AL OBJETO*/
		ActionMap asignar=getActionMap();/*CREAMOS UN ACTIONMAP PARA PODER ASIGNAR LAS TECLAS A UNA ACCION*/
		asignar.put("fondo_amarillo", accionAmarillo);/*EL OBJETO CREADO FONDO AMARILLO CON LAS TECLAS CTR+A .LAS ASIGNAMOS A LA ACCION*/
		
		
		KeyStroke teclAzul=KeyStroke.getKeyStroke("ctrl B");
		KeyStroke teclRojo=KeyStroke.getKeyStroke("ctrl R");
		
		mapaEntrada.put(teclAzul, "fondo_azul");
		mapaEntrada.put(teclRojo, "fondo_rojo");
		
		asignar.put("fondo_azul", accionAzul);
		asignar.put("fondo_rojo", accionRojo);
		
	}
	/*ABSTRACTACCION ES UNA CLASE QUE QUE IMPLEMENTA ACTION,Y ACTION HEREDA DE ACTIONLISTENER*/
	/*PARA NO IMPLEMENTAR ACTION Y SOBREESCRIBIR TODOS SUS METODOS,HEREDAMOS DE LA CLASE ABSTRACTA Y SOBREESCRIBIMOS LOS METODOS QUE NOS INTERESEN*/
	class AccionColor extends AbstractAction{
		
		public AccionColor(String nombre,Icon icono,Color color_boton) {

			putValue(NAME, nombre);
			putValue(SMALL_ICON, icono);
			putValue(SHORT_DESCRIPTION, "Poner la lamina de color"+nombre);
			putValue("color_de_fondo", color_boton);
			
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			
			Color c=(Color) getValue("color_de_fondo");
		
			setBackground(c);
			
		}
		
	}
}

