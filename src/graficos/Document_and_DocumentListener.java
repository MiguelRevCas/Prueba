package graficos;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

public class Document_and_DocumentListener {

	public static void main(String[] args) {
	

		MarcoPruebaArea marco=new MarcoPruebaArea();
		
		int a=1;
		
	}

}



class MarcoPrueba extends JFrame{
	
	public MarcoPrueba() {
		
		setVisible(true);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setBounds(500, 500, 500, 500);
		
		add(new LaminaPrueba());
	}
}



class LaminaPrueba extends JPanel{
	
	public LaminaPrueba() {
	
		JTextField micampo=new JTextField(20);
		/*LOS JTEXTFIELD NOS PERMITE GENERAR UN DOCUMENTO DEL TEXTO QUE ALMACENA EN SU INTERIOR*/
		Document miDoc=micampo.getDocument();
		/*DOCUMENTO TIENE SU LISTENER,QUE SALTARA CADA VEZ QUE EL TEXTO SEA MODIFICADO,BORRADO...ETC*/
		miDoc.addDocumentListener(new EscuchaTexto());
		
		this.add(micampo);
	}
	
	private class EscuchaTexto implements DocumentListener{

		@Override
		public void insertUpdate(DocumentEvent e) {
			
			System.out.println("Has INTROUCIDO texto");
			
		}

		@Override
		public void removeUpdate(DocumentEvent e) {

			System.out.println("Has BORRADO texto");
			
		}

		@Override
		public void changedUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
}