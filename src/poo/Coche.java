package poo;

public class Coche {
	
	private int ruedas;  //CON private,ENCAPSULAMOS LOS DATOS,PARA QUE NO SE PUEDAN CAMBIAR ESOS DATOS FUERA DE AQUI
							//MEDIANTE OTRAS CLASES o TRABAJANDO CON ELLAS// MODIFICAMOS EL ACCESO
	private int largo;
	private int ancho;
	private int motor;	//PROPIEDADES O ATRIBUTOS      //CREAMOS UNAS PROPIEDADES COMUNES Y OTRAS PROPIEDADES VARIABLES,HAY COSAS QUE SERÁ OPCIONALES
	private int peso_plataforma;									
	private String color;
	private int peso_total;
	private boolean asientos_cuero,climatizador;
	
																									//SI SUPONEMOS QUE LA CALSE ES UNA BASE/PLANTILLA DE UN
	//EL CONSTRUCTOR SE DEBE LLAMAR IGUAL QUE LA CLASE A LA QUE SE REFERENCIA						// OBJETO ,TODOS ESOS OBJETOS TENDRAN LA MISMA BASE CON LOS
	public Coche() {																				//MISMAS PROPIEDADES nO?
																							//TODOS LOS COCHES TENDRAN 4 RUEDAS ,UN PESO,LARGO...ETCy ESA SERA SU base
		ruedas=4;
		largo=2000;			//METODO CONSTRUCTOR
		ancho=300;			//ESTADO INICIAL DE LOS ATRIBUTOS ,OSEA CREAMOS UN OBJETO CON ESTE ESTADO INICIAL
		motor=1600;
		peso_plataforma=500;
		
	}

							//GETTER Y SETTER /AHORA VENDRIAN LOS METODOS DE LA CLASE
							//QUE PUEDE HACER NUESTRO OBJETO DE CLASE O QUE PROPIEDADES PUEDEN CAMBIAR? PUES EL COLOR Y ASIENTOS Y CLIMATIZADOR EN NUESTRO CASO,NO SON PREESTABLECIDAS,SON OPCIONALES
	
	public String dime_datos_generales() {	//METODO PARA MOSTRAR EL LARGO DEL COCCHE(METODO GETTER)
		return	"La plataforma del vehículo tiene " + ruedas + " ruedas " + " . mide " + largo/1000 + "metros con un ancho de " + ancho + " cm y un peso de plataforma de "+ peso_plataforma+" kg";	
		
													//PUBLIC PARA QUE PUEDA VERSE DESDE CUALQUIER CLASE    
	}
		
	
	public void establece_color(String color_coche){    //SETTER PARA ESTABLECER ALGUN VALOR DENTRO DE LOS PARENTISIS,Y LO QUE PONGAMOS SERA EL VALOR DE COLOR
		
		color=color_coche;
		}
	
	
			//GETTER
	public String dime_color() {								
		return "El color del coche es " +color;
	}
	
	
	
			//SETTER
	public void configura_asientos(String asientos_cuero){     // SI LA VARIABLE Y EL METODO SE NOMBRAN DE LA MISMA MANERA,PARA HACER REFERENCIA A LA VARIABLE SE UTILIZA EL "THIS"
		
		if(asientos_cuero.equalsIgnoreCase("si")) {
			this.asientos_cuero=true;       			//PARA COMPARAR CADENAS DE TEXTO,SIEMPRE EQUALS ,NUCA ="SI" O COSAS DEL ESTILO
		
		}else {
			this.asientos_cuero=false;
		}
	}
	
	
	
			//GETTER
	public String dime_asientos(){            
		if (this.asientos_cuero==true) {       
			return "El coche tiene asientos de cuero";
		}else {
			return "El coche tiene asientos de serie";
		}
		
	}
	
	
	public void configura_climatizador(String climatizador) {
		if(climatizador.equalsIgnoreCase("si")) {
			this.climatizador=true;
		}else {
			this.climatizador=false;
		}
		
		
		}
	public String dime_climatizador() {
		if(this.climatizador==true) {
			return "El coche incorpora climatizador";
		}else {
			return"El coche tiene aire acondicionado";
		}
	
	}
	
	public String dime_peso_coche(){				//SETTER+GETTER ,SE PUEDE HACER,PERO NO ES RECOMENDABLE,ES MEJOR SEPARAR GETTER(NOS DA INFORMACION) 
													// DEL SETTER(METER INFORMACION)COMO ESTAMOS CAMBIANDO LA VARIABLE INICIAL PESO TOTAL SE CONSIDERA GETTER TAMBIEN
		int peso_carroceria=500;
		peso_total=peso_plataforma+peso_carroceria;
		if(asientos_cuero==true) {
			peso_total=peso_total+50;
		}if(climatizador==true) {
			peso_total=peso_total+20;
		}
		return "El peso del coche es " + peso_total;
	}
	
	
	public int precio_coche() {														//ESTO ES UN GETTER ,NO MODIFICAMOS NINGUNA VARIABLE INICIAL,SOLO MOSTRAMOS UNA,UN VALOR ADICIONAL
		int precio_final=10000;
		if(asientos_cuero==true) {
			precio_final+=2000; 
			
		}if(climatizador==true) {
			precio_final+=1500;
			
		}
		return precio_final;
	}
}		


