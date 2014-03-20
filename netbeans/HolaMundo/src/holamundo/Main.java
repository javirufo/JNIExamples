/*
 * Main.java
 *
 * Created on 11 de noviembre de 2006, 9:46
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package holamundo;

/*
 * Para que el programa compile correctamente debe importarse el paquete
 * java.io, ya que en él se encuentran las clases que se emplean para la
 * captura de datos desde teclado. Esto se consigue con esta línea, que debe
 * escribirse antes que cualquier declaración de clase. El asterisco indica
 * que se tiene acceso a todas las clases de primer nivel del paquete.
 * Los paquetes se estudiarán más adelante.
 */
import java.io.*;

public class Main{
	public static void main(String args[])throws IOException{
//Creación del flujo para leer datos
		InputStreamReader isr=new InputStreamReader(System.in);
		
		//Creación del filtro para optimizar la lectura de datos
		BufferedReader br=new BufferedReader(isr);
		System.out.print("Teclea el primer numero: ");		
		//Lectura de datos mediante el método readLine()
		String texto1=br.readLine();
		
		//Conversión a int de la String anterior para poder sumar
		int num1=Integer.parseInt(texto1);
		
		System.out.print("Teclea el segundo numero: ");
		String texto2=br.readLine();
		int num2=Integer.parseInt(texto2);
		
		//Sumar los dos enteros
		System.out.println("Suma de "+num1+" y "+num2+" es "+(num1+num2));
	}
}
