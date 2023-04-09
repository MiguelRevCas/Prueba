package Ejercicio;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CCuentaTest {
	/*******CREAMOS EL OBJETO FUERA DEL METODO,SI NO ,OTRO METODDO NO TENDRIA ACCESO*******/
	CCuenta MiCuenta=new CCuenta();
	@BeforeAll
	static void setUpBeforeClass() throws Exception {/******ESTO SE LANZARIA UNA VEZ ANTES DE TODOS LOS @TEST *******/
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach                           /*****************SE EJECUTA ANTES DE CADA METODO DE PRUEBA,OSEA LOS @TEST,SI HAY 2,2 VECES*****************************/
	void setUp() throws Exception {/***EL AFTER HACE REFERENCIA A QUE SE EJECUTARA ANTES DE LANZAR EL PROGRAMA****/
		CCuenta MiCuenta=new CCuenta();
		/*	Aquí estableceriamos los valores de la clase,le dariamos un estado etc*/
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testIngresar1() {
		/*ESTE METODO HACE LA COMPARACION */
		assertEquals(1, MiCuenta.ingresar(-10));/*RESULTADO ESPERADO Y RESULTADO ACTUAL*//***EL RESULTADO ACTUAL SERIA LA FUNCION QUE TESTEAMOS***/
												/*SI EL RESULTADO ESPERADO ES IGUAL AL ACTUAL ,DARA COMO VALIDO,SI NO COMO ERROR O FALLO*/
	}
	@ Test
	void testIngresar2() {
		assertEquals(2, MiCuenta.ingresar(-3));
	}
	@ Test
	void testIngresar3() {
		assertEquals(0, MiCuenta.ingresar(10));
		
	}

}
