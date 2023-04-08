
public class manipula_cadenas_2 {

	public static void main(String[] args) {
		
		String frase="Hoy es un estupendo dia para aprender a programar en Java";
		
		String frase_resumen=frase.substring(0,29) + " irnos a la playa y olvidarnos de todo " + frase.substring(29, 57);  // substring  para coger una parte de un texto 
		
		System.out.println(frase_resumen);
	}

}
