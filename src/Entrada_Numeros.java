import javax.swing.*;
public class Entrada_Numeros {

	public static void main(String[] args) {
		
		
		//double x=10000.0;
		
		//System.out.println(x/3);
		
		//System.out.printf("%1.2f" ,x/3);  //el 1.2 quiere decir q imprime con 2 decimales ,si queremos tres seria 1.3
		// y el f es por el printf  ,printf da formato al valor númerico x/3

		
		String num1= JOptionPane.showInputDialog("Introduce un número");
		
		double num2=Double.parseDouble(num1);  //pasamos el string a double  con la calse Double y lo almacenamos en num2
		
		System.out.print("La raíz de " + num2 + " es "); 
		
		System.out.printf("%1.2f" , Math.sqrt(num2));  //pasamos a doble en valor incial por que el sqrt pide un double 
		
	}

}
