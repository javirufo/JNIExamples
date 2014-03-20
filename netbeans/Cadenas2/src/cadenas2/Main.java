/*
 * Main.java
 *
 * Created on 16 de noviembre de 2006, 10:08
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package cadenas2;

/**
 *
 * @author javi
 */
public class Main {
    
    private String cadena;
    
    /** Creates a new instance of Main */
    public Main(String texto) {
        cadena = new String(texto);
    }    
    
    public native void ModificaCadena();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Main cadenas2 = new Main("Esto es una cadena");
        System.out.println("La cadena de Main es: "+cadenas2.cadena);
        cadenas2.ModificaCadena();
        System.out.println("La cadena de Main es: "+cadenas2.cadena);
    }
    
    static {
        System.loadLibrary("cadenas2");
    }
    
}
