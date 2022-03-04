/**
 * Class Archivo
 * @version 1.0 02/03/2022
 *
 * 
 */


package uvg.edu.common;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;

/**
 * @author Brian Carrillo
 *
 */
public class Archivo {
	/**
    *
    */
	
	Random random = new Random();
	
	/**
     * Metodo createFile: sirve para crear un archivo con números enteros aleatorios.
     * 
     * @see System.out#println()
     * @see java.io.File()
     * @see File#createNewFile()
     * @see java.io.BufferedWriter()
     * @see BufferedWriter#close()
     * @see BufferedWriter#write()
     * @see Exception#printStackTrace()
     * 
     */
	public void createFile() {
		Integer[] enteros = new Integer[3000];
		for(int i=0;i<3000;i++) {
			enteros[i] = Math.abs(random.nextInt());
		}
		
		try {
			File file = new File("datosHDT3.txt");
			file.createNewFile();
			
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			
			String contenido="";
			for(int entero:enteros) {
				contenido += String.valueOf(entero)+"\n";
			}
			
			bw.write(contenido);
			bw.close();
			
		}catch(Exception e) {
			System.out.println("Error al crear el archivo.");
			e.printStackTrace();
		}
	}
	
	
	/**
     * Metodo readFile: sirve para leer un archivo con números enteros aleatorios.
     * 
     * @see System.out#println()
     * @see java.io.File()
     * @see java.io.BufferedReader()
     * @see BufferedReader#readLine()
     * @see BufferedReader#close()
     * @see java.io.FileReader()
     * @see Integer#parseInt(String)
     * @see Exception#printStackTrace()
     * @return enteros: (Integer[])
     * 
     */
	public Integer[] readFile() {
		Integer[] enteros = new Integer[3000];
		
    	//Clases para el escaneo de la clase
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        
        try {
        	//Creacion del BufferedReader
            archivo = new File ("datosHDT3.txt");
            fr = new FileReader (archivo);
            br = new BufferedReader(fr);

            // Lectura del archivo
            String fila;
            
            //Adicion de cada fila al ArrayList
            int i = 0;
            while((fila=br.readLine())!=null){
                enteros[i]=Integer.parseInt(fila);
                i++;
            }
            return enteros;
            
        }catch(Exception e){
        	
        	//En caso no se pueda escanear el archivo
        	System.out.println("Error al escanear el archivo.");
            e.printStackTrace();
            
        }finally{
        	
            // En el finally cerramos el archivo, tanto si se leyo correctamente como si
        	// se encontro alguna excepcion.
            try{
            	//Cierre del archivo
                if( fr != null ){   
                    fr.close();     
                }                  
            }catch (Exception f){
            	//En caso el archivo no pueda ser cerrado
            	System.out.println("Error al cerrar el archivo.");
               f.printStackTrace();
            }
        }

        return null;
	}
	
	
	/**
     * Metodo checkFile: sirve para verificar si el archivo existe y si tiene data.
     * 
     * @see System.out#println()
     * @see java.io.File()
     * @see File#exists()
     * @see File#isFile()
     * @see Archivo#readFile()
     * @see Archivo#createFile() 
     * @return readFile()
     * 
     */
	public Integer[] checkFile() {
		File file = new File("datosHDT3.txt");
		
		if(file.exists() && file.isFile()) {
			return readFile();
		}else {
			createFile();
			return readFile();
		}
	}
	
	/**
     * Metodo updateFile: sirve para actualizar los datos del archivo ya existente.
     * 
     * @see System.out#println()
     * @see java.io.File()
     * @see File#createNewFile()
     * @see java.io.BufferedWriter()
     * @see BufferedWriter#close()
     * @see BufferedWriter#write()
     * @see String#valueOf()
     * @see Exception#printStackTrace()
     * 
     */
	public void updateFile(Integer[] enteros) {
		try {
			File file = new File("datosHDT3.txt");
			
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			
			String contenido="";
			for(int entero:enteros) {
				contenido += String.valueOf(entero)+"\n";
			}
			
			bw.write(contenido);
			bw.close();
			
		}catch(Exception e) {
			System.out.println("Error al actualizar el archivo.");
			e.printStackTrace();
		}
	}
}
