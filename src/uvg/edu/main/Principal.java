/**
 * 
 */
package uvg.edu.main;

import uvg.edu.common.Archivo;

/**
 * @author Brian Carrillo
 *
 */
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Archivo archivo = new Archivo();
		Integer[] enteros = archivo.checkFile();
		
		for(int i:enteros) {
			System.out.println(i);
		}

	}

}
