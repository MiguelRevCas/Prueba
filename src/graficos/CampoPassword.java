package graficos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class CampoPassword {

	public static void main(String[] args) {

		MarcoArea marco = new MarcoArea();

	}

}

class MarcoArea extends JFrame {

	public MarcoArea() {

		setVisible(true);
		setBounds(500, 500, 500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(new PanelArea());

	}

}

class PanelArea extends JPanel {

	private JTextArea miTexto;
	
	public PanelArea() {
		
		/*CAJA DE TEXTO*/
		 miTexto=new JTextArea(8,20);
		
		/*SI EL TEXTO OCUPA EL ANCHO DEL ELEMENTO,SALTA A LA LINEA SIGUIENTE*/
		miTexto.setLineWrap(true);
		
		/*SI QUEREMOS QUE EL TEXTO TENGA UNA BARRA DE DESPLAZAMINETO,TENDRIAMOS QUE CREAR UNA PANEL ESPACIAL PARA ESO*/
		JScrollPane scroll=new JScrollPane(miTexto);
		
		add(scroll);
		
		JButton boton=new JButton("Dale");
		
		boton.addActionListener(new dameTexto() );
		
		add(boton);
		
	}
	
	private class dameTexto implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			
			System.out.println(miTexto.getText());
			
		}
		
	}

}
