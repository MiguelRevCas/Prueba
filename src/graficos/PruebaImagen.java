package graficos;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PruebaImagen {

	public static void main(String[] args) {
	
		MarcoConImagen mimarco=new MarcoConImagen();
		
		mimarco.setVisible(true);
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
class MarcoConImagen extends JFrame{
	
	public MarcoConImagen(){
		
		setTitle("Marco Con Imagen");
		
		setBounds(750, 300, 1000, 520);//RECUERDA ,ESTE METODO ESPECIFICABA EL TAMAÑO Y UBICACION
		
		LaminaConImagen milamina=new LaminaConImagen();
		
		add(milamina);
		
	}
	
}
class LaminaConImagen extends JPanel{
	
	private Image imagen;
	
	@Override
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		
		
		try {		//IMAGEIO ES UN CLASE CON METODOS ESTATICOS UTILES PARA IMAGENES,COMO LEER UNA IMAGEN DESDE UN ARCHIVO
			/********LEE UNA IMAGEN DE ESE FICHERO*********************************************************************/
			imagen=ImageIO.read(new File("src/graficos/azul.png"));//LA RUTA SE ESTABLECE DESDE LA CARPETA DEL PROYECTO
		} catch (IOException e) {
			
			System.out.println("La imagen no se encuentra");
		}
		int anchuraImagen=imagen.getHeight(this);//ESTE METODO SIRVE PARA QUE NOS DIGA LA ALTURA DE LA IMAGEN,PERO PIDE UN VALOR ,PIDE EL OBJETO QUE ESPERA
		//QUE LA IMAGEN SEA CARGADA ,EN NUESTRO CASO LA LAMINA ,QUE ES DONDE SE PONE LA IMAGEN, "THIS" A SECAS SE REFIERE A LA CLASE
		int alturaImagen=imagen.getWidth(this);
		
		g.drawImage(imagen, 0, 0, null);//METODO PARA DIBUJAR LA IMAGEN
		/**PARA REPETIR LA IMAGEN**/
		for(int i=0;i<300;i++) {
			for (int j = 0; j < 200; j++) {
				g.copyArea(0,0 ,anchuraImagen , alturaImagen,anchuraImagen*i , alturaImagen*j);//METODO PARA COPIAR LA IMAGEN Y LA DIBUJE
			}
		}
		
		
	}
	
	
}

