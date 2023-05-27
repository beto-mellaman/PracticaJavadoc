package ajedrez;

import java.io.*;
import java.util.Scanner;
/**
 * Class main
 *
 *
 * @author beto_mellaman
 * @version 1.0
 */
public class Main {
	/**
	 * Este método se encarga de iniciar la ejecución del programar
	 * Éste es el método principal del proyecto
	 * se encarga de mostrar el un mensaje al usuario y capturar su respuesta por teclado
	 * @param args[] es un array con los parámetros que reciba por consola
	 * @see ajedrez.LeerFichero#leerlinea()
	 * @return void
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la linea que quieres ver: ");
        int num = sc.nextInt();
        System.out.println("Ha seleccionado la linea: " + num + "\nMostrando resultados:\n");
		sc.close(); 
		try {
			LeerFichero.leerLinea(num);
			}catch (IOException e){
				e.printStackTrace();
				}
	}
    
}