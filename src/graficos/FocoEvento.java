package graficos;

import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FocoEvento {

	public static void main(String[] args) {
		
		MarcoFoco marco=new MarcoFoco();
		
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
class MarcoFoco extends JFrame {
	
	public MarcoFoco() {
			setVisible(true);
			setBounds(300, 300, 600, 450);
			add(new LaminaFoco());
		
	}
	
}

class LaminaFoco extends JPanel{
	
	JTextField cuadro1;
	JTextField cuadro2;
	
	@Override
	protected void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		setLayout(null);/*INAVLIDAMOS EL LAYOUT,PARA QUITAR LAS POSICIONES DE LOS OBJETOS POR DEFECTO*/
		
		cuadro1=new JTextField();
		
		cuadro2=new JTextField();
		
		cuadro1.setBounds(120, 10, 150, 20);
		cuadro2.setBounds(120, 50, 150, 20);
		
		add(cuadro1);
		add(cuadro2);
		
		cuadro1.addFocusListener(new LanzaFocos());
		
	}
	
	/*CLASE INTERNA PARA PODER ACCEDER A LAS VARIABLES DEL JTEXTFIELD*/
	private class LanzaFocos implements FocusListener{

		@Override
		public void focusGained(FocusEvent e) {
			
			
			
		}

		@Override
		public void focusLost(FocusEvent e) {
		
			String email=cuadro1.getText();/*CAPTURA EL TEXTO ESCRITO EN EL CUADRO*/
			
			boolean comprobacion=false;
			
			for (int i = 0; i < email.length(); i++) {
				
				if(email.charAt(i)=='@') {
					comprobacion=true;
				}
				
			}
			
			if(comprobacion) {
				System.out.println("Es correcto");
			}else {
				System.out.println("No es correcto");
			}
			
		}
		
	}
}

