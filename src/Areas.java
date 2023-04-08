import java.util.*;
import javax.swing.*;
public class Areas {

	public static void main(String[] args) {
		
		Scanner entrada=new Scanner (System.in);
		
		// \n es un salto de linea
		System.out.println("Elige una opcion : \n1:Cuadrado \n2:Rectangulo \n3:Triangulo  \n4:circulo");
		
		int figura=entrada.nextInt();
		
	
		switch (figura) {
		
		case 1:
			
			int lado=Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado"));
			System.out.println("El área del cuadrado es " + Math.pow(lado,2));
			break;
			
			//String lado=JOptionPane.showInputDialog("Introduce el lado");
			//int lado2=Integer.parseInt(lado);
			//System.out.println("El área del cuadrado es " + Math.pow(lado2,2));
			//break;
			
		case 2:
			int base=Integer.parseInt(JOptionPane.showInputDialog("Introduce base"));
			int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce altura"));
			System.out.println("El área del rectangulo es " + base*altura);
			break;
			
		case 3 :
			base=Integer.parseInt(JOptionPane.showInputDialog("Introduce base"));
			altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce altura"));
			System.out.println("El área del triangulo es " + (base*altura)/2);
			break;
			
		case 4:
			int radio=Integer.parseInt(JOptionPane.showInputDialog("Introduce radio"));
			System.out.print("El área del circulo  es ");
			System.out.printf("% 1.2f", Math.PI*(Math.pow(radio, 2)));
			break;
			
			
			
			default:
				System.out.println("La opcion no es correcta");
				
				
			
					
				
				
		}

	}

}
