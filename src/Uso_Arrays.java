
public class Uso_Arrays {

	public static void main(String[] args) {
	
		
		/*int [] mi_matriz=new int[5];
		mi_matriz[0]=5;
		mi_matriz[1]=38;
		mi_matriz[2]=-15;
		mi_matriz[3]=92;
		mi_matriz[4]=71;*/
		
	//	System.out.println(mi_matriz[0]);              //sería muy engorroso//
		//System.out.println(mi_matriz[1]);
		//System.out.println(mi_matriz[2]);
		//System.out.println(mi_matriz[3]);
		//System.out.println(mi_matriz[4]);
		
		
		int[]mi_matriz= {5,38,-15,92,71,95,85,65,25,14,78};
		
		for (int i=0;i<mi_matriz.length;i++) {
			
			System.out.println("El valor del índice " + i + " = " + mi_matriz[i]);
			
			//for(int elemento:mi_matriz) {
				//System.out.println(elemento);
		}
		
		

	}

}
