package ajedrez;
/*La práctica consiste en crear un programa que pueda leer el contenido del fichero "partidas_ajedrez.txt", 
procesarlo y mostrarlo.
 El fichero se encuentra adjunto en la sección "Recursos" de esta tarea.

El programa debe tener al menos dos clases:
 	- la principal (que contenga el método main)
 	- otra que se encargue de leer el fichero.

Debe pedir al usuario por consola que introduzca la línea que quiere procesar 
(empezando a partir de la primera línea que tiene datos de partidas).

Una vez elegida la línea, el programa debe mostrar por consola:
 	- la información contenida en ella, 
 	- escribiendo en una línea distinta cada uno de los campos y su valor correspondiente
 	
La fecha de la partida (el campo "created_at") debe mostrarse en un formato "entendible para los humanos",
con un año, mes, etc

La fecha límite para entregar la tarea es el domingo 14 de mayo de 2023 a las 23:59
String filePath = "./src/ajedrez/ajedrez.csv";
*/
//imports
import java.io.*;
/**
 *Class LeerFichero es la encargada de leer el fichero ajedrez.csv
 *
 *@author beto_mellaman
 */
public class LeerFichero {
		//Fields
		
		
		//Constructor
		
		
		//Methods
		/**
		* Método que convierte la hora en formato epoch a dd/MM/YYYY hh:mm:ss
		* 
		* @param fecha en formato epoch
		* @return date en formato dd/MM/YYYY hh:mm:ss
		*/
		public static String convertir(double fecha) {
			String date = new java.text.SimpleDateFormat("dd/MM/YYYY hh:mm:ss").format(new java.util.Date ((long) (fecha)));
			return date;
		}
		
		/**
		 * El metodo leer linea recorre el fichero mediante un bucle hasta encontar la linea que ha
		 * recibido como parametro.
		 * @param numlinea linea que ha introducido el usuario por consola
		 * @throws FileNotFoundException excepcion generada al no localizar el fichero
		 */
		public static void leerLinea(int numlinea) throws FileNotFoundException {
			int linea = 0;
	        String line = "";
	        final String delimiter = ",";
	        try
	        {
	        	String ruta = "./src/ajedrez/ajedrez.csv";
	            FileReader fr = new FileReader(ruta);

	            BufferedReader reader = new BufferedReader(fr);
	            while ((line = reader.readLine()) != null)   //loops through every line until null found
	            {
	            if(linea == numlinea) {
	               String[] token = line.split(delimiter);    // separate every token by comma
	               System.out.println("id: "+ token[0] );
	               System.out.println("rated: "+ token[1] );
	               System.out.println("created_at: "+ convertir(Double.parseDouble(token[2])));
	               System.out.println("last_move_at: "+ convertir(Double.parseDouble(token[3])));
	               System.out.println("turns: "+ token[4] );
	               System.out.println("victory_status: "+ token[5] );
	               System.out.println("winner: "+ token[6] );
	               System.out.println("increment_code: "+ token[7] );
	               System.out.println("white_id: "+ token[8] );
	               System.out.println("white_rating: "+ token[9] );
	               System.out.println("black_id: "+ token[10] );
	               System.out.println("black_rating: "+ token[11] );
	               System.out.println("moves: "+ token[12] );
	               System.out.println("opening_eco: "+ token[13] );
	               System.out.println("opening_name: "+ token[14] );
	               System.out.println("opening_ply: "+ token[15] );
	              
	            	}
	            	linea ++;
	            }
	            reader.close();
	        }
	        catch (IOException e)
	        {
	            e.printStackTrace();
	        }
	        
	    }
		
}

