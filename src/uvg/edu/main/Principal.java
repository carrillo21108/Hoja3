/**
 * 
 */
package uvg.edu.main;

import java.util.Scanner;

import uvg.edu.common.Archivo;
import uvg.edu.common.IntegerComparator;
import uvg.edu.common.Sorts;

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
		
		//Enteros del archivo
		Integer[] enteros = archivo.checkFile();
		Scanner scanner = new Scanner(System.in);
		Sorts sorts = new Sorts(new IntegerComparator());
		
		//Mensaje inicial
		System.out.println("--ORDENAMIENTOS--");
		System.out.println("Bienvenido\n");

		//Banderas para el manejo de menu y errores
		boolean menu = true;
		boolean error = false;
		int opcion;
		
		//Ciclo del menu
        do {
        	do{
            	opcion = 0;
                //Verificacion de entrada de las opciones del menu
                try{
                    //Solicitud de opcion de menu
                    System.out.println("\n---MENU---");
                    System.out.println("\nEscoja una de las siguientes opciones de ordenamiento:");
                    System.out.println("1. Gnome sort");
                    System.out.println("2. Merge sort.");
                    System.out.println("3. Radix sort.");
                    System.out.println("4. Quick sort.");
                    System.out.println("5. Bubble sort.");
                    System.out.println("6. Salir y guardar ordenamiento.");
                    opcion = scanner.nextInt();
                    error = false;

                //En caso de error
                }catch(Exception e){
                    System.out.println("Error de ingreso, intente de nuevo.\n");
                    error = true;
                //Finalmente
                }finally{
                    scanner.nextLine();
                }
            }while(error);
            
            switch(opcion) {
            	case 1:
            		//Pruebas con Gnome Sort
            		System.out.println("--GNOME SORT--");
            		
            		//Arrays Parciales
            		for(int i=10;i<=3000;i+=299) {
            			Integer[] parciales = new Integer[i];
            			
            			//Creacion de array parcial
            			for(int j=0; j<i; j++) {
            				parciales[j]=enteros[j];
            			}
            			System.out.println("Ordenamiento con: "+i+" numeros.");
            			sorts.gnomeSort(parciales);
            			
            			//Impresion de resultado
            			for(int k:parciales) {
            				System.out.println(k);
            			}
            			
            			System.out.println("Presione [ENTER] para continuar.");
            			scanner.nextLine();
            		}
            		
            		System.out.println("Ordenamientos finalizados.");
            		break;
            		
            	case 2:
            		//Pruebas con merge sort
            		System.out.println("--MERGE SORT--");
            		
            		//Arrays Parciales
            		for(int i=10;i<=3000;i+=299) {
            			Integer[] parciales = new Integer[i];
            			
            			//Creacion de array parcial
            			for(int j=0; j<i; j++) {
            				parciales[j]=enteros[j];
            			}
            			System.out.println("Ordenamiento con: "+i+" numeros.");
            			sorts.mergeSort(parciales, 0, parciales.length-1);
            			
            			//Impresion de resultados
            			for(int k:parciales) {
            				System.out.println(k);
            			}
            			
            			System.out.println("Presione [ENTER] para continuar.");
            			scanner.nextLine();
            		}
            		
            		System.out.println("Ordenamientos finalizados.");
            		break;
            		
            	case 3:
            		//Pruebas con Radix sort
            		System.out.println("--RADIX SORT--");
            		
            		//Arrays parciales
            		for(int i=10;i<=3000;i+=299) {
            			Integer[] parciales = new Integer[i];
            			
            			//Creacion de array parcial
            			for(int j=0; j<i; j++) {
            				parciales[j]=enteros[j];
            			}
            			System.out.println("Ordenamiento con: "+i+" numeros.");
            			sorts.radixSort(parciales);
            			
            			//Impresion de resultados
            			for(int k:parciales) {
            				System.out.println(k);
            			}
            			
            			System.out.println("Presione [ENTER] para continuar.");
            			scanner.nextLine();
            		}
            		
            		System.out.println("Ordenamientos finalizados.");
            		break;
            		
            	case 4:
            		//Pruebas con quick sort
            		System.out.println("--QUICK SORT--");
            		
            		//Arrays parciales
            		for(int i=10;i<=3000;i+=299) {
            			Integer[] parciales = new Integer[i];
            			
            			//Creacion de array parcial
            			for(int j=0; j<i; j++) {
            				parciales[j]=enteros[j];
            			}
            			System.out.println("Ordenamiento con: "+i+" numeros.");
            			sorts.quickSort(parciales,0,parciales.length-1);
            			
            			//Impresion de resultados
            			for(int k:parciales) {
            				System.out.println(k);
            			}
            			
            			System.out.println("Presione [ENTER] para continuar.");
            			scanner.nextLine();
            		}
            		
            		System.out.println("Ordenamientos finalizados.");
            		
            		break;
            		
            	case 5:
            		//Pruebas con bubble sort
            		System.out.println("--BUBBLE SORT--");
            		
            		//Arrays parciales
            		for(int i=10;i<=3000;i+=299) {
            			Integer[] parciales = new Integer[i];
            			
            			//Creacion de arrays parciales
            			for(int j=0; j<i; j++) {
            				parciales[j]=enteros[j];
            			}
            			System.out.println("Ordenamiento con: "+i+" numeros.");
            			sorts.bubbleSort(parciales);
            			
            			//Impresion de resultados
            			for(int k:parciales) {
            				System.out.println(k);
            			}
            			
            			System.out.println("Presione [ENTER] para continuar.");
            			scanner.nextLine();
            		}
            		
            		System.out.println("Ordenamientos finalizados.");
            		break;
            		
            	case 6:
            		//Almacenamiento del ordenamiento
            		System.out.println("Almacenando ordenamiento realizado.");
            		sorts.quickSort(enteros, 0, enteros.length -1);
            		archivo.updateFile(enteros);
            		
            		System.out.println("Saliendo...");
            		menu = false;
            		break;
            		
            	default:
            		System.out.println("Opcion incorrecta. Intentelo de nuevo.");
            		break;
            }
        }while(menu);
        
	}

}
