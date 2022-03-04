/**
 * 
 */
package uvg.edu.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import uvg.edu.common.Archivo;

/**
 * @author Brian Carrillo
 *
 */
class ArchivoTest {

	//Prueba sobre lectura de archivos
	@Test
	void checkFileTest() {
		Archivo archivo = new Archivo();
		Integer[] valorRecibido = archivo.checkFile();
		
		assertEquals(valorRecibido[0], 1);
		assertEquals(valorRecibido[1], 2);
		assertEquals(valorRecibido[2], 3);
		assertEquals(valorRecibido[3], 4);
		assertEquals(valorRecibido[4], 5);
	}

}
