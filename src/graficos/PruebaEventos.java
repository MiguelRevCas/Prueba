package graficos;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PruebaEventos {

	public static void main(String[] args) {
		
		
		MarcoConBotones mimarco=new MarcoConBotones();
		
		mimarco.setVisible(true);
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}

}
class MarcoConBotones extends JFrame{
	
	public MarcoConBotones() {
		
		setTitle("Botones y Eventos");
		
		setBounds(700, 300, 500, 300);
		
		LaminaBotones milamina=new LaminaBotones();
		add(milamina);//LOS METODOS DE LA CLASE SE USAN EN EL CONSTRUCTOR,POR QUE SI NO ,SOBREESCRIBE EL METODO,YA QUE FUERA DEL CONSTRUCTOR,
		//EN UNA CREACION DE CLASE VAN LOS METODOS Y VARIABLES , PIENSA EN LA ESTRUCTURA
	
	}
	
	
}
class LaminaBotones extends JPanel implements ActionListener{//LA CLASE QUE VA A HACER ALGO O CAMBIAR ,TIENE QUE IMPLEMENTAR LA INTERFACE ACTIONLISTENER
	
	
	JButton botonazul=new JButton("Azul");//CREACION DE BOTON
	
	JButton botonamarillo=new JButton("Amarillo");
	
	JButton botonrojo=new JButton("Rojo");
	
	/***************************************************************************************************************************************************
	 * AL HACER CLICK EN EL BOTON CREADO ,"AHORA MISMO COMO ESTA ESCRITO" ,SE CREA AUTOMATICAMENTE UN OBJETO DE TIPO EVENTO QUE VIAJA DE DEL BOTON AZUL
	 * CONCRETAMENTE DEL " ADDACTIONLISTENER"
	 * AL OBJETO QUE LE DECIMOS EN ESE METODO ,
	 * "THIS" SE REFIERE A LA CLASE ,
	 * Y LO RECOGE AUTOMATICAMENTE EL METODO ACTIONPERFORMED EN EL ACTIONEVENT
	 * RECUERDA QUE EL OBJETO AGREGADO EN ADDACTIONLISTENER ,TIENE QUE IMPLEMENTAR LA INTERFAZ ACTIONLISTENER ,YA QUE EL METODO RECOGE UN OBJETO ACTIONLISTENER
	 ****************************************************************************************************************************************************/
	public LaminaBotones() {	
		add(botonazul);//Y AÑADIMOS EL BOTON A LA LAMINA Y AL CONSTRUCTOR PARA QUE AL INSTANCIAR EL OBJETO SE CREE
		//**RECUERDA QUE PODEMOS USAR EL METODO DE LA CLASE SIN INSTANCIARLA DENTRO DE LA PROPIA CLASE ,EN EL MAIN TENDRIAMOS QUE CREAR UN OBJETO DE LA CLASE
		add(botonamarillo);
		add(botonrojo);
		
		botonazul.addActionListener(this);//LE INDICAMOS QUE OBJETO ESTA EN ESCUCHA,EL QUE VA A CAMBIAR O HACER ALGO
		//ADD"ACTION"LISTENER ACTION SIGNIFICA QUE LE EVENTO ES DE RATON
		botonrojo.addActionListener(this);
		botonamarillo.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {//METODO DE LA INTERFAZ ,QUE RECIBE AUTOMATICAMENTE EL EVENTO,EN ESTE CASO EL CLICK
		//**************************************RECIBE CUALQUIER EVENTO,NO DIFERENCIA SI ES EL BOTON AMARILLO P EL ROJO QUIEN LO MANDA,ES UN OYENTE EN ESPERA
		//DE UN EVENTO
	
		Object botonpulsado=e.getSource();//ESTO NOS DICE QUE BOTON INICIA EL EVENTO,DE DONDE PROVIENE
		
		if(botonpulsado==botonazul) {
			setBackground(Color.blue);
		}else if(botonpulsado==botonamarillo) {
			setBackground(Color.yellow);
		}else {
			setBackground(Color.red);
		}
		
		
		
	}
	
	
}