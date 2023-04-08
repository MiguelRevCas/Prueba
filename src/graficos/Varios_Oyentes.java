package graficos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Varios_Oyentes {

	public static void main(String[] args) {
	
		MarcoPrincipal marco=new MarcoPrincipal();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class MarcoPrincipal extends JFrame{

	public MarcoPrincipal() {
			
		setBounds(1300,100,500,300);
		setVisible(true);
		
		Lamina_Principal lamina=new Lamina_Principal();
		add(lamina);
		
	}
	
}

class Lamina_Principal extends JPanel{
	
	JButton cerrar=new JButton("Cerrar todo");
	
	public Lamina_Principal() {
		
		JButton nuevo=new JButton("Nuevo");
	
		add(nuevo);
		add(cerrar);
		
		nuevo.addActionListener(new OyenteNuevo() );
	}
	
	private class OyenteNuevo implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			MarcoEmergente marco=new MarcoEmergente(cerrar);
			
		}
		
	}
	
	
}

class MarcoEmergente extends JFrame{
	
	private static int contador=0;
	public MarcoEmergente(JButton boton_de_cierre) {
		contador++;
		setTitle("Ventana"+contador);
		setBounds(40*contador,40*contador,500,300);
		setVisible(true);
		boton_de_cierre.addActionListener(new CierraTodos());
	}
	
	private class CierraTodos implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
		
			dispose();
			
			
		}
		
		
	}
	
}