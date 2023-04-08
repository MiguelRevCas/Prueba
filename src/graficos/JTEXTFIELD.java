
package graficos;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class JTEXTFIELD {

	public static void main(String[] args) {

		MarcoTF marco = new MarcoTF();

	}

}

class MarcoTF extends JFrame {

	public MarcoTF() {

		setVisible(true);
		setBounds(500, 500, 500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		LaminaTF lamina = new LaminaTF();
		add(lamina);
	}
}

class LaminaTF extends JPanel {

	private JTextField campo1;

	
	private JLabel resultado;

	public LaminaTF() {
		/* ETIQUETA */
		
		this.setLayout(new BorderLayout());
		
		JPanel milamina2=new JPanel();
		
		milamina2.setLayout(new FlowLayout());
		
		JLabel etiqueta = new JLabel("Email :");
		
		resultado = new JLabel("",SwingConstants.CENTER);

		campo1 = new JTextField("escribe", 20);

		milamina2.add(etiqueta);
		
		milamina2.add(campo1);
		
		add(resultado,BorderLayout.CENTER);

		JButton miboton = new JButton("Comprobar");

		DameTexto mievento = new DameTexto();

		miboton.addActionListener(mievento);

		milamina2.add(miboton);
		
		add(milamina2,BorderLayout.NORTH);
	}

	private class DameTexto implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			int correcto = 0;

			String email = campo1.getText().trim();

			for (int i = 0; i < email.length(); i++) {

				if (email.charAt(i) == '@') {

					correcto++;
				}

			}

			if (correcto != 1) {

				System.out.println("Incorrecto");
				resultado.setText("Incorrecto");

			} else {
				System.out.println("Correcto");
				resultado.setText("Correcto");
			}

		}

	}

}