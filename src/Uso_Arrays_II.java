import javax.swing.*;
public class Uso_Arrays_II {

	public static void main(String[] args) {
		
		String[] paises=new String[8];
		
		for (int i=0;i<8;i++){
			
			paises[i]=JOptionPane.showInputDialog("Introduce pais " +(i+1) );
		}
for (String elemento:paises) {
			
			System.out.println(elemento);
				
			}
			
		
		
		
	/*	paises[0]="España";
		paises[1]="Mexico";
		paises[2]="Colombia";
		paises[3]="Perú";
		paises[4]="Chile";
		paises[5]="Argentina";
		paises[6]="España";
		paises[7]="España";*/
		
	/*	for( int i=0;i<paises.length;i++) {
			System.out.println("Pais " + (i+1) + " " + paises[i]);           
			
		}*/
												
			
		/*String[] paises= {"España","México","Colombia","Perú","Chile","Argentina","Ecuador","Venezuela"};
		
		for (String elemento:paises) {
			
			System.out.println(elemento);
			
			
			
		}*/
		

	}

}
