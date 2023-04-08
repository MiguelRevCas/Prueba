
public class Declaraciones_Operadores {

	public static void main(String[] args) {
		
		final double a_pulgadas=2.54;  //1 pulgada son 2.54 cm ,en este caso interesa crear una constante (final + el primitivo) ,un valor que nunca cambie,no como las variables
		
		double cm=6;
		
		double resultado=cm/a_pulgadas;
		
		System.out.println("En " + cm  + "cm hay " + resultado + "pulgadas " );
		
		//para crear varias variables a la vez 
		
		int operador1,operador2,resultado1;
		operador1=8;
		operador2=7;
		resultado1=operador1+operador2;
		
		
		System.out.println(resultado1);
		
		
		//++ incrementa en 1
				//+=valor incrementa en x numeros
		
		//pero + tambien sirve para concatenar como hicimos en el print de arriba con el texto mas resultados
				
		resultado1++;
		
		System.out.println(resultado1);
		

		resultado1+=3;
		
		System.out.println(resultado1);
		
	}

}
