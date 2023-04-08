package graficos;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class CreandoMarcoCentrado {

	public static void main(String[] args) {
		
		MarcoCentrado mimarco=new MarcoCentrado();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//
		
	}

}

class MarcoCentrado extends JFrame{

	public MarcoCentrado(){
		
		Toolkit mipantalla=Toolkit.getDefaultToolkit();//LA CLASE TOOLKIT TIENE MUCHOS METODOS,ES UNA CLASE QUE TIENE UN CONJUNTO DE HERRAMIENTAS POR DECIR 
		//DE ALGUNA MANERA ,UNO DE ELLOS ES EL DE VER QUE RESOLUCION TENEMOS EN PANTALLA
		
		Dimension tamanhoPantalla=mipantalla.getScreenSize();// USAMOS EL METODO PARA RECOGER NUESTRA RESOULCION,PERO COMO DEVUELVE UN "DIMENSION" LO GUARDAMOS
		//ES UN DIMENSION
		
		int alturaPantalla=tamanhoPantalla.height;//LOS OBJETOS DIMENSION TIENEN CAMPOS DE CLASE PUBLICOS,NOS DEJA ACCEDER A ELLOS SIN GETTERS
		
		int anchoPantalla=tamanhoPantalla.width;
		
		setSize(anchoPantalla/2, alturaPantalla/2);
		setVisible(true);
		setLocation(anchoPantalla/4, alturaPantalla/4);
		setTitle("Marco Centrado");
		
		Image miIcono=mipantalla.getImage("icono.png");//EL METODO GETIMAGE PERMITE RECOGER UNA IMAGEN,EN UN OBJETO IMAGEN
		
		setIconImage(miIcono);//METODO PARA CAMBIAR EL ICONO,QUE PIDE UN OBJETO IMAGE
	}
}