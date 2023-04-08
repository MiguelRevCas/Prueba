package graficos;

import javax.swing.JFrame;

public class PruebaTextArea {

	public static void main(String[] args) {
	
		MarcoPruebaArea marco=new MarcoPruebaArea();
		
	}

}

class MarcoPruebaArea extends JFrame{
	
	public MarcoPruebaArea() {
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setVisible(true);
		
		setBounds(500,500,500,500);
		
	}
	
}